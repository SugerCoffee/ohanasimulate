package com.ohana.ohanasimulator.abilityentity;


public class AttackUpAbi extends HanakishiAbilityAbs{

	private int attackUpPoint; //バフ値(%で指定)
	
	
	
	/* 
	 * Cloneメソッド
	 * @see com.ohana.ohanasimulator.abilitytype.HanakishiAbilityAbs#clone()
	 */
	@Override
	public AttackUpAbi clone() {
		// TODO Auto-generated method stub
		return (AttackUpAbi) super.clone();
	}
	
	/**
	 * 攻撃バフアビリティの上昇率(%)を返す。
	 * @return the attackUpPoint
	 */
	public int getAttackUpPoint() {
		return attackUpPoint;
	}
	/**
	 * 攻撃バフアビリティの上昇率(%)をセットする
	 * @param attackUpPoint the attackUpPoint to set
	 */
	public void setAttackUpPoint(int attackUpPoint) {
		this.attackUpPoint = attackUpPoint;
	}
	
}
