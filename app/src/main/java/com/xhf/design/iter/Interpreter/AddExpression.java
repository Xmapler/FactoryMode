package com.xhf.design.iter.Interpreter;

import java.util.HashMap;

/**
 * �ӷ�������
 * @author lyq
 *
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression _left, Expression _right) {

		super(_left, _right);

	}

	/**
	 *  �������������ʽ����Ľ��������
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}