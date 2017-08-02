package com.company.section5;

import java.util.Arrays;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	//�ӷ���
	public final static String ADD_SYMBOL = "+";
	//������
	public final static String SUB_SYMBOL = "-";
	
	public static void main(String[] args) {
		//�������������������
		int a = Integer.parseInt(args[0]);
		String symbol = args[1];  //����
		int b = Integer.parseInt(args[2]);
		
		System.out.println("����Ĳ���Ϊ��"+Arrays.toString(args));
		//������
		Context context = null;
		//�жϳ�ʼ����һ������
		if(symbol.equals(ADD_SYMBOL)){
			context = new Context(new Add());
		}else if(symbol.equals(SUB_SYMBOL)){
			context = new Context(new Sub());
		}
		System.out.println("���н��Ϊ��"+a + symbol + b + "=" + context.exec(a, b, symbol));
	}
}
