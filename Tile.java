public class Tile {

   // Attributes

    int bombCounter;
    boolean tileRevealed;
    boolean isMine;
    boolean flagged;


    //Constructor
    public Tile() {
        this.tileRevealed = false;
        this.isMine = false;
        this.flagged = false;
    }
    // Methods
    public void setBombCounter(int numofbombs){
        this.bombCounter = numofbombs;
    }
    public void setBomb(){
        this.isMine =true;
    }

    public boolean getBomb(){
        return isMine;
    }
    public void setFlagged(){
        this.flagged = !this.flagged;
    }
    public boolean getFlagged(){
        return this.flagged;
    }
    }

