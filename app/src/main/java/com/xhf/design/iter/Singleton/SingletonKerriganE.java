package com.xhf.design.iter.Singleton;

/**
 * ʵ�ֵ�������Kerrigan�ĵ���γ��� ���뵹Խ��Խ�����ˣ�������������豹��棬����JLS��Java Language
 * Specification���еĹ涨
 * ��һ������һ��ClassLoader��ֻ�ᱻ��ʼ��һ�Σ������JVM����֤�ģ��ǾͰѳ�ʼ��ʵ���������Ӹ�JVM���ˣ����뱻�ĳ�������
 * Ҳ���Ǳ�׼�Ķ���ʽд��
 */
public class SingletonKerriganE {

	/**
	 * ��������ʵ��
	 */
	private static SingletonKerriganE instance = new SingletonKerriganE();

	public static SingletonKerriganE getInstance() {
		return instance;
	}
}
