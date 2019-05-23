// Marton Zeisler
// 1841485

class AddPlayerConstraints{
    // This class is responsible for checking user input for each question during the new player creation process

    // Checking user input for player name
    public static boolean checkStep1(String input, Player player){
        input = input.trim(); // Whitespaces don't matter
        String words[] = input.split(" "); 
        if(words.length == 2){ // Making sure user typed two words only
            String first = words[0];
            String last = words[0];
            for (int i = 0; i < first.length(); i++) {
                if(!Character.isLetter(first.charAt(i))){ // Each character must be a letter
                    return false;
                }
            }
            for (int i = 0; i < last.length(); i++) {
                if(!Character.isLetter(last.charAt(i))){ // Each character must be a letter
                    return false;
                }
            }
            player.setName(first + " " + last); // If I get to this step then user input passed our logic and I can set player name
            return true;

        }
        return false;
    }

    // Checking user input for player id
    public static boolean checkStep2(String input, Player player){
        if(input.length() == 8){ // Input must be 8 characters long
            if(input.substring(0, 3).equals("RFU")){ // Subtracting the first three charachters from the input and forming a string with it
                String numberPart = input.substring(3, 8); // Getting the number part from the input
                try {
                    Integer.parseInt(numberPart); // If this fails, Java will catch it and the checkpoint will return false
                    player.setId(input); // At this point, integer conversin was successful, I can set player id and return true
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }

        }
        return false;
    }

    // Checking user input for career tries scored
    public static boolean checkStep3(String input, Player player){
        try {
            int number = Integer.parseInt(input);
            return number >= 0; // Just making sure user enterd a number and it's at least 0
        } catch (Exception e) {
            return false;
        }
    }

    // Checking user input for team name
    public static boolean checkStep4(String input, Player player){
        if(input.length() >= 1){ // At least one character must have been entered
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(c != ' ' && !Character.isLetter(c)){ // Making sure each character is either a space or a letter
                    return false;
                }
            }
            player.setTeamName(input); // Checkpoint was successful, I can set the team name
            return true;
        }

        return false;
    }

    // Checking user input for team id
    public static boolean checkStep5(String input, Player player){
        if(input.length() == 7){ // Input must be 7 characters long
            String letters = input.substring(0, 3); // Getting the first part of the input
            for (int i = 0; i < letters.length(); i++) {
                char c = letters.charAt(i);
                if(!Character.isLetter(c) || !Character.isUpperCase(c)){ // Making sure first three characters are letters and uppercase as Ill
                    return false;
                }
            }

            String numbers = input.substring(3, 7); // Getting the second part from the input
            try {
                Integer.parseInt(numbers); // Making sure second part is all number so I can convert it to int
                player.setTeamID(input); // Checkpoint was success, I can set team id
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    // Checking user input for stadium name
    public static boolean checkStep6(String input, Player player){
        if(input.length() >= 1){ // Making sure at least one character was entered
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(c != ' ' && !Character.isLetter(c)){ // Each character must be either space or a valid letter
                    return false;
                }
            }
            player.setStadiumName(input);
            return true;
        }
        return false;
    }

    // Checking user input for stadium street
    public static boolean checkStep7(String input, Player player){
        if(input.length() >= 1){ // Making sure at least one character was entered
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(c != ' ' && !Character.isLetter(c) && !Character.isDigit(c)){ // Each character must be space or letter or a digit
                    return false;
                }
            }
            player.setStadiumStreet(input);
            return true;
        }
        return false;
    }

    // Checking user input for stadium town
    public static boolean checkStep8(String input, Player player){
        if(input.length() >= 1){ // Making sure at least one character was entered
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(c != ' ' && !Character.isLetter(c)){ // Each character must be either space or a valid letter
                    return false;
                }
            }
            player.setStadiumTown(input);
            return true;
        }
        return false;
    }

    // Checking user input for stadium postcode
    public static boolean checkStep9(String input, Player player){
        if(input.length() == 5){ // Must be 5 characters long
            char firstLetter = input.charAt(0); // Getting the first character
            char digit = input.charAt(1); // Second one should be a digit and I will check it in a bit
            if(Character.isUpperCase(firstLetter) && Character.isDigit(digit)){ // Making sure first letter is uppercase and second character is a number
                String letters = input.substring(2, 5); // Getting the last part of the input
                for (int i = 0; i < letters.length();i++) {
                    if(!Character.isUpperCase(letters.charAt(i))){ // Only uppercase letters allowed for that part
                        return false;
                    }
                }
                player.setStadiumPost(input);
                return true;
            }
        }

        return false;
    }

}