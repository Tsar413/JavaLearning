package com.company.javaRelearn.UofGAssignment1;/*
    Instructions - Assessed Exercise 1
    - This exercise tests the things you've learnt in the first week of the semester.
    - Add your code to this file, leaving the main method unchanged except to call your methods.
    - Add all of your methods *below* the main method, in question order.
    - Each of the tasks involves writing a single method. You do not need to add additional main methods.
    - The total number of marks is 22.
    - Read the instructions for each task *carefully*.
    - Submit a single .java file on moodle by the deadline (details on moodle).
    - Your java file must be called AE1_<yourguid>.java
    - You do not need to add any additional import lines.
    - Everything you need to do these tasks is covered in the week 1 lectures and slides.
    - You do not need to perform error checking unless explicitly requested in the task.
*/

/*
    Non task-specific marks:
     - Add a comment with your name and GUID here - [1 mark]
     - Clear code commenting [1 mark]
     - Use of correct Java variable and method naming conventions [1 mark]
*/

import java.util.Scanner;

public class AE1 {

	public static void main(String[] args) {

		/*
		 * EXAMPLE TASK:
		 * 
		 * This code here demonstrates how you should answer the questions. You will be
		 * asked to create code to perform certain tasks. It is important that you leave
		 * this main method unmodified, except for where you need to call the methods
		 * that you create.
		 * 
		 * So, if I asked you to create a method called helloWorld that will print the
		 * following line: 'hello world!' you should do the following: create the method
		 * body below the main method as shown, and call it from main as below.
		 */

		helloWorld();

		/*
		 *  Now, please make a start on the following tasks below:
		 *  Reminder, you are supposed to work on this assessment on your own, to test your
		 *  own understanding and to strengthen your problem solving skills.
		 */
		
		
		/*
		 * TASK 1: (2 marks)
		 * 
		 * Create a method called 'task1' to calculate the area of a rectangle and call it from main
		 * here. The method will not specify any input parameters. Within the method, use a scanner to 
		 * capture user input. The user should be prompted for both the length and width of the rectangle.
		 * 
		 * Note that the length and width of the rectangle can be specified to 2 decimal places.
		 * Once entered, calculate the area and print it to the screen.
		 * 
		 */

		/*
		 * TASK 2: (3 marks)
		 * 
		 * Create a method called 'task2' that will take two integer input parameters, max and number. The
		 * method should print out the total number of values (not the values themselves) 
		 * between 1 and max (inclusive) that satisfy the following conditions:
		 *  
		 * The value must be odd, and the value must be a factor of number.
		 * 
		 * Your main method must pass in max = 99. For example, if I passed in 
		 * the parameters task2(99, 39) the output should be 4.
		 */

		/*
		 * TASK 3: (3 marks)
		 * 
		 * Create a method called 'task3' that will take an int parameter and assign it to the variable
		 * 'challenge'. This method will play out a table top game at the console. The
		 * idea is that players roll a 20-sided dice and indicate what they got in the
		 * terminal. 
		 * 
		 * You are not being asked to program the dice roll, you can assume
		 * the user will simply input a number between 1 and 20.
		 * 
		 * The game plays out over a series of rounds. On each round, the player should
		 * be prompted for input specifying what they rolled. If the player rolls higher
		 * than the challenge, then they are successful in attacking the monster, and
		 * the monster will lose 1 hit point. If the player rolls less than or the value
		 * of challenge, they are not successful.
		 * 
		 * If the player is not successful, the monster will attack. When the player
		 * fails for the first time the monster will miss and the player will not lose a
		 * hit point. However, on the second failed attempt onwards, the monster will
		 * always be successful and the player will lose a hit point.
		 * 
		 * The game continues until either the player or the monster lose all their hit
		 * points. Both the player and the monster should start with 3 hit points.
		 * 
		 * You must use a while loop in this code. The input parameter (challenge) should 
		 * be set to 10.
		 */

		/*
		 * TASK 4: (6 marks)
		 * 
		 * Create a method 'task4' that will take an integer as an input parameter. This value will
		 * be used in a guessing game where the user is to input a series of guesses, to
		 * try and guess the number held by the method, which is the input parameter.
		 * 
		 * Each time the player guesses, they are to be prompted for input. An example
		 * of expected input can be seen below:
		 * 
		 * 16 97
		 * 
		 * Each time the player guesses, they are to input 2 numbers, separated by a
		 * single space. Your method should take both of these guesses, and determine
		 * which value is closer to the secret number. Your method should ensure that
		 * exactly 2 guesses are entered. If not, it should print an error message.
		 * 
		 * If either of the guesses are correct, then the player wins. Otherwise they
		 * are presented with some console output, telling them how far away they are,
		 * which is to be calculated based on which guess was the closest of the two.
		 * 
		 * The output the user should see must be formatted, with '0' being used as
		 * padding. The readout should be 3 characters long. Therefore, if the secret
		 * number is 364, and the user enters 4 300 as their guess, the readout must be
		 * exactly:
		 * 
		 * You are 064 away from the secret number!
		 */
		
		/*
		 * TASK 5: (5 marks)
		 * 
		 * Create a method 'task5' that will take 2 int parameters rows and columns. This method will create 
		 * a table on the console output, representing the game of mine sweeper. The aim of this task
		 * is to illustrate to the player where all the mines are on the board, such as what occurs in 
		 * the standard 'game over' screen for mine sweeper. 
		 * 
		 * The method should accept values between 5 and 10 for the rows and columns, however it is not
		 * required that the value of rows should match the value of columns.
		 * 
		 * The minimum value that must be entered for the rows and columns is 5, and the maximum is 10. Your method 
		 * should check this. If ok, then the method will continue, otherwise it should print out an error message.
		 * 
		 * The method should print a header for the table, labelling the columns, beneath, a separator as shown in the example.
		 * The method should then populate the table, using the character 'o' to represent clear cells and
		 * the character 'x' to represent mines. Each row should also be labelled as 1, 2, 3, etc.
		 * 
		 * The mines are to be specified with 2 int values, x,y such that x represents the row position, and 
		 * y represents the column position. Your method must specify three mines.
		 * 
		 * You are expected to use String.format() in this task, to format the table.
		 * The cells should be padded to a length of 3 with no unnecessary information to pad the cells.
		 * (i.e. no occurrences of for example, XoX or OoO)
		 * 
		 * If for example, the table was specified with having 10 rows and 6 columns, and
		 * the 3 mines were specified at 3,4 and 1,5 and 6,6 your table must look *exactly* like this:
		 * 
    
    |  1  2  3  4  5  6
    |  -  -  -  -  -  -
  1 |  o  o  o  o  x  o

  2 |  o  o  o  o  o  o

  3 |  o  o  o  x  o  o

  4 |  o  o  o  o  o  o

  5 |  o  o  o  o  o  o

  6 |  o  o  o  o  o  x

  7 |  o  o  o  o  o  o

  8 |  o  o  o  o  o  o

  9 |  o  o  o  o  o  o

 10 |  o  o  o  o  o  o
		 */
		
		/*
		 * PLACE YOUR METHOD CALLS HERE
		 */


	}


	/*
	 * EXAMPLE METHOD
	 */
	private static void helloWorld() {
		System.out.println("hello world!");
	}
	
	/*
	 * PLACE YOUR METHODS HERE
	 */

}
