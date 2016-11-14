package com.xhf.design.iter.Bridge;

/**
 * �Ž�ģʽ ��������仯��ϵ���� ������������ͼ��ʹ�û�ͼ���� ����Ӧ����Shape��ʹ��Drawing
 * ���ǿ���ͨ���ھ����ͼ������ͨ�����캯���������Ļ�ͼ������ʵ��
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {
		Shape circle = new Circle(new Drawing2());
		circle.doDraw();
	}
}
