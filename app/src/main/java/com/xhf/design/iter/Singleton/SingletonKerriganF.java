package com.xhf.design.iter.Singleton;

/**
 * �����������������Ҿ�����Ӧ�Խ϶ೡ���ĵ���д����
 * ʵ�ֵ�������Kerrigan�ĵ����γ���
 * ����д����Ȼʹ��JVM������Ʊ�֤���̰߳�ȫ���⣻����SingletonHolder��˽�еģ�����getInstance()֮��û�а취��������
 * �����������ʽ�ģ�ͬʱ��ȡʵ����ʱ�򲻻����ͬ����û������ȱ�ݣ�Ҳ������JDK�汾��
 */
public class SingletonKerriganF {
 
    private static class SingletonHolder {
        /**
         * ��������ʵ��
         */
        static final SingletonKerriganF INSTANCE = new SingletonKerriganF();
    }
 
    public static SingletonKerriganF getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
