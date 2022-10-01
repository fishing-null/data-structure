package seqList.poker;

import java.util.ArrayList;
import java.util.List;

public class Poker {
    private String suit;
    private int rank;
    private final String[] suits = {"♥","♠","♣","♦"};
    public Poker(int rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }
    public List<Poker> buyOne(){
        List<Poker> pokers = new ArrayList<>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 1; j <= 13; j++) {
                Poker poker = new Poker(j,suits[i]);
                pokers.add(poker);
            }
        }
        return pokers;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
