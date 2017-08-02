package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByNameEqual extends CompositeSpecification {
	//��׼����
	private String name;
	//���캯�����ݻ�׼����
	public UserByNameEqual(String _name){
		this.name = _name;
	}
	
	//�����û��Ƿ���������
	public boolean isSatisfiedBy(User user) {
		return user.getName().equals(name);
	}

}
