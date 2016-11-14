package com.xhf.design.iter.Immutable;

/**
 * ������ģʽ
 * һ�����ʵ����״̬�ǲ��ɱ仯�ģ��������������õ�ʵ�����п��ܻ�仯��״̬�������������������ģʽ�Ķ��塣Ҫʵ��������ģʽ��һ���������������������
 * 
 * ��һ������û���κη������޸Ķ����״̬��������Ĺ��캯���Զ����״̬��ʼ��֮�󣬶����״̬�㲻�ٸı䡣
 * 
 * �ڶ������е����Զ�Ӧ����˽�еģ��Է��ͻ��˶���ֱ���޸��κε��ڲ�״̬��
 * 
 * ������������������õĶ�������ǿɱ����Ļ��������跨���������������ķ��ʣ��Է�ֹ����Щ������޸ġ��������Ӧ�þ����ڲ��������ڲ�����ʼ����
 * 
 * ������ģʽ��ȱ���ǣ�
 * һ��������������õ�ʵ�����������ǿɱ���󣬿��ܻ�ͨ������޸ĸ������״̬������һ��������ȱ�㡣�����ڳ�ʼ���ɱ����ʱ���Ƚ���clone��
 */
public class WeakImmutable {

	/**
	 * ����˽�У���������2
	 */
	private int state;

	/**
	 * ����˽�У���������2
	 */
	private User user;

	private Integer age;

	public WeakImmutable(int state, User user, Integer age) {
		this.state = state;
		this.user = user;
		this.age = age;
	}

	public int getState() {
		return this.state;
	}

	public User getUser() {
		return this.user;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setState() {
		// ����û���κη����޸Ķ����״̬,��������1
		// do nothing.
	}
}
