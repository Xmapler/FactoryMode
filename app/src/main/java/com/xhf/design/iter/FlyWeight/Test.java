package com.xhf.design.iter.FlyWeight;

/**
 * ��Ԫģʽ 
 * �����ȿ���һ�ֱȽϼ򵥵Ľ�����������ڲ��ܹ����״̬����Ҫ��Charactor�������ã������ɿͻ��������Լ��Ĵ����н�������
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {
		Charactor a = new CharactorA();
		Charactor b = new CharactorB();
		
		// ��ʾ�ַ�A
		display(a, 12);
		// ��ʾ�ַ�B
		display(b, 14);
	}

	// �����ַ��Ĵ�С
	public static void display(Charactor objChar, int nSize) {
		try {
			System.out.println("�ַ���" + objChar.letter + "����С��" + nSize);
		} catch (Exception err) {
		}
	}
}
