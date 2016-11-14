package com.xhf.design.iter.ChainOfResponsibility;

public abstract class Handler {
	protected Handler successor;
	protected String name;

	public String getName() {
		return name;
	}

	//����������������� 
	public abstract void handleRequest(String request);

	//������һ������������� 
	public void setNextHandler(Handler successor) {
		this.successor = successor;
	}
}







	


