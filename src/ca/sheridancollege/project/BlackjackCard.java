package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Collections;

public class BlackjackCard extends Card {
    private int value;

    public BlackjackCard(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}