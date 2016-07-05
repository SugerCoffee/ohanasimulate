package com.ohana.ohanasimulator.abilityentity;


//TODO
public class SkillUpAbi extends HanakishiAbilityAbs {

	private int skillUpPoint; // スキル倍率の上昇率(%)
	
	
	
	/* (non-Javadoc)
	 * @see com.ohana.ohanasimulator.abilitytype.HanakishiAbilityAbs#clone()
	 */
	@Override
	public SkillUpAbi clone() {
		// TODO Auto-generated method stub
		return (SkillUpAbi) super.clone();
	}
	
	
	/**
	 * スキル発動確率の上昇率(%)を返します。
	 * @return the skillUpPoint
	 */
	public int getSkillUpPoint() {
		return skillUpPoint;
	}
	/**
	 * スキル発動確率の上昇率(%)をセットします。
	 * @param skillUpPoint the skillUpPoint to set
	 */
	public void setSkillUpPoint(int skillUpPoint) {
		this.skillUpPoint = skillUpPoint;
	}
	
	
	
}
