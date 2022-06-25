package com.test.utilities;

import java.io.*;

public class FileUtils {

	public void createNewFile(String fileName)
	{
		File file=new File(fileName);
		try
		{
		if(!file.exists())
		{
			file.createNewFile();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readFile(String fileName)
	{
		File file=new File(fileName);
		String value=null;
		
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			while((value=br.readLine())!=null)
			{
				System.out.println(value);
			}
			br.close();
			fr.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeIntoFile(String fileName,String message)
	{
		File file=new File(fileName);
		try
		{
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.print(message+"\n");
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
