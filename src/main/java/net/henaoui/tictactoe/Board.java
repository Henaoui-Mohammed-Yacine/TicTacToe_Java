package net.henaoui.tictactoe;

import net.henaoui.tictactoe.Case;

public class Board {

    private Case[][] cases;

    Board() {
        cases = new Case[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cases[i][j] = new Case(i,j); 
            }
        }
    }

    void afficherBoard() {
       
        System.out.print(cases[0][0].getCaractere());
        System.out.print("|");
        System.out.print(cases[0][1].getCaractere());
        System.out.print("|");
        System.out.println(cases[0][2].getCaractere());
        System.out.print("_ ");
        System.out.print("_ ");
        System.out.println("_ ");
        System.out.print(cases[1][0].getCaractere());
        System.out.print("|");
        System.out.print(cases[1][1].getCaractere());
        System.out.print("|");
        System.out.println(cases[1][2].getCaractere());
        System.out.print("_ ");
        System.out.print("_ ");
        System.out.println("_ ");
        System.out.print(cases[2][0].getCaractere());
        System.out.print("|");
        System.out.print(cases[2][1].getCaractere());
        System.out.print("|");
        System.out.println(cases[2][2].getCaractere());
    }

    Case getCase(int l,int c){
        return cases[l][c];
    }
    
    
    void remplirCase(int ligne, int colone, String symbol) {
        cases[ligne][colone].setCaractere(symbol);
    }

    public boolean verifierGagne() {
        // Vérification des lignes
        if (cases[0][0].getCaractere() == cases[0][1].getCaractere() && cases[0][0].getCaractere() == cases[0][2].getCaractere() && cases[0][0].getCaractere() != " ") {
            return true;
        }
        if (cases[1][0].getCaractere() == cases[1][1].getCaractere() && cases[1][0].getCaractere() == cases[1][2].getCaractere() && cases[1][2].getCaractere() != " ") {
            return true;
        }
        if (cases[2][0].getCaractere() == cases[2][1].getCaractere() && cases[2][0].getCaractere() == cases[2][2].getCaractere() && cases[2][2].getCaractere() != " ") {
            return true;
        }

        // Vérification des colonnes
        if (cases[0][0].getCaractere() == cases[1][0].getCaractere() && cases[0][0].getCaractere() == cases[2][0].getCaractere() && cases[2][0].getCaractere() != " ") {
            return true;
        }
        if (cases[0][1].getCaractere() == cases[1][1].getCaractere() && cases[0][1].getCaractere() == cases[2][1].getCaractere() && cases[2][1].getCaractere() != " ") {
            return true;
        }
        if (cases[0][2].getCaractere() == cases[1][2].getCaractere() && cases[0][2].getCaractere() == cases[2][2].getCaractere() && cases[2][2].getCaractere() != " ") {
            return true;
        }

        // Vérification des diagonales
        if (cases[0][0].getCaractere() == cases[1][1].getCaractere() && cases[0][0].getCaractere() == cases[2][2].getCaractere() && cases[2][2].getCaractere() != " ") {
            return true;
        }
        if (cases[0][2].getCaractere() == cases[1][1].getCaractere() && cases[0][2].getCaractere() == cases[2][0].getCaractere() && cases[2][0].getCaractere() != " ") {
            return true;
        }

        // Aucune condition de victoire trouvée
        return false;
    }
    
    boolean verifierEgaliteJeux(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             if(!cases[i][j].isOccuper())
                 return false;
        }
        }
        return true;
    }
    
    void viderCases(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             cases[i][j].setCaractere(" ");
             cases[i][j].setOccuper(false);
        }
        }
    }
}
