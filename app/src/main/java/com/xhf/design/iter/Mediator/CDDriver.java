package com.xhf.design.iter.Mediator;

/**
 * ͬ���࣬����
 * @author lyq
 *
 */
public class CDDriver extends Colleague{
    //������ȡ����������
    private String data = "";
    /**
     * ���캯��
     */
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    /**
     * ��ȡ���̶�ȡ����������
     */
    public String getData() {
        return data;
    }
    /**
     * ��ȡ����
     */
    public void readCD(){
        //����ǰ����Ƶ��ʾ�����ݣ����ź�������
        this.data = "One Piece,�������ҵ�����";
        //֪ͨ���壬�Լ���״̬�����˸ı�
        getMediator().changed(this);
    }
}