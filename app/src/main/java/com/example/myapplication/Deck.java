package com.example.myapplication;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<CardB> Cards;

    private Deck()
    {
        Cards = new ArrayList<>();
    }

    public static Deck Create(Boolean useJokers)
    {
        Suit[] values = Suit.values();
        Deck deck = new Deck();
        for(int k = 0; k < 4; k++) {
            for (int i = 0; i < CardB.Ranks.length-1; i++) {
                deck.Cards.add(new CardB(i, values[k]));
            }
        }

        if(useJokers)
        {
            deck.Cards.add(new CardB(CardB.Ranks.length, Suit.spades));
            deck.Cards.add(new CardB(CardB.Ranks.length, Suit.hearts));
        }


        return deck;
    }

    public void Shuffle()
    {
        Collections.shuffle(Cards);
    }

    public static CardB GetRandom(Deck deck)
    {
        return deck.Cards.get((int) getRandomDoubleBetweenRange(0, deck.Cards.size()-1));
    }

    private static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }

    public CardB Get()
    {
        int indx = Cards.size()-1;
        CardB card = Cards.get(indx);
        Cards.remove(indx);
        return card;
    }
    public void Add(CardB card) throws Exception {
        if(Cards.contains(card))
            throw new Exception("Card is already in the Deck");
        Cards.add(card);
    }

    public boolean isEmpty()
    {
        return !(Cards.size() > 0);
    }

    @Override
    public String toString() {
        StringBuilder deck = new StringBuilder();

        for (CardB card :
                this.Cards) {
            deck.append(card.toString()).append("\n");
        }

        return "Deck{" +
                "Cards=" + deck.toString() +
                '}';
    }
}
