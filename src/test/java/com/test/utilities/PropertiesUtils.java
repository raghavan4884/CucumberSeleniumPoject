package com.test.utilities;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {

	public String getPropertyVal(String fileName,String property)
	{
		String propValue=null;
		File file=new File(fileName);
		try
		{
			FileInputStream fis=new FileInputStream(file);
			Properties prop=new Properties();
			prop.load(fis);
			propValue=prop.getProperty(property);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return propValue;
	}
}
