package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����������
		Aggregate agg = new ConcreteAggregate();
		
		
		//�����������ݷŽ�ȥ
		agg.add("abc");
		agg.add("aaa");
		agg.add("1234");
		
		//����һ��
		Iterator iterator = agg.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
