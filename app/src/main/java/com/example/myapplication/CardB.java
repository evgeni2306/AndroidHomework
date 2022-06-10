package com.example.myapplication;
import java.util.Objects;

public class CardB {
    private final int Rank;
    private final Suit CardsSuit;

    public static final String[] Ranks = new String[]
            {
                    "Two",
                    "Three",
                    "Four",
                    "Five",
                    "Six",
                    "Seven",
                    "Eight",
                    "Nine",
                    "Ten",
                    "Jack",
                    "Queen",
                    "King",
                    "Ace",
                    "Joker"
            };

    public CardB(int rank, Suit suit)
    {
        Rank = rank;
        CardsSuit = suit;
    }

    public int getRank()
    {
        return  Rank;
    }

    public Suit getSuit()
    {
        return CardsSuit;
    }

    @Override
    public String toString()
    {
        return "CardB{" +
                "Rank=" + Ranks[Rank] +
                ", CardsSuit=" + CardsSuit.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardB cardB = (CardB) o;
        return Rank == cardB.Rank && CardsSuit == cardB.CardsSuit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Rank, CardsSuit);
    }

    public Boolean isIn54()
    {
        return (52/4) >= Rank+1;
    }
    public Boolean isStronger(CardB card)
    {
        if(card.getSuit() != this.CardsSuit)
            return false;
        return card.getRank() > this.Rank;
    }
    public int Compare(CardB card)
    {
        return card.getSuit().ordinal() - this.CardsSuit.ordinal();
    }
    public static int Compare(CardB a, CardB b)
    {
        return a.getSuit().ordinal() - b.getSuit().ordinal();
    }
}
