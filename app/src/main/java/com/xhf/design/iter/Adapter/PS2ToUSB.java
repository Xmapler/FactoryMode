package com.xhf.design.iter.Adapter;

/**
 * ����������
 * ��PS2�ӿ�װ����USB�ӿ�
 * ���Դ���������USB�ӿ�(implements USBPort) + ��Ա����ps2Port
 * @author eason
 *
 */
public class PS2ToUSB implements USBPort{

	private PS2Port ps2Port;
	
	public PS2ToUSB(PS2Port ps2Port) {
		this.ps2Port = ps2Port;
	}
	
	@Override
	public void workWithUSB() {
		System.out.println("ת���Ĺؼ�������,������");
		ps2Port.workWithPS2();
		System.out.println("�������ת����������USB������");
	}
	
}
