package com.xhf.design.iter.Decorator;

/**
 * װ��ģʽ
 * װ��ģʽ������װ(Wrapper)ģʽ��װ��ģʽ�ԶԿͻ�͸���ķ�ʽ��̬�ĸ�һ�����󸽼��ϸ�������Ρ�װ��ģʽ�ڲ��ظı�ԭ���ļ���ʹ�ü̳е�����£�
 * ��̬����չһ������Ĺ��ܡ�����ͨ������һ����װ����Ҳ����װ����������ʵ�Ķ��� 3��װ��ģʽ�Ľ�ɫ���ص㣿 ��ɫ���ɣ�
 * -���󹹼���ɫ������һ������ӿڣ��Թ淶׼�����ո������εĶ��� -���幹����ɫ������һ����Ҫ���ո������ε��ࡣ
 * -װ�ν�ɫ������һ��������������ã�������һ������󹹼��ӿ�һ�µĽӿڡ� -����װ�ν�ɫ������������������ϡ����ӵ����Ρ�
 * 
 * װ��ģʽ���ص㣺 1.װ�ζ������ʵ��������ͬ�Ľӿڡ������ͻ��˶���Ϳ����Ժ���ʵ������ͬ�ķ�ʽ��װ�� ���󽻻���
 * 2.װ�ζ������һ����ʵ���������(reference)�� 3.װ�ζ�������������Կͻ��˵�����������Щ����ת������ʵ����
 * 4.װ�ζ��������ת����Щ������ǰ�����Ժ�����һЩ���ӹ���
 * ��������ȷ����������ʱ�������޸ĸ�������Ľṹ�Ϳ������ⲿ���Ӹ��ӵĹ��ܡ����������������У�ͨ����ͨ���̳���ʵ�ֶԸ�����Ĺ�����չ��
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {
		Component component = new ConcreteDecorator2(new ConcreteDecorator1(
				new ConcreteComponent()));

		component.doSomething();
		
		//�������� 
		//����A 
		//����B 
		//����C 
	}

}
