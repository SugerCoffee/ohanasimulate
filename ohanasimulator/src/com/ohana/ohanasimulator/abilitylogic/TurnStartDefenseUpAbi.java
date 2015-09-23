package com.ohana.ohanasimulator.abilitylogic;

import java.util.ArrayList;

import com.ohana.ohanasimulator.charactor.Hanakishi;
import com.ohana.ohanasimulator.utility.CountTurn;
import com.ohana.ohanasimulator.utility.UtilMethod;

/**
 * ターン開始時に行う防御バフ処理を記述するクラスです。
 * 
 * @author sk
 *
 */
public class TurnStartDefenseUpAbi {

	// 自作のUtilMethodクラスのインスタンス化
	private UtilMethod UM = new UtilMethod();

	/**
	 * ターンのはじめに防御バフの処理をすべての花騎士に対して行うメソッド。 第一引数に計算のベースとなる花騎士リスト
	 * 第二引数にターゲットの花騎士リストを入れる。
	 * 
	 * @param baseLhk
	 * @param targetLhk
	 * @return ArrayList<Hanakishi>
	 */
	public ArrayList<Hanakishi> defenseUpAbiAll(ArrayList<Hanakishi> baseLhk, ArrayList<Hanakishi> targetLhk) {

		// 花騎士のクローンを作成
		ArrayList<Hanakishi> newLhk = UM.cloneHanakishiList(targetLhk);

		// 花騎士パーティ全体に対して防御バフ処理
		for (int i = 0; i < baseLhk.size(); i++) {

			// 以下一体ずつの処理 //

			// もし攻撃バフを持っていなければ処理を終了
			if (baseLhk.get(i).getHal().getDefenseUpAbi().getTargetNum() == 0) {
				continue;
			}

			// 先頭が自分自身になる、targetLhk個までの乱数を作成
			ArrayList<Integer> ran = UM.firstIRams(i, targetLhk.size());

			// 自分を含む味方に防御バフを適応
			for (int j = 0; j < baseLhk.get(i).getHal().getDefenseUpAbi().getTargetNum(); j++) {

				if (j < targetLhk.size()) {
					newLhk = this.defenseUpAbiOne(i, ran.get(j), baseLhk, newLhk);
				} else {
					break;
				}

			}

		}
		return newLhk;
	}

	/**
	 * 防御バフアビリティ処理 引数に要素番号a,b、計算のベースとなる花騎士リスト
	 * baseLhk,バフ対象の花騎士オブジェクトのArrayListを投げると、
	 * 要素番号aの花騎士のアビリティを要素番号bの花騎士に対して防御バフアビリティを発動させます。
	 * その後、バフ済みの花騎士のArrayListを返します。
	 * 引数を変更してしまうことに注意
	 * 
	 * @param base
	 * @param target
	 * @param baseLhk
	 * @param targetLhk
	 * @return
	 */
	public ArrayList<Hanakishi> defenseUpAbiOne(int base, int target, ArrayList<Hanakishi> baseLhk,
			ArrayList<Hanakishi> targetLhk) {
		// 引数の花騎士インスタンスの番号が配列に格納されている量を超えている場合に何もせず返す。
		if (target >= targetLhk.size()) {
			return targetLhk;
		}
		if (base >= baseLhk.size()) {
			return targetLhk;
		}

		// アビリティ発動条件の確認(baseの花騎士のアビリティ発動ターンにあっているかの確認)
		if (baseLhk.get(base).getHal().getDefenseUpAbi().getFromTurn() <= CountTurn.getTurnCount()
				&& CountTurn.getTurnCount() <= baseLhk.get(base).getHal().getDefenseUpAbi().getToTurn()) {

			// newLhkの防御力を書き換え
			targetLhk.get(target).setDefense(targetLhk.get(target).getDefense() + (baseLhk.get(target).getDefense()
					* baseLhk.get(base).getHal().getDefenseUpAbi().getDefenseUpPoint() / 100));
			return targetLhk;
		} else {
			return targetLhk;
		}

	}

}
