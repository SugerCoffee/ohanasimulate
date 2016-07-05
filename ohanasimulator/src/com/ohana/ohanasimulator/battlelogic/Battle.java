package com.ohana.ohanasimulator.battlelogic;

import java.util.ArrayList;
import java.util.Random;

import com.ohana.ohanasimulator.charactor.Hanakishi;
import com.ohana.ohanasimulator.utility.UtilMethod;;

/**
 * Battle時のロジックを記述したクラスです。
 * 
 * @author sk
 *
 */
public class Battle {

	// Randomクラスのインスタンス化
	private Random rnd = new Random();

	// 自作のUtilMethodクラスのインスタンス化
	private UtilMethod UM = new UtilMethod();
	
	
	
	/**
	 * 通常攻撃時の処理を記述します。一回の戦闘が終わったあとの敵害虫(花騎士)のArrayListを返します。
	 * 
	 * @param baseLhk
	 * @param targetLhk
	 * @return
	 */
	public ArrayList<Hanakishi> normalBattle(Hanakishi hk, ArrayList<Hanakishi> targetLhk) {

		// 敵の数までの乱数を作成。攻撃対象を決定
		int ran = rnd.nextInt(targetLhk.size());

		// ダメージを計算しセット

		ArrayList<Hanakishi> newLhk = UM.cloneHanakishiList(targetLhk);
		newLhk.set(ran, this.hkAfterBattle(hk.getAttack(), targetLhk.get(ran)));

		return newLhk;
	}

	/**
	 * スキル攻撃発動時の処理を記述します。一回の戦闘が終わったあとの敵害虫(花騎士)のArrayListを返します。
	 * 
	 * @param hk 攻撃者
	 * @param targetLhk　ターゲット
	 * @return
	 */
	public ArrayList<Hanakishi> skillBattleOne(Hanakishi hk, ArrayList<Hanakishi> targetLhk) {

		// targetLhkをディープコピー
		ArrayList<Hanakishi> newLhk = UM.cloneHanakishiList(targetLhk);
		
		// スキル発動時の攻撃回数分だけ攻撃処理を行う
		for (int i = 0; i < hk.getSkillAttackTimes(); i++) {
			
			// 敵が攻撃対象人数以下の場合全員に攻撃
			if (targetLhk.size() <= hk.getSkillAttackNum()) {
				for (int j = 0; j < targetLhk.size(); j++) {
					newLhk.set(j, this.hkAfterBattle(this.skillAttack(hk), targetLhk.get(j)));
				}
				continue;

			}

			//攻撃対象の花騎士(害虫)の人数までのランダムな数列を作成
			ArrayList<Integer> ran = UM.shuffle(targetLhk.size());

			// 攻撃対象人数まで攻撃を繰り返す
			for (int j = 0; j < hk.getSkillAttackNum(); j++) {
				newLhk.set(ran.get(j), this.hkAfterBattle(this.skillAttack(hk), targetLhk.get(ran.get(j))));
			}
			
			
		}
		return newLhk;
	}

	/**
	 * バトル発生時の一体に対する最終的なダメージを計算するメソッドです。
	 * 引数に与ダメージ、対象花騎士を渡すと、ダメージを受けたあとの花騎士が帰ってきます。
	 * 
	 * @param attackDamage
	 * @param diffence
	 * @return damage
	 */
	private Hanakishi hkAfterBattle(float attackDamage, Hanakishi hk) {

		Hanakishi newhk = hk.clone();
		
		// ダメージを計算
		int damage;
		damage = (int) (attackDamage * 2 - hk.getDefense()) / 4;

		// 攻撃後の敵のHPを計算し、hkにセット
		int newHp = hk.getHp() - damage;
		newhk.setHp(newHp);

		return newhk;

	}

	/**
	 * スキル発動時の一体に対する与ダメージを計算するメソッドです。
	 * 
	 * @param hk
	 * @return
	 */
	private float skillAttack(Hanakishi hk) {
		float x;
		x = (float) hk.getAttack() * hk.getSkiilPower();

		return x;
	}

}
