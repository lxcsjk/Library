package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class User {
	//����
	private String name;
	//����
	private int age;
	
	public User(String _name,int _age){
		this.name = _name;
		this.age = _age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//�û�����Ϣ��ӡ
	@Override
	public String toString(){
		return "�û�����" + name+"\t���䣺" + age;
	}
}
