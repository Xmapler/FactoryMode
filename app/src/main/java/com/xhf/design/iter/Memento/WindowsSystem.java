package com.xhf.design.iter.Memento;

public class WindowsSystem {
	private String state;

	/**
	 * ����ϵͳ����
	 * @return
	 */
	public Memento createMemento() { 
		return new Memento(state);
	}

	/**
	 * �ָ�ϵͳ
	 * @param m
	 */
	public void restoreMemento(Memento m) {  
		this.state = m.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("��ǰϵͳ����" + this.state);
	}
}
