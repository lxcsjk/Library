package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByNameLike extends CompositeSpecification {
	//like�ı��
	private final static String LIKE_FLAG = "%";
	//��׼��like�ַ���
	private String likeStr;
	//���캯�����ݻ�׼����
	public UserByNameLike(String _likeStr){
		this.likeStr = _likeStr;
	}
	
	//�����û��Ƿ���������
	public boolean isSatisfiedBy(User user) {
		boolean result = false;
		String name = user.getName();
		//�滻��%��ĸɾ��ַ���
		String str = likeStr.replace("%","");
		//�������ֿ�ͷ����'����%'
		if(likeStr.endsWith(LIKE_FLAG) && !likeStr.startsWith(LIKE_FLAG)){
			result = name.startsWith(str);
		}else if(likeStr.startsWith(LIKE_FLAG) && !likeStr.endsWith(LIKE_FLAG)){ //���� '%����'
			result = name.endsWith(str);
		}else{
			result = name.contains(str); //������'%����%'
		}
		
		return result;
	}

}
