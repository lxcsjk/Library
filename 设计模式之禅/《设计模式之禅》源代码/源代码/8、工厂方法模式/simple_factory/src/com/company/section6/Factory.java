package com.company.section6;

import java.util.HashMap;
import java.util.Map;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Factory {
	private static final Map<String,Product> prMap = new HashMap();
	
	public static synchronized  Product createProduct(String type) throws Exception{
		Product product =null;
		
		//���Map���Ѿ����������
		if(prMap.containsKey(type)){
			product = prMap.get(type);
		}else{
			if(type.equals("Product1")){
				product = new ConcreteProduct1();
			}else{
				product = new ConcreteProduct2();
			}
			//ͬʱ�Ѷ���ŵ�����������
			prMap.put(type,product);
		}
		return product;
	}
}
