package com.xhf.design.iter.Multiton;

import java.util.Random;

/**
 *  ���������޶�����
 * @author lyq
 * 
 */
public class Dice {

	public static final int INSTANCE1 = 0;
	public static final int INSTANCE2 = 1;
	
	/**
	 *  ����ʽ
	 */
	private static final Dice DICE_INSTANCE1 = new Dice(); 
	private static final Dice DICE_INSTANCE2 = new Dice(); 

	/**
	 *  ˽�л�������,��ֹ�ⲿֱ��ʵ��������
	 */
	private Dice() {

	}

	/**
	 * <B>����������</B>
	 * <p style="margin-left:20px;color:#A52A2A;">
	 * ��ȡ�������ʵ��
	 * 
	 * @param which
	 *            <span style="color: #008080;"> ȡֵ��Χ��<BR>
	 *            �� Dice.INSTANCE1������Dice�ĵ�һ��ʵ������<BR>
	 *            �� Dice.INSTANCE2������Dice�ĵڶ���ʵ������<BR>
	 *            </span>
	 * @return <span style="color: #008080;"> ����Dice��һ��ʵ������ </span>
	 */
	public static Dice getInstance(int which) {

		switch (which) {
		case INSTANCE1:
			return DICE_INSTANCE1;
		case INSTANCE2:
			return DICE_INSTANCE2;
		default:
			try {
				throw new Exception("�Ҳ�������� " + which + " ��ƥ���ʵ����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * <B>����������</B>
	 * <p style="margin-left:20px;color:#A52A2A;">
	 * �˷������̰߳�ȫ�ģ����ø÷�����������
	 * 
	 * @return <span style="color: #008080;"> �������ӵĵ��� </span>
	 */
	public synchronized int roll() {

		try {
			Random ran = new Random(System.currentTimeMillis());
			int rollValue = ran.nextInt();
			rollValue %= 6;
			Thread.sleep(6);
			return rollValue > 0 ? ++rollValue : --rollValue * -1;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 1;
	}
}
