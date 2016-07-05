package com.ohana.ohanasimulator.testbattlelogic;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.ohana.ohanasimulator.battlelogic.Battle;
import com.ohana.ohanasimulator.charactor.Hanakishi;

public class TestBattle {

	
	
	
	
	/**
	 * 通常攻撃時にきちんと計算されているかテスト
	 */
	@Test
	public void testNormalBattle() {
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
		//targetLhk.add(hk2);
		
		// 攻撃者の花騎士を作成
		Hanakishi hk3 = new Hanakishi();
		hk3.setName("C");
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.normalBattle(hk3, targetLhk);
		
		assertEquals(returnLhk.get(0).getHp(),9100);
		
		
	}
	
	/**
	 * 引数が変更されていないことを確認するテスト
	 */
	@Test
	public void testNormalBattle2() {
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
		//targetLhk.add(hk2);
		
		// 攻撃者の花騎士を作成
		Hanakishi hk3 = new Hanakishi();
		hk3.setName("C");
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.normalBattle(hk3, targetLhk);
		
		assertEquals(targetLhk.get(0).getHp(),10000);
		
		
	}
	
	/**
	 * スキル攻撃のテスト
	 */
	@Test
	public void testSkillBattleOne() {
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
		
		// 攻撃者の花騎士を作成
		Hanakishi hk3 = new Hanakishi();
		hk3.setName("C");
		hk3.setSkiilPower(2);
		hk3.setSkillAttackNum(2);
		hk3.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk3, targetLhk);
		
		assertEquals(returnLhk.get(0).getHp(),8100);
		
		
	}
	
	/**
	 * スキル攻撃のテスト2
	 */
	@Test
	public void testSkillBattleOne2() {
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
		
		// 攻撃者の花騎士を作成
		Hanakishi hk3 = new Hanakishi();
		hk3.setName("C");
		hk3.setSkiilPower(2);
		hk3.setSkillAttackNum(2);
		hk3.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk3, targetLhk);
		
		assertEquals(returnLhk.get(1).getHp(),8100);
		
		
	}
	
	/**
	 * スキル攻撃のテスト3 引数に影響を与えていないことのテスト
	 */
	@Test
	public void testSkillBattleOne3() {
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
		
		// 攻撃者の花騎士を作成
		Hanakishi hk3 = new Hanakishi();
		hk3.setName("C");
		hk3.setSkiilPower(2);
		hk3.setSkillAttackNum(2);
		hk3.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk3, targetLhk);
		
		assertEquals(targetLhk.get(0).getHp(),10000);
		
		
	}
	
	/**
	 * スキル攻撃のテスト4 3分の1の確率で失敗するはず
	 */
	@Test
	public void testSkillBattleOne4() {
		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();
		Hanakishi hk3 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
				
		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		
		hk3.setName("C");
		hk3.setHp(10000);
		hk3.setAttack(1000);
		hk3.setDefense(400);
		
		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);
		targetLhk.add(hk3);
		
		// 攻撃者の花騎士を作成
		Hanakishi hk0 = new Hanakishi();
		hk0.setName("0");
		hk0.setSkiilPower(2);
		hk0.setSkillAttackNum(2);
		hk0.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk0, targetLhk);
		
		assertEquals(returnLhk.get(0).getHp(),8100);
		
		
	}
	
	/**
	 * スキル攻撃のテスト5 3分の2の確率で失敗するはず
	 */
	@Test
	public void testSkillBattleOne5() {
		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();
		Hanakishi hk3 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
				
		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		
		hk3.setName("C");
		hk3.setHp(10000);
		hk3.setAttack(1000);
		hk3.setDefense(400);
		
		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);
		targetLhk.add(hk3);
		
		// 攻撃者の花騎士を作成
		Hanakishi hk0 = new Hanakishi();
		hk0.setName("0");
		hk0.setSkiilPower(2);
		hk0.setSkillAttackNum(2);
		hk0.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk0, targetLhk);
		
		assertEquals(returnLhk.get(0).getHp(),10000);
		
		
	}
	
	/**
	 * スキル攻撃のテスト6 敵の削れた総HPがあっていることの確認
	 * 今回は敵2体に対して2倍の攻撃力で攻撃を行っている
	 */
	@Test
	public void testSkillBattleOne6() {
		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();
		Hanakishi hk3 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
				
		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		
		hk3.setName("C");
		hk3.setHp(10000);
		hk3.setAttack(1000);
		hk3.setDefense(400);
		
		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);
		targetLhk.add(hk3);
		
		// 攻撃者の花騎士を作成
		Hanakishi hk0 = new Hanakishi();
		hk0.setName("0");
		hk0.setSkiilPower(2);
		hk0.setSkillAttackNum(2);
		hk0.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk0, targetLhk);
		
		int sumHP = returnLhk.get(0).getHp() + returnLhk.get(1).getHp() + returnLhk.get(2).getHp();
		
		assertEquals(sumHP,26200);
		
		
	}
	
	/**
	 * スキル攻撃のテスト6 敵の削れた総HPがあっていることの確認
	 * 今回は敵2体に対して2.4倍の攻撃力で攻撃を行っている
	 */
	@Test
	public void testSkillBattleOne7() {
		// ターゲットの花騎士オブジェクトを生成リストに格納

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();
		Hanakishi hk3 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(10000);
		hk1.setAttack(1000);
		hk1.setDefense(400);
				
		hk2.setName("B");
		hk2.setHp(10000);
		hk2.setAttack(1000);
		hk2.setDefense(400);
		
		hk3.setName("C");
		hk3.setHp(10000);
		hk3.setAttack(1000);
		hk3.setDefense(400);
		
		ArrayList<Hanakishi> targetLhk = new ArrayList<Hanakishi>();

		targetLhk.add(hk1);
		targetLhk.add(hk2);
		targetLhk.add(hk3);
		
		// 攻撃者の花騎士を作成
		Hanakishi hk0 = new Hanakishi();
		hk0.setName("0");
		hk0.setSkiilPower(2.5F);
		hk0.setSkillAttackNum(2);
		hk0.setSkillAttackTimes(1);
		
		
		
		// Battleをインスタンス化
		Battle bt = new Battle();
		
		// 結果を格納する花騎士リストを作成
		ArrayList<Hanakishi> returnLhk = new ArrayList<Hanakishi>();
		
		// バトルを行う
		returnLhk = bt.skillBattleOne(hk0, targetLhk);
		
		int sumHP = returnLhk.get(0).getHp() + returnLhk.get(1).getHp() + returnLhk.get(2).getHp();
		
		assertEquals(sumHP,25200);
		
		
	}

}
