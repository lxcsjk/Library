package com.company.section5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Leaf extends Component {	
	@Deprecated
	public void add(Component component) throws UnsupportedOperationException{
		//��ʵ��,ֱ������һ������֧�������쳣
		throw new UnsupportedOperationException();
	}
	
	@Deprecated
	public void remove(Component component)throws UnsupportedOperationException{
		//��ʵ��
		throw new UnsupportedOperationException();
	}
	
	@Deprecated
	public ArrayList<Component> getChildren()throws UnsupportedOperationException{
		//��ʵ��
		throw new UnsupportedOperationException();		
	}
}
