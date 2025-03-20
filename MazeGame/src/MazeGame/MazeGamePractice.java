package MazeGame;
import java.util.*;
public class MazeGamePractice {
	public static char Person='P';
	public static char Exit='E';
	public static char Wall='#';
	public static char[][] maze= {  
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
	public static int row;
	public static int col;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		row=1;
		col=1;
		while(true){
			printmaze();
			System.out.println("Enter your move (w = up, z = down, a = left, s = right): ");
			char move=sc.next().charAt(0);
			switch(move) {
			case 'w':
				MoveUp();
				break;
			case 's':
				MoveRight();
				break;
			case 'a':
				MoveLeft();
				break;
			case 'z':
				MoveDown();
				break;
			}
			if(maze[row][col]=='X') {
				System.out.println("you won!");
				break;
			}
		}
	}
	public static void printmaze() {
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				if(i==row && j==col) {
					System.out.print(Person);
				}else {
					System.out.print(maze[i][j]);
				}
			}System.out.println();
		}
	}
	public static void MoveUp(){
		if(row>0&&maze[row-1][col]!=Wall) 	row--;
	}
	public static void MoveDown() {
		if(row<maze.length && maze[row+1][col]!=Wall) row++;
	}
	public static void MoveRight() {
		if(col<maze[0].length && maze[row][col+1]!=Wall) 	col++;
	}
	public static void MoveLeft() {
		if(col>0&&maze[row][col-1]!=Wall)	col--;
	}
}
