package edu.wmich.cs1120.la2.jhyetimchi;

// The MazeSolver class.

public class MazeSolver {

	// Fields: numRows, numCols, maze[][], visited[][], correctPath[][]
	private int numRows;
	private int numCols;
	private String maze[][];
	private boolean visited[][];
	private String correctPath[][];

	/* The setter for the private attribute: numRows. */
	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}

	/* The setter for the private attribute: numCols. */
	public void setNumCols(int numCols) {
		this.numCols = numCols;
	}

	/* The getter for the private attribute: numRows. */
	public int getNumRows() {
		return numRows;
	}

	/* The getter for the private attribute: numCols. */
	public int getNumCols() {
		return numCols;
	}

	/*
	 * Draw the maze (a 2-d matrix, type String) by randomly filling it with "#"
	 * (block) and numbers (e.g., "45"). Set the top left cell to "S" (starting
	 * point), and the bottom right cell to "D" (destination). Numbers are randomly
	 * generated within the range [1, 100], while the total number of "#" cannot
	 * exceed 1/3 of the total number of cells in the matrix.
	 */
	public void drawMaze() {

		// Set maze[][], visited[][], correctPath[][]
		this.maze = new String[numRows][numCols];
		this.visited = new boolean[numRows][numCols];
		this.correctPath = new String[numRows][numCols];

		// Fill maze[][] and correctPath[][] with “#” (block)and numbers (e.g., "45").
		// Numbers are randomly generated within the range [1, 100], while the total 
		// number of "#" cannot exceed 1/3 of the total number of cells in the matrix.
		boolean randomPound = false;
		int numPound = 0;

		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				randomPound = (Math.random() < 0.5);
				if (randomPound && (numPound < (numRows * numCols) / 3)) {
					numPound++;
					maze[r][c] = "#";
					correctPath[r][c] = "#";
				} else {
					maze[r][c] = Integer.toString((int) (Math.random() * 100));
					correctPath[r][c] = Integer.toString((int) (Math.random() * 100));
				}
			}
		}

		// Set the top left cell to "S"(starting point), and the bottom right cell to "D" destination).
		maze[0][0] = "S";
		maze[numRows - 1][numCols - 1] = "D";

		// Set all values in visited[][] as false.
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				visited[r][c] = false;
			}
		}

	} // End method drawMaze

	/* Print out the original maze. Each column must be properly aligned. */
	public void printMaze() {

		// Display unsolved maze.
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				System.out.printf("%-2s    ", maze[r][c]);
			}
			System.out.println();
		}

	} // End method printMaze

	/*
	 * This method should only call the method “solveMazeRecursively(int row, int
	 * col)” – the recursive method - and return the result received from it.
	 */
	public boolean isSolvable() {
		return solveMazeRecursively(0, 0);
	} // End method isSolvable

	/*
	 * This method is the core part to solve the maze. It tries to solve the maze
	 * using recursion. It returns true if there is at least one solution.
	 * Otherwise, it returns false.
	 */
	private boolean solveMazeRecursively(int row, int col) {

		// If you reached the end
		if (maze[row][col].compareTo("D") == 0) {
			return true;
		}
		// If you reach a #
		else if (maze[row][col].compareTo("#") == 0) {
			return false;
		}
		// If you are on a wall
		else if (row > numRows - 1 || col > numCols - 1) {
			return false;
		}
		// If you already visited
		else if (visited[row][col]) {
			return false;
		}

		visited[row][col] = true;

		// Checks if not on right edge
		if (row != numRows - 1) 
			if (solveMazeRecursively(row + 1, col)) {
				correctPath[row][col] = "+";
				correctPath[0][0] = "S";
				maze[0][0] = "0";
				return true;
			}

		// Checks if not on bottom edge
		if (col != numCols - 1) 
			if (solveMazeRecursively(row, col + 1)) {
				correctPath[row][col] = "+";
				correctPath[0][0] = "S";
				maze[0][0] = "0";
				return true;
			}
		return false;

	} // End method solveMazeRecursively

	/*
	 * If there is a solution, this method will be called to print out the maze with
	 * the path position replaced by “+”. The amount of coins collected on the path
	 * is also calculated and printed in this method. Each column must be properly
	 * aligned.
	 */
	public void printResult() {

		// Display solved maze.
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				System.out.printf("%-2s    ", correctPath[r][c]);
			}
			System.out.println();
		}

		// Calculate amount of coins collected.
		int total = 0;

		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				if (visited[r][c] == true) {
					total = total + Integer.parseInt(maze[r][c]);
				}
			}
		}
		System.out.printf("The amount of coins collected: %d\n\n", total);
		
	} // End method printResult

} // End MazeSolver class
