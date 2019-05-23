// Marton Zeisler
// 1841485

import java.util.*;

class PlayersManager{
    // This class handles the logic for the new player creation process and stores the list of players

    // I use ArrayList because I don't know how many players the program will store and with ArrayList I can add and delete objects easily
    ArrayList<Player> players; // I will put any players user created or anything that I can load from the file
    private Scanner scanner; // Just keeping one instace of Scanner so that I can reuse it

    // Initialising the variables
    public PlayersManager(){
        scanner = new Scanner(System.in);
        players = new ArrayList<Player>();
    }

    // Adding the player name
    public void addPlayerStep1(Player player){
        System.out.println("\nPlayer Name\t- Only letters/spaces allowed, must include forename and surname seperated by a space!");
        String userInput = scanner.nextLine(); // Getting input from the user
        if(userInput.toLowerCase().equals("exit")){ // Any time user enters exit, we just return nothing so the program jumps right to the end and shows the main menu again
            return;
        }
        if(AddPlayerConstraints.checkStep1(userInput, player)){ // Checking user input constraints
            addPlayerStep2(player);
        }else{ // If a constraint fails user is asked to provide new input again
            System.out.println("Please follow the instructions!");
            addPlayerStep1(player);
        }
    }

    public void addPlayerStep2(Player player){
        System.out.println("\nPlayer ID\t- Uppercase \"RFU\" followed by 5 digits!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep2(userInput, player)){
            addPlayerStep3(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep2(player);
        }
    }

    public void addPlayerStep3(Player player){
        System.out.println("\nCareer Tries Scored\t- At least one digit!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep3(userInput, player)){
            addPlayerStep4(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep3(player);
        }
    }

    public void addPlayerStep4(Player player){
        System.out.println("\nTeam Name\t- Only letters/spaces allowed, at least one character!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep4(userInput, player)){
            addPlayerStep5(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep4(player);
        }
    }

    public void addPlayerStep5(Player player){
        System.out.println("\nTEAM ID\t- 3 Uppercase letters followed by 4 digits!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep5(userInput, player)){
            addPlayerStep6(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep5(player);
        }
    }

    public void addPlayerStep6(Player player){
        System.out.println("\nHome Stadium Name\t- Only letters/spaces allowed, at least one character!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep6(userInput, player)){
            addPlayerStep7(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep6(player);
        }

    }

    public void addPlayerStep7(Player player){
        System.out.println("\nHome Stadium Street\t- Only digits/letters/spaces allowed, at least one character!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep7(userInput, player)){
            addPlayerStep8(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep7(player);
        }
    }

    public void addPlayerStep8(Player player){
        System.out.println("\nHome Stadium Town\t - Only letters/spaces allowed, at least one character!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep8(userInput, player)){
            addPlayerStep9(player);
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep8(player);
        }
    }

    public void addPlayerStep9(Player player){
        System.out.println("\nHome Stadium Postcode\t- 1 uppercase letter, 1 digit, 3 uppercase letters!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            return;
        }
        if(AddPlayerConstraints.checkStep9(userInput, player)){
            players.add(player);
            System.out.println("You successfully added a new rugby player! Don't forget to save the database to keep the changes!"); // At this point user created the player and it was also added to the list of players as well
        }else{
            System.out.println("Please follow the instructions!");
            addPlayerStep9(player);
        }
    }

}