# Maze-Input-and-Solver
This program creates a randomly generated maze with the size of it being user-entered. It will then try to solve it if it's possible. There will be three classes: LA2Main, MazeInput, and MazeSolver. LA2Main to call methods in MazeInput and MazeSolver, MazeInput to initialize user-entered variables for the size of the maze, and MazeSolver to draw and print the maze.

## Write a class LA2Main that can:
1) Instantiate classes MazeInput and MazeSolver.
2) Call proper methods from MazeInput class to initialize MazeSolver.
3) Call proper methods in MazeSolver to start the maze and display the maze.

## Test the class by performing the following steps:
1) Instantiate classes MazeInput and MazeSolver.
2) Call a method from MazeInput to initialize Mazesolver.
3) Call a method to draw a maze.
4) Call a method to print the maze.
5) Call a method to check if the maze is solvable.
6) Call a method to print the maze with the path position if the maze is solvable.


## Example:
```
Enter number of rows in range [5, 10]:
1
Invalid input!
Enter number of rows in range [5, 10]:
a
Input must be an integer. Re-enter:
5
Enter number of columns in range [5, 10]:
This must be different from number of rows:
5
Number of columns is the same as number of rows!
Enter number of columns in range [5, 10]:
This must be different from number of rows:
6

******Maze #1******
Start drawing the maze...
The maze is as below:
S     25    88    #     76    14 
#     32    39    46    84    #
32    48    #     48    0     #
#     93    #     #     #     #
6     42    5     48    82    D
Congratulations! I found a solution for this maze as below:
S     +     57    #     58    49
#     +     89    58    46    #
4     +     #     5     21    #
#     +     #     #     #     #
61    +     +     +     +     67
The amount of coins collected: 375

******Maze #2******
Start drawing the maze...
The maze is as below:
S     7     #     #     44    #
#     #     #     #     43    #
#     86    99    #     13    17
97    39    47    26    41    50
14    95    13    6     87    D
Sorry, no solution can be found for this maze!

******Maze #3******
Start drawing the maze...
The maze is as below:
S     86    #     2     #     #
73    #     20    43    #     30
39    7     72    #     14    #
#     #     35    69    #     60
98    93    99    69    81    D
Congratulations! I found a solution for this maze as below:
S     94    #     57    #     #
+     #     71    6     #     84
+     +     +     #     45    #
#     #     +     70    #     36
62    82    +     +     +     53
The amount of coins collected: 475
```
