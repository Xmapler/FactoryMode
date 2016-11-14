package com.xhf.design.iter.AbstractFactory;

/**
 * ���󹤳�ģʽ
 * @author lyq
 *
 */
public class Test {
	public static void main(String[] args) {
		// �������������
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();

		// ����A1����
		AbstractProductA a1 = creator1.createProductA();
		// ����2����
		AbstractProductA a2 = creator2.createProductA();

		// ����B1����
		AbstractProductB b1 = creator1.createProductB();
		// ����B2����
		AbstractProductB b2 = creator2.createProductB();
	}
}
