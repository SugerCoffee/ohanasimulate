package com.ohana.ohanasimulator.testcharactor;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ohana.ohanasimulator.charactor.Hanakishi;

public class TestHanakishi {

	// 花騎士がきちんとクローンされているかテスト
	@Test
	public void test() {
		Hanakishi hk1 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(1000);
		hk1.getHal().getAttackUp().setTargetNum(1);

		Hanakishi hk2 = hk1.clone();

		assertNotSame(hk1, hk2);

	}

	// 花騎士がきちんとクローンされているかテスト
	@Test
	public void test2() {
		Hanakishi hk1 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(1000);
		hk1.getHal().getAttackUp().setTargetNum(1);

		Hanakishi hk2 = hk1.clone();

		assertEquals(hk1.getName(), hk2.getName());

	}

	// 花騎士がきちんとクローンされているかテスト
	@Test
	public void test3() {
		Hanakishi hk1 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(1000);
		hk1.getHal().getAttackUp().setTargetNum(1);

		Hanakishi hk2 = hk1.clone();

		assertEquals(hk1.getHal().getAttackUp().getTargetNum(), hk2.getHal().getAttackUp().getTargetNum());

	}
	
	// 花騎士がきちんとクローンされているかテスト(失敗すればOK)
		@Test
		public void test4() {
			Hanakishi hk1 = new Hanakishi();

			hk1.setName("A");
			hk1.setHp(1000);
			hk1.getHal().getAttackUp().setTargetNum(1);

			Hanakishi hk2 = hk1.clone();
			
			hk2.getHal().getAttackUp().setTargetNum(3);

			assertEquals(hk1.getHal().getAttackUp().getTargetNum(), hk2.getHal().getAttackUp().getTargetNum());

		}

}
