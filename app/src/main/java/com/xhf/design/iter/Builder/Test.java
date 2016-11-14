package com.xhf.design.iter.Builder;

/**
 * ������ģʽ ������ģʽ���ŵ� ��װ��
 * ʹ�ý�����ģʽ����ʹ�ͻ��˲���֪����Ʒ�ڲ���ɵ�ϸ�ڣ������������ǾͲ���Ҫ����ÿһ�������ģ���ڲ������ʵ�ֵģ������Ķ������;���CarModel��
 * 
 * �����߶�����������չ Builder֮�����໥�����ģ���������Builder�޹أ���ϵͳ����չ�ǳ�������
 * 
 * ���ڿ���ϸ�ڷ��� ģʽ����������ղ�Ʒ�����ڿ��ƣ����ھ���Ľ������Ƕ����ģ���˿��ԶԽ��������ϸ����������������ģ������κ�Ӱ�졣
 * 
 * @author lyq
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder shandongCuisineChef = new ShandongCuisineChefBuilder();
		Builder siChuanChef = new SiChuanChefBuilder();

		Director director = new Director(shandongCuisineChef);
		Food food = director.construct("�Ǵ��Ｙ", "ɫ����,�ι�����.���ɴ�����,����������", "��������",
				"��", "����", "����");

		System.out.println("����³�ˣ� " + "\r\n" + food);

		Director director2 = new Director();
		director2.setDirector(siChuanChef);
		Food food2 = director2.construct("ˮ����Ƭ", "��ζ���������ۣ��׽�", "�顢�����ʡ���", "��",
				"����", "��");
		System.out.println("���䴨�ˣ� " + "\r\n" + food2);

	}
}
