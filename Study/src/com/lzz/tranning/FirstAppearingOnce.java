package com.lzz.tranning;


/**
   *   请实现一个函数用来找出字符流中第一个只出现一次的字符。
   *   例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
   *   当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
   *   输出描述:
   *           如果当前字符流没有存在出现一次的字符，返回#字符
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
