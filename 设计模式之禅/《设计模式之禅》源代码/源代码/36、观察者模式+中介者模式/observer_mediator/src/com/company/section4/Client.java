package com.company.section4;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	public static void main(String[] args) {
		//����¼��ַ�����
		EventDispatch dispatch = EventDispatch.getEventDispathc();
		//������ؤ���¼��Ĵ���
		dispatch.registerCustomer(new Beggar());	
		//����ƽ����¼��Ĵ���
		dispatch.registerCustomer(new Commoner());
		//���ܹ���Ը��¼��Ĵ���
		dispatch.registerCustomer(new Nobleman());
		
		//����һ��ԭ�ӵ���������
		ProductManager factory = new ProductManager();
		
		//����һ����Ʒ
		System.out.println("=====ģ�ⴴ����Ʒ�¼�========");
		System.out.println("����һ������С�к���ԭ�ӵ�");
		Product p = factory.createProduct("С�к�ԭ�ӵ�");
		
		//�޸�һ����Ʒ
		System.out.println("\n=====ģ���޸Ĳ�Ʒ�¼�========");
		System.out.println("��С�к�ԭ�ӵ��޸�Ϊ���Ӻ�ԭ�ӵ�");
		factory.editProduct(p, "���Ӻ�ԭ�ӵ�");
		
		//�ٿ�¡һ��ԭ�ӵ�
		System.out.println("\n=====ģ���¡��Ʒ�¼�========");
		System.out.println("��¡���Ӻ�ԭ�ӵ�");
		factory.clone(p);
		
		//����һ����Ʒ�����ٵص�����˶�֪��
		System.out.println("\n=====ģ�����ٲ�Ʒ�¼�========");
		System.out.println("�������Ӻ�ԭ�ӵ�");
		factory.abandonProduct(p);
		
	}
}
