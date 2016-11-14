package com.xhf.design.iter.Observer;

/**
 * �۲���ģʽ �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ���������������������״̬�Ϸ����仯ʱ����֪ͨ���й۲��߶���
 * �������ܹ��Զ������Լ�
 * 
 * �۲���ģʽ�����
 * 
 * 1.���������ɫ:�����жԹ۲��߶�������ñ�����һ�������У�ÿ�����������ɫ�����������������Ĺ۲��ߡ����������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߽�ɫ��
 * һ����һ���������ӿ���ʵ�� 2.����۲��߽�ɫ:Ϊ���о���Ĺ۲��߶���һ���ӿڣ��ڵõ������֪ͨʱ�����Լ���
 * 3.���������ɫ(Watched):�����жԹ۲��߶�������ñ�����һ��������
 * ��ÿ�����������ɫ�����������������Ĺ۲��ߡ����������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߽�ɫ��һ����һ���������ӿ���ʵ�֡�
 * 4.����۲��߽�ɫ(Watcher):Ϊ���о���Ĺ۲��߶���һ���ӿڣ��ڵõ������֪ͨʱ�����Լ�
 * 
 * @author lyq
 * 
 */
public class Test {

	public static void main(String[] args) {
		// ����һ�����۲��߶���
		AbstractWatched watched = new ConcreteWatched();

		// ���������۲��߶���
		AbstractWatcher watcher1 = new ConcreteWatcher();
		AbstractWatcher watcher2 = new ConcreteWatcher();
		AbstractWatcher watcher3 = new ConcreteWatcher();

		// ���۲�����ӹ۲���. ���۲��ߺ͹۲���֮���ϵ��һ�Զ��ϵ
		watched.addAbstactWatcher(watcher1);
		watched.addAbstactWatcher(watcher2);
		watched.addAbstactWatcher(watcher3);

		System.out.println("��1��...");
		// ���۲��߷����ı�ʱ��֪ͨ�۲���ִ����Ӧ����
		watched.notifyWatchers();

		// �Ƴ�һ���۲���
		watched.removeAbstactWatcher(watcher2);

		System.out.println("��2��...");
		// ���۲��߷����ı�ʱ��֪ͨ�۲���ִ����Ӧ����
		watched.notifyWatchers();

		// �Ƴ�һ�����й۲���
		watched.removeAll();

		System.out.println("��3��...");
		// ���۲��߷����ı�ʱ��֪ͨ�۲���ִ����Ӧ����
		watched.notifyWatchers();

		// ���
		/*
		 * ִ�н��Ϊ�� ��1��... update..... update..... update..... ��2��... update.....
		 * update..... ��3��...
		 */

	}
}
