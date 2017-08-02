package com.company.action;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ActionDispather implements IActionDispather {
	//��Ҫִ�е�Action
	private ActionManager actionManager = new ActionManager();
	
	//��������
	private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();
	
	public String actionInvoke(String actionName) {
		//ǰ��������
		return actionManager.execAction(actionName);
		//����������
	}

}
