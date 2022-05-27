<h1 align="center">Rock Paper Scissors</h1>

## Description
Plays a game of Rock Paper Scissors with the computer. The user chooses how many rounds it takes to win.  

This program has 5 different methods: main, computerSelection, game, gameTime, and results.
 - **_main:_** This method describes the program to the user and receives the number of how many rounds it will take 
to win. It then calls the gameTime() with the gameNum variable as the parameter and results() to finish the program. 
 - **_computerSelection:_** Returns a random number of either 0, 1, or 2 to give the computer a selection in the game. I assigned these 
three numbers to the global constants of ROCK, PAPER, and SCISSORS. Math.Random() is used which gives a random number greater than or equal 
to 0.0 and less than 1.0. Multiplying that random number by 3 will give you numbers in the range of 0 to 2.7, and then I converted that to an 
int to get the whole numbers between 0-2. When converting a double to an int, it will always round down to the nearest whole number. So 
(int)2.7 will always get rounded down to 2 instead of rounded up to 3. 
- **_game:_** takes a user and computer selection of numbers between 0-2. 0 = Rock, 1 = Paper, and 2 = Scissors. Using the classic
rules of Rock Paper Scissors, this method will use three if statements to return a winner for the round. If the variables go through 
the three if statements without declaring a winner, it will then return the TIE constant.
- **_gameTime:_** The parameter being the gameNum variable that the user decides how many rounds this game will be. The while loop gets both 
the user and computer selection for each round. It then calls the game() method to assign what ever it returns to the gameResult variable. That
variable is used to display the winner of each round, while also keeping a running total in wins for the user and the computer. These running 
totals are globally declared varaibles to be used in the last method also. The while loop will end when one of the running totals reaches the 
gameNum variable that is passed to this method. 
- **_results:_** This takes the globaly decalred running total variables to display the results of the game. This will include who wins and how 
many rounds the user and computer won. 

## Outcome
<p align="center">
  <img src="https://user-images.githubusercontent.com/80684500/170293033-6d4d0be3-de92-4309-b99c-7f5027060f9b.JPG" alt="Sublime's custom image"/>
</p>

## Projects
|  Num  | Project                                                                                                 | Author                                            |
| ----- | ------------------------------------------------------------------------------------------------------- | --------------------------------------------------|
|   1   | [Bookstore](https://github.com/JamesSmith232/BookStore)                                                 | [James Smith](https://github.com/JamesSmith232)   |
|   2   | [FizzBuzz](https://github.com/JamesSmith232/FizzBuzz)                                                   | [James Smith](https://github.com/JamesSmith232)   |
|   3   | [RockPaperScissors](https://github.com/JamesSmith232/RockPaperScissors)                                 | [James Smith](https://github.com/JamesSmith232)   |
|   4   | [Grader](https://github.com/JamesSmith232/Grader)                                                       | [James Smith](https://github.com/JamesSmith232)   |
|   5   | [StoreManager](https://github.com/JamesSmith232/StoreManager)                                           | [James Smith](https://github.com/JamesSmith232)   |
|   6   | [TicTacToe](https://github.com/JamesSmith232/TicTacToe)                                                 | [James Smith](https://github.com/JamesSmith232)   |
