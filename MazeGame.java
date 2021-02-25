package skeleton;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
/**
 * A maze game.
 * 
 * @author
 * @version
 *
 */
public class MazeGame
{
    /**
     * The size of each side of the game map.
     */
    private final static int HEIGHT = 19;
    private final static int WIDTH = 39;

    /**
     * The game map, as a 2D array of ints.
     */
    private boolean[][] blocked;
    
    /**
     * The current location of the player vertically.
     */
    // TODO: add field here.
    int userRow;
    /**
     * The current location of the player horizontally.
     */
    // TODO: add field here.
    int userCol;
    /**
     * The scanner from which each move is read.
     */
    // TODO: add field here.
    Scanner moveScanner;
    /**
     * The row and column of the goal.
     */
    // TODO: add fields here.
    int goalRow;
    int goalCol;
    /**
     * The row and column of the start.
     */
    // TODO: add fields here.
    int startRow;
    int startCol;
    /**
     * @return blocked
     */
    public boolean[][] getBlocked()
    {
    	return blocked;
    }
    /**
     * @param b new blocked
     */
    public void setBlocked(boolean[][] b)
    {
    	blocked = b;
    }
    /**
     * @return userRow
     */
    public int getUserRow()
    {
    	return userRow;
    }
    /**
     * @param ur new userRow
     */
    public void setUserRow(int ur)
    {
    	userRow = ur;
    }
    /**
     * @return userCol
     */
    public int getUserCol()
    {
    	return userCol;
    }
    /**
     * @param uc new userCol
     */
    public void setUserCol(int uc)
    {
    	userCol = uc;
    }
    /**
     * @return goalRow
     */
    public int getGoalRow()
    {
    	return goalRow;
    }
    /**
     * @param gr new goalRow
     */
    public void setGoalRow(int gr)
    {
    	goalRow = gr;
    }
    /**
     * @return goalCol
     */
    public int getGoalCol()
    {
    	return goalCol;
    }
    /**
     * @param gc new goalCol
     */
    public void setGoalCol(int gc)
    {
    	goalCol = gc;
    }
    /**
     * @return startRow
     */
    public int getStartRow()
    {
    	return startRow;
    }
    /**
     * @param sr new startRow
     */
    public void setStartRow(int sr)
    {
    	startRow = sr;
    }
    /**
     * @return startCol
     */
    public int getStartCol()
    {
    	return startCol;
    }
    /**
     * @param sc new startCol
     */
    public void setStartCol(int sc)
    {
    	startCol = sc;
    }
    /**
     * @return moveScanner
     */
    public Scanner getMoveScanner()
    {
    	return moveScanner;
    }
    /**
     * @param ms new moveScanner
     */
    public void setMoveScanner(Scanner ms)
    {
    	moveScanner = ms;
    }
    /**
     * Constructor initializes the maze with the data in 'mazeFile'.
     * @param mazeFile the input file for the maze
     */
    public MazeGame(String mazeFile)
    {
        // TODO
    	loadMaze(mazeFile);
    	moveScanner = new Scanner(System.in);
    }

    /**
     * Constructor initializes the maze with the 'mazeFile' and the move 
     * scanner with 'moveScanner'.
     * @param mazeFile the input file for the maze
     * @param moveScanner the scanner object from which to read user moves
     */
    public MazeGame(String mazeFile, Scanner moveScanner)
    {
    	// TODO
    	loadMaze(mazeFile);
    	if (moveScanner != null)
    	{
    		this.moveScanner = moveScanner;
    	}
    }

    /**
     * getMaze returns a copy of the current maze for testing purposes.
     * 
     * @return the grid
     */
    public boolean[][] getMaze()
    {
        if (blocked == null)
        {
            return null;
        }
        boolean[][] copy = new boolean[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++)
        {
            for (int j = 0; j < WIDTH; j++)
            {
                copy[i][j] = blocked[i][j];
            }
        }
        return copy;
    }

    /**
     * setMaze sets the current map for testing purposes.
     * 
     * @param maze
     *            another maze.
     */
    public void setMaze(boolean[][] maze)
    {
        this.blocked = maze;
    }
    
    /**
     * Function loads the data from the maze file and creates the 'blocked' 
     * 2D array.
     *  
     * @param mazeFile the input maze file.
     * @throws FileNotFoundException 
     */
    // TODO: private void loadMaze(String mazeFile)
    public void loadMaze(String mazeFile)
    {
    		blocked = new boolean[HEIGHT][WIDTH];
    		try
        	{
    			FileReader file = new FileReader(mazeFile);
	    		Scanner fileReader = new Scanner(file);
		    	for (int i = 0; i <= blocked.length; i++)
		    	{
		    		for (int j = 0; j < blocked[i].length; j++)
		    		{
		    			if (fileReader.next() == "S")
		    			{
		    				startRow = i;
		    				startCol = j;
		    			}
		    			else if (fileReader.next() == "G")
		    			{
		    				goalRow = i;
		    				goalCol = j;
		    			}
		    			else if (fileReader.next() == "1")
		    			{
		    				blocked[i][j] = true;
		    			}
		    			else if (fileReader.next() == "0")
		    			{
		    				blocked[i][j] = false;
		    			}
		    		}
	        fileReader.close();
	    	}
	    }
	    catch (FileNotFoundException e)
	    {
	    	System.out.println("File doesn't exist");
	    }
    }
    /**
     * Actually plays the game.
     */
    public void playGame()
    {
        printMaze();
    }

    /**
     * Checks to see if the player has won the game.
     * @return true if the player has won.
     */
    // TODO: public boolean playerAtGoal()
    /**
     * Makes a move based on the String.
     * 
     * @param move
     *            the direction to make a move in.
     * @return whether the move was valid.
     */
    public boolean makeMove(String move)
    {
        // TODO
        return false;
    }

    /**
     * Prints the map of the maze.
     */
    public void printMaze()
    {
        // TODO
    	System.out.print("*");
    	for (int k = 0; k <= blocked.length; k++)
    	{
    		System.out.print("-");
    	}
    	System.out.print("*");
    	for (int i = 0; i <= blocked.length; i++)
    	{
    		for (int j = 0; j <= blocked[i].length; j++)
    		{
    			if (j == 0)
    			{
    				System.out.print("|");
    			}
    			if (i == userRow && j == userCol)
    			{
    				System.out.print("@");
    			}
    			else if (i == startRow && j == startCol)
    			{
    				System.out.print("S");
    			}
    			else if (i == goalRow && j == goalCol)
    			{
    				System.out.print("G");
    			}
    			else if (blocked[i][j] == true)
    			{
    				System.out.print("X");
    			}
    			else if (blocked[i][j] == false)
    			{
    				System.out.print(" ");
    			}
    			if (j == blocked[i].length)
    			{
    				System.out.print("|");
    			}
    		}
    	}
    	System.out.print("*");
    	for (int l = 0; l <= blocked.length; l++)
    	{
    		System.out.print("-");
    	}
    	System.out.print("*");
    }

    /**
     * Creates a new game, using a command line argument file name, if one is
     * provided.
     * 
     * @param args the command line arguments
     */

    public static void main(String[] args)
    {
        String mapFile = "data/easy.txt";
        Scanner scan = new Scanner(System.in);
        MazeGame game = new MazeGame(mapFile, scan);
        game.playGame();
    }
}
