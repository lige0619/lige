
    /**  
    * @Title: StreamUtilTest.java
    * @Package com.lige.common.utils
    * @Description: TODO(用一句话描述该文件做什么)
    * @author DELL
    * @date 2019年10月11日
    * @version V1.0  
    */
    
package com.lige.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
    * @ClassName: StreamUtilTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author DELL
    * @date 2019年10月11日
    *
    */

public class StreamUtilTest {

	
	@Test
	public void testCloseAll() {
		
	}

	
	@Test
	public void testReadTextFileInputStream() throws Exception {
		
		
		
		String string = StreamUtil.readTextFile(new FileInputStream(new File("D:/dada.txt")));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("D:/dada.txt"));
		System.out.println(string);
	}

}
