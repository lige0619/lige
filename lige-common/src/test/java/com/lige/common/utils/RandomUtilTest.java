
    /**  
    * @Title: RandomUtilTest.java
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
    * @ClassName: RandomUtilTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author DELL
    * @date 2019年10月12日
    *
    */

public class RandomUtilTest {

	
	@Test
	public void testRandom() {
	
		int i = RandomUtil.random(1, 10);
		System.out.println(i);
	}

	
	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 4);
		for (int i : is) {
			System.out.println(i);
		}
	}

	
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	
	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
