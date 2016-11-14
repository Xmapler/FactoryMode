package com.xhf.design.iter.AbstractFactory;

/**
 * ���󹤳�
 * 
 * @author lyq
 * 
 */
public abstract class AbstractCreator {
	/**
	 * ����A��Ʒ��
	 * 
	 * @return
	 */
	public abstract AbstractProductA createProductA();

	/**
	 * ����B��Ʒ��
	 * 
	 * @return
	 */
	public abstract AbstractProductB createProductB();
}
