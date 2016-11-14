package com.xhf.design.iter.Decorator;

/**
 * ����װ�ν�ɫ1���������������"����"���ӵ����Σ�������µĹ���
 * 
 * @author lyq
 * 
 */
public class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	@Override
	public void doSomething() {
		super.doSomething();
		this.doAnotherThing();
	}

	private void doAnotherThing() {
		System.out.println("����B");
	}
}
