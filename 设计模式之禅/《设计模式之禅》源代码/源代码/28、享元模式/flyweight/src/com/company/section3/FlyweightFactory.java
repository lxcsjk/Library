package com.company.section3;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class FlyweightFactory {
	//����һ��������
	private static  HashMap<String,Flyweight> pool= new HashMap<String,Flyweight>();
	
	//��Ԫ����
	public static Flyweight getFlyweight(String Extrinsic){
		//��Ҫ���صĶ���
		Flyweight flyweight = null;
		//�ڳ���û�иĶ���
		if(pool.containsKey(Extrinsic)){
			flyweight = pool.get(Extrinsic);
		}else{
			//�����ⲿ״̬������Ԫ����
			flyweight = new ConcreteFlyweight1(Extrinsic);
			//���õ�����
			pool.put(Extrinsic, flyweight);
		}
		
		return flyweight;
	}

}
