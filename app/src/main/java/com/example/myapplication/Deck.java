package com.example.myapplication;

import  com.example.myapplication.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final ArrayList<CardB> cards;

    private Deck() {
        cards = new ArrayList<>();
    }

    public static Deck createDeckWithoutJokers() {
        Deck deck = new Deck();
        for (int i = 1; i < 14; i++) {
            deck.cards.add(new CardB(i, Suit.clubs));
            deck.cards.add(new CardB(i, Suit.diamonds));
            deck.cards.add(new CardB(i, Suit.spades));
            deck.cards.add(new CardB(i, Suit.hearts));
        }
        return deck;
    }

    public static Deck createDeckWithJokers() {
        Deck deck = createDeckWithoutJokers();
        int jokerRank = 14;
        deck.cards.addAll(
                50,
                List.of(new CardB[]{new CardB(jokerRank, Suit.hearts), new CardB(jokerRank, Suit.spades)})
        );
        return deck;
    }

    public static CardB getRandomCard(Deck deck){
        Random random = new Random();
        return deck.cards.get(random.nextInt(deck.cards.size()));
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void sort(){
        Collections.sort(cards);
    }

    public CardB dealCard(){
        CardB currentCard = getRandomCard(this);
        cards.remove(currentCard);
        return currentCard;
    }

    public void returnCardIntoDeck(CardB card){
        if(!cards.contains(card)){
            cards.add(card);
        }
    }

    public boolean isEmpty(){
        return cards.size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder strCards = new StringBuilder();
        if(this.isEmpty())
            return "Deck is empty";
        for (CardB card : cards){
            strCards.append(" ").append(card).append("\n");
        }
        return "Deck{ \n" +
                "cards: \n" + strCards +
                "}\n";
    }
}
