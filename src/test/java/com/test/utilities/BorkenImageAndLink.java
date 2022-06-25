package com.test.utilities;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;



public class BorkenImageAndLink {
	
	public void brokenLink(String linkName)
	{
		try
		{
			URL url=new URL(linkName);
			HttpURLConnection hu=(HttpURLConnection)url.openConnection();
			hu.setConnectTimeout(3000);
			hu.connect();
			hu.getResponseCode();
			hu.getResponseMessage();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void brokenImage(String imgName)
	{
		try
		{
			HttpClient client=HttpClientBuilder.create().build();
			HttpGet request=new HttpGet();
			HttpResponse response=client.execute(request);
			response.getStatusLine().getStatusCode();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
