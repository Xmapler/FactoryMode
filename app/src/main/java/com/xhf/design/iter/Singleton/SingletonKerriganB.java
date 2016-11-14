package com.xhf.design.iter.Singleton;

/**
 * ʵ�ֵ�������Kerrigan�ĵڶ��γ���
 * �����һ�δ�������ڷ����ж���һ��synchronized���η������ڿ��Ա�֤������߳������ˡ����������и��ܴ�
 * ���ٺ�ʱ�����Ϻܴ󣩵��������⡣���˵�һ�ε���ʱ��ִ����SingletonKerriganB�Ĺ��캯��֮��
 * ���Ժ��ÿһ�ε��ö���ֱ�ӷ���instance����
 * �����ض������������ʱ�Ǻ�С�ģ����󲿷ֵĺ�ʱ������synchronized���η���ͬ��׼���ϣ���˴�������˵�ܲ����㡣
 */
public class SingletonKerriganB {

	/**
	 * ��������ʵ��
	 */
	private static SingletonKerriganB instance = null;

	public synchronized static SingletonKerriganB getInstance() {
		if (instance == null) {
			instance = new SingletonKerriganB();
		}
		return instance;
	}
}
