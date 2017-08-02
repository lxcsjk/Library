package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Decorator extends Component {
	private Component component = null;
	
	//ͨ�����캯�����ݱ�������
	public Decorator(Component _component){
		this.component = _component;
	}
	
	//ί�и���������ִ��
	@Override
	public void operate() {
		this.component.operate();
	}

}
