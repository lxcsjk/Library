package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//����һ�����ڵ�
		Composite root = new Composite();
		root.doSomething();
		
		//����һ����֦����
		Composite branch = new Composite();
		//����һ��Ҷ�ӽڵ�
		Leaf leaf = new Leaf();
		
		//��������
		root.add(branch);
		branch.add(leaf);		
	}
	
	//ͨ���ݹ������
	public static void display(Composite root){

		for(Component c:root.getChildren()){
			if(c instanceof Leaf){ //Ҷ�ӽڵ�
				c.doSomething();
			}else{ //��֦�ڵ�
				display((Composite)c);
			}
		}
		
	}
}
