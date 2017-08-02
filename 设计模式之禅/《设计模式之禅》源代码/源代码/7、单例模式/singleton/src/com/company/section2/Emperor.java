/**
 * 
 */
package com.company.section2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �й�����ʷ��һ�㶼��һ������һ���ʵۣ��������ʵ۵Ļ�����ȻҪPK��һ���ʵ۳�����
 * ��������ˣ��������һ��ʱ�䣬�й������������ʵ���ô�죿����������ľ��֮���
 * ��Ӣ�ڱ���²�������ۼ�λ�����������۵��ϻʵۺ��ַ��ˣ���Ȼ���ǰ����ϸ���Ӣ����Ϊ̫�ϻʣ�
 * Ҳ��������һ�����µ�ʱ���ڣ��й���Ȼ�������ʵۣ�
 * 
 */

public class Emperor {
	//��������ܲ�����ʵ������
	private static int maxNumOfEmperor = 2;  	
	//ÿ���ʵ۶������֣�ʹ��һ��ArrayList�����ɣ�ÿ�������˽������
	private static ArrayList<String> nameList=new ArrayList<String>(); 
	//����һ���б��������еĻʵ�ʵ��
	private static ArrayList<Emperor> emperorList=new ArrayList<Emperor>();
	//��ǰ�ʵ����к�
	private static int countNumOfEmperor =0;  
	
	//�������еĶ���
	static{
		for(int i=0;i<maxNumOfEmperor;i++){  
			emperorList.add(new Emperor("��"+(i+1)+"��"));
		}
	}
	
	private Emperor(){
		//���׺͵���Լ���㣬Ŀ�ľ��ǲ���������ڶ����ʵ�
	}
	
	//����ʵ����ƣ�����һ���ʵ۶���
	private Emperor(String name){
		nameList.add(name);
	}
	
	//������һ���ʵ۶���
	public static Emperor getInstance(){
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);  //�������һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		return emperorList.get(countNumOfEmperor);		
	}
	
	//���ָ���Ļʵ�
	public static Emperor getInstance(int i){
		return emperorList.get(i);
	}
	
	//�ʵ۷�����
	public static void say(){
		System.out.println(nameList.get(countNumOfEmperor));		
	}
}
