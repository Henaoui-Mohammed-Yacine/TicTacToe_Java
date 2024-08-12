
package net.henaoui.tictactoe;

public class Case {

    private String caractere;
    private boolean occuper;
    private int ligne;
    private int column;

    public Case(int ligne,int column) {
        this.ligne=ligne;
        this.column=column;
        this.caractere=" ";
        this.occuper = false;
    }
    
    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public boolean isOccuper() {
        return occuper;
    }


    public void setOccuper(boolean occuper) {
        this.occuper = occuper;
    }
    
    boolean verifeOccuper(){
        if(occuper)
            return true;
        return false;
    }
    
}
