package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByAgeThan extends CompositeSpecification {
	//��׼����
	private int age;
	//���캯�����ݻ�׼����
	public UserByAgeThan(int _age){
		this.age = _age;
	}
	
	//�����û��Ƿ���������
	public boolean isSatisfiedBy(User user) {
		return user.getAge() > age;
	}

}
