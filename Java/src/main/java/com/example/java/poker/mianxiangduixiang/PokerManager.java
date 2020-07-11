package com.example.java.poker.mianxiangduixiang;

public class PokerManager {
    //创建一个数组保存生成的每一张牌
    Poker [] pokers ;//声明


    //构造函数
    public PokerManager() {
            pokers = new Poker[52];
    }
    //生成一副牌
    public void produceOneCards(){
        int index = 0;//用于将牌存于数组中
        for (String i:Constans.DOTS)
            for (String j : Constans.PICS) {
                //生成一张牌
                Poker poker = new Poker(i,j);
                //保存到数组中
                pokers[index] = poker;
                index++;
            }
    }
    //打乱一副牌
//    public void shuffle(){
//
//    }
    public void show(){
        for(int i =0;i<pokers.length; i++ ){
            Poker poker = pokers[i];
            System.out.print(poker);
            if((i+1)%4==0){
                System.out.println(" ");
            }
        }
    }
}
