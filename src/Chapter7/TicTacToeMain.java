package Chapter7;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        mainMenu();


    }

    private static void mainMenu() {
        TicTacToe aceGame = new TicTacToe();
        System.out.println("""
                
                
                
                
                                   TICKTACKTOE GAME
                                      1 PLAY
                                      2 RULES
                                      3 QUIT
                
                
                
                
                        
                """);
        String rules = ("""
                              
                                  
                                    TICKTACKTOE
                                    GAME RULES
                
                 -> The game is played on a grid that's 3 squares by 3 squares.
                 -> You are X, The next player is O.
                 -> The first player to get 3 of his/her marks in a roll
                (Up, Down, Across, or Diagonally) is the winner.
                 -> When all 9 squares are full, the game is over.
                0 -> Start Game
         
                
                
                
                """);

        Scanner input = new Scanner(System.in);

        String result = " ";


        int userInput = input.nextInt();
        if(userInput == 1){
            System.out.println("GAME FORMAT");
            aceGame.empty();
            do {
                System.out.println("player 1");
                aceGame.player1(input.nextInt());

                result = aceGame.resultPlayer1();
                if(result ==" "){
                    System.out.println("player2");
                    aceGame.player2(input.nextInt());
                    result= aceGame.resultPlayer2();

                }

            }while (result ==" ");

            System.out.println(result);
        }
        if(userInput == 2){
            System.out.println(rules);
            int userInput2 = input.nextInt();
            if (userInput2 == 0) {
                mainMenu();
            }

        }

        if(userInput == 3){
            System.out.println("Thank you for playing");
        }


    }
}
