
    /**  
    * @Title: FileUtil.java
    * @Package com.lige.common.utils
    * @Description: TODO(用一句话描述该文件做什么)
    * @author DELL
    * @date 2019年10月11日
    * @version V1.0  
    */
    
package com.lige.common.utils;

import java.io.File;

/**
    * @ClassName: FileUtil
    * @Description: 文件工具类
    * @author DELL
    * @date 2019年10月11日
    *
    */

public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
	//TODO 实现代码
		if(fileName!=null && fileName.length()>0) {
			return fileName.substring(fileName.lastIndexOf(".")+1);
			}
			return null;
		
		
		
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
	//TODO 实现代码
		
		String string = System.getProperty("java.io.tmpdir");
		return new File(string);
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
	//TODO 实现代码
		String string = System.getProperty("user.home");
		return new File(string);
	}

}
