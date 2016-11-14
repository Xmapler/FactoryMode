package com.xhf.design.iter.ChainOfResponsibility;

public class LaoShi extends Handler{
	public LaoShi(String name) {
		this.name = name;
	}

	public void handleRequest(String request) {
		if ("��ٲ�ȥ�Ͽ�".equals(request)) {
			System.out.println(name + "���Դ���" + request + ",������׼��");
		} else {
			System.out.println(name + "�����Դ���" + request + "ת����"
					+ successor.getName());
			successor.handleRequest(request);
		}
	}

}
