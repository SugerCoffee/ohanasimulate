package com.ohana.ohanasimulator.testabilitylogic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


import com.ohana.ohanasimulator.abilitylogic.TurnStartDefenseUpAbi;
import com.ohana.ohanasimulator.charactor.Hanakishi;

public class TestTurnStartDefenceUpAbi {

	/**
	 * 攻撃バフをすべてに行うメソッドのテスト1
	 */
	@Test
	public void testDefenseUpAbiAll1() {

		
		
		// ターンスタートアビリティクラスをインスタンス化
		TurnStartDefenseUpAbi ts = new TurnStartDefenseUpAbi();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(1000);
		hk1.getHal().getDefenseUpAbi().setFromTurn(0);
		hk1.getHal().getDefenseUpAbi().setToTurn(0);
		hk1.getHal().getDefenseUpAbi().setDefenseUpPoint(10);
		hk1.getHal().getDefenseUpAbi().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(1000);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.defenseUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(0).getDefense(), 1100);
		assertEquals(returnLhk.get(1).getDefense(), 1100);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト2
	 */
	@Test
	public void testDefenseUpAbiAll2() {

		
		
		// ターンスタートアビリティクラスをインスタンス化
		TurnStartDefenseUpAbi ts = new TurnStartDefenseUpAbi();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(1000);
		hk1.getHal().getDefenseUpAbi().setFromTurn(0);
		hk1.getHal().getDefenseUpAbi().setToTurn(0);
		hk1.getHal().getDefenseUpAbi().setDefenseUpPoint(10);
		hk1.getHal().getDefenseUpAbi().setTargetNum(1);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(1000);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.defenseUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(0).getDefense(), 1100);
		assertEquals(returnLhk.get(1).getDefense(), 1000);

		
	}
	
	/**
	 * 防御バフをすべてに行うメソッドのテスト2
	 * バフ持ちが複数いた場合に和算で処理することの確認
	 */
	@Test
	public void testDefenseUpAbiAll3() {

		
		
		// ターンスタートアビリティクラスをインスタンス化
		TurnStartDefenseUpAbi ts = new TurnStartDefenseUpAbi();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(1000);
		hk1.getHal().getDefenseUpAbi().setFromTurn(0);
		hk1.getHal().getDefenseUpAbi().setToTurn(0);
		hk1.getHal().getDefenseUpAbi().setDefenseUpPoint(10);
		hk1.getHal().getDefenseUpAbi().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(1000);
		hk2.getHal().getDefenseUpAbi().setFromTurn(0);
		hk2.getHal().getDefenseUpAbi().setToTurn(0);
		hk2.getHal().getDefenseUpAbi().setDefenseUpPoint(10);
		hk2.getHal().getDefenseUpAbi().setTargetNum(5);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.defenseUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(0).getDefense(), 1200);
		assertEquals(returnLhk.get(1).getDefense(), 1200);

		
	}
	
	/**
	 * 防御バフをすべてに行うメソッドのテスト2
	 * バフ持ちが複数いた場合に和算で処理することの確認
	 * 引数が変更されていないことの確認
	 */
	@Test
	public void testDefenseUpAbiAll4() {

		
		
		// ターンスタートアビリティクラスをインスタンス化
		TurnStartDefenseUpAbi ts = new TurnStartDefenseUpAbi();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(1000);
		hk1.getHal().getDefenseUpAbi().setFromTurn(0);
		hk1.getHal().getDefenseUpAbi().setToTurn(0);
		hk1.getHal().getDefenseUpAbi().setDefenseUpPoint(10);
		hk1.getHal().getDefenseUpAbi().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(1000);
		hk2.getHal().getDefenseUpAbi().setFromTurn(0);
		hk2.getHal().getDefenseUpAbi().setToTurn(0);
		hk2.getHal().getDefenseUpAbi().setDefenseUpPoint(10);
		hk2.getHal().getDefenseUpAbi().setTargetNum(5);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.defenseUpAbiAll(targetLhk, targetLhk);

		assertEquals(targetLhk.get(0).getDefense(), 1000);
		assertEquals(targetLhk.get(1).getDefense(), 1000);

		
	}

}
