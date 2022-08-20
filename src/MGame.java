public class MGame {
    private static final int N = 10;
    private int roundCount = 0;
    private Player[] players;
    private Board board;
    private Die[] dice;

    public void playGame(){
        while(roundCount < N){
            playRound();
            roundCount++;
        }
    }

    public void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }

}
