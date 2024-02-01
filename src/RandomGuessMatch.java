//Nuha Abdul Gafoor
//0788434
//Ask the user to guess the number and 
//compare it to a generated random number and display if it is true or false 

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomGuessMatch
 {
    public static void main(String[] args) 
    {
        
        // Generate a random number between 1 and 5
        final int MIN = 1;
        final int MAX = 5;
        int random = MIN + (int) (Math.random() * MAX);

        // Prompt user to guess the number
        Scanner scanner = new Scanner(System.in);
        String userInput = JOptionPane.showInputDialog(null,"Guess the number between 1 and 5: ","Message", JOptionPane.QUESTION_MESSAGE);
        int userGuess = Integer.parseInt(userInput);
        
        
        // Display the difference between the random number and the user's guess
        int difference = (random - userGuess);
       
        JOptionPane.showMessageDialog(null,"The difference between the random number and your guess is: " + difference,"Message" ,JOptionPane.INFORMATION_MESSAGE);

        // Display the random number and check if the guess is correct
        JOptionPane.showMessageDialog(null,"The random number was: " + random, "Message",JOptionPane.INFORMATION_MESSAGE);
        boolean isGuessCorrect = (userGuess == random);
        JOptionPane.showMessageDialog(null,"Your guess is: " + isGuessCorrect,"Message",JOptionPane.INFORMATION_MESSAGE);

        // Close the scanner
        scanner.close();
    }
}
