package com.ohana.ohanasimulator.utility;

import java.util.ArrayList;
import java.util.Collections;

import com.ohana.ohanasimulator.charactor.Hanakishi;

/**
 * 重複しない乱数の生成とか、標準ライブラリに用意されていない なんかいろいろ使えるメソッドを書いていくクラスだよ
 * ちょっと編集してみるよ
 *
 * @author sk
 *
 */
public class UtilMethod {

	/**
	 * 引数に整数numを入れると、0〜num-1までのランダムなint型の配列を返します
	 *
	 * @param num
	 * @return
	 */
	public ArrayList<Integer> shuffle(int num) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			list.add(i);
		}

		Collections.shuffle(list);

		return list;

	}

	/**
	 * 先頭が引数iNumで定義した数になる、ランダムなnum個の数列を返す
	 *
	 * @param iNum
	 * @param num
	 * @return
	 */
	public ArrayList<Integer> firstIRams(int iNum, int num) {

		if (iNum < 0) {
			throw new IllegalArgumentException("第一引数は0以上の数にしてください");
		}

		if (num <= 0) {
			throw new IllegalArgumentException("第一引数は0より大きい数にしてください");
		}

		if (iNum >= num) {
			throw new IllegalArgumentException("第一引数は第二引数よりも小さい数にしてください");
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < num; i++) {
			list.add(i);
		}

		// 先頭がiNumと同じになるまでシャッフルを繰り返す
		do {
			Collections.shuffle(list);
		} while (list.get(0) != iNum);

		return list;
	}

	/**
	 * 花騎士のオブジェクトのArrayListのクローンを作るメソッドです
	 * ArrayListのクローンメソッドはなぜかシャローコピーになってしまうためこちらを使用すること
	 *
	 * @param Lhk
	 * @return Lhk
	 */
	public ArrayList<Hanakishi> cloneHanakishiList(ArrayList<Hanakishi> Lhk) {

		ArrayList<Hanakishi> newLhk = new ArrayList<Hanakishi>();

		for (int i = 0; i < Lhk.size(); i++) {
			newLhk.add(i, Lhk.get(i).clone());
		}

		return newLhk;
	}


	/**
	 * HPが0になった花騎士をArrayListから削除して返すメソッドです。
	 * @param Lhk
	 * @return newLhk
	 */
	public ArrayList<Hanakishi> deleteDeathHanakishi(ArrayList<Hanakishi> Lhk) {

		ArrayList<Hanakishi> newLhk = new ArrayList<Hanakishi>();

		for (int i = 0; i < Lhk.size(); i++) {
			if (Lhk.get(i).getHp() > 0) {
				newLhk.add(Lhk.get(i).clone());
			}
		}

		return newLhk;
	}

}
