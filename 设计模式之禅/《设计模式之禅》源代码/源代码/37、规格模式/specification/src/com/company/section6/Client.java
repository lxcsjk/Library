package com.company.section6;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//�������Ķ���
		ArrayList<Object> list = new ArrayList<Object>();
		
		//��������ҵ����
		ISpecification spec1 = new BizSpecification(new Object());
		ISpecification spec2 = new BizSpecification(new Object());
		//����ĵ���
		for(Object obj:list){
			if(spec1.and(spec2).isSatisfiedBy(obj)){  //and����
				System.out.println(obj);
			}
		}
		
	}
}
