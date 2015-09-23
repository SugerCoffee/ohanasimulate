package com.ohana.ohanasimulator.abilitylogic;

import java.util.Random;

/**
 * 反撃アビリティのロジックに関するメソッドです
 *
 * @author sk
 *
 */
public class Countor {
	/**
	 * 反撃アビリティ発動時に実行されるメソッドです。返り値で攻撃ダメージを返します
	 * ロジックを記述しています。
	 * 
	 * @param diffence
	 *            防御力
	 * @param countorPower
	 *            　反撃倍率
	 * @param countorPerce 反撃確率
	 * @return　与ダメージ(敵側計算処理前)
	 */
	public float hangeki(int diffence, float countorPower, int countorPerce) {

		float x;

		// Randomクラスのインスタンス化
		Random rnd = new Random();
		// 0〜99までの乱数を作成
		int ran = rnd.nextInt(100);

		if (ran < countorPerce) {
			x = (float) diffence * countorPower;
			return x;
		} else {
			return 0;
		}
	}

}
