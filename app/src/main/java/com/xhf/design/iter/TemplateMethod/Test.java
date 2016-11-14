package com.xhf.design.iter.TemplateMethod;

/**
 * ģ�巽��ģʽ ģ�巽��ģʽ�������Ϊģʽ��׼��һ�������࣬�������߼��Ծ��巽���Լ����幹�캯������ʽʵ�֣�Ȼ������һЩ���󷽷�����ʹ����ʵ��ʣ����߼���
 * ��ͬ����������Բ�ͬ�ķ�ʽʵ����Щ���󷽷����Ӷ���ʣ����߼��в�ͬ��ʵ�֡������ģ�巽��ģʽ������
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {
		Account account = new MoneyMarketAccount();
		System.out.println("�����г��˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
		account = new CDAccount();
		System.out.println("�����˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
	}
}
