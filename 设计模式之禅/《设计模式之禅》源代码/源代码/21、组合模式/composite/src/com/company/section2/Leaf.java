package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * Leaf����Ҷ��Ҳ�ǣ����������������ЩС��
 */
@SuppressWarnings("all")
public class Leaf implements ILeaf {
	//С��Ҳ������
	private String name = "";
	//С��Ҳ��ְλ
	private String position = "";
	//С��Ҳ��нˮ������˭�����
	private int salary = 0;
	
	//ͨ��һ�����캯������С������Ϣ
	public Leaf(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	//���С������Ϣ
	public String getInfo() {
		String info = "";
		info = "������" + this.name;
		info = info + "\tְλ��"+ this.position;
		info = info + "\tнˮ��" + this.salary;
		return info;
	}

}
