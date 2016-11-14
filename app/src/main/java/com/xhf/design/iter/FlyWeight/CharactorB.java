package com.xhf.design.iter.FlyWeight;

/**
 * ������ַ���B
 * 
 * @author lyq
 * 
 */
public class CharactorB extends Charactor {
	/**
	 * ���캯��
	 */
	public CharactorB() {
		this.letter = 'B';
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
