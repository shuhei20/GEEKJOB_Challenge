/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author shuhei01
 */
//Dealearクラス
public class Dealer extends Human {
    
    //CardsというArrayListの変数を用意
    //初期段階でCardsに全てのトランプを持たせる
    //(1~10+J,Q,K(10が3つ)) × 4(♠♣♦❤)
    public ArrayList<Integer> Cards = new ArrayList<Integer>();
    
    public Dealer() {
        for (Integer num=1; num<=4; num++) {
            Cards.add(1);
            Cards.add(2);
            Cards.add(3);
            Cards.add(4);
            Cards.add(5);
            Cards.add(6);
            Cards.add(7);
            Cards.add(8);
            Cards.add(9);
            Cards.add(10);
            Cards.add(10);
            Cards.add(10);
            Cards.add(10); 
        }
    }
    
    //Dealという公開メソッドを用意
    //Cardsからランダムに2枚のカードをArrayListにして返却
    public ArrayList<Integer> Deal() {
        Random rand = new Random();
        
        Integer Card1 = rand.nextInt(Cards.size());
        Integer Card2 = rand.nextInt(Cards.size());
        
        Integer Card11 = Cards.get(Card1);
        Integer Card22 = Cards.get(Card2);
        
        Cards.remove(Card1);
        Cards.remove(Card2);
        
        ArrayList<Integer> play = new ArrayList<Integer>();
        play.add(Card11);
        play.add(Card22);
        
        return play;
    }
    
    //Hitという公開メソッド
    //Cardsからランダムで1枚のカードをArrayListにして返却
    public ArrayList<Integer> Hit() {
        Random rand = new Random();
        
        Integer Card3 = rand.nextInt(Cards.size());
        Integer Card33 = rand.nextInt(Card3);
        Cards.remove(Card3);
        
        ArrayList<Integer> enjoy = new ArrayList<Integer>();
        enjoy.add(Card33);
        
        return enjoy;
    }
    
    //DealerとUser両方に必要な処理
    //SetCardはArrayListで受けたカード情報をmyCardに追加
    //カードを自分の手札としてセット
    @Override
    public void setCard(ArrayList<Integer> set) {
        for(int i=0; i<set.size(); i++) {
            myCards.add(set.get(i));
        }
    }
    
    //checkSumという公開メソッド
    //自分の今の合計値と21をチェック
    //カードを引くか判断
    @Override
    public boolean checkSum() {
        return open() < 21;
    }
    
    //orenはmyCardsのカードの合計値を返却
    @Override
    public Integer open() {
        int total = 0;
        for (int l = 0; l<myCards.size(); l++) {
            total = total + myCards.get(l);
        }
        
        return total;
    }
    
}
