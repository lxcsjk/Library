package com.company.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class CompositeSpecification implements ISpecification {
	//�Ƿ�����������ʵ����ʵ��
	public abstract boolean isSatisfiedBy(Object candidate);	

	//and����
	public ISpecification and(ISpecification spec) {
		return new AndSpecification(this,spec);
	}

	//not����
	public ISpecification not() {
		return new NotSpecification(this);
	}

	//or����
	public ISpecification or(ISpecification spec) {
		return new OrSpecification(this,spec);
	}

}
