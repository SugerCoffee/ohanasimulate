package com.ohana.ohanasimulator.testutility;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.ohana.ohanasimulator.charactor.Hanakishi;
import com.ohana.ohanasimulator.utility.UtilMethod;

public class TestUtilMethod {

	
	/**
	 * Shuffleが正常に機能しているかを確認するテスト
	 */
	@Test
	public void testShuffle(){
		
		UtilMethod UM = new UtilMethod();
		
		
		
		ArrayList<Integer> a = UM.shuffle(1);
		
		assertEquals((int)a.get(0),0);
		
		
	}
	
	/**
	 * Shuffleが正常に機能しているかを確認するテスト
	 */
	@Test
	public void testfirstIRams(){
		
		UtilMethod UM = new UtilMethod();
		
		
		
		ArrayList<Integer> a = UM.firstIRams(3, 5);
		
		assertEquals((int)a.get(0),3);
		
		
	}
	
	
	
	
	
	/**
	 * ArrayListのcloneメソッドがディープコピーになっていることの確認
	 */
	@Test
	public void testClone3() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");
		hk1.getHal().getAttackUp().setTargetNum(1);

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = new ArrayList<Hanakishi>();

		newLhk = (ArrayList<Hanakishi>) Lhk.clone();
		
		Hanakishi hk3 = new Hanakishi();

		hk3.setName("C");

		newLhk.add(hk3);

		assertNotSame(Lhk, newLhk);
	}
	
	/**
	 * オブジェクトは違うが中身がきちんとコピーされていることの確認1(cloneメソッドを使った場合)
	 */
	@Test
	public void testClone4() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = (ArrayList<Hanakishi>) Lhk.clone();


		
		Hanakishi hk3 = new Hanakishi();

		hk3.setName("C");

		newLhk.add(hk3);
		
		Lhk.add(hk3);

		assertNotSame(Lhk, newLhk);
	}
	
	/**
	 * オブジェクトは違うが中身がきちんとコピーされていることの確認2(cloneメソッドを使った場合)
	 */
	@Test
	public void testClone2() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = (ArrayList<Hanakishi>) Lhk.clone();
		
		

		assertEquals(Lhk,newLhk);
	}
	
	/**
	 * オブジェクトは違うが中身がきちんとコピーされていることの確認2(cloneメソッドを使った場合)
	 */
	@Test
	public void testClone5() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = (ArrayList<Hanakishi>) Lhk.clone();
		
		Hanakishi hk3 = new Hanakishi();

		hk3.setName("C");

		newLhk.add(hk3);
		
		Lhk.add(hk3);

		assertEquals(Lhk,newLhk);
	}
	
	/**
	 * ArrayListのcloneメソッドがディープコピーになっていることの確認
	 */
	@Test
	public void testClone1() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");
		hk1.getHal().getAttackUp().setTargetNum(1);

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = UM.cloneHanakishiList(Lhk);

		assertNotSame(Lhk, newLhk);
	}
	
	/**
	 * Hanakishiのクローンメソッドがきちんと動いているか確認
	 */
	@Test
	public void testClone6() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");
		hk1.getHal().getAttackUp().setTargetNum(1);

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = UM.cloneHanakishiList(Lhk);

		newLhk.add(2,hk1);
		
		assertNotSame(Lhk, newLhk);
	}
	
	/**
	 * Hanakishiのクローンメソッドがきちんと動いているか確認(失敗すればおk)
	 */
	@Test
	public void testClone7() {
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk2.setName("B");
		hk1.getHal().getAttackUp().setTargetNum(1);

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		ArrayList<Hanakishi> newLhk = UM.cloneHanakishiList(Lhk);

		newLhk.add(2,hk1);
		
		assertEquals(Lhk, newLhk);
	}
	
	
	/**
	 * 死んだ花騎士をリストから削除するメソッドがうまく動いているかテスト
	 */
	@Test
	public void testDeleteDeathHanakishi() {
		
		// テスト対象のインスタンス化
		UtilMethod UM = new UtilMethod();

		// 花騎士オブジェクトを生成

		Hanakishi hk1 = new Hanakishi();
		Hanakishi hk2 = new Hanakishi();

		hk1.setName("A");
		hk1.setHp(0);
		
		hk2.setName("B");
		hk2.setHp(10000);
		

		ArrayList<Hanakishi> Lhk = new ArrayList<Hanakishi>();

		Lhk.add(hk1);
		Lhk.add(hk2);

		Lhk = UM.deleteDeathHanakishi(Lhk);
		
		assertEquals(Lhk.get(0).getHp(), 10000);
		assertEquals(Lhk.size(), 1);
		
	}
	

}
