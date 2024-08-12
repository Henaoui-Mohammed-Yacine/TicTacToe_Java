
package net.henaoui.tictactoe;

public class Player {
    
    private String name;
    private String symbol;
    
    Player(String name,String symbol){
        this.name=name;
        this.symbol=symbol;
    }
    
    void setSymbol(String symbol){
        this.symbol=symbol;
    }
    
    String getSymbol(){
        return this.symbol;
    }
    
    void setName(String name){
        this.name=name;
    }
    
    String getName(){
        return this.name;
    }
    
    
}
