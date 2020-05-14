package demo1;

import demo.MyLinkList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description: 扑克牌练习
 * User: HHH.Y
 * Date: 2020-05-13
 */
class Card {
    public int rank; // 牌面值
    public String suit; // 花色

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d]", suit, rank);
    }
}
public class CardList {
    // 1. 初始化花色, 由于花色从头到尾是不变的, 因此初始化成一个常量(常量应该大写)
    public static final String[] SUITS = {"♥", "♠", "♦", "♣"};

    // 买牌 (一副牌共52张, 总共4个花色, 每个花色13张牌)
    public static List<Card> buyDeck() {
        List<Card> deck = new ArrayList<>(); // 创建一个存放一副牌的集合
        // 共4个花色
        for (int i = 0; i < 4; i++) {
            // 一个花色总共有13张牌
            for (int j = 1; j <= 13; j++) {
                int rank = j;
                String suit = SUITS[i];
                Card card = new Card(rank, suit); // 形成一张牌
                deck.add(card); // 将牌放入到集合中
            }
        }
        return deck;
    }

    private static void swap(List<Card> deck, int index, int i) {
        // 在数组中是这样进行交换的 tmp = [index]
        //                       [index] = [i]
        //                       [i] = tmp
        Card tmp = deck.get(index);
        deck.set(index, deck.get(i));
        deck.set(i, tmp);
    }
    // 洗牌 (将牌进行前后交换)
    public static List<Card> shuffle(List<Card> deck) {
        // 由于random抽取到的随机值的范围是[0, i), 所以采用从后向前进行交换
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int index = random.nextInt(i);
            swap(deck, index, i);
        }
        return deck;
    }

    public static void main(String[] args) {
        List<Card> deck = buyDeck();
        System.out.println(deck);
        System.out.println("洗牌: ");
        shuffle(deck);
        System.out.println(deck);

        // 发牌 (3个人, 轮流, 进行揭牌, 每个人揭5张牌)
        // 1. 创建一个大的集合, 里面用于存放3个人
        List< List<Card> > hand = new ArrayList<>();

        // 2. 创建3个集合, 分别表示3个人手中的牌
        List<Card> hands1 = new ArrayList<>();
        List<Card> hands2 = new ArrayList<>();
        List<Card> hands3 = new ArrayList<>();

        hand.add(hands1);
        hand.add(hands2);
        hand.add(hands3);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card card = deck.remove(0); // 每次抽出的牌
                hand.get(j).add(card);
            }
        }
        System.out.println("第1个人的牌: ");
        System.out.println(hands1);
        System.out.println("第2个人的牌: ");
        System.out.println(hands2);
        System.out.println("第3个人的牌: ");
        System.out.println(hands3);
        System.out.println("剩下的牌: ");
        System.out.println(deck);
    }
}
