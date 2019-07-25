package com.plain.java.programs;

@FunctionalInterface
public interface DefaultMethodTest {

	public abstract void normalMethod();
	
	public default void defaultMethod() {
		System.out.println("Default method original implementation.");
	}
	
	public static void staticMethod() {
		System.out.println("Original Static method implementation");
	}
}

class DefaultMethodTestImpl implements DefaultMethodTest{

	@Override
	public void normalMethod() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		DefaultMethodTestImpl d = new DefaultMethodTestImpl();
		d.defaultMethod();
		DefaultMethodTest.staticMethod();
		
//		new DefaultMethodTest( ()-> {
//			System.out.println("test");
//		}
		
		DefaultMethodTest t = ()->{
			System.out.println("test");
		};
		
	}
	
	@Override
	public void defaultMethod() {
		DefaultMethodTest.super.defaultMethod();
		System.out.println("Default method implementation.");
	}
	
}