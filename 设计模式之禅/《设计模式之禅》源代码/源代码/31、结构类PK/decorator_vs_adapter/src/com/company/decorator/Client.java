package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//�ܾúܾ���ǰ��������һ����ª��СѼ��
		System.out.println("===�ܾúܾ���ǰ��������һֻ��ª��СѼ��===");
		Swan duckling = new UglyDuckling();
		//չʾһ��СѼ
		duckling.desAppaearance();  //СѼ�ӵ�����
		duckling.cry();  //СѼ�ӵĽ���
		duckling.fly();  //СѼ�ӵ���Ϊ
		
		System.out.println("\n===СѼ�����ڷ����Լ���һֻ���====");
		//�������α仯��
		duckling = new BeautifyAppearance(duckling);
		//�����ΪҲ�����˸ı�
		duckling = new StrongBehavior(duckling); 
		//��Ȼ���ǽг�СѼ�������Ѿ������˺ܴ�仯
		duckling.desAppaearance();  //СѼ�ӵ�������
		duckling.cry();  //СѼ�ӵĽ���
		duckling.fly();  //СѼ�ӵ�����Ϊ
	}
}