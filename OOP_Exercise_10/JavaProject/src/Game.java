public class Game {

    private int id;
    private Player player1;
    private Player player2;

    public Game(int id, Player player1, Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getWinner() {
        return (player1.getScore() >= 100 && player2.getScore() >= 100 ? player1 : null);
    }

    public void resetGame() {
        this.player1.setScore(0);
        this.player2.setScore(0);
    }

    public void swapPlayers() {
        Player temp;
        temp = this.player1;
        this.player1 = this.player2;
        this.player2 = temp;
    }
}
