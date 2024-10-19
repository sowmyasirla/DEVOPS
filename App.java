// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random integer between 0 and 100
        int randomInt = random.nextInt(101); // 101 is exclusive
        System.out.println("Random Integer: " + randomInt);
    }
}
