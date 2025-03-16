import java.util.Scanner;

public class WordCounter {
    
    // Method to get sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }

    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 if the sentence is empty
        }
        String[] words = sentence.trim().split("\\s+"); // Split sentence into words
        return words.length;
    }

    // Main method
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get sentence from user
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence has " + wordCount + " words.");
    }
}

// Car.java - Defines the Car class
class Car {
    // Attributes
    int year;
    String make;
    String model;

    // Constructor
    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}