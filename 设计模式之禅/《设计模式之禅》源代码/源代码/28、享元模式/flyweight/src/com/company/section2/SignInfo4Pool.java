package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfo4Pool extends SignInfo {
	
	//����һ���������ȡ��KEYֵ
	private String key;
	
	//���캯�������ͬ��־
	public SignInfo4Pool(String _key){
		this.key = _key;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
