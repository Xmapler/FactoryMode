package com.xhf.design.iter.TemplateMethod;

/**
 * ����ģ���ɫ��
 * 
 * @author lyq
 * 
 */
public abstract class Account {
	/**
	 * ģ�巽����������Ϣ����
	 * 
	 * @return ������Ϣ����
	 */
	public final double calculateInterest() {
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount * interestRate;
	}

	/**
	 * ����������������ʵ��
	 */
	protected abstract String doCalculateAccountType();

	/**
	 * ����������������ʵ��
	 */
	protected abstract double doCalculateInterestRate();

	/**
	 * �����������Ѿ�ʵ��
	 */
	private double calculateAmount(String accountType) {
		/**
		 * ʡ����ص�ҵ���߼�
		 */
		return 7243.00;
	}
}
