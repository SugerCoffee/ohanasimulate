package com.ohana.ohanasimulator.testabilityentity;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ohana.ohanasimulator.abilityentity.HanakishiAbilityList;
import com.ohana.ohanasimulator.charactor.Hanakishi;

public class TestHanakishiAbilityList {

	// 花騎士がきちんとクローンされているかテスト
	@Test
	public void test() {
		HanakishiAbilityList hk1 = null;

		hk1.getAttackUp().setTargetNum(1);
		

		HanakishiAbilityList hk2 = hk1.clone();

		assertNotSame(hk1, hk2);

	}
}
