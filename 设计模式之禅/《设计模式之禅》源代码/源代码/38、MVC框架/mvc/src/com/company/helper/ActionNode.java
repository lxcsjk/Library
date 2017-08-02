package com.company.helper;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class ActionNode {
	
	//action������
	private String actionName;
	//action������
	private String actionClass;
	//������, Ĭ����execute
	private String methodName = "excuete";
	//��ͼ·��
	private String view;
	
	
	public String getActionName() {
		return actionName;
	}

	public String getActionClass() {
		return actionClass;
	}

	public String getMethodName() {
		return methodName;
	}

	public abstract String getView(String Result);

	
}
