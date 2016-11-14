package com.xhf.design.iter.Strategy;

/**
 * �����ۿ���
 * @author lyq
 *
 */
public interface MemberStrategy {
	/**
	 * ����ͼ��ļ۸�
	 * 
	 * @param booksPrice
	 *            ͼ���ԭ��
	 * @return ��������ۺ�ļ۸�
	 */
	public double calcPrice(double booksPrice);
}
