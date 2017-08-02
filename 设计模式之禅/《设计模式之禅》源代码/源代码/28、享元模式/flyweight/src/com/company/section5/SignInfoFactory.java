package com.company.section5;

import java.util.HashMap;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfoFactory {
	//������
	private static HashMap<ExtrinsicState,SignInfo> pool = new HashMap<ExtrinsicState,SignInfo>();

	//�ӳ��л�ö���
	public static SignInfo getSignInfo(ExtrinsicState key){
		//���÷��ض���
		SignInfo result = null;
		//����û�иö������������������
		if(!pool.containsKey(key)){
			result = new SignInfo();
			pool.put(key, result);
		}else{
			result = pool.get(key);
		}
		return result;
	}
}
