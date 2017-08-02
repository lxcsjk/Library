package com.company.helper;

import java.util.Observable;
import java.util.Observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Checker implements Observer{
	//ʹ����һ������
	private IXmlValidate validate;
	
	//xml�����ļ���·��
	String xmlPath;
	
	//�޲ι���
	public Checker(){
		//��ȡweb.xml�����ļ������ʹ����һ���������
		this(null);
	}
	
	//���캯������
	public Checker(IXmlValidate _validate){
		this.validate = _validate;	
	}
	
	public void setXmlPath(String _xmlPath){
		this.xmlPath = _xmlPath;
	}
	
	//���
	public boolean check(){
		return validate.validate(xmlPath);
	}

	
	public void update(Observable arg0, Object arg1) {
		//����Ƿ��������
		arg1 = check();
	}
		
}
