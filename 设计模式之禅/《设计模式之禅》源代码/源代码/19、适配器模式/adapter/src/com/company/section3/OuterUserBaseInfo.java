package com.company.section3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

	/* 
	 * �û��Ļ�����Ϣ
	 */
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		
		baseInfoMap.put("userName", "���Ա���л���ħ��....");
		baseInfoMap.put("mobileNumber", "���Ա���绰��....");
		
		return baseInfoMap;
	}

}
