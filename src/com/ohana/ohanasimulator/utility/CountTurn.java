package com.ohana.ohanasimulator.utility;

/**
 * 今何ターン目かを数えるクラスです。
 * 
 * @author sk
 *
 */
public class CountTurn {
	private static int turnCount = 0; // 現在のターン数

	/**
	 * 現在のターン数を返します
	 * 
	 * @return the turnCount
	 */
	public static int getTurnCount() {
		return turnCount;
	}

	/**
	 * 1ターン進めるメソッドです
	 */
	public static void turnCountUp() {
		turnCount++;
	}

	/**
	 * ターンカウントを0に戻します。
	 */
	public static void turnCountReset() {
		turnCount = 0;
	}

	public static void setTurnCount(int a) {
		turnCount = a;
	}
}
