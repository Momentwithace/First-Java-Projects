package Chapter7.TicTacToe;

import java.util.Objects;

public class TicTacToe {
    public String[][] bigBoyGame;
    public final int SIZE = 3;

    public TicTacToe() {
        this.bigBoyGame = new String[SIZE][SIZE];

    }

    public void empty() {


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == 0) {
                    bigBoyGame[i][j] = "%d";
                    bigBoyGame[i][j] = bigBoyGame[i][j].formatted(j + 1);
                }
                if (i == 1) {
                    bigBoyGame[i][j] = "%d";
                    bigBoyGame[i][j] = bigBoyGame[i][j].formatted(j + 4);
                }
                if (i == 2) {
                    bigBoyGame[i][j] = "%d";
                    bigBoyGame[i][j] = bigBoyGame[i][j].formatted(j + 7);
                }

            }

        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(bigBoyGame[i][j] + "       ");

            }
            System.out.println();
            System.out.println("__".repeat(9));
            System.out.println();
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bigBoyGame[i][j] = " ";
            }
        }
    }
    public void player1(int number) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (number >= 1 && number <= 3 && Objects.equals(bigBoyGame[0][number - 1], " ")) {
                    bigBoyGame[0][number - 1] = "X";
                    break;
                }
                if (number >= 4 && number <= 6 && Objects.equals(bigBoyGame[1][number - 4], " ")) {
                    bigBoyGame[1][number - 4] = "X";
                    break;
                }
                if (number >= 7 && number <= 9 && Objects.equals(bigBoyGame[2][number - 7], " ")) {
                    bigBoyGame[2][number - 7] = "X";
                    break;
                }
            }
        }
        display();
        resultPlayer1();


    }

    public void player2(int number) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (number >= 1 && number <= 3 && Objects.equals(bigBoyGame[0][number - 1], " ")) {
                    bigBoyGame[0][number - 1] = "O";

                    break;
                }
                if (number >= 4 && number <= 6 && Objects.equals(bigBoyGame[1][number - 4], " ")) {
                    bigBoyGame[1][number - 4] = "O";

                    break;
                }
                if (number >= 7 && number <= 9 && Objects.equals(bigBoyGame[2][number - 7], " ")) {
                    bigBoyGame[2][number - 7] = "O";
                    break;
                }
            }
        }
        display();
        resultPlayer2();

    }

    public void display(){


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(bigBoyGame[i][j]+"        ");

            }
            System.out.println();
            System.out.println("__".repeat(9));

            System.out.println();
        }

    }

    public String resultPlayer1() {
        String result = " ";
        //rows- horizontal play
        if (Objects.equals(bigBoyGame[0][0], "X") && Objects.equals(bigBoyGame[0][1], "X") && Objects.equals(bigBoyGame[0][2], "X")) {
            result = "Player 1 wins";
        }
        if (Objects.equals(bigBoyGame[1][0], "X") && Objects.equals(bigBoyGame[1][1], "X") && Objects.equals(bigBoyGame[1][2], "X")) {
            result = "Player 1 wins";
        }
        if (Objects.equals(bigBoyGame[2][0], "X") && Objects.equals(bigBoyGame[2][1], "X") && Objects.equals(bigBoyGame[2][2], "X")) {
            result = "Player 1 wins";
        }

        //columns=- vertical play
        if (Objects.equals(bigBoyGame[0][0], "X") && Objects.equals(bigBoyGame[1][0], "X") && Objects.equals(bigBoyGame[2][0], "X")) {
            result = "Player 1 wins";
        }
        if (Objects.equals(bigBoyGame[0][1], "X") && Objects.equals(bigBoyGame[1][1], "X") && Objects.equals(bigBoyGame[2][1], "X")) {
            result = "Player 1 wins";
        }
        if (Objects.equals(bigBoyGame[0][2], "X") && Objects.equals(bigBoyGame[1][2], "X") && Objects.equals(bigBoyGame[2][2], "X")) {
            result = "Player 1 wins";
        }

        //diagonal play
        if (Objects.equals(bigBoyGame[0][0], "X") && Objects.equals(bigBoyGame[1][1], "X") && Objects.equals(bigBoyGame[2][2], "X")) {
            result = "Player 1 wins";
        }
        if (Objects.equals(bigBoyGame[0][2], "X") && Objects.equals(bigBoyGame[1][1], "X") && Objects.equals(bigBoyGame[2][0], "X")) {
            result = "Player 1 wins";
        }
         return  result;
          }
 public String resultPlayer2(){
       String result2 = " ";
        if(Objects.equals(bigBoyGame[0][0], "O") && Objects.equals(bigBoyGame[0][1], "O") && Objects.equals(bigBoyGame[0][2], "O")){
            result2 = "Player 2 wins";
        }
        if(Objects.equals(bigBoyGame[1][0], "O") && Objects.equals(bigBoyGame[1][1], "O") && Objects.equals(bigBoyGame[1][2], "O")){
            result2 = "Player 2 wins";
        }
        if(Objects.equals(bigBoyGame[2][0], "O") && Objects.equals(bigBoyGame[2][1], "O") && Objects.equals(bigBoyGame[2][2], "O")){
            result2 = "Player 2 wins";
        }

        //columns=- vertical play
        if(Objects.equals(bigBoyGame[0][0], "O") && Objects.equals(bigBoyGame[1][0], "O") && Objects.equals(bigBoyGame[2][0], "O")){
            result2 = "Player 2 wins";
        }
        if(Objects.equals(bigBoyGame[0][1], "O") && Objects.equals(bigBoyGame[1][1], "O") && Objects.equals(bigBoyGame[2][1], "O")){
            result2 = "Player 2 wins";
        }
        if(Objects.equals(bigBoyGame[0][2], "O") && Objects.equals(bigBoyGame[1][2], "O") && Objects.equals(bigBoyGame[2][2], "O")){
            result2 = "Player 2 wins";
        }

        //diagonal play
        if(Objects.equals(bigBoyGame[0][0], "O") && Objects.equals(bigBoyGame[1][1], "O") && Objects.equals(bigBoyGame[2][2], "O")){
            result2 = "Player 2 wins";
        }
        if(Objects.equals(bigBoyGame[0][2], "O") && Objects.equals(bigBoyGame[1][1], "O") && Objects.equals(bigBoyGame[2][0], "O")){
            result2 = "Player 2 wins";
        }

        return result2;

    }


}
