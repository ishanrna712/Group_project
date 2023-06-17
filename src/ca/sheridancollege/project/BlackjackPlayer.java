package ca.sheridancollege.project;

import java.util.ArrayList;

public class BlackjackPlayer extends Player {
    private ArrayList<Card> hand;
    private int score;

    public BlackjackPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
        score = 0;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public int getScore() {
        return score;
    }

    public void calculateScore() {
        score = 0;
        int numOfAces = 0;

        for (Card card : hand) {
            BlackjackCard blackjackCard = (BlackjackCard) card;
            if (blackjackCard.getValue() == 1) {
                numOfAces++;
                score += 11;
            } else if (blackjackCard.getValue() > 10) {
                score += 10;
            } else {
                score += blackjackCard.getValue();
            }
        }

        while (score > 21 && numOfAces > 0) {
            score -= 10;
            numOfAces--;
        }
    }

    @Override
    public void play() {
        // Implement the logic for player's turn in the Blackjack game
    }
}