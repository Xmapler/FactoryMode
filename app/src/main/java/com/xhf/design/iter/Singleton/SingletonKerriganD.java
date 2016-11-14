package com.xhf.design.iter.Singleton;

/**
 * ʵ�ֵ�������Kerrigan�ĵ��Ĵγ���
 * �����������Ѿ��ﵽ�����ǵ�Ҫ�󣬳��˵�һ�δ�������֮�⣬�����ķ����ڵ�һ��if�оͷ����ˣ���˲����ߵ�ͬ�����С��Ѿ���������
 * 
 * ������������������������߳�һִ�е�instance = new
 * SingletonKerriganD()��䣬���￴������һ�仰����ʵ������������һ��ԭ�Ӳ���
 * ��ԭ�Ӳ�������˼�����������Ҫô�ͱ�ִ���꣬Ҫô��û�б�ִ�й�
 * �����ܳ���ִ����һ���������Σ�����ʵ�ϸ߼����������ԭ�Ӳ����кܶ࣬����ֻҪ������仰���������JVMִ�еĶ�Ӧ������ͷ���
 * ����仰�������8�����ָ���������3�����飺
 * 
 * 1.��Kerrigan��ʵ�������ڴ档 2.��ʼ��Kerrigan�Ĺ�����
 * 3.��instance����ָ�������ڴ�ռ䣨ע�⵽�ⲽinstance�ͷ�null�ˣ���
 */
public class SingletonKerriganD {

	/**
	 * ��������ʵ��
	 */
	private static SingletonKerriganD instance = null;

	public static SingletonKerriganD getInstance() {
		if (instance == null) {
			synchronized (SingletonKerriganD.class) {
				if (instance == null) {
					instance = new SingletonKerriganD();
				}
			}
		}
		return instance;
	}
}
