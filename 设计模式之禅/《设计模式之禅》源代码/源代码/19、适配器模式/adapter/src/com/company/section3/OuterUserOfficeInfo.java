package com.company.section3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	/* 
	 * Ա���Ĺ�����Ϣ������ְλ�˵�
	 */
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap();
		
		officeInfo.put("jobPosition","����˵�ְλ��BOSS...");
		officeInfo.put("officeTelNumber", "Ա���İ칫�绰��....");
		
		return officeInfo;
	}

}
