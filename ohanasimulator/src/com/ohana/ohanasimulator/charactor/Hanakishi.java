package com.ohana.ohanasimulator.charactor;

import java.io.Serializable;

import com.ohana.ohanasimulator.abilityentity.HanakishiAbilityList;

/**
 * 花騎士クラスです。
 * 
 * @author sk
 *
 * 
 *
 */
public class Hanakishi implements Cloneable, Serializable {
	/**
	 * シリアルIDを生成して保存
	 */
	private static final long serialVersionUID = -3166024759539334819L;

	/**
	 * この花騎士インスタンスを複製した新しいインスタンスを返すメソッドです。
	 * 
	 * @return Hanakishi
	 */
	@Override
	public Hanakishi clone() {
		Hanakishi nhk = new Hanakishi();

		try {

			nhk = (Hanakishi) super.clone();
			nhk.hal=this.hal.clone();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return nhk;
	}

	/**
	 * コンストラクタ 花騎士の名前、HP,攻撃力、防御力を入力して花騎士を生成します。
	 * 
	 * @param name
	 * @param hp
	 * @param attack
	 * @param defense
	 */
	public Hanakishi(String name1, int hp1, int attack1, int defense1) {
		name = name1;
		hp = hp1;
		attack = attack1;
		defense = defense1;

	}

	/**
	 * 空の花騎士を作成します。
	 */
	public Hanakishi() {
		this("不明", 10000, 2000, 1000);
	}

	/*
	 * キャラの名前
	 */
	private String name;
	/*
	 * キャラのHP
	 */
	private int hp;
	/*
	 * キャラの攻撃力
	 */
	private int attack;
	/*
	 * キャラの防御力
	 */
	private int defense;
	
	private int attackAttribute; //キャラの攻撃属性。0~3で指定
	
	private int weekAttribute; //キャラの弱点属性
	/*
	 * キャラのスキル発動率
	 */
	private int skillTriggerPerce;

	
	private float skiilPower; // キャラのスキル威力倍率
	/*
	 * スキル発動時の攻撃対象人数
	 */
	private int skillAttackNum;

	private int skillAttackTimes; //スキル発動時の攻撃回数

	private int kyusyuritu; //吸収率
	
	private HanakishiAbilityList hal = new HanakishiAbilityList(); //花騎士のアビリティに関する情報を格納するクラス
	
	

	// ///////以下戦闘に関するアビリティ////////////////////

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp
	 *            the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * 攻撃力を返す
	 * 
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * 攻撃力を入力
	 * 
	 * @param attack
	 *            the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * 防御力を返す
	 * 
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * 防御力を入力
	 * 
	 * @param diffence
	 *            the defense to set
	 */
	public void setDefense(int diffence) {
		this.defense = diffence;
	}

	/**
	 * 攻撃属性を返す
	 * @return the attackAttribute
	 */
	public int getAttackAttribute() {
		return attackAttribute;
	}

	/**
	 * 攻撃属性をセットする
	 * @param attackAttribute the attackAttribute to set
	 */
	public void setAttackAttribute(int attackAttribute) {
		this.attackAttribute = attackAttribute;
	}

	/**
	 * 防御属性を返す
	 * @return the weekAttribute
	 */
	public int getWeekAttribute() {
		return weekAttribute;
	}

	/**
	 * 防御属性をセットする
	 * @param weekAttribute the weekAttribute to set
	 */
	public void setWeekAttribute(int weekAttribute) {
		this.weekAttribute = weekAttribute;
	}

	/**
	 * スキル発動率を返す。
	 * 
	 * @return the skillTriggerPerce
	 */
	public int getSkillTriggerPerce() {
		return skillTriggerPerce;
	}

	/**
	 * スキル発動率をセット
	 * 
	 * @param skillTriggerPerce
	 *            the skillTriggerPerce to set
	 */
	public void setSkillTriggerPerce(int skillTriggerPerce) {
		this.skillTriggerPerce = skillTriggerPerce;
	}

	/**
	 * スキルの威力(倍率)を返す。例2.3(倍)
	 * 
	 * @return the skiilPower
	 */
	public float getSkiilPower() {
		return skiilPower;
	}

	/**
	 * スキルの威力(倍率)をセットする。例2.3(倍)
	 * 
	 * @param skiilPower
	 *            the skiilPower to set
	 */
	public void setSkiilPower(float skiilPower) {
		this.skiilPower = skiilPower;
	}

	/**
	 * スキル発動時の攻撃対象人数を返す
	 * 
	 * @return the skillAttackNum
	 */
	public int getSkillAttackNum() {
		return skillAttackNum;
	}

	/**
	 * スキル発動時の攻撃対象人数をセットする
	 * 
	 * @param skillAttackNum
	 *            the skillAttackNum to set
	 */
	public void setSkillAttackNum(int skillAttackNum) {
		this.skillAttackNum = skillAttackNum;
	}

	/**
	 * スキル発動時の攻撃回数を返す
	 * 
	 * @return the skillAttackTimes
	 */
	public int getSkillAttackTimes() {
		return skillAttackTimes;
	}

	/**
	 * スキル発動時の攻撃回数をセットする
	 * 
	 * @param skillAttackTimes
	 *            the skillAttackTimes to set
	 */
	public void setSkillAttackTimes(int skillAttackTimes) {
		this.skillAttackTimes = skillAttackTimes;
	}

	/**
	 * 吸収率を返す。なにもない場合は0とする。
	 * 
	 * @return the kyusyuritu
	 */
	public int getKyusyuritu() {
		return kyusyuritu;
	}

	/**
	 * @param kyusyuritu
	 *            the kyusyuritu to set
	 */
	public void setKyusyuritu(int kyusyuritu) {
		this.kyusyuritu = kyusyuritu;
	}

	/**
	 * 花騎士の持つのアビリティのパラメーターをクラスとして返します。
	 * @return the hal
	 */
	public HanakishiAbilityList getHal() {
		return hal;
	}

	/**
	 * 花騎士の持つのアビリティのパラメーターをクラスとしてセットします。
	 * @param hal the hal to set
	 */
	public void setHal(HanakishiAbilityList hal) {
		this.hal = hal;
	}


	

}
