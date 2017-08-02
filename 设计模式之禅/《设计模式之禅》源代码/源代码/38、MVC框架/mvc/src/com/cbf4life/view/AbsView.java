package com.cbf4life.view;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsView {
	private AbsLangData langData;
	
	//����Ҫһ�������ļ�
	public AbsView(AbsLangData _langData){
		this.langData = _langData;
	}
	
	//��õ�ǰ������
	public AbsLangData getLangData(){
		return langData;
	}
	
	//ҳ���URL·��
	public String getURI(){
		return null;
	}
	
	//��װһ��ҳ��
	public abstract void assemble();
	
}
