package com.ohana.ohanasimulator.abilitylogic;

import java.util.ArrayList;
import java.util.Random;

import com.ohana.ohanasimulator.charactor.Hanakishi;
import com.ohana.ohanasimulator.utility.CountTurn;

/**
 * ターン開始時に行う防御バフ処理を記述するクラスです。
 * 
 * @author sk
 *
 */
public class TurnStartDefenseUpAbi {

	// Randomクラスのインスタンス化
	private Random rnd = new Random();

	/**
	 * ターンのはじめに防御バフの処理をすべての花騎士に対して行うメソッド。 第一引数に計算のベースとなる花騎士リスト
	 * 第二引数にターゲットの花騎士リストを入れる。
	 * 
	 * @param baseLhk
	 * @param targetLhk
	 * @return ArrayList<Hanakishi>
	 */
	public ArrayList<Hanakishi> defenseUpAbiAll(ArrayList<Hanakishi> baseLhk,
			ArrayList<Hanakishi> targetLhk) {

		// 花騎士パーティ全体に対して防御バフ処理
		for (int i = 0; i < targetLhk.size(); i++) {
			// 以下一体ずつの処理

			// 防御バフ対象の人数によって処理を変更
			switch (baseLhk.get(i).getHal().getDefenseUpAbi().getTargetNum()) {

			// 防御バフを持っていない時
			case 0:
				break;

			// 防御バフ対象が1体の時
			case 1:
				// 自分自身に防御バフを適応
				targetLhk = this.defenseUpAbiOne(i, i, baseLhk, targetLhk);
				break;

			// 防御バフ対象が2体の時
			case 2:

				// 自分自身に防御バフを適応
				targetLhk = this.defenseUpAbiOne(i, i, baseLhk, targetLhk);

				// 花騎士が自分のみであれば処理を終了
				if (targetLhk.size() <= 1) {
					break;
				}

				// targetの花騎士Listの要素数までの乱数を生成
				int ran = rnd.nextInt(targetLhk.size());

				// 自分以外になるまで作成
				while (ran == i) {
					ran = rnd.nextInt(targetLhk.size());
				}

				// 自分以外の一体に防御バフを適応
				targetLhk = this.defenseUpAbiOne(i, ran, baseLhk, targetLhk);
				break;

			// 防御バフ対象が3体の時
			case 3:

				// 味方が3体以下の時、全員に防御バフを適応
				if (targetLhk.size() <= 3) {
					for (int j = 0; j < targetLhk.size(); j++) {
						targetLhk = this.defenseUpAbiOne(i, j, baseLhk,
								targetLhk);
					}
					break;
				}

				// targetの花騎士Listの要素数までの2種類の異なる乱数を作成
				// ran1のほうが小さくなるように設定
				int ran1 = rnd.nextInt(targetLhk.size());
				int ran2 = rnd.nextInt(targetLhk.size());
				while (ran1 == ran2 || ran1 == i || ran2 == i) {
					ran1 = rnd.nextInt(targetLhk.size());
					ran2 = rnd.nextInt(targetLhk.size());
				}

				// 自分自身に防御バフを適応
				targetLhk = this.defenseUpAbiOne(i, i, baseLhk, targetLhk);

				// 自分以外の一体に防御バフを適応
				targetLhk = this.defenseUpAbiOne(i, ran1, baseLhk, targetLhk);

				// 自分以外のもう一体に防御バフを適応
				targetLhk = this.defenseUpAbiOne(i, ran2, baseLhk, targetLhk);
				break;

			// 防御バフ対象が4体の時
			case 4:

				// もし味方が4人以下の場合全員に防御バフ処理
				if (targetLhk.size() <= 4) {
					for (int j = 0; j < targetLhk.size(); j++) {
						targetLhk = this.defenseUpAbiOne(i, j, baseLhk,
								targetLhk);
					}
					break;
				}

				// 味方が4体以上の時の処理

				// targetLhkの要素数までの異なる乱数を3種類作成
				int ran41 = rnd.nextInt(targetLhk.size());
				int ran42 = rnd.nextInt(targetLhk.size());
				int ran43 = rnd.nextInt(targetLhk.size());
				while (ran41 == ran42 || ran42 == ran43 || ran41 == ran43
						|| ran41 == i || ran42 == i || ran43 == i) {
					ran41 = rnd.nextInt(targetLhk.size());
					ran42 = rnd.nextInt(targetLhk.size());
					ran43 = rnd.nextInt(targetLhk.size());
				}
				// 防御バフ処理
				targetLhk = this.defenseUpAbiOne(i, i, baseLhk, targetLhk);

				targetLhk = this.defenseUpAbiOne(i, ran41, baseLhk, targetLhk);
				targetLhk = this.defenseUpAbiOne(i, ran42, baseLhk, targetLhk);
				targetLhk = this.defenseUpAbiOne(i, ran43, baseLhk, targetLhk);
				break;

			case 5:
				// 味方全体に防御バフ処理

				for (int j = 0; j < targetLhk.size(); j++) {
					targetLhk = this.defenseUpAbiOne(i, j, baseLhk, targetLhk);
				}
				break;
			default:
				break;

			}

		}
		return targetLhk;
	}

	/**
	 * 防御バフアビリティ処理 引数に要素番号a,b、計算のベースとなる花騎士リスト
	 * baseLhk,バフ対象の花騎士オブジェクトのArrayListを投げると、
	 * 要素番号aの花騎士のアビリティを要素番号bの花騎士に対して防御バフアビリティを発動させます。
	 * その後、バフ済みの花騎士のArrayListを返します。
	 * 
	 * @param base
	 * @param target
	 * @param baseLhk
	 * @param targetLhk
	 * @return
	 */
	public ArrayList<Hanakishi> defenseUpAbiOne(int base, int target,
			ArrayList<Hanakishi> baseLhk, ArrayList<Hanakishi> targetLhk) {
		// 引数の花騎士インスタンスの番号が配列に格納されている量を超えている場合に何もせず返す。
		if (target >= targetLhk.size()) {
			return targetLhk;
		}
		if (base >= baseLhk.size()) {
			return targetLhk;
		}

		// アビリティ発動条件の確認(baseの花騎士のアビリティ発動ターンにあっているかの確認)
		if (baseLhk.get(base).getHal().getDefenseUpAbi().getFromTurn() <= CountTurn
				.getTurnCount()
				&& CountTurn.getTurnCount() <= baseLhk.get(base).getHal()
						.getDefenseUpAbi().getToTurn()) {

			// newLhkの防御力を書き換え
			targetLhk.get(target).setDefense(
					targetLhk.get(target).getDefense()
							+ (baseLhk.get(target).getDefense()
									* baseLhk.get(base).getHal()
											.getDefenseUpAbi()
											.getDefenseUpPoint() / 100));
			return targetLhk;
		} else {
			return targetLhk;
		}

	}

}
