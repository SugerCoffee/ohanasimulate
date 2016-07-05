package com.ohana.ohanasimulator.abilityentity;


//TODO
public class DefenseUpAbi extends HanakishiAbilityAbs{

	private int defenseUpPoint; //防御力上昇率(%)
	
	
	
	/* (non-Javadoc)
	 * @see com.ohana.ohanasimulator.abilitytype.HanakishiAbilityAbs#clone()
	 */
	@Override
	public DefenseUpAbi clone() {
		// TODO Auto-generated method stub
		return (DefenseUpAbi) super.clone();
	}
	
	/**
	 * 防御力上昇率(%)を返す。
	 * @return the defenseUpPoint
	 */
	public int getDefenseUpPoint() {
		return defenseUpPoint;
	}
	/**
	 * 防御力上昇率をセットする。
	 * @param defenseUpPoint the defenseUpPoint to set
	 */
	public void setDefenseUpPoint(int defenseUpPoint) {
		this.defenseUpPoint = defenseUpPoint;
	}

	
	
}
