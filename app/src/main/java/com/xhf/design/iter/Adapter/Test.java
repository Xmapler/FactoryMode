package com.xhf.design.iter.Adapter;

/**
 * ������ģʽ
 * ������ client PS2Port(PS2�ӿ�)�� USBPort(USB�ӿ�)�� PS2ToUSB(����������)����PS2�ӿ�װ����USB�ӿڡ�
 * TestAdapter(������)���ͻ��ˡ�
 * ������ģʽ����һ���ӿ�ת��������һ���ӿڡ�
 * 
 * @author lyq
 * 
 */
public class Test {

	public static void main(String[] args) {
		// 1.��������һ��PS2�ӿ�
		PS2Port ps2Port = new PS2Port() {
			@Override
			public void workWithPS2() {
				System.out.println("PS2������");
			}
		};

		// 2.��������Ҫ����һ��USB�ӿڰ�,����(client)��˵����ֻ��ʶUSB�ӿ�
		// 3.����PS2ToUSB��ת����PS2�ӿڱ����USB�ӿ�
		USBPort ps2ToUsbPort = new PS2ToUSB(ps2Port);

		ps2ToUsbPort.workWithUSB();

	}

}
