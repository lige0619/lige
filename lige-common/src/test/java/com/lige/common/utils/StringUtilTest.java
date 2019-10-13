
    /**  
    * @Title: StringUtilTest.java
    * @Package com.lige.common.utils
    * @Description: TODO(用一句话描述该文件做什么)
    * @author DELL
    * @date 2019年10月12日
    * @version V1.0  
    */
    
package com.lige.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
    * @ClassName: StringUtilTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author DELL
    * @date 2019年10月12日
    *
    */

public class StringUtilTest {

	
	@Test
	public void testHasLength() {
		String str=" ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	
	@Test
	public void testHasText() {
		String str="";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}


	@Test
	public void testRandomChineseString() {
		int length = 20;
		String string = StringUtil.randomChineseString(length);
		System.out.println(string);
		
	}

	
	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}

}
