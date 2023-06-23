import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // scoretable 2d array,
        char[][] scoreTable = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
        };
        
        // co-ordinates to fill in scoretable
        // int[] coord = new int[2];
        Scanner in = new Scanner(System.in);

        short choice = 0;
        while (choice != 3) {
            System.out.println(
                "1. Play PvP\n" +
                "2. Show Demo (Help -- coordinates)\n" +
                "3. Exit\n"
            );

            
            choice = in.nextShort();
            Board board = new Board();
            CheckWinner winner = new CheckWinner(); 
            switch (choice) {
                case 1:
                    // System.out.println("\033[H\033[2J");
                    // System.out.flush();
                    System.out.println("Enter Player1 Name: ");
                    // String Player1 = in.next();
                    winner.Player1 = in.next();
                    System.out.println("Enter Player2 Name: ");
                    // String Player2 = in.next();
                    winner.Player2 = in.next();
                    // winner.Player1 = Player1;
                    // winner.Player2 = Player2;
                    short count = 0;
                    while ((CheckWinner.someoneWon == false) && (count < 9)) {
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        board.updatedTable(scoreTable);
                        if (count%2 == 0) {
                            System.out.println(winner.Player1 + "'s turn:");
                            System.out.println("Print X coordinate: ");
                            short X_coord = in.nextShort();
                            System.out.println("Print Y coordinate: ");
                            short Y_coord = in.nextShort();
                            if (scoreTable[X_coord][Y_coord] == ' '){
                                scoreTable[X_coord][Y_coord] = 'X';
                                count++;
                            }
                        }
                        else {
                            System.out.println(winner.Player2 + "'s turn:");
                            System.out.println("Print X coordinate: ");
                            short X_coord = in.nextShort();
                            System.out.println("Print Y coordinate: ");
                            short Y_coord = in.nextShort();
                            if (scoreTable[X_coord][Y_coord] == ' ')
                            {
                                scoreTable[X_coord][Y_coord] = 'O';
                                count++;
                            }
                        } 
                        System.out.println(winner.winner(scoreTable));
                    }
                    break;

                case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    board.showDemo();
                    break;

                case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Thank You for playing.\n");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
            // System.out.println("\033[H\033[2J");
            // System.out.flush();
        }
        in.close();
    }

}