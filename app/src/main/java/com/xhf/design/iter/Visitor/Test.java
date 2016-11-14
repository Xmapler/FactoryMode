package com.xhf.design.iter.Visitor;

/**
 * ������ģʽ ������ģʽ��Ӧ���������ݽṹ�ǳ��ȶ��������ʹ�ã��������ݽṹ�����������ݽṹ�ϵĲ���֮�������ѿ���ʹ�ò������Ͽ���������ɵ��ݻ���
 * 
 * ���ݽṹ��ÿһ���ڵ㶼���Խ���һ�������ߵĵ��ã��˽ڵ�������߶�����ڵ���󣬶������߶����򷴹���ִ�нڵ����Ĳ����������Ĺ��̽�����˫�ط��ɡ���
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure(); // ������ObjectStructure
		// ʵ��������Ԫ��
		o.attach(new Man());
		o.attach(new Woman());

		// ���ɹ�ʱ��ͬԪ�صĲ�ͬ��ӳ
		Visitor success = new Success(); // �����ڳ����Visitor�ӿ�
		o.display(success);

		// ������ʱ�Ĳ�ͬ��ӳ
		Visitor amativeness = new Love(); // �����ڳ����Visitor�ӿ�
		o.display(amativeness);

	}
}
