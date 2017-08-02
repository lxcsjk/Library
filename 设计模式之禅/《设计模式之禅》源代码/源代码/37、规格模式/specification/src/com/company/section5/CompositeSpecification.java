package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class CompositeSpecification implements IUserSpecification {
	//�Ƿ�����������ʵ����ʵ��
	public abstract boolean isSatisfiedBy(User user);

	//and����
	public IUserSpecification and(IUserSpecification spec) {
		return new AndSpecification(this,spec);
	}

	//not����
	public IUserSpecification not() {
		return new NotSpecification(this);
	}

	//or����
	public IUserSpecification or(IUserSpecification spec) {
		return new OrSpecification(this,spec);
	}

}
