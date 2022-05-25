/**
--A program that plays the popular scissor-rock-paper game--
        Author: James Hunter Smith
        Email: jsmith1863@kctcs.edu
        Last Changed: September 18, 2018
**/

import java.util.Scanner;

public class RockPaperScissors {
    
    //Constants for the choices and who wins
    final static int ROCK = 0; 
    final static int PAPER = 1; 
    final static int SCISSORS = 2;
    
    final static int USERWIN = 0; 
    final static int COMPUTERWIN = 1; 
    final static int TIE = 2;
    
    static int userCount = 0; 
    static int computerCount = 0; 
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        int gameNum = 0; 
        
        //getting the round total
        System.out.println("========================================================================================\n");
        System.out.println("This program will allow you to play a game of Rock, Paper, Scissors with the computer.");
        System.out.println("\n========================================================================================\n");
        
        System.out.println("How many rounds do you need to win the game: ");
        gameNum = keyboard.nextInt();
        
        System.out.println("\nEach item has a number attached. You will need to use that number to choose that item.\n"); 
        results(gameNum); 
        
        //if statement to display the results of the game 
        if (userCount > computerCount) {
            System.out.println("Congrats! You beat the computer with the score of " +userCount+ " to " +computerCount);
        } else if (userCount < computerCount) {
            System.out.println("The computer beat you with the score of " +computerCount+ " to " +userCount);
        } else System.out.println("You and the computer tied!");
    } //end of Main method
    
    
    //getting the computer selection by using the .random() function and return the number
    public static int ComputerSelection() {
        double random; 
        
        random = Math.random(); 
        random *= 3; 
        return (int)random;
    }
    
    //method to decided the winner of each round
    public static int game(int user, int computer) {
        if (computer == ROCK) { 
            if (user == PAPER) return USERWIN;
            else if (user == SCISSORS) return COMPUTERWIN; 
        }
        if (computer == PAPER) {
            if (user == SCISSORS) return USERWIN;
            else if (user == ROCK) return COMPUTERWIN;
        }
        if (computer == SCISSORS) {
            if (user == ROCK) return USERWIN;
            else if (user == PAPER) return COMPUTERWIN;
        }
        return TIE; 
    }
    
    public static void results(int gameNum) {
        Scanner keyboard = new Scanner(System.in); 
        
        //variables for the game total, results, and win totals for user and computer
        int gameResult = 0; 
        int computer = 0;
        int user = 0; 
        
        //strings for choices, winning, losing, tied
        String userSelection = "Rock(0), Paper(1), Scissors(2): ";
        String userWin = "You won the round!"; 
        String userLose = "You lost the round."; 
        String userTie = "You and the computer tied."; 
        
        while (userCount < gameNum && computerCount < gameNum) {
            System.out.println(userSelection);
            user = keyboard.nextInt();
            computer = ComputerSelection(); 
            
            gameResult = game(user, computer); 
            if (gameResult == USERWIN) {
                userCount++; 
                System.out.println("--------------------------------------");
                System.out.println(userWin); 
                System.out.println("SCORE"); 
                System.out.println("You: " + userCount); 
                System.out.println("Computer: " + computerCount);
                System.out.println("--------------------------------------\n");
            } else if (gameResult == COMPUTERWIN) {
                computerCount++;
                System.out.println("--------------------------------------");
                System.out.println(userLose); 
                System.out.println("\tSCORE"); 
                System.out.println("\tYou: " + userCount); 
                System.out.println("\tComputer: " + computerCount);
                System.out.println("--------------------------------------\n");
            } else {
                System.out.println("--------------------------------------");
                System.out.println(userTie);
                System.out.println("\tSCORE"); 
                System.out.println("\tYou: " + userCount); 
                System.out.println("\tComputer: " + computerCount);
                System.out.println("--------------------------------------\n");
            }
        }
    }
}
