package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * С˵�鼮
 */
public class NovelBook implements IBook {
	//�鼮����
	private String name;
	
	//�鼮�ļ۸�
	private int price;
	
	//�鼮������
	private String author;
	
	
	
	//ͨ�����캯�������鼮����
	public NovelBook(String _name,int _price,String _author){
		this.name = _name;
		this.price = _price;
		this.author = _author;
	}
	
	//���������˭
	public String getAuthor() {
		return this.author;
	}

	//�鼮��ʲô����
	public String getName() {
		return this.name;
	}

	//����鼮�ļ۸�
	public int getPrice() {
		return this.price;
	}

}
