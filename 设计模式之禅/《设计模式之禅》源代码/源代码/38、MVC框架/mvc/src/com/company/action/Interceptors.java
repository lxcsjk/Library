package com.company.action;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Interceptors implements Iterable<AbstractInterceptor> {

	//��������������һ������������
	public Interceptors(ArrayList<AbstractInterceptor> list){
		
	}

	
	//�г����е�������
	public Iterator<AbstractInterceptor> iterator() {
		return null;
	}
	
	//��������ִ�з���
	public void intercept(){
		//ί��������ִ��
	}
}
