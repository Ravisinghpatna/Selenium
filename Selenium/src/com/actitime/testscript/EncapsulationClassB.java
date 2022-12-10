package com.actitime.testscript;

public class EncapsulationClassB {

	public static void main(String[] Ravi) {

		EncapsulationClassA a1=new EncapsulationClassA(20);
		int x = a1.getValue();
		System.out.println(x);
		System.out.println(a1.getValue());
		a1.setValue(50);
		System.out.println(a1.getValue());


	}

}
