package edu.wmich.cs1120.la2.jhyetimchi;

// The MazeInput class.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MazeInput {

	/*
	 * This method initializes/sets the numRows and numCols of the solver (instance
	 * of MazeSolver Class) with the numRows and numCols provided by the user.
	 */
	public void initializeMazeSolver(MazeSolver solver) {

		// Call methods getNumRows() and getNumCols().
		int numRow = getNumRows();
		int numCol = getNumCols(numRow);

		// Call methods from MazeSolver to set numRows and numCols.
		solver.setNumRows(numRow);
		solver.setNumCols(numCol);

	} // End method initializeMazeSolver

	/*
	 * This method asks for a number within the range [5, 10] from the user as the
	 * number of rows. The method is also responsible for validating the input and
	 * printing corresponding messages to the screen if the input is not valid.
	 */
	private int getNumRows() {

		int option = 0;

		// If input is not within range or not an integer, ask the user again.
		do {
			// Ask user for numRows
			Scanner kbd = new Scanner(System.in);

			if (option == 0 || option == -1) {
				System.out.println("Enter number of rows in range [5, 10]:");
			}

			try {
				option = kbd.nextInt();

				if (option >= 5 && option <= 10) {
				} else if (option < 5 || option > 10) {
					System.out.println("Invalid input!");
					option = -1;
				}

			} catch (InputMismatchException e) {
				System.out.print("Input must be an integer. Re-enter:\n");
				option = -2;
			}

		} while (option == -1 || option == -2);

		return option;

	} // End method getNumRows

	/*
	 * This method asks for a number within the range [5, 10] from the user as the
	 * number of rows - this number cannot be the same as the number of rows denoted
	 * by parameter numRows. This method is also responsible for validating the
	 * input and printing corresponding messages to the screen if the input is not
	 * valid.
	 */
	private int getNumCols(int numRows) {

		int option = 0;

		// If input is not within range, not an integer, or has the same value as numRows, ask the user again.
		do {
			// Ask user for numCols
			Scanner kbd = new Scanner(System.in);

			if (option == 0 || option == -1) {
				System.out.println("Enter number of columns in range [5, 10]:");
				System.out.println("This must be different from number of rows:");
			}

			try {
				option = kbd.nextInt();

				if ((option >= 5 && option <= 10) && option != numRows) {
				} else if (option < 5 || option > 10) {
					System.out.println("Invalid input!");
					option = -1;
				} else if (option == numRows) {
					System.out.println("Number of columns is the same as number of rows!");
					option = -1;
				}

			} catch (InputMismatchException e) {
				System.out.print("Input must be an integer. Re-enter:");
				option = -2;
			}

		} while (option == -1 || option == -2);

		return option;

	} // End method getNumCols

} // End MazeInput class
