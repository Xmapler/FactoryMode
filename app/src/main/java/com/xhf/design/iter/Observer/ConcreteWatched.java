package com.xhf.design.iter.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������ɫ
 * @author lyq
 *
 */
public class ConcreteWatched implements AbstractWatched {

	/**
	 * list:��Ź۲��ߵ�һ�����϶���
	 */
	List<AbstractWatcher> list = new ArrayList<AbstractWatcher>();
	
	/**
	 * ����һ���۲���
	 */
	public void addAbstactWatcher(AbstractWatcher watcher) {
		list.add(watcher);

	}

	/**
	 * �Ƴ�һ���۲���
	 */
	public void removeAbstactWatcher(AbstractWatcher watcher) {
		list.remove(watcher);

	}

	/**
	 * �Ƴ����еĹ۲���
	 */
	public void removeAll() {
		list.clear();

	}
	
	/**
	 * ֪ͨ���еĹ۲���
	 */
	public void notifyWatchers() {
		for(AbstractWatcher watcher : list){
			watcher.update();
		}

	}

}
