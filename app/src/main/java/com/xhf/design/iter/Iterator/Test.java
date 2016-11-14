package com.xhf.design.iter.Iterator;

/**
 * ������ģʽ ������ģʽ�Ľṹ �ṩһ�ַ�������һ�����������и���Ԫ�أ����ֲ���¶�ö�����ڲ�ϸ�ڡ�
 * ����������һ����һ���ӿڣ��ṩһ��iterator()����������java�е�Collection�ӿڣ�List�ӿڣ�Set�ӿڵȡ�
 * �������������ǳ��������ľ���ʵ����
 * ������List�ӿڵ������б�ʵ��ArrayList��List�ӿڵ�����ʵ��LinkList��Set�ӿڵĹ�ϣ�б��ʵ��HashSet�ȡ�
 * ������������������Ԫ������Ҫ�ķ���
 * ��һ����˵������ô����������ȡ�õ�һ��Ԫ�صķ���first()��ȡ����һ��Ԫ�صķ���next()���ж��Ƿ���������ķ���isDone
 * ()�����߽�hasNext()�����Ƴ���ǰ����ķ���remove(), ������ʵ�֣�ʵ�ֵ������ӿ��ж���ķ�������ɼ��ϵĵ�����
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("С��");
		ag.add("С��");
		ag.add("С��");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}
