package com.example.myapplication;

import  com.example.myapplication.Suit;

public class CardB implements Comparable<CardB>{
    private final int rank;
    private final Suit suit;
    private static final String[] dignities = new String[]{"Ace", "Jack", "Queen", "King", "Joker"};

    public CardB(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean isStandardDeck() {
        return rank <= 14;
    }

    public boolean isStronger(CardB card) {
        if (suit == card.suit)
            return rank > card.rank;
        return false;
    }

    @Override
    public int compareTo(CardB card) {
        if (this.equals(card))
            return 0;
        if(this.isStronger(card) || suit.ordinal() > card.suit.ordinal())
            return 1;
        return -1;
    }

    public static int compare(CardB first, CardB second) {
        return first.compareTo(second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CardB cardB = (CardB) obj;
        return rank == cardB.rank && suit == cardB.suit;
    }

    @Override
    public int hashCode() {
        return rank * suit.hashCode();
    }

    @Override
    public String toString() {
        String currentRank;
        int rankBeforeJack = 10;
        if (rank == 1)
            currentRank = dignities[0];
        else if (rank > rankBeforeJack)
            currentRank = dignities[rank - rankBeforeJack];
        else
            currentRank = String.valueOf(rank);
        return String.format("Card{Suit: %s, Rank: %s}", suit, currentRank);
    }

}
