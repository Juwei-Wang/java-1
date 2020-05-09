package com.zzpublic.assignments.q08;

import com.zzpublic.console.Console;

import java.util.Arrays;
import java.util.LinkedList;

public class Poker {
    public static void main(String[] args) {
        {
            // 扑克牌的纸牌用数字表示，暂时不考虑扑克的花色问题
            // A 1
            // 2 2
            // 3 3
            // ...
            // 10 10
            // J 11
            // Q 12
            // K 13
            // 假设没有 小王大王牌

            // 代码写在 todo 的位置
        }
        {
            /*
                要求
                    给定 一副手牌
                    判断 是否已经排好序
                    输出 true 或者 false

                背景知识
                    德州扑克的顺序是
                    2 3 4 ... 10 J Q K A

                正确案例
                    1 2 3 4 5 应该是 false
                    2 5 7 9 11 应该是 true
                    2 8 9 13 1 应该是 true
             */

            int[] cards = {1, 2, 3, 4, 5};

            String str = Arrays.toString(cards);
            Console.println(str);

            for (int i = 0; i < cards.length; i++) {
                if (cards[i] == 1) {
                  cards[i] = 14;
                }
            }

            boolean increasing = true;
            for (int i = 1; i < cards.length; i++) {
                if (cards[i] < cards[i - 1]){
                    increasing = false;
                    break;
                }
            }

            Console.println(increasing);
        }
        {
            Console.printHeader2("question 1 - 2");
            int[] cards = {6, 7, 8, 1, 5};
            int max = 13;
            int min = 2;
            for (int i = 0; i < 5; i++) {
                if (cards[i] >= min) {
                    min = cards[i];
                    if (cards[4] == min) {
                        Console.println("true");
                        break;
                    } else if (cards[3] == min && cards[4] == 1) {
                        Console.println("true");
                        break;
                    }
                } else {
                    // decrease
                    Console.println("false");
                    break;
                }
            }
        }
        {
            /*
                要求
                    给定 一副一定升序的手牌
                    判断 是否是顺子
                    输出 true 或者 false

                背景知识
                    德州扑克的顺子是
                    五张牌连在一起

                正确案例
                    1 2 3 4 5 应该是 false
                    2 5 7 9 11 应该是 false
                    6 7 8 9 10 应该是 true
                    10 11 12 13 1 应该是 true
             */
            int[] cards = {2, 3, 4, 5, 6};
            // TODO:

            for (int i = 0; i < cards.length; i++) {
                if (cards[i] == 1) {
                    cards[i] = 14;
                }
            }

            boolean increasing = true;
            for (int i = 1; i < cards.length; i++) {
                if (cards[i] != cards[i - 1] + 1){
                    increasing = false;
                    break;
                }
            }

            Console.println(increasing);


        }
        {
            /*
                要求
                    给定 一副一定升序的手牌
                    判断 是否是葫芦
                    输出 true 或者 false

                背景知识
                    德州扑克的葫芦是
                    三张一样的 + 两张一样的

                正确案例
                    1 2 3 4 5 应该是 false
                    2 2 3 3 4 应该是 false
                    7 7 7 1 1 应该是 true
                    8 8 9 9 9 应该是 true
             */
            int[] cards = {2, 3, 4, 5, 6};
            // TODO:


            //  AAABB
            //  AABBB

            //  1 = 2
            //  4 = 5
            //  3 ?= 2 / 4

            if (cards[0] == cards[1] && cards[3] == cards[4]){
                if (cards[2] == cards[1] || cards[2] == cards[3]) {
                    Console.println(true);
                } else {
                    Console.println(false);
                }
            } else {
                Console.println(false);
            }



        }
    }
}
