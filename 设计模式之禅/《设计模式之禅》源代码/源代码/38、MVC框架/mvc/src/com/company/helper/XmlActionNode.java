package com.company.helper;

import org.dom4j.Attribute;
import org.dom4j.Element;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class XmlActionNode extends ActionNode {
	
	//��Ҫת����element
	private Element el;
	
	//ͨ�����캯������
	public XmlActionNode(Element _el){
		this.el = _el;
	}
	
	
	@Override
	public String getActionName(){
		return getAttValue("name");
	}
	
	@Override
	public String getActionClass(){
		return getAttValue("class");
	}
	
	@Override
	public String getMethodName(){
		return getAttValue("method");
	}
	
	public String getView(String result){
		ViewPathVisitor visitor = new ViewPathVisitor("success");
		el.accept(visitor);
		return visitor.getViewPath();
	}
	
	
	//���ָ������ֵ
	private String getAttValue(String attName){
		Attribute att = el.attribute(attName);
		return att.getText();
	}
	
}
