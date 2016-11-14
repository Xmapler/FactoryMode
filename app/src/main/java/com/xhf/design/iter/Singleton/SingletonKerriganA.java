package com.xhf.design.iter.Singleton;

/**
 * ʵ�ֵ�������Kerrigan�ĵ�һ�γ��� ��׼����ʽ���� ���д�����ǰ��ĵ�����������¼�⣬
 * ���ֵڶ����ʱ��ͳ������⣬���������ĳ����������̲߳�������SingletonKerriganA
 * .getInstance()�������߳�һ���ж���instance�Ƿ�Ϊnull���ȴ����е�line A���뵽line
 * B��λ�á��ո��ж���Ϻ�JVM��CPU��Դ�л����̶߳��������߳�һ��ûִ��line B������instance��Ȼ�ǿյģ�����̶߳�ִ����new
 * SignletonKerriganA()������Ƭ��֮���߳�һ�����»��ѣ���ִ�е���Ȼ��new
 * SignletonKerriganA()���������ˣ��������ˣ�����Kerrigan˭������˭�����
 */
public class SingletonKerriganA {

	/**
	 * ��������ʵ��
	 */
	private static SingletonKerriganA instance = null;

	public static SingletonKerriganA getInstance() {
		if (instance == null) { // line A
			instance = new SingletonKerriganA(); // line B
		}
		return instance;
	}
}
