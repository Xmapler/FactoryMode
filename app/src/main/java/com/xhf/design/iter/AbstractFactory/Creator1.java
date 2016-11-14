package com.xhf.design.iter.AbstractFactory;

/**
 * ��Ʒ�ȼ�1��ʵ����
 * 
 * @author lyq
 * 
 */
public class Creator1 extends AbstractCreator {

	/**
	 * ֻ������Ʒ�ȼ�Ϊ1��A��Ʒ
	 */
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	/**
	 * ֻ������Ʒ�ȼ�Ϊ1��B��Ʒ
	 */
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
