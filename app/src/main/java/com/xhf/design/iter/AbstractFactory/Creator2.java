package com.xhf.design.iter.AbstractFactory;

/**
 * ��Ʒ�ȼ�2��ʵ����
 * 
 * @author lyq
 * 
 */
public class Creator2 extends AbstractCreator {

	/**
	 * ֻ������Ʒ�ȼ�Ϊ2��A��Ʒ
	 */
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	/**
	 * ֻ������Ʒ�ȼ�Ϊ2��B��Ʒ
	 */
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
