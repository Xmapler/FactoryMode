package com.xhf.design.iter.Mediator;

/**
 * ͬ�����Կ�
 * @author lyq
 *
 */
public class VideoCard extends Colleague {
    /**
     * ���캯��
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * ��ʾ��Ƶ����
     */
    public void showData(String data){
        System.out.println("�����ڹۿ����ǣ�" + data);
    }
}