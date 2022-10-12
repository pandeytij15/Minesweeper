import java.lang.Math;

public class Grid {
    //Attributes
    Tile[][] board;
    int boardSize;
    int numofMines;
    int numofTilesFlagged;

    //Constructor
    public Grid(int boardSize) {
        this.boardSize = boardSize;
        this.board = new Tile[boardSize][boardSize];
        this.numofMines = (int) ((boardSize * boardSize) / 10);
        setTiles();
        // put tiles in board//
        // set the bombs on board//
        //set the counters//
        //start game//

    }

    //Methods

    public void makeBoard() {
        System.out.print(board[0][0]);
    }

    public void setTiles() {

        board[0][0] = new Tile();
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = new Tile();
            }
        }

    }

    public void setTilesOnBoard() {
        Tile[][] board;
        board = new Tile[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            System.out.println();
            for (int j = 0; j < boardSize; j++) {
                // board[i][j] = 0;//
                System.out.print(board[i][j] + " ");
            }
        }
    }

    public void setBombs() {
        for (int i = 0; i < this.numofMines; i++) {

            int X = (int) (Math.random() * boardSize);
            int y = (int) (Math.random() * boardSize);
            board[X][y].setBomb();cd


        }
        ;


    }


    public void setBombCounter() {
    }

}