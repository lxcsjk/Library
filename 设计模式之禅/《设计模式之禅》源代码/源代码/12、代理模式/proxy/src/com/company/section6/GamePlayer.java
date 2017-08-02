package com.company.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���ǵ����
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";
	//�ҵĴ�����˭
	private IGamePlayer proxy = null;
		
	public GamePlayer(String _name){
		this.name = _name;	
	}
	
	//�ҵ��Լ��Ĵ���
	public IGamePlayer getProxy(){
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	//��֣��������ľ���ɱ�Ϲ�
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name + "�ڴ�֣�");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}
		
	}
	
	//����Ϸ֮ǰ��϶�Ҫ��¼�ɣ�����һ����Ҫ����
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("��¼��Ϊ"+user + " ���û� " + this.name + "��¼�ɹ���");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");;
		}
		
	}

	//�����������кܶ෽������Ǯ����һ�֣�������Ҳ��һ��
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name + " ������һ����");
		}else{
			System.out.println("��ʹ��ָ���Ĵ������");
		}
	}
	
	//У���Ƿ��Ǵ������
	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		}else{
			return true;
		}
	}
}
