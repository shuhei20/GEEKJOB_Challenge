/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author shuhei01
 */

//Humanという抽象クラス
abstract class Human {
    
    //openという公開メソッド
    //カードの合計値を計算して返す
    abstract public Integer open();
    
    //setCardというArrayListを引数とした公開メソッド
    //カードを自分の手札としてセットする際に使用
    //ユーザーとディーラーそれぞれにセットカードを用意
    abstract public void setCard(ArrayList<Integer> set);
    
    //checkSumという公開メソッド
    //自分の今の合計値と21をチェック
    //カードを引くか判断
    abstract public boolean checkSum();
    
    //myCardsというArrayListの変数
    //自分の手札を管理するイメージ
    //ユーザーとディーラーは各々myCardsにカードを保管
    public ArrayList<Integer> myCards = new ArrayList<Integer>();
    
}
