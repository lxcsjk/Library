package com.company.section3;

import junit.framework.TestCase;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OffNovelBookTest extends TestCase {
	
	private IBook below40NovelBook = new OffNovelBook("ƽ��������",3000,"·ң");
	private IBook above40NovelBook = new OffNovelBook("ƽ��������",6000,"·ң");
	
	//���Ե���40Ԫ�������Ƿ��Ǵ�8��
	public void testGetPriceBelow40() {
		super.assertEquals(2400, this.below40NovelBook.getPrice());
	}
	
	//���Դ���40���鼮�Ƿ��Ǵ�9��
	public void testGetPriceAbove40(){
		super.assertEquals(5400, this.above40NovelBook.getPrice());
	}

}
