package com.xhf.design.iter.Proxy;
/**
*���������ɫ,����ָ��ƴ�����.������ҲҪʵ����sellInterface�ӿ���,�����к��
*����RedWineFactory ���������,�Ӷ�ʹ�����ڵ�����ʵ����ǰ����һЩ��Ҫ����.
*/
public class RedWineProxy implements SellInterface{
     //����һ��RedWineFactory���������
      private RedWineFactory redWineFactory;

     //��������
      private static int sell_count = 0;

     public Object sell(){
         if(checkUser()){//��ͨ�����������ɫ,���ǿ�������ʵ�����ɫ������ǰ��һЩ����Ȩ���жϵ�����
             Object obj = redWineFactory.sell();
             sell_count ++;//ͬ��,�ڵ��ú�����Ҳ����ִ��һЩ����Ķ���.
             return obj ;
         }else{
             throw new RuntimeException();
         }
     }

     protected boolean checkUser(){
            //do something
            return true;
     }
}

