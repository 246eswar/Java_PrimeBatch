package MazeGame;
import java.util.*;
public class MageGame {
    public static char Person = 'P';
    public static char Exit = 'X';
    public static char Wall = '#';
    public static char[][] maze = {  
            {'#','#','#','#','#','#','#','#'},
            {'#',' ','#',' ','#',' ','#','#'},
            {'#',' ',' ',' ',' ','#','#','#'},
            {'#','#',' ','#',' ',' ',' ','#'},
            {'#',' ',' ',' ','#','#',' ','#'},
            {'#',' ',' ',' ','#','#',' ','#'},
            {'#',' ','#',' ',' ',' ',' ','#'},
            {'#',' ',' ',' ','#','#',' ','X'},
            {'#','#','#','#','#','#','#','#'}
    };
    static int row;
    static int col;
    public static void main(String[] args) {
        row = 1;
        col = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMaze();
            System.out.println("Enter your move (w = up, z = down, a = left, s = right): ");
            char move = sc.next().charAt(0);
            switch (move) {
                case 'w':
                    moveUp();
                    break;
                case 'z':
                    moveDown();
                    break;
                case 'a':
                    moveLeft();
                    break;
                case 's':
                    moveRight();
                    break;
                default:
                    System.out.println("Invalid move!");
                    break;
            }
            if (maze[row][col] == 'X') {
                System.out.println("You won!");
                break;
            }
        }
    }
    static void printMaze() {
        for (int i = 0; i <maze.length; i++) {
            for (int j = 0; j <maze[0].length; j++) {
                if (i == row && j == col) {
                    System.out.print(Person); 
                } else {
                    System.out.print(maze[i][j]);
                }
            }
            System.out.println();
        }
    }    
    static void moveUp() {
        if (row > 0 && maze[row - 1][col] != Wall) {
            row--;
        } else {
            System.out.println("Invalid move! You can't move up.");
        }
    }
    static void moveDown() {
        if (row < maze.length && maze[row + 1][col] != Wall) {
            row++;
        } else {
            System.out.println("Invalid move! You can't move down.");
        }
    }
    static void moveLeft() {
        if (col > 0 && maze[row][col - 1] != Wall) {
            col--;
        } else {
            System.out.println("Invalid move! You can't move left.");
        }
    }
    static void moveRight() {
        if (col < maze[0].length && maze[row][col + 1] != Wall) {
            col++;
        } else {
            System.out.println("Invalid move! You can't move right.");
        }
    }
}
