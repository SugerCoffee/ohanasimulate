package com.ohana.ohanasimulator.abilityentity;

public class HanakishiAbilityAbs implements Cloneable {
	private int fromTurn;
	private int toTurn;
	private int targetNum; // スキルのターゲットとなる人数を返します。
	private int eneOrMine; // スキルの対象が味方か敵かを返します。1が味方、2が敵

	/*
	 * Cloneメソッドの実装
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public HanakishiAbilityAbs clone(){
		HanakishiAbilityAbs hab = new HanakishiAbilityAbs();
		try{
			hab=(HanakishiAbilityAbs) super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}

			return hab;

	}

	/**
	 * アビリティ発動開始ターンを返します。
	 * 
	 * @return the fromTurn
	 */
	public int getFromTurn() {
		return fromTurn;
	}

	/**
	 * アビリティ発動廃止ターンをセットします。
	 * 
	 * @param fromTurn
	 *            the fromTurn to set
	 */
	public void setFromTurn(int fromTurn) {
		this.fromTurn = fromTurn;
	}

	/**
	 * アビリティ発動終了ターンを返します。
	 * 
	 * @return the toTurn
	 */
	public int getToTurn() {
		return toTurn;
	}

	/**
	 * アビリティ発動終了ターンをセットします。
	 * 
	 * @param toTurn
	 *            the toTurn to set
	 */
	public void setToTurn(int toTurn) {
		this.toTurn = toTurn;
	}

	/**
	 * アビリティ発動対象人数を返します。
	 * @return the targetNum
	 */
	public int getTargetNum() {
		return targetNum;
	}

	/**
	 * アビリティ発動対象人数をセットします。
	 * @param targetNum the targetNum to set
	 */
	public void setTargetNum(int targetNum) {
		this.targetNum = targetNum;
	}

	/**
	 * アビリティの対象が味方か敵かを判断します。
	 * 0が味方、1が敵
	 * @return the eneOrMine
	 */
	public int getEneOrMine() {
		return eneOrMine;
	}

	/**
	 * アビリティの対象が味方か敵かを判断します。
	 * 0が味方、1が敵
	 * @param eneOrMine the eneOrMine to set
	 */
	public void setEneOrMine(int eneOrMine) {
		this.eneOrMine = eneOrMine;
	}

}
