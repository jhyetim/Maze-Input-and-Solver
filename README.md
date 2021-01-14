# Maze-Input-and-Solver
The program will have three classes: the class Main, MazeInput and MazeSolver. Main to call methods in MazeInput and MazeSolver, MazeInput to initialize variables, and MazeSolver to draw and print the maze.

Write a class Main that can:\
a) Instantiate classes MazeInput and MazeSolver.\
b) Call proper methods from MazeInput class to initialize MazeSolver.\
c) Call proper methods in MazeSolver to start the maze and display the maze.

Test the class by performing the following steps:\
a) Instantiate classes MazeInput and MazeSolver.\
b) Call a method from MazeInput to initialize Mazesolver.\
c) Call a method to draw a maze.\
d) Call a method to print the maze.\
e) Call a method to check if the maze is solvable.\
f) Call a method to print the maze with the path position if the maze is solvable.


# Example:
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
