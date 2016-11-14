package com.xhf.design.iter.FlyWeight;

/**
 * ������ַ���A
 * 
 * @author lyq
 * 
 */
public class CharactorA extends Charactor {
	/**
	 * ���캯��
	 */
	public CharactorA() {
		this.letter = 'A';
	}

	/**
	 * ��ʾ����
	 */
	public void display() {
		try {
			System.out.println(this.letter);
		} catch (Exception err) {
		}
	}
}
