package com.xhf.design.iter.ChainOfResponsibility;

/**
 * ��ͳģʽ�ķ�����ûʹ��������ģʽ
 * @author lyq
 *
 */
public class HandlerWithoutPattern {
	
	private String name; //�����ߵ����� 
	public HandlerWithoutPattern(String name) {
		this.name = name;
	}
	public void handleRequest(String request) {
		if ("�೤".equals(name)) {
			if ("��ȥ�����".equals(request)) {
				System.out.println(name + "���Դ���" + request + ",������׼");
			} else {
				System.out.println(name + "������" + request + "��������");
			}
		} else if ("��Ա".equals(name)) {
			if ("��У".equals(request)) {
				System.out.println(name + "���Դ���" + request + ",������׼");
			} else {
				System.out.println(name + "������" + request + "��������");
			}
		} else if ("У��".equals(name)) {
			if ("��ѧ".equals(request)) {
				System.out.println(name + "���Դ���" + request + ",������׼");
			} else {
				System.out.println(name + "������" + request + "��������");
			}
		} else {
			System.out.println("û��ר�˿��Դ����������");
		}
} 

}
