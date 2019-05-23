// Marton Zeisler
// 1841485

import java.io.*;
import java.util.*;

public class Main {
    // The main class of the program. This is the file I need to run to start the program.

    static Scanner scanner; // Reusing scanner throughout the program
    static File playersFile; // Empty file objec first but once user decides to load a file or create a new file, this instance will hold that file information
    static PlayersManager playersManager; // I use this instace to add new players and to also access the list of all the players stored in the program
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        playersManager = new PlayersManager();
        showMainMenu();
    }

    public static void showMainMenu(){
        System.out.println("Welcome to Rugby Database!\n");
        System.out.println("Type exit anytime to get back to the main menu!");
        System.out.println("Main Menu:");
        System.out.println("\t- 1. Load database");
        System.out.println("\t- 2. Create new database");
        
        String userInput = scanner.nextLine();
        try {
            int menuChoice = Integer.parseInt(userInput); // Getting the user's choice for the menu
            switch (menuChoice) {
                case 1:
                    showLoadDatabaseMenu();
                    break;
                case 2:
                    showCreateDatabaseMenu();
                    break;
                default:
                    showMainMenu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Try again!"); // Couldn't process user input with converting it to an integer
            showMainMenu();
        }
    }

    public static void showLoadDatabaseMenu(){
        System.out.println("\nType the file name(e.g. players.txt) of your database:");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){ // Anytime user can type exit to go back to the main menu
            showMainMenu();
            return;
        }
        if(fileExists(userInput)){ // Making sure file exists before loading data from the given file name
            if(isValidFileType(userInput)){ // Also need to make sure I only attempt to load players from a txt file type
                playersFile = new File(userInput);
                loadPlayersFromFile(); // Loading the players 
                showOperationsMenu(); // Players have been loaded, main menu can now be shown
            }else{
                System.out.println("File type must be .txt");
                showLoadDatabaseMenu();
            }
        }else{
            System.out.println("File doesn't exist!");
            showLoadDatabaseMenu();
        }
    }

    public static void loadPlayersFromFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(playersFile));
            String line = reader.readLine();
            // Reading through the file the user specified
            while(line != null){
                String parts[] = line.split("--");
                if(parts.length == 9){ // We can only decode players data if it was encoded the way I designed it
                    // Grabbing each bit of information of the player and adding it to the list
                    Player player = new Player(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], parts[4], parts[5], parts[6], parts[7], parts[8]);
                    playersManager.players.add(player);
                }else{
                    System.out.println("Text file is incorrect, try with another file!");
                    showLoadDatabaseMenu();
                }
                line = reader.readLine();
            }

            reader.close();
            System.out.println("Loaded " + playersManager.players.size() + " players!");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            exitProgram();
        }
    }

    // Same logic as loading file except file must not exist
    public static void showCreateDatabaseMenu(){
        System.out.println("\nType the file name(e.g. players.txt) to create your database:");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            showMainMenu();
            return;
        }
        if(fileExists(userInput)){
            System.out.println("This file already exists, try again!");
            showCreateDatabaseMenu();
        }else{
            if(isValidFileType(userInput)){
                createNewFile(userInput);
                showOperationsMenu();
            }else{
                System.out.println("File type must be .txt");
                showCreateDatabaseMenu();
            }
        }
    }

    // All the checkpoints have been passed, I can now create the file that the user asked for
    public static void createNewFile(String fileName){
        try {
            playersFile = new File(fileName);
            playersFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Someting went wrong while creating the file!");
            showMainMenu();
        }
    }

    public static boolean fileExists(String fileName){
        File file = new File(fileName);
        if (file.exists() && !file.isDirectory()){ // Need to make sure that the user's specified file is actually a file and not a folder
            return true;
        }else{
            return false;
        }
    }

    // Only .txt files are supported
    public static boolean isValidFileType(String fileName){
        return fileName.toLowerCase().endsWith(".txt");
    }

    public static void showOperationsMenu(){
        System.out.println("\nPlease select an action:");
        System.out.println("\t- 1. Add a new rugby player");
        System.out.println("\t- 2. Delete a rugby player");
        System.out.println("\t- 3. Display all rugby players");
        System.out.println("\t- 4. Display all rugby players whose team name contains a specific substring");
        System.out.println("\t- 5. Find stadium addresses");
        System.out.println("\t- 6. Display a subset of rugby players");
        System.out.println("\t- 7. Save database");
        System.out.println("\t- 8. Exit");

        String userInput = scanner.nextLine();
        try {
            int choice = Integer.parseInt(userInput); // Converting the user input to an integer, if it fails then I will show the main menu again 
            switch (choice) {
                case 1:
                    addPlayer();
                    showOperationsMenu();
                    break;
                case 2:
                    if(playersManager.players.size() > 0){ // Making sure program has at least one player stored in the database
                        deleteRugbyPlayer();
                    }else{
                        noPlayersFound();
                    }
                    break;
                case 3:
                    if(playersManager.players.size() > 0){
                        displayAllPlayers(playersManager.players);
                        showOperationsMenu();
                    }else{
                        noPlayersFound();
                    }
                    break;
                case 4:
                    if(playersManager.players.size() > 0){
                        displayPlayersByTeamName();
                    }else{
                        noPlayersFound();
                    }
                    break;
                case 5:
                    if(playersManager.players.size() > 0){
                        displayStadiumAddresses();
                    }else{
                        noPlayersFound();
                    }
                    break;
                case 6:
                    if(playersManager.players.size() > 0){
                        displaySubsetPlayers();
                    }else{
                        noPlayersFound();
                    }
                    break;
                case 7:
                    savePlayers();
                    break;
                case 8:
                    exitProgram();
                    break;
                default:
                    showOperationsMenu();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Try again!");
            showOperationsMenu();
        }
    }

    public static void noPlayersFound(){
        System.out.println("No players found in the database!");
        showOperationsMenu();
    }

    public static void addPlayer(){
        Player player = new Player();
        System.out.println("\nLet's add a new rugby player. Just follow the instructions!");
        playersManager.addPlayerStep1(player); // Starting the add player process
    }

    public static void deleteRugbyPlayer(){
        if (playersManager.players.size() > 0){
            displayAllPlayers(playersManager.players); // Need to display the list of players first so user can pick which one to delete
            attemptToDelete();
        }else{
            System.out.println("No players found in the database!");
            showOperationsMenu();
        }    
    }

    public static void attemptToDelete(){
        System.err.println("\nEnter the position of the player in the list to delete");
        System.out.println("Range is 1 - " + playersManager.players.size());
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            showOperationsMenu();
            return;
        }
        try {
            int userIndex = Integer.parseInt(userInput);
            if (userIndex >= 1 && userIndex <= playersManager.players.size()){ // Making sure user's range is valid
                playersManager.players.remove(userIndex-1); // If valid, I can remove the specified player from the list and show the main menu again
                System.out.println("Rugby player deleted successfully! Don't forget to save your database to keep the changes!\n");
                showOperationsMenu();
            }else{
                System.out.println("Invalid range, try again!");
                attemptToDelete();
            }
        } catch (Exception e) {
            System.out.println("Invalid format, try again!");
            attemptToDelete();
        }
    }

    public static void displayAllPlayers(ArrayList<Player> players){
        System.out.println();
        for (int i = 0; i < players.size(); i++) { // Looping through all the players in the database and displaying thei data
            Player player = players.get(i);
            System.out.println("Result #" + (i+1) + ":");
            player.displayPlayer(); // Using the player's class display function to print the player's data
            System.out.println();   
        }
    }

    public static void displayPlayersByTeamName(){
        System.out.println("\nEnter a string to display all rugby players whose team name contains that string!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            showOperationsMenu();
            return;
        }
        displayPlayersByTeamNameResults(userInput);
    }

    public static void displayPlayersByTeamNameResults(String input){
        ArrayList<Player>results = new ArrayList<Player>();
        for (Player player : playersManager.players) {
            if(player.getTeamName().contains(input)){ // If team name contains the input filter then add it to a new list
                results.add(player);
            }
        }

        if(results.size() > 0){ // If there was no results, I navigate the user back to the main menu
            System.out.println("\nHere's the result to your query:");
            displayAllPlayers(results); // Display the results list
            showOperationsMenu();
        }else{
            System.out.println("No results!");
            showOperationsMenu();
        }
    }

    public static void displayStadiumAddresses(){
        System.out.println("\nEnter a string to display all stadium addresses that contain that string!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            showOperationsMenu();
            return;
        }
        int found = 0;
        for (Player player : playersManager.players) {
            // Adding any players to the list that match the query
            if(player.getStadiumName().toLowerCase().contains(userInput.toLowerCase()) || player.getStadiumStreet().toLowerCase().contains(userInput.toLowerCase()) || player.getStadiumTown().toLowerCase().contains(userInput.toLowerCase()) || player.getStadiumPost().toLowerCase().contains(userInput.toLowerCase())){
                found += 1;
                System.out.println("Result #" + found + ":");
                player.printStadiumResults();
                System.out.println();
            }
        }

        if(found == 0){
            System.out.println("No results found!");
        }
        showOperationsMenu();
    }

    public static void displaySubsetPlayers(){
        System.out.println("\nThe database has the following range: 1-" + playersManager.players.size()); // Getting the range for the players list
        System.out.println("Select the range to display a subet. Enter the two digits seperated by a hyphen!");
        String userInput = scanner.nextLine();
        if(userInput.toLowerCase().equals("exit")){
            showOperationsMenu();
            return;
        }
        int start = 0;
        int end = 0;
        try {
            String words[] = userInput.trim().split("-"); // Reading user's input and figuring out user's min and max for the range
            start = Integer.parseInt(words[0]);
            end = Integer.parseInt(words[1]);
        } catch (Exception e) {
            System.out.println("Invalid format, try again!");
            displaySubsetPlayers();
        }

        if(start >= 1 && end <= playersManager.players.size()){ // Making sure user's range was valid
            for (int i = start-1; i < end; i++) { // We display each player that is found within the range
                Player player = playersManager.players.get(i);
                System.out.println("Result #" + (i+1) + ":");
                player.displayPlayer();
            }

            System.out.println();
            showOperationsMenu();
        }else{
            System.out.println("Wrong range, try agin!");
            displaySubsetPlayers();
        }
    }

    public static void savePlayers(){
        if(playersManager.players.size() == 0){
            try {
                new FileWriter(playersFile, false).close();
                System.out.println("Database updated!");
                showOperationsMenu();
            } catch (Exception e) {
                System.out.println("Something went wrong during saving!");
                showOperationsMenu();
            }
        }else{
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(playersFile)); // Creating a writer so i can write to the file.
                for (int i=0; i<playersManager.players.size(); i++) { // Looping through the players to get their data so I can write it
                    Player player = playersManager.players.get(i);
                    String line = player.encodePlayerForWriting(); // Encoding each player object
                    if(i <= playersManager.players.size()-2){
                        line += "\n";
                    }
                    writer.write(line); // Writing the encoded player string to a new line in the text file
                }
                
                writer.close();
                System.out.println("All players saved!\n");
                showOperationsMenu();
            } catch (Exception e) {
                System.out.println("Something went wrong during saving!");
                showOperationsMenu();
            }
        }
    }

    public static void exitProgram(){
        System.out.println("\nGoodbye!");
        System.exit(0); // This will stop the program and exit
    }
}