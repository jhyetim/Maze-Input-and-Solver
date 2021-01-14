/* 
The main method should be implemented to 
•	create instances of classes MazeInput and MazeSolver, 
•	call proper methods in MazeInput class to initialize MazeSolver,
•	call proper methods in MazeSolver to start the maze. 
This whole process needs to repeat three times, with different mazes generated each time. 
*/
package edu.wmich.cs1120.la2.jhyetimchi;

//The LA2Main class.

public class LA2Main {

	// Main method begins program execution 
	
	public static void main(String[] args) {

		// Instantiate classes MazeInput and MazeSolver.
		MazeInput input = new MazeInput();
		MazeSolver solver = new MazeSolver();

		// Call a method from MazeInput to initialize Mazesolver.
		input.initializeMazeSolver(solver);

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.printf("******Maze #%d******\n", i + 1);
			System.out.println("Start drawing the maze...");
			System.out.println("The maze is as below:");

			// Call a method to draw a maze.
			solver.drawMaze();
			// Call a method to print the maze.
			solver.printMaze();

			// Call a method to check if the maze is solvable.
			if (solver.isSolvable() == true) {
				System.out.println("Congratulations! I found a solution for this maze as below:");
				// Call a method to print the maze with the path position if the maze is 
				// solvable.
				solver.printResult();
			} else {
				System.out.println("Sorry, no solution can be found for this maze!\n");
			}
		}

	} // End main

} // End LA2Main class
