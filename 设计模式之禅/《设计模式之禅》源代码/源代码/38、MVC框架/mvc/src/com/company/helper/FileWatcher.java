package com.company.helper;

import java.util.Observable;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class FileWatcher extends Observable implements Watchable{
	//�Ƿ�Ҫ���¼���XML�ļ�
	private boolean isReload = false;
	
	//��������
	public void watch(){
		//����һ���̣߳�ÿ��15��ɨ��һ���ļ��������ļ����ڱ��޸ģ�����֪ͨ�۲���
		super.addObserver(new Checker());
		super.setChanged();
		super.notifyObservers(isReload);
	}

}
