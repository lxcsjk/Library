package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public interface Aggregate {
	
	//��������Ȼ��Ԫ�ص�����
	public void add(Object object);
	
	//����Ԫ��
	public void remove(Object object);
	
	//�ɵ��������������е�Ԫ��
	public Iterator iterator();
}
