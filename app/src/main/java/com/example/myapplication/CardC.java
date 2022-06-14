package com.example.myapplication;

import  com.example.myapplication.Suit;

import java.util.HashMap;
import java.util.Map;

public class CardC {
    private static final Map<Suit, Integer> MaxRanks = new HashMap() {
        {
            put(Suit.diamonds, 0);
            put(Suit.clubs, 0);
            put(Suit.spades, 0);
            put(Suit.hearts, 0);
        }
    };
    private final int rank;
    private final Suit suit;

    public CardC(int rank, Suit suit) {
        int currentMaxRank = Math.max(MaxRanks.get(suit), rank);
        MaxRanks.put(suit, currentMaxRank);
        this.rank = rank;
        this.suit = suit;
    }

    public CardC(Suit suit) {
        this.suit = suit;
        this.rank = MaxRanks.get(suit) + 1;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
