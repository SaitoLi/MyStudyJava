package com.lzz.tranning;


/**
   *   ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
   *   ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
   *   ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
   *   �������:
   *           �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ�
 * @author CunsiALIEN
 *
 */
public class FirstAppearingOnce {
	public char[] hash = new char[256];
	public String str = new String();
	
	public static void main(String[] args) {
		FirstAppearingOnce string = new FirstAppearingOnce();
		string.Insert('g');
		string.Insert('o');
		string.Insert('o');
		string.Insert('g');
		string.Insert('l');
		string.Insert('e');
		System.out.println(string.firstAppearingOnce());
	}
	
	//Insert one char from stringstream
    public void Insert(char ch)
    {
        hash[ch]++;
        str += ch;
    }
    //return the first appearence once char in current stringstream
    public char firstAppearingOnce()
    {
    	for(int i = 0 ; i < str.length(); i++) {
    		if(hash[str.charAt(i)] == 1) {
    			return str.charAt(i);
    		}
    	}
    	return '#';
    }
}
