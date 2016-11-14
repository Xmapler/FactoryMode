package com.xhf.design.iter.Singleton;

/**
 * ʵ�ֵ�������Kerrigan�ĵ����γ���
 * �����ϣ���synchronized�ƶ��������ڲ���û��ʲô����ģ�ÿ�ε���getInstance()����Ҫ����ͬ��
 * ��ͬ������û�����⣬��������ֻϣ���ڵ�һ�δ���Kerriganʵ����ʱ�����ͬ��������������������д������˫��������飨DCL����
 */
public class SingletonKerriganC {

	/**
	 * ��������ʵ��
	 */
	private static SingletonKerriganC instance = null;

	public static SingletonKerriganC getInstance() {
		synchronized (SingletonKerriganC.class) {
			if (instance == null) {
				instance = new SingletonKerriganC();
			}
		}
		return instance;
	}
}
