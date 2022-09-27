import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhoWin {
    public static String rps(String p1, String p2) {
        switch (p1) {
            case "rock":
                switch (p2) {
                    case "rock":
                        System.out.println("Draw!");
                        break;

                    case "scissors":
                        System.out.println("Player 1 won!");
                        break;

                    case "paper":
                        System.out.println("Player 2 won!");
                        break;

                    default:
                        System.out.println("Wrong option");
                        break;
                }
            case "scissors":
                switch (p2) {
                    case "scissors":
                        System.out.println("Draw!");
                        break;

                    case "paper":
                        System.out.println("Player 1 won!");
                        break;

                    case "rock":
                        System.out.println("Player 2 won!");
                        break;

                    default:
                        System.out.println("Wrong option");
                        break;
                }
            case "paper":
                switch (p2) {
                    case "paper":
                        System.out.println("Draw!");
                        break;

                    case "rock":
                        System.out.println("Player 1 won!");
                        break;

                    case "scissors":
                        System.out.println("Player 2 won!");
                        break;

                    default:
                        System.out.println("Wrong option");
                        break;
                }
        }

        return null;
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", WhoWin.rps("rock", "scissors"));
        assertEquals("Player 1 won!", WhoWin.rps("scissors", "paper"));
        assertEquals("Player 1 won!", WhoWin.rps("paper", "rock"));
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", WhoWin.rps("scissors", "rock"));
        assertEquals("Player 2 won!", WhoWin.rps("paper", "scissors"));
        assertEquals("Player 2 won!", WhoWin.rps("rock", "paper"));
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", WhoWin.rps("scissors", "scissors"));
        assertEquals("Draw!", WhoWin.rps("paper", "paper"));
        assertEquals("Draw!", WhoWin.rps("rock", "rock"));
    }
}