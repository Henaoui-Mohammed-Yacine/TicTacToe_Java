
package net.henaoui.tictactoe;

import java.util.ArrayList;
import java.util.Scanner;
import net.henaoui.tictactoe.Player;
import net.henaoui.tictactoe.Board;

public class Game {
    
    Player p1;
    Player p2;
    Board b;
    
    Game(Player p1,Player p2,Board b){
     this.p1=p1;
     this.p2=p2;
     this.b=b;
    }
    
    void startGame(){
        b.afficherBoard();
    }
    
    
    void restartGame(){
        b.viderCases();
        b.afficherBoard();
    }
    
    void QuiterGame(){
        System.out.print("Merci d'avoir jouer.");
        System.exit(0);
    }
    
}
