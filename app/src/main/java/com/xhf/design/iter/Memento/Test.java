package com.xhf.design.iter.Memento;

/**
 * ����¼ģʽ
 * ����¼ģʽ �ڲ��ƻ���װ��ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬�������Ϳ��Խ��ö���ָ���ԭ�ȱ���ǰ��״̬�� ���� ģʽ��˵
 * �ڳ������й����У�ĳЩ�����״̬����ת�������У���������ĳ��ԭ����Ҫ�����ʱ�����״̬���Ա�������е�ĳ���ض��׶Σ���Ҫ�ָ�������֮ǰ����ĳ����ʱ��״̬��
 * ���ʹ��һЩ���нӿ��������������õ������״̬����ᱩ¶�����ʵ��ϸ�ڡ�
 * 
 * @author lyq
 * 
 */
public class Test {
	public static void main(String[] args) {

		WindowsSystem Winxp = new WindowsSystem(); // Winxpϵͳ
		User user = new User(); // ĳһ�û�
		Winxp.setState("�õ�״̬"); // Winxp���ںõ�����״̬
		user.saveMemento(Winxp.createMemento()); // �û���ϵͳ���б��ݣ�WinxpϵͳҪ���������ļ�
		Winxp.setState("����״̬"); // Winxp���ڲ��õ�����״̬
		Winxp.restoreMemento(user.retrieveMemento()); // �û����ָ����ϵͳ���лָ�
		System.out.println("��ǰϵͳ����" + Winxp.getState());
	}
}
