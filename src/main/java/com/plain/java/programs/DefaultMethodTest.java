package com.plain.java.programs;

@FunctionalInterface
public interface DefaultMethodTest {

	public abstract void normal();
	
	public default void defaul() {
		System.out.println("Default method original implementation.");
	}
	
	public static void stat() {
		System.out.println("Original Static method implementation");
	}
}

class DefaultMethodTestImpl implements DefaultMethodTest{

	@Override
	public void normal() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		DefaultMethodTestImpl d = new DefaultMethodTestImpl();
		d.defaul();
		DefaultMethodTest.stat();
		
//		new DefaultMethodTest( ()-> {
//			System.out.println("test");
//		}
		
		DefaultMethodTest t = ()->{
			System.out.println("test");
		};
		
	}
	
	@Override
	public void defaul() {
		DefaultMethodTest.super.defaul();
		System.out.println("Default method implementation.");
	}
	
}