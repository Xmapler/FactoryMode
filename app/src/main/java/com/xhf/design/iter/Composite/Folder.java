package com.xhf.design.iter.Composite;

import java.util.Vector;

/**
 * Created by IntelliJ IDEA. �ļ��н�ɫ
 */
public class Folder implements IFile {
	private String name; // �ļ�����
	private int deep; // �㼶��ȣ������Ϊ0
	private Vector<IFile> componentVector = new Vector<IFile>();

	public Folder(String name) {
		this.name = name;
	}

	/**
	 * �����Լ���ʵ��
	 */
	public IFile getComposite() {
		return this;
	}

	/**
	 * ĳ����ҵ����
	 */
	public void sampleOperation() {
		System.out.println("ִ����ĳ����ҵ������");
	}

	/**
	 * ����һ���ļ����ļ���
	 * 
	 * @param IFile
	 */
	public void add(IFile IFile) {
		componentVector.addElement(IFile);
		IFile.setDeep(this.deep + 1);

	}

	// ɾ��һ���ļ����ļ���
	public void remove(IFile IFile) {
		componentVector.removeElement(IFile);
	}

	/**
	 *  ����ֱ�����ļ����У�����
	 * @return
	 */
	public Vector getAllComponent() {
		return componentVector;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeep() {
		return deep;
	}

	public void setDeep(int deep) {
		this.deep = deep;
	}
}
