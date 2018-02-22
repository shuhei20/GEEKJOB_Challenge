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

//Userクラス
public class User extends Human {
    
    //DealerとUser両方に必要な処理を実装
    //SetCardはArrayListで受けたカード情報をmyCardに追加する
    //カードを自分の手札としてセット
    @Override
    public void setCard(ArrayList<Integer> set) {
        for (int i=0; i<set.size(); i++) {
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
    
    //OpenはmyCardsのカードの合計値を返却
    @Override
    public Integer open() {
        int total = 0;
        for (int l =0; l<myCards.size(); l++) {
            total = total + myCards.get(l);
        }
        
        return total;
    }
}
