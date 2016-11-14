package com.xhf.design.iter.ChainOfResponsibility;

public class BanZhang extends Handler {
	public BanZhang(String name) {
		this.name = name;
	}

	public void handleRequest(String request) {
		if ("��ȥ�����".equals(request)) {
			System.out.println(name + "���Դ���" + request + ",������׼��");
		} else {
			System.out.println(name + "�����Դ���" + request + "ת����"
					+ successor.getName());
			successor.handleRequest(request);
		}
	}
}
