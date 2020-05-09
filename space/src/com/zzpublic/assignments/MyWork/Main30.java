package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main30 {
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

            String[] cards = {"6", "9", "4", "5", "6"};
            String[] pokerNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            // TODO:
            int index = 0;
            int index_compare = 0;
            for(int i = 0; i < cards.length; i++){
                int index_store = 0;
                index_compare = index;
                while(cards[i] != pokerNumber[index_store]){
                    index_store += 1;
                }
                if (cards[i] == pokerNumber[index_store]) {
                    index = index_store;
                }
                if (index_compare > index) {
                    Console.println("False");
                    break;
                }
                if (i == (cards.length - 1) ){
                    Console.println("ture");
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
            String[] cards = {"9", "10", "J", "Q", "K"};
            String[] pokerNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            // TODO:
            // Find the index of the first element in pokerNumber
            int index = 0;
            while (cards[0] != pokerNumber[index]){
                index += 1;
            }
            // To find out if there are other numbers which equal to the elements in the pokerNumber with the same indexes
            for(int i = 0; i < cards.length; i++){
                int index_store = index;
                if (cards[i] == pokerNumber[index]){
                    index = index + 1;
                }
                if (index == index_store){
                    Console.println("False");
                    break;
                }
                if (i == cards.length - 1 && index != index_store){
                    Console.println("Ture");
                }


            }



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
            String[] cards = {"3", "3", "6", "6", "6"};
            String[] pokerNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            // TODO;
            int index_store = 0;
            int[] cards_index_array = new int[cards.length];
            for (int i = 0; i < cards.length; i++){
                cards_index_array[i] = index_store;
                while (cards[i] == pokerNumber[index_store]){
                    index_store += 1;
                }

            }
            // Let's check out if there has the same indexes
            // and calculate the times of the numbers changing
            int  calculateNumber1 = 0;
            for (int i = 0; i < cards.length; i++){
                if (i < cards.length - 1) {
                    if (cards_index_array[i] != cards_index_array[i + 1]){
                        calculateNumber1 = calculateNumber1 + 1;
                    }

                }
            }

            if (calculateNumber1 == 1){
                Console.println("Ture");
            }
            else{
                Console.println("Flase");
            }




        }



    }
}
