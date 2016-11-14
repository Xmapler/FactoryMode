package com.xhf.design.iter.Iterator;

public interface Aggregate {
	public void add(Object obj);
	public void remove(Object obj);
	public Iterator iterator();
}
