/**
--A program that allows the user to play Rock Paper Scissors with the computer--
        Author: James Hunter Smith
        Email: jsmith1863@kctcs.edu
        Last Changed: September 18, 2018
**/

import java.util.Scanner;

public class RockPaperScissors {
  
    //Globally declared variables 
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
      
        System.out.println("========================================================================================\n");
        System.out.println("This program will allow you to play a game of Rock, Paper, Scissors with the computer.");
        System.out.println("\n========================================================================================\n");
        
        //Getting the number of rounds
        System.out.println("How many rounds do you need to win the game: ");
        gameNum = keyboard.nextInt();
        
        System.out.println("\nEach item has a number attached. You will need to use that number to choose that item.\n"); 
            
        //passing the gameNum varaible to play the game  
        gameTime(gameNum); 
        results(); 
    }
    
    public static int computerSelection() {
        double random; 
        
        //Using Math.random and multiplying that number to get in specific range 
        random = Math.random(); 
        random *= 3; 
        return (int)random;
    }
        
    //if statements to decide the winner of the round 
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
    
    public static void gameTime(int gameNum) {
        Scanner keyboard = new Scanner(System.in); 

        int gameResult = 0; 
        int computer = 0;
        int user = 0; 

        String userSelection = "Rock(0), Paper(1), Scissors(2): ";
        String userWin = "You won the round!"; 
        String userLose = "You lost the round."; 
        String userTie = "You and the computer tied."; 
        
        //while loop to decide the winner of the game 
        while (userCount < gameNum && computerCount < gameNum) {
            System.out.println(userSelection);
            user = keyboard.nextInt();
            computer = computerSelection(); 
            
            gameResult = game(user, computer); 
            if (gameResult == USERWIN) {
                userCount++; 
                System.out.println("--------------------------------------");
                System.out.println(userWin); 
                System.out.println("\tSCORE"); 
                System.out.println("\tYou: " + userCount); 
                System.out.println("\tComputer: " + computerCount);
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
    
    //Using the globally declared variables to display the results
    public static void results() {
        if (userCount > computerCount) {
            System.out.println("Congrats! You beat the computer with the score of " +userCount+ " to " +computerCount);
        } else if (userCount < computerCount) {
            System.out.println("The computer beat you with the score of " +computerCount+ " to " +userCount);
        } else System.out.println("You and the computer tied!");
    }
}
