package net.henaoui.tictactoe;

import java.util.ArrayList;
import java.util.Scanner;
import net.henaoui.tictactoe.Player;
import net.henaoui.tictactoe.Board;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("----Welcom to game Tic-Tac-Toe:----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the name of player 1:");
        String name_player_1=scanner.nextLine();
        Player p1=new Player(name_player_1,"X");
        System.out.print("enter the name of player 2:");
        String name_player_2=scanner.nextLine();
        Player p2=new Player(name_player_2,"O");
        Board b=new Board();
        Game game=new Game(p1,p2,b);
        game.b.afficherBoard();
        int ligne;
        int column;
        Player current_player=p1;
        for(;;){
        System.out.println("turn of "+current_player.getName());
        System.out.println("enter place of your symbol:");
        System.out.println("enter line(1->3):");
        ligne=scanner.nextInt()-1;
        System.out.println("enter column(1->3):");
        column=scanner.nextInt()-1;
        if(ligne <0 || ligne>2 || column <0 || column>2 || game.b.getCase(ligne, column).isOccuper()){
        System.out.println("ligne or column not valid or occuped !!!");
        continue;
        }
        b.getCase(ligne, column).setOccuper(true);
        b.getCase(ligne, column).setCaractere(current_player.getSymbol());
        game.b.afficherBoard();
        if(game.b.verifierGagne()){
            System.out.println("Well done "+current_player.getName()+" you are Win");
            game.restartGame();
            continue;
        }
        else if(game.b.verifierEgaliteJeux()){
            System.out.println("This game is a draw for both players.");
            game.restartGame();
            continue;
        }
        current_player= (current_player==p1)? p2 : p1;
        }
    }
}
