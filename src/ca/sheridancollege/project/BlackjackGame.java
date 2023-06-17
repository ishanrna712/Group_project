package ca.sheridancollege.project;

public class BlackjackGame extends Game {
    private GroupOfCards deck;
    private BlackjackPlayer dealer;

    public BlackjackGame(String name) {
        super(name);
        deck = new GroupOfCards(52);
        dealer = new BlackjackPlayer("Dealer");
    }

    private void initializeDeck() {
        for (int i = 1; i <= 13; i++) {
            deck.getCards().add(new BlackjackCard(i));
        }
        // Repeat the above loop for all the card suits (hearts, diamonds, clubs, spades)
    }

    private void dealInitialCards() {
        for (Player player : getPlayers()) {
            BlackjackPlayer blackjackPlayer = (BlackjackPlayer) player;
            blackjackPlayer.addCardToHand(deck.getCards().remove(0));
            blackjackPlayer.addCardToHand(deck.getCards().remove(0));
            blackjackPlayer.calculateScore();
        }
        dealer.addCardToHand(deck.getCards().remove(0));
        dealer.addCardToHand(deck.getCards().remove(0));
        dealer.calculateScore();
    }

    private void playPlayerTurns() {
        for (Player player : getPlayers()) {
            BlackjackPlayer blackjackPlayer = (BlackjackPlayer) player;
            blackjackPlayer.play();
        }
    }

    private void playDealerTurn() {
        dealer.play();
    }

    private void determineWinners() {
        // Implement the logic to determine the winner(s) of the Blackjack game
    }

    @Override
    public void play() {
        initializeDeck();
        deck.shuffle();
        dealInitialCards();
        playPlayerTurns();
        playDealerTurn();
        determineWinners();
        System.out.println("Starting the Blackjack game...");
    }

    @Override
    public void declareWinner() {
        // Implement the logic to declare and display the winning player(s) of the Blackjack game
        System.out.println("Game over! Declaring the winner...");
    }
}