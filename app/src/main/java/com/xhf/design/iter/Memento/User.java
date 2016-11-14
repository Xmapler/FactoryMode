package com.xhf.design.iter.Memento;

public class User {
	private Memento memento;

	public Memento retrieveMemento() { // �ָ�ϵͳ
		return this.memento;
	}

	public void saveMemento(Memento memento) { // ����ϵͳ
		this.memento = memento;
	}
}
