public class DragonBallApp {
    public static void main(String[] args) {
        // Create instances of the characters
        Character goku = new Character("Goku", "Hello, Vegeta! How are you?");
        Character vegeta = new Character("Vegeta", "Hmph! What do you want, Kakarotto?");
        
        // Display the characters' greetings
        goku.greet();
        vegeta.greet();
    }
}

// Class to represent a Dragon Ball character
class Character {
    private String name;
    private String greeting;

    // Constructor
    public Character(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    // Method to display the character's greeting
    public void greet() {
        System.out.println(name + ": " + greeting);
    }
}
