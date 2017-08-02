package com.company.action;

import com.company.helper.ValueStackHelper;
import com.company.valuestack.ValueStack;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����������
 */
public abstract class AbstractInterceptor {
	//��õ�ǰ��ֵջ
	private ValueStack valueStack = ValueStackHelper.getValueStack();
	//���������ͣ�ǰ�á����á�����
	private int type =0;
	
	
	//��ǰ��ֵջ 
	protected ValueStack getValueStack(){
		return valueStack;
	}
	
	//���ش���
	public final void exec(){
		//����type��ͬ������ʽҲ��ͬ
	}
	
	//����������
	protected abstract void setType(int type);
	
	//����ʵ�ֵ�������
	protected abstract void intercept();
	
}
