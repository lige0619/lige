
    /**  
    * @Title: FileUtilTest.java
    * @Package com.lige.common.utils
    * @Description: TODO(用一句话描述该文件做什么)
    * @author DELL
    * @date 2019年10月11日
    * @version V1.0  
    */
    
package com.lige.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**
    * @ClassName: FileUtilTest
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author DELL
    * @date 2019年10月11日
    *
    */

public class FileUtilTest {

	
	@Test
	public void testGetExtendName() {
		String file="1706D.jsp";
		String flie = FileUtil.getExtendName(file);
		System.out.println(flie);
	}

	
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	
	@Test
	public void testGetUserDirectory() {
	
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
		
	}

}
