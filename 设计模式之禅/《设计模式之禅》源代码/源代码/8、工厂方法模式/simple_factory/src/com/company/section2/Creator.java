package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Creator {
	
	/*
	 * ����һ����Ʒ����,������������Ϳ�����������
	 * ͨ��ΪString��Enum��Class�ȣ���ȻҲ����Ϊ��
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
