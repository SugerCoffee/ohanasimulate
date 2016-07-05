package com.ohana.ohanasimulator.abilityentity;

public class Hangeki extends HanakishiAbilityAbs {
	
	private int hangekiBairitu;
	private int hangekiKakuritu;
	
	
	
	
	/* (non-Javadoc)
	 * @see com.ohana.ohanasimulator.abilitytype.HanakishiAbilityAbs#clone()
	 */
	@Override
	public Hangeki clone() {
		// TODO Auto-generated method stub
		Hangeki h = new Hangeki();
		
		try{
			h=(Hangeki)super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return h;
	}
	/**
	 * 反撃倍率を返します。
	 * @return the hangekiBairitu
	 */
	public int getHangekiBairitu() {
		return hangekiBairitu;
	}
	/**
	 * 反撃倍率をセットします。
	 * @param hangekiBairitu the hangekiBairitu to set
	 */
	public void setHangekiBairitu(int hangekiBairitu) {
		this.hangekiBairitu = hangekiBairitu;
	}
	/**
	 * 反撃確率を返します。
	 * @return the hangekiKakuritu
	 */
	public int getHangekiKakuritu() {
		return hangekiKakuritu;
	}
	/**
	 * 反撃倍率をセットします。
	 * @param hangekiKakuritu the hangekiKakuritu to set
	 */
	public void setHangekiKakuritu(int hangekiKakuritu) {
		this.hangekiKakuritu = hangekiKakuritu;
	}
	

}
