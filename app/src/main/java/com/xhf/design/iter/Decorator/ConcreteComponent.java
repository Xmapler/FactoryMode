package com.xhf.design.iter.Decorator;

/**
 * ���幹����ɫ
 * 
 * @author lyq
 * 
 */
public class ConcreteComponent implements Component {
	@Override
	public void doSomething() {
		System.out.println("����A");
	}
}
