package com.company.section2;

import java.util.Stack;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ͨ������Ϊһ����װ��
 */
@SuppressWarnings("all")
public class Client {

	public static void main(String[] args) {
		Context ctx = new Context();
		//ͨ����һ���﷨����������һ������ı��ʽ��ͨ��ΪListArray,LinkedList,Stack������
		Stack<Expression> stack = null; 
		/*
		for(;;){
			//�����﷨�жϣ��������ݹ����
		}
		*/
		//����һ���������﷨�����ɸ�����������﷨�������н���
		Expression exp = stack.pop();
		
		//����Ԫ�ؽ��볡��
		exp.interpreter(ctx);
	}
}
