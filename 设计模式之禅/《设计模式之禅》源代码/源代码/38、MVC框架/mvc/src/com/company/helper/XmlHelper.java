package com.company.helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class XmlHelper {
	//��������
	private static Document doc;
	//Ĭ�ϵ�Action��XPATH·��
	private final static String DEFAULT_ACTION_PATH = "/mvc/action";
	
	public XmlHelper(){
		this("c:/ActionConfig.xml");
	}
	
	//��ʼ��һ��XML DOCUMENT����
	public XmlHelper(String xmlFilePath){
		try {
			InputStream xmlStream = new FileInputStream(xmlFilePath);
			doc = (new SAXReader()).read(xmlStream); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//����Action���Ʋ��ҳ��ڵ�
	@SuppressWarnings("unchecked")
	public Element getNodeByActionName(String actionName){
		//ȡ�����нڵ�
		List<Node> nodeList = doc.selectNodes(DEFAULT_ACTION_PATH);
		//�������е�Node�ڵ�
		System.out.println(nodeList.size());
		for(Node node:nodeList){
			Element e = (Element)node;
			Attribute a = e.attribute("name");
			//�ҵ�����ƥ���action
			if(a.getText().equals(actionName)){
				return e;
			}
		}
		return null;
	}
	
	//�����������
	public static void main(String[] args) {
		XmlHelper xmlhelper = new XmlHelper();
		Element e=xmlhelper.getNodeByActionName("loginAction");
		ActionNode node = new XmlActionNode(e);
		System.out.println(node.getView("success"));
	}
}
