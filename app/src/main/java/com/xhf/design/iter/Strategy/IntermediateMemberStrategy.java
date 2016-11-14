package com.xhf.design.iter.Strategy;

/**
 * �м���Ա�ۿ���
 * 
 * @author lyq
 * 
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {

		System.out.println("�����м���Ա���ۿ�Ϊ10%");
		return booksPrice * 0.9;
	}

}
