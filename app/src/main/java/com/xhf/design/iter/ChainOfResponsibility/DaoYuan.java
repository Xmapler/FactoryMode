package com.xhf.design.iter.ChainOfResponsibility;

public class DaoYuan extends Handler {
	public DaoYuan(String name) {
		this.name = name;
	}

	public void handleRequest(String request) {
		if ("��У".equals(request)) {
			System.out.println(name + "���Դ���" + request + "������׼��");
		} else {
			System.out.println(name + "�����Դ���" + request + "ת����"
					+ successor.getName());
			successor.handleRequest(request);
		}
	}
}

