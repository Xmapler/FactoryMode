package com.xhf.design.iter.Observer;

/**
 * ����۲��߽�ɫ(Watcher) 
 * @author lyq
 *
 */
public class ConcreteWatcher implements AbstractWatcher {

	/**
	 * �۲쵽���۲��߷����仯ʱ��ִ�еķ���
	 */
	public void update() {
		System.out.println("update.....");
		
	}
	
}
