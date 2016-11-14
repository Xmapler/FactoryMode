package com.xhf.design.iter.Composite;

/**
 * Created by IntelliJ IDEA. �����ļ���ɫ
 */
public interface IFile {
	/**
	 *  �����Լ���ʵ��
	 * @return
	 */
	IFile getComposite();

	/**
	 *  ĳ����ҵ����
	 */
	void sampleOperation();

	/**
	 *  ��ȡ���
	 * @return
	 */
	int getDeep();

	/**
	 *  �������
	 * @param x
	 */
	void setDeep(int x);

}
