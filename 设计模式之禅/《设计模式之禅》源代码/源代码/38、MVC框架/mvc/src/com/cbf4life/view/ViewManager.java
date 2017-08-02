package com.cbf4life.view;

import com.company.helper.ValueStackHelper;
import com.company.valuestack.ValueStack;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ViewManager {
	//Action������
	private String actionName;
	//��ǰ��ֵջ
	private ValueStack valueStack = ValueStackHelper.getValueStack();
	
	//����һ��ActionName����ʼ�����е���ͼ
	public ViewManager(String _actionName){
		this.actionName = _actionName;
	}
	
	//����model�ķ��ؽ���ṩ��ͼ
	public String getViewPath(String result){
		//����ֵջ���ҵ���Ҫ�ṩ�����԰�
		AbsLangData langData = new GBLangData();
		//����action��result���ҵ�ָ������ͼ,����������
		AbsView view = new JspView(langData);
		//������ͼ�ĵ�ַ
		return view.getURI();
	}
}
