package com.ohana.ohanasimulator.testabilityentity;

import static org.junit.Assert.*;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.ohana.ohanasimulator.abilityentity.HanakishiAbilityAbs;

public class TestHanakishiAbilityAbs {

	/**
	 * HanakishiAbilityAbsが正常にクローンされているかのテスト
	 */
	@Test
	public void test() {

		HanakishiAbilityAbs haa = new HanakishiAbilityAbs();

		haa.setEneOrMine(1);

		HanakishiAbilityAbs haa2 = haa.clone();

		assertNotSame(haa2, haa);

	}

	/**
	 * HanakishiAbilityAbsが正常にクローンされているかのテスト2
	 */
	@Test
	public void test2() {

		HanakishiAbilityAbs haa = new HanakishiAbilityAbs();

		haa.setEneOrMine(1);

		HanakishiAbilityAbs haa2 = new HanakishiAbilityAbs();
		haa2 = haa.clone();

		assertNotSame(haa2, haa);

	}
	
	/**
	 * HanakishiAbilityAbsが正常にクローンされているかのテスト3
	 */
	@Test
	public void test3() {

		HanakishiAbilityAbs haa = new HanakishiAbilityAbs();

		haa.setEneOrMine(1);

		HanakishiAbilityAbs haa2 = new HanakishiAbilityAbs();
		haa2 = haa.clone();
		
		haa2.setFromTurn(1);

		assertNotSame(haa2, haa);

	}
	
	/**
	 * HanakishiAbilityAbsが正常にクローンされているかのテスト3
	 */
	@Test
	public void test4() {

		HanakishiAbilityAbs haa = new HanakishiAbilityAbs();

		haa.setEneOrMine(1);

		HanakishiAbilityAbs haa2 = new HanakishiAbilityAbs();
		haa2 = haa.clone();
		
		haa2.setFromTurn(1);

		assertEquals(haa2, haa);

	}
	
	/**
	 * HanakishiAbilityAbsが正常にクローンされているかのテスト3
	 */
	@Test
	public void test5() {

		HanakishiAbilityAbs haa = new HanakishiAbilityAbs();

		haa.setEneOrMine(1);

		HanakishiAbilityAbs haa2 = new HanakishiAbilityAbs();
		haa2 = haa.clone();
		
		haa2.setFromTurn(1);

		assertEquals(haa.getFromTurn(),haa2.getFromTurn());

	}
	
	/**
	 * HanakishiAbilityAbsが正常にクローンされているかのテスト3
	 */
	@Test
	public void test6() {

		HanakishiAbilityAbs haa = new HanakishiAbilityAbs();

		haa.setEneOrMine(1);

		HanakishiAbilityAbs haa2 = new HanakishiAbilityAbs();
		haa2 = haa.clone();
		
		//haa2.setFromTurn(1);

		assertEquals(haa.getEneOrMine(),haa2.getEneOrMine());

	}

}
