package com.xhf.design.iter.ChainOfResponsibility;

/**
 * ��ͳģʽ�Ĺ�ϵģʽ����
 * @author lyq
 *
 */
public class TestWithNoPattern {

	public static void main(String[] args) {
		HandlerWithoutPattern banzhang = new HandlerWithoutPattern("�೤");
		HandlerWithoutPattern daoyuan = new HandlerWithoutPattern("��Ա");
		HandlerWithoutPattern xiaozhang = new HandlerWithoutPattern("У��");
		//���������ͬ�����Ա��ܹ��õ�������Ϊ�ͻ�����֪����Щ��������ĸ� 
		//���ܹ������������������һһ�Ľ��������� 
		banzhang.handleRequest("��ȥ�����");
		daoyuan.handleRequest("��ȥ�����");
		xiaozhang.handleRequest("��ȥ�����");

	}
}
