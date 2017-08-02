package com.company.section2;

import java.util.HashMap;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfoFactory {
	//������
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
	
	//������Ϣ�Ķ��󹤳�
	@Deprecated
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
	
	//�ӳ��л�ö���
	public static SignInfo getSignInfo(String key){
		//���÷��ض���
		SignInfo result = null;
		//����û�иö������������������
		if(!pool.containsKey(key)){
			System.out.println(key + "----�������󣬲����õ�����");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}else{
			result = pool.get(key);
			System.out.println(key +"---ֱ�Ӵ�ֱ����ȡ��");
		}
		return result;
	}
}
