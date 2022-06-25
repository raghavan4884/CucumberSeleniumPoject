package com.test.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeUtils {

	public String getCurrentDateTime()
	{
		String localTime=null;
		try
		{
			DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime now=LocalDateTime.now();
			localTime=df.format(now);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return localTime;
	}
}
