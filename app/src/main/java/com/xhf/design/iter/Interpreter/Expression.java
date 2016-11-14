package com.xhf.design.iter.Interpreter;

import java.util.HashMap;

public abstract class Expression {

	/**
	 *  ������ʽ����ֵ,����var�е�keyֵ���ǹ�ʽ�еĲ�����valueֵ�Ǿ��������
	 * @param var
	 * @return
	 */
	public abstract int interpreter(HashMap<String, Integer> var);

}