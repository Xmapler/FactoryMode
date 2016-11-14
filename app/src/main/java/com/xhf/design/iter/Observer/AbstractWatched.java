package com.xhf.design.iter.Observer;

/**
 * ���������ɫ��
 * @author lyq
 *
 */
public interface AbstractWatched {
	
	//����һ���۲���
	public void addAbstactWatcher(AbstractWatcher watcher);
	
	//�Ƴ�һ���۲���
	public void removeAbstactWatcher(AbstractWatcher watcher);
	
	//�Ƴ����еĹ۲���
	public void removeAll();
	
	//֪ͨ���еĹ۲���
	public void notifyWatchers();

}
