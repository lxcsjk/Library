package com.company.section3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	/* 
	 * Ա���ļ�ͥ��Ϣ
	 */
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		
		homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰��....");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��....");
		
		return homeInfo;
	}
}
