/**
 * 
 */
package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���Ǳ����ˣ�һ���ʵ۶��ź򲻹����ˣ����ڻ������������ʵ�
 * TND�������ˣ��ҵ����ʵۣ���ͷ���밴�ͳ��ˣ�
 */
@SuppressWarnings("all")
public class Minister {

	public static void main(String[] args) {
		//����5����
		int ministerNum =5; 
		
		for(int i=0;i<ministerNum;i++){
			Emperor emperor = Emperor.getInstance();
			System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			emperor.say();
		}		
	}
}
