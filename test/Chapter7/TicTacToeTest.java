package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
        TicTacToe game ;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
        for (int i = 0; i < game.SIZE; i++) {
            for (int j = 0; j < game.SIZE; j++) {
                game.bigBoyGame[i][j]=" ";
            }
        }
    }
    @AfterEach
    void result(){
        game.display();
    }

    @Test
    void testThatWeHaveATwoDimensionalArray(){
        System.out.println(game.bigBoyGame.length);
    }

    @Test
    void testThatYouCanDisplayArrayTable(){
        for (int i = 0; i < game.SIZE; i++) {
            for (int j = 0; j < game.SIZE; j++) {
                System.out.print(game.bigBoyGame[i][j]+"            ");
            }
            System.out.println();
            System.out.println("_ ".repeat(19));

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    @Test
    void tesThatWeCanHaveEmptySpaces(){
        for (int i = 0; i < game.SIZE; i++) {
            for (int j = 0; j < game.SIZE; j++) {
                System.out.print(game.bigBoyGame[i][j]=" "+"            ");

            }
            System.out.println();
            System.out.println("_ ".repeat(19));

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        }
    }
    @Test
    void thatGamePlays(){
        game.player1(1);
        game.player2(1);
        game.player2(3);

        game.player2(5);
        game.player1(4);

        game.player1(9);
        game.player2(7);


    }
}