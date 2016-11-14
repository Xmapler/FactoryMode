package com.xhf.design.iter.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * ������ģʽ ������ģʽ���ŵ�
 * ��������һ�����﷨�������ߣ������������ŵ������չ�ԣ��޸��﷨����ֻҪ�޸���Ӧ�ķ��ս�����ʽ�Ϳ����ˣ�����չ�﷨����ֻҪ���ӷ��ս����Ϳ����ˡ�
 * 
 * 27.3.2 ������ģʽ��ȱ�� ������ģʽ������������
 * ÿ���﷨��Ҫ����һ�����ս�����ʽ���﷨����Ƚϸ���ʱ���Ϳ��ܲ������������ļ���Ϊά�������˷ǳ�����鷳��
 * 
 * ������ģʽ���õݹ���÷���
 * ÿ�����ս�����ʽֻ�������Լ��йصı��ʽ��ÿ�����ʽ��Ҫ֪�����յĽ��������һ��һ��ذ��룬������������̵����Ի���������������
 * ���ݹ鶼���ڱ�Ҫ������ʹ�õģ������µ��Էǳ����ӡ����뿴�����Ҫ�Ų�һ���﷨���������ǲ���Ҫһ��һ���ϵ�ĵ�����ȥ��ֱ����С���﷨��Ԫ��
 * 
 * Ч������ ������ģʽ����ʹ���˴�����ѭ���͵ݹ飬Ч���Ǹ����ݺ��ӵ����⣬�ر������ڽ������ӡ��߳����﷨ʱ��Ч�����������ܵġ�
 * 
 * @author lyq
 * 
 */
public class Test {
	/**
	 * ������������
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		String expStr = getExpStr();

		// ��ֵ

		HashMap<String, Integer> var = getValue(expStr);

		Calculator cal = new Calculator(expStr);

		System.out.println("������Ϊ��" + expStr + "=" + cal.run(var));

	}

	/**
	 * ��ñ��ʽ
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String getExpStr() throws IOException {

		System.out.print("��������ʽ��");

		return (new BufferedReader(new InputStreamReader(System.in)))
				.readLine();

	}

	/**
	 * ���ֵӳ��
	 * 
	 * @param exprStr
	 * @return
	 * @throws IOException
	 */
	public static HashMap<String, Integer> getValue(String exprStr)
			throws IOException {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// �����м�������Ҫ����

		for (char ch : exprStr.toCharArray()) {

			if (ch != '+' && ch != '-') {

				// ����ظ�����������

				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("������" + ch + "��ֵ:");

					String in = (new BufferedReader(new InputStreamReader(
							System.in))).readLine();

					map.put(String.valueOf(ch), Integer.valueOf(in));

				}

			}

		}
		return map;
	}
}
