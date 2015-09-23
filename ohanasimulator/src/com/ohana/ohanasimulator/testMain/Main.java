package com.ohana.ohanasimulator.testMain;

import com.ohana.ohanasimulator.charactor.Hanakishi;

public class Main {
	public static void main(String[] args) {
		int x = 5;
		
		x=testsum(x);
		x=testsum(x);
		
		System.out.println(x);
		
		Hanakishi hk = new Hanakishi();
		
		System.out.println(hk.getAttack());
		
		
		

	}

	private static int testsum(int a) {
		return a += a;

	}
}
