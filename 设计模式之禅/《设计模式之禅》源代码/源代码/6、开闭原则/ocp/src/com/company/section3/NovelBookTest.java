package com.company.section3;

import junit.framework.TestCase;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * NovelBook�Ĳ�����
 */
public class NovelBookTest extends TestCase {
	private String name = "ƽ��������";
	private int price = 6000;
	private String author = "·ң";
	
	private IBook novelBook = new NovelBook(name,price,author);

	//����getPrice����
	public void testGetPrice() {
		//ԭ�����ۣ��ж�����������ֵ�Ƿ���Ƚ��ж���
		super.assertEquals(this.price, this.novelBook.getPrice());
	}

}
