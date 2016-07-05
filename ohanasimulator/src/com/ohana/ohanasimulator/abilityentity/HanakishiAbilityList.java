package com.ohana.ohanasimulator.abilityentity;



/**
 * 花騎士のアビリティをまとめたクラスです。
 * @author sk
 *
 */
public class HanakishiAbilityList implements Cloneable{

	private Hangeki hangeki = new Hangeki(); //反撃アビリティ
	private AttackUpAbi attackUp = new AttackUpAbi(); //味方の攻撃力を上げるアビリティ
	private DefenseUpAbi defenseUpAbi = new DefenseUpAbi(); //味方の防御力を上げるアビリティ
	private SkillUpAbi skillUpAbi = new SkillUpAbi(); //スキル発動率を上げるアビリティ
	private AttackDownAbi attackDownAbi = new AttackDownAbi(); // 敵の攻撃力を下げるアビリティ
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public HanakishiAbilityList clone() {
		// TODO Auto-generated method stub
		HanakishiAbilityList hal = new HanakishiAbilityList();
		try{
			hal=(HanakishiAbilityList) super.clone();
			hal.attackUp = this.attackUp.clone();
			hal.defenseUpAbi = this.defenseUpAbi.clone();
			hal.hangeki = this.hangeki.clone();
			hal.skillUpAbi = this.skillUpAbi.clone();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return hal;
	}
	/**
	 * 反撃アビリティクラスを返す
	 * @return the hangeki
	 */
	public Hangeki getHangeki() {
		return hangeki;
	}
	/**
	 * 反撃アビリティクラスをセットする
	 * @param hangeki the hangeki to set
	 */
	public void setHangeki(Hangeki hangeki) {
		this.hangeki = hangeki;
	}
	/**
	 * 攻撃バフクラスを返す。
	 * @return the attackUp
	 */
	public AttackUpAbi getAttackUp() {
		return attackUp;
	}
	/**
	 * 攻撃バフクラスをセットする
	 * @param attackUp the attackUp to set
	 */
	public void setAttackUp(AttackUpAbi attackUp) {
		this.attackUp = attackUp;
	}
	/**
	 * 防御バフクラスを返す。
	 * @return the defenseUpAbi
	 */
	public DefenseUpAbi getDefenseUpAbi() {
		return defenseUpAbi;
	}
	/**
	 * 防御バフクラスをセットする
	 * @param defenseUpAbi the defenseUpAbi to set
	 */
	public void setDefenseUpAbi(DefenseUpAbi defenseUpAbi) {
		this.defenseUpAbi = defenseUpAbi;
	}
	/**
	 * スキル発動倍率を上げるアビリティクラスを返す
	 * @return the skillUpAbi
	 */
	public SkillUpAbi getSkillUpAbi() {
		return skillUpAbi;
	}
	/**
	 * スキル発動倍率を上げるアビリティクラスをセットする
	 * @param skillUpAbi the skillUpAbi to set
	 */
	public void setSkillUpAbi(SkillUpAbi skillUpAbi) {
		this.skillUpAbi = skillUpAbi;
	}
	
	/**
	 * 攻撃力デバフクラスを返す
	 * @return
	 */
	public AttackDownAbi getAttackDownAbi() {
		return attackDownAbi;
	}
	
	/**
	 * 攻撃力デバフクラスをセットする
	 * @param attackDownAbi
	 */
	public void setAttackDownAbi(AttackDownAbi attackDownAbi) {
		this.attackDownAbi = attackDownAbi;
	}
	
	
	
	
}
