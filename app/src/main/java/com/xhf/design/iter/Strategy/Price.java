package com.xhf.design.iter.Strategy;

/**
 * �۸���
 * @author lyq
 *
 */
public class Price {
    /**
     * ����һ������Ĳ��Զ���
     */
    private MemberStrategy strategy;
    
    /**
     * ���캯��������һ������Ĳ��Զ���
     * @param strategy    ����Ĳ��Զ���
     */
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }
    
    /**
     * ����ͼ��ļ۸�
     * @param booksPrice    ͼ���ԭ��
     * @return    ��������ۺ�ļ۸�
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}
