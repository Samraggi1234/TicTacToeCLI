public class Main {


    public static void main(String[] args) {
        char[][] scoreTable = {
            {'X', 'X', 'O'},
            {'O', 'O', 'X'},
            {'X', 'X', 'O'},
        };
        CheckWinner winner = new CheckWinner();
        winner.Player1 = "Aayush";
        winner.Player2 = "Anish";

        System.out.println(winner.winner(scoreTable));

        // Board board = new Board();
        // board.updatedTable(scoreTable);
    }

}