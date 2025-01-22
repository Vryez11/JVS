package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCardGameMain {

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        String[] art = new String[]{"♠", "♥", "♦", "♣"};
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < art.length; j++) {
                deck.add(new Card(i, art[j]));
            }
        }

        Collections.shuffle(deck);
        int player1Sum = 0;
        List<Card> player1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player1.add(deck.get(i));
            player1Sum += deck.get(i).number;
        }
        player1.sort(null);

        int player2Sum = 0;
        List<Card> player2 = new ArrayList<>();
        for (int i = 6; i < 11; i++) {
            player2.add(deck.get(i));
            player2Sum += deck.get(i).number;
        }
        player2.sort(null);

        System.out.println("플레이어1의 카드: " + player1 + ", 합계: " + player1Sum);
        System.out.println("플레이어2의 카드: " + player2 + ", 합계: " + player2Sum);

        if (player1Sum > player2Sum)
            System.out.println("플레이어1 승리");
        else if (player1Sum < player2Sum)
            System.out.println("플레이어2 승리");
        else
            System.out.println("무승부");
    }

    static class Card implements Comparable<Card>{
        private int number;
        private String art;

        public Card(int number, String art) {
            this.number = number;
            this.art = art;
        }

        @Override
        public String toString() {
            return number + "(" + art + ")";
        }

        @Override
        public int compareTo(Card o) {
            Integer thisValue = artValue(this);
            Integer otherValue = artValue(o);
            if (this.number != o.number) {
                return this.number - o.number;
            } else {
                return Integer.compare(thisValue, otherValue);
            }
        }

        private int artValue(Card card) {
            int artValue = switch (art) {
                case "♠" -> 1;
                case "♥" -> 2;
                case "♦" -> 3;
                default -> 4;
            };

            return artValue;
        }
    }
}
