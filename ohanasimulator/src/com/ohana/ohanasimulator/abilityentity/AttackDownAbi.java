package com.ohana.ohanasimulator.abilityentity;

public class AttackDownAbi extends HanakishiAbilityAbs {
	
	private int AttackDownPoint; //攻撃力低下率(%)

	
	/**
	 * 攻撃力デバフ率を返します
	 * @return
	 */
	public int getAttackDownPoint() {
		return AttackDownPoint;
	}

	
	/**
	 * 攻撃力デバフ率をセットします
	 * @param attackDownPoint
	 */
	public void setAttackDownPoint(int attackDownPoint) {
		AttackDownPoint = attackDownPoint;
	}

}
