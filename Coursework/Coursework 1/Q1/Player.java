// Marton Zeisler
// 1841485

public class Player{
    // This is the Player model, it holds all the information a player object can have

    private String name;
    private String id;
    private int careerTries = 0;
    private String teamName;
    private String teamID;
    private String stadiumName;
    private String stadiumStreet;
    private String stadiumTown;
    private String stadiumPost;

    public Player(){
        // Empty constructor, at first when a new player is created, no info is known yet about the player
    }

    // All info about the user is known so we can use a player constructor with all the parameters needed to set all the variables in the player model class
    public Player(String name, String id, int careerTries, String teamName, String teamID, String stadiumName, String stadiumStreet, String stadiumTown, String stadiumPost){
        this.name = name;
        this.id = id;
        this.careerTries = careerTries;
        this.teamName = teamName;
        this.teamID = teamID;
        this.stadiumName = stadiumName;
        this.stadiumStreet = stadiumStreet;
        this.stadiumTown = stadiumTown;
        this.stadiumPost = stadiumPost;
    }

    // This is how a player gets printed on the screen
    public void displayPlayer(){
        System.out.println("\tPlayer Name: " + getName());
        System.out.println("\tPlayer ID: " + getId());
        System.out.println("\tCareer Tries Scored: " + getCareerTries());
        System.out.println("\tTeam Name: " + getTeamName());
        System.out.println("\tTeam ID: " + getTeamID());
        System.out.println("\tHome Stadium Name: " + getStadiumName());
        System.out.println("\tHome Stadium Street: " + getStadiumStreet());
        System.out.println("\tHome Stadium Town: " + getStadiumTown());
        System.out.println("\tHome Stadium Postcode: " + getStadiumPost());
    }

    // When I need to write a player object to a text file, I use this method to encode it in a way that I can decode it easily when the user decides to load player data from the text file later
    public String encodePlayerForWriting(){
        String line = getName() + "--";
        line += getId() + "--";
        line += getCareerTries() + "--";
        line += getTeamName() + "--";
        line += getTeamID() + "--";
        line += getStadiumName() + "--";
        line += getStadiumStreet() + "--";
        line += getStadiumTown() + "--";
        line += getStadiumPost();
        return line;
    }

    // Only needed to print stadium related data
    public void printStadiumResults(){
        System.out.println("\tStadium Name: " + getStadiumName());
        System.out.println("\tStadium Street: " + getStadiumStreet());
        System.out.println("\tStadium Town: " + getStadiumTown());
        System.out.println("\tStadium PostCode: " + getStadiumPost());
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCareerTries() {
        return careerTries;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamID() {
        return teamID;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public String getStadiumStreet() {
        return stadiumStreet;
    }

    public String getStadiumTown() {
        return stadiumTown;
    }

    public String getStadiumPost() {
        return stadiumPost;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCareerTries(int careerTries) {
        this.careerTries = careerTries;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public void setStadiumStreet(String stadiumStreet) {
        this.stadiumStreet = stadiumStreet;
    }

    public void setStadiumTown(String stadiumTown) {
        this.stadiumTown = stadiumTown;
    }

    public void setStadiumPost(String stadiumPost) {
        this.stadiumPost = stadiumPost;
    }

}