package com.company.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteAggregate implements Aggregate {
	//���ɶ��������
	private Vector vector = new Vector();
	
	//����һ��Ԫ��
	public void add(Object object) {
		this.vector.add(object);
	}

	//���ص���������
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}

	//ɾ��һ��Ԫ��
	public void remove(Object object) {
		this.remove(object);
	}

}
