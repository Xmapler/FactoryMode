package com.xhf.design.iter.Visitor;

/**
 * �ɹ�ʱMan��Woman�Ĳ�ͬ����  
 * @author lyq
 *
 */
public class Success implements Visitor{  

  public void visit(Man man) {  
      System.out.println("�����˳ɹ�ʱ����������һ��ΰ���Ů��");  
  }  


  public void visit(Woman woman) {  
      System.out.println("��Ů�˳ɹ�ʱ����������һ�����ɹ�������");  
  }  
} 