package com.zzpublic.assignments.MyWork;

import com.zzpublic.console.Console;

public class Main12 {
    public static void main(String[] args) {
        int player1ATK = Console.readInt();
        int player1DEF = Console.readInt();
        int player1DEX = Console.readInt();
        int player1AGL = Console.readInt();
        int player2ATK = Console.readInt();
        int player2DEF = Console.readInt();
        int player2DEX = Console.readInt();
        int player2AGL = Console.readInt();

        double  dexFluctuationRate1 = (Math.random() * 0.4) + 0.8;
        double  dexFluctuationRate2 = (Math.random() * 0.4) + 0.8;
        double  AGLFluctuationRate1 = (Math.random() * 0.4) + 0.8;
        double  AGLFluctuationRate2 = (Math.random() * 0.4) + 0.8;
        double tureDEX1 = dexFluctuationRate1 * player1DEX;
        double tureDEX2 = dexFluctuationRate1 * player2DEX;
        double tureAGL1 = dexFluctuationRate1 * player1AGL;
        double tureAGL2 = dexFluctuationRate1 * player2AGL;

        int player1Dmagevalue = player1ATK - player2DEF;
        int player2Dmagevalue = player2ATK - player1DEF;
        if (player1ATK > player2DEF) {
            player1Dmagevalue = player1Dmagevalue;
        }else {
            player1Dmagevalue = 1;
        }
        if (player2ATK > player1DEF) {
            player2Dmagevalue = player2Dmagevalue;
        }else {
            player2Dmagevalue = 1;
        }
        if ((tureDEX1 / tureAGL2) >= 1.5 ) {
            player1Dmagevalue = player1Dmagevalue * 2;
            Console.println("玩家1在攻击玩家2时造成了暴击！！并且造成了" + player1Dmagevalue + "点伤害");
        }else if ((tureDEX1 / tureAGL2) <= 0.5) {
            player1Dmagevalue = 0;
            Console.println("玩家2闪躲掉了玩家1的攻击");
        }else {
            double tureDamageRate1 = (Math.random() * 0.2) + 0.9;
            player1Dmagevalue = (int) (player1Dmagevalue * tureDamageRate1);
            Console.println("玩家1在攻击玩家2时造成了" + player1Dmagevalue + "伤害");
        }
        if ((tureDEX2 / tureAGL1) >= 1.5 ) {
            player2Dmagevalue = player2Dmagevalue * 2;
            Console.println("玩家2在攻击玩家1时造成了暴击！！并且造成了" + player2Dmagevalue + "伤害");
        }else if ((tureDEX2 / tureAGL1) <= 0.5) {
            player1Dmagevalue = 0;
            Console.println("玩家1闪躲掉了玩家2的攻击");
        }else {
            double tureDamageRate2 = (Math.random() * 0.2) + 0.9;
            player2Dmagevalue = (int) (player2Dmagevalue * tureDamageRate2);
            Console.println("玩家2在攻击玩家1时造成了" + player2Dmagevalue + "伤害");
        }

    }
}
