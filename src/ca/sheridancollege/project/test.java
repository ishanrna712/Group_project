package ca.sheridancollege.project;

public class test {
     public static void main(String[] args) {
        BlackjackGame blackjackGame = new BlackjackGame("Blackjack");
        blackjackGame.getPlayers().add(new BlackjackPlayer("Player 1"));
        blackjackGame.getPlayers().add(new BlackjackPlayer("Player 2"));

        blackjackGame.play();
        blackjackGame.declareWinner();
    }
}
