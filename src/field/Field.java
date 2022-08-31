package field;

import java.util.Random;

public class Field {

    private final int[][] field = new int[10][2];
    private char[][] fieldGame = new char[10][10];
    Random r = new Random();


    public void builField() {

        for (int i = 0; i < 10; i++) {
            field[i][0] = i+1;
            for (int j = 1; j < 2; j++) {
                field[i][j] = r.nextInt(6) + 1;
                System.out.println("Student Nr: " + field[i][0] + ", degree: " + field[i][j]);
            }



        }
    }
    public void buildField(){
        for(int i = 0; i < 10; i++){
            field[i][0] = i + 1;
            for(int j = 1; j < 2; j++){
                field[i][j] = r.nextInt(6) + 1;
                System.out.println("Student nr: " + field[i][0] + ", degree: " + field[i][j]);
            }
        }
    }
    public void buildGame(){
        for(int i = 0; i < fieldGame.length; i++){
            fieldGame[i][0] = '@';
            fieldGame[i][9] = '#';
            for(int t = 1; t < (fieldGame.length - 1); t++) {
                fieldGame[i][t] = ' ';
            }
            for(int j = 1; j < (fieldGame.length - 1); j++){
                fieldGame[0][j] = '!';
                fieldGame[9][j] = '!';

            }


        }
    }

    public void printGame(){
        for(int i = 0; i < fieldGame.length; i++) {
            for(int j = 0; j < fieldGame.length; j++) {
                System.out.print(fieldGame[i][j]);
            }
            System.out.println();
        }
    }








}
