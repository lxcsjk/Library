package com.company.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteIterator implements Iterator {
	private Vector vector = new Vector();
	//���嵱ǰ�α�
	public int cursor = 0;
	
	@SuppressWarnings("unchecked")
	public ConcreteIterator(Vector _vector){		
		this.vector = _vector;
	}
	
	//�ж��Ƿ񵽴�β��
	public boolean hasNext() {
		if(this.cursor == this.vector.size()){
			return false;
		}else{
			return true;
		}
	}
	
	//������һ��Ԫ��
	public Object next() {
		Object result = null;
		
		if(this.hasNext()){
			result = this.vector.get(this.cursor++);
		}else{
			result = null;
		}
		return result;
	}

	//ɾ����ǰԪ��
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}

}
