package com.xhf.design.iter.Prototype;

/**
 * ԭʼģʽʵ�ʾ��Ƕ���ĸ��ƣ�JAVA�����ṩ��Cloneable�ӿ�ֻ��һ�����ã����������е�ʱ��֪ͨJAVA��������԰�ȫ�����������ʹ��clone()
 * ������ͨ���������clone()�������Եõ�һ������ĸ��ơ�����Object�౾����ʵ��Cloneable�ӿڣ�
 * �����������ǵ���û��ʵ��Cloneable�ӿ�ʱ������clone()�������׳�CloneNotSupportedException�쳣��
 * ϵͳ������PandaToClone�����û���java
 * .lang.Object�ṩ��clone()�������Ա���Ƹ��ƵĹ��̡�������������PandaToClone��һ�����м������ʵ���
 * ������java.lang.Object��Ŀ�¡�����û����ˣ���һ���µ�clone()�����ṩ�����Լ�ʵ��������
 * 
 * @author lyq
 * 
 */
class PandaToClone implements Cloneable {

	private int height, weight, age;

	public PandaToClone(int height, int weight) {
		this.age = 0;
		this.weight = weight;
		this.height = height;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public Object clone() {
		// ����һ������Ķ���
		// ��������������
		PandaToClone temp = new PandaToClone(height, weight);
		temp.setAge(age);
		// ע�ⷵ��ֵ�����ͱ�����Object
		return (Object) temp;
	}
}
