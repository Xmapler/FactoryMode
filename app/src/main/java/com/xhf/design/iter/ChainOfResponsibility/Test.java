package com.xhf.design.iter.ChainOfResponsibility;

/**
 * ������ģʽ ������ģʽ�ŵ㣬�����Ѿ����ֳ����ˡ��޷Ǿ��ǽ�������ϡ����������ԡ�����������ģʽ���ܻ����һЩ�����������ģ���Ϊ��Ҫ�����ӿ�ͷ��ʼ������
 * ��Ϊ�޷�Ԥ֪������磨�ͻ��ˣ��������������������ͣ�ÿ����������������ܴ��������ֻҪ�����Ϳ��ԡ�
 * ȱ����Ч�ʵͣ���Ϊһ���������ɿ���Ҫ���������ſ�����ɣ���ȻҲ���������ĸ����Ż���
 * 
 * @author lyq
 * 
 */
public class Test {

	public static void main(String[] args) {
		Handler banzhang = new BanZhang("�೤");
		Handler laoshi = new BanZhang("��ʦ");
		Handler daoyuan = new DaoYuan("��Ա");
		Handler xiaozhang = new XiaoZhang("У��");
		banzhang.setNextHandler(laoshi); // ���ð೤����һ������������ʦ
		laoshi.setNextHandler(daoyuan);// ������ʦ����һ���������ǵ�Ա
		daoyuan.setNextHandler(xiaozhang);// ���õ�Ա����һ����������У��
		String requests = "��ѧ";

		// �����󽻸��೤���ɣ�����೤�����˻�һ������Ͻ�
		banzhang.handleRequest(requests);
	}
}
