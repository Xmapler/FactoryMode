package com.xhf.design.iter.ChainOfResponsibility;

public class XiaoZhang extends Handler {
	public XiaoZhang(String name) {
		this.name = name;
	}

	public void handleRequest(String request) {
		if ("��ѧ".equals(request)) {
			System.out.println(name + "���Դ���" + request + "������׼��");
		} else {
			System.out.println(name + "����" + request + "���������󣬲�������׼");
		}
	}
}