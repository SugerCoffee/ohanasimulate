package com.ohana.ohanasimulator.testabilitylogic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.ohana.ohanasimulator.abilitylogic.TurnStartAttackAbility;
import com.ohana.ohanasimulator.charactor.Hanakishi;
import com.ohana.ohanasimulator.utility.CountTurn;
import com.ohana.ohanasimulator.utility.UtilMethod;

public class TestTurnStartAttackUpAbi {

	/**
	 * 攻撃バフをすべてに行うメソッドのテスト1
	 */
	@Test
	public void testattackUpAbiAll1() {

		
		
		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.attackUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(0).getAttack(), 1100);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト2
	 */
	@Test
	public void testattackUpAbiAll2() {

		
		
		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.attackUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(1).getAttack(), 1100);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト3
	 */
	@Test
	public void testattackUpAbiAll3() {

		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(1);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.attackUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(0).getAttack(), 1100);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト4
	 */
	@Test
	public void testattackUpAbiAll4() {

		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(1);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.attackUpAbiAll(targetLhk, targetLhk);

		assertEquals(returnLhk.get(1).getAttack(), 1000);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト5
	 * バフ持ちが複数いた場合和算で処理することを確認
	 */
	@Test
	public void testattackUpAbiAll5() {

		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		hk2.getHal().getAttackUp().setFromTurn(0);
		hk2.getHal().getAttackUp().setToTurn(0);
		hk2.getHal().getAttackUp().setAttackUpPoint(10);
		hk2.getHal().getAttackUp().setTargetNum(5);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		// 自作のUtilMethodクラスのインスタンス化
		UtilMethod UM = new UtilMethod();
		
		ArrayList<Hanakishi> baseLhk = UM.cloneHanakishiList(targetLhk);
		
		returnLhk = ts.attackUpAbiAll(baseLhk, targetLhk);

		assertEquals(returnLhk.get(0).getAttack(), 1200);
		assertEquals(returnLhk.get(1).getAttack(), 1200);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト5
	 * バフ持ちが複数いた場合和算で処理することを確認
	 * 引数が変化しないことの確認
	 */
	@Test
	public void testattackUpAbiAll6() {

		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		hk2.getHal().getAttackUp().setFromTurn(0);
		hk2.getHal().getAttackUp().setToTurn(0);
		hk2.getHal().getAttackUp().setAttackUpPoint(10);
		hk2.getHal().getAttackUp().setTargetNum(5);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		// 自作のUtilMethodクラスのインスタンス化
		UtilMethod UM = new UtilMethod();
		
		ArrayList<Hanakishi> baseLhk = UM.cloneHanakishiList(targetLhk);
		
		returnLhk = ts.attackUpAbiAll(baseLhk, targetLhk);

		assertEquals(targetLhk.get(0).getAttack(), 1000);
		assertEquals(targetLhk.get(1).getAttack(), 1000);

		
	}
	
	/**
	 * 攻撃バフをすべてに行うメソッドのテスト5
	 * バフ持ちが一人もいない場合の確認
	 */
	@Test
	public void testattackUpAbiAll7() {

		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		// 自作のUtilMethodクラスのインスタンス化
		UtilMethod UM = new UtilMethod();
		
		ArrayList<Hanakishi> baseLhk = UM.cloneHanakishiList(targetLhk);
		
		returnLhk = ts.attackUpAbiAll(baseLhk, targetLhk);

		assertEquals(returnLhk.get(0).getAttack(), 1000);
		assertEquals(returnLhk.get(1).getAttack(), 1000);

		
	}
	
	/**
	 * クローンがきちんと機能しているか確認テスト
	 */
	@Test
	public void testClone() {

		// クローン作成のため
		UtilMethod UM = new UtilMethod();

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		hk2.getHal().getAttackUp().setFromTurn(0);
		hk2.getHal().getAttackUp().setToTurn(0);
		hk2.getHal().getAttackUp().setAttackUpPoint(10);
		hk2.getHal().getAttackUp().setTargetNum(5);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		

		ArrayList<Hanakishi> baseLhk = UM.cloneHanakishiList(targetLhk);
		
		targetLhk.get(0).setAttack(1100);
		targetLhk.get(0).getHal().getAttackUp().setTargetNum(10);

		assertEquals(targetLhk.get(0).getAttack(), 1100);
		assertEquals(baseLhk.get(0).getAttack(), 1000);
		assertEquals(targetLhk.get(0).getHal().getAttackUp().getTargetNum(), 10);
		assertEquals(baseLhk.get(0).getHal().getAttackUp().getTargetNum(), 5);

		
	}
	

	/**
	 * 攻撃バフを一体に対し行うメソッドのテスト1
	 */
	@Test
	public void testattackUpAbiOne1() {

		// ターンスタートアビリティクラスをインスタンス化
		TurnStartAttackAbility ts = new TurnStartAttackAbility();
		
		

		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
		hk1.getHal().getAttackUp().setFromTurn(0);
		hk1.getHal().getAttackUp().setToTurn(0);
		hk1.getHal().getAttackUp().setAttackUpPoint(10);
		hk1.getHal().getAttackUp().setTargetNum(5);

		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);

		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);

		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();

		returnLhk = ts.attackUpAbiOne(0, 0, targetLhk, targetLhk);

		assertEquals(returnLhk.get(0).getAttack(), 1100);
		
	}

}
