package com.xhf.design.iter.Visitor;

/**
 * ����ʱMan��Woman�Ĳ�ͬ����  
 * @author lyq
 *
 */
public class Love implements Visitor{  

  public void visit(Man man) {  
      System.out.println("����������ʱ�����²���Ҳװ��");  
  }  


  public void visit(Woman girl) {  
      System.out.println("��Ů������ʱ�����¶�Ҳװ����");  
  }  
}  