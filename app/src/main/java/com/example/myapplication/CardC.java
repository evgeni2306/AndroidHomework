package com.example.myapplication;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class CardC {
    private int Rank;
    private Suit CardsSuit;

    private static int MaxDiamonds = 0;
    private static int MaxClubs = 0;
    private static int MaxHearts = 0;
    private static int MaxSpades = 0;

    public CardC(int rank, Suit suit)
    {
        Rank = rank;
        CardsSuit = suit;
    }
    public CardC(Suit suit)
    {
        CardsSuit = suit;
        switch (suit)
        {
            case clubs:
                Rank = MaxClubs++;
                break;
            case hearts:
                Rank = MaxHearts++;
                break;
            case spades:
                Rank = MaxSpades++;
                break;
            case diamonds:
                Rank = MaxDiamonds++;
                break;
        }
    }

    public int getRank()
    {
        return  Rank;
    }

    public Suit getSuit()
    {
        return CardsSuit;
    }
}
