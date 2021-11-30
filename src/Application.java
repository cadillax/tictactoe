import java.util.Scanner;

public class Application {
    static char[][] board = new char[3][3];
    static boolean isContinue = true;
    static char[] simb = {'x', '0'};

    public static void main(String[] args) {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int y = 0; y < board.length; y++) {
                board[i][y] = ' ';
            }
        }
        while (isContinue) {
            for (int i = 0; i < simb.length; i++) {
                makeMove(simb[i]);
                drawMap();
                chekWin();
            }
        }
    }

    public static void makeMove(char symbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, type position X!");
        int x = scanner.nextInt();
        System.out.println("Hey, type position Y");
        int y = scanner.nextInt();
        if (chekPosition(x, y, symbol)) {
            return;
        }
        board[x][y] = symbol;
    }

    public static void drawMap() {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int g = 0; g < board.length; g++) {
                System.out.print("[" + board[i][g] + "]");
            }
        }
        System.out.println();
    }

    public static boolean chekPosition(int x, int y, char symbol) {
        if (board[x][y] == ' ') {
            return false;
        } else {
            System.out.println("Error, this place it's occupied");
            System.out.println("Make move again!");
            makeMove(symbol);
            return true;
        }
    }

    public static void chekWin() {
        for (int i = 0; i < simb.length; i++) {
            if (board[0][0] == simb[i] && board[0][1] == simb[i] && board[0][2] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[1][0] == simb[i] && board[1][1] == simb[i] && board[1][2] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[2][0] == simb[i] && board[2][1] == simb[i] && board[2][2] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[0][0] == simb[i] && board[1][0] == simb[i] && board[2][0] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[0][1] == simb[i] && board[1][1] == simb[i] && board[2][1] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[0][2] == simb[i] && board[1][2] == simb[i] && board[2][2] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[0][0] == simb[i] && board[1][1] == simb[i] && board[2][2] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            } else if (board[0][2] == simb[i] && board[1][1] == simb[i] && board[2][0] == simb[i]) {
                System.out.println("Wow! You win!");
                isContinue = false;
            }
        }
    }
}
