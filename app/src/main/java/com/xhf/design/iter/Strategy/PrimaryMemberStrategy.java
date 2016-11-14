package com.xhf.design.iter.Strategy;

/**
 * ������Ա�ۿ���
 * @author lyq
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        
        System.out.println("���ڳ�����Ա��û���ۿ�");
        return booksPrice;
    }

}
