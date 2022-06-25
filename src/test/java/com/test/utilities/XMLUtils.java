package com.test.utilities;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLUtils {

	public ArrayList xmlReader(String fileName,String tagName)
	{
		File file=new File(fileName);
		ArrayList ls=null;
		try
		{
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse(fileName);
			doc.getDocumentElement().normalize();
			doc.getDocumentElement().getNodeName();//GetRootNode
			NodeList list=doc.getElementsByTagName(tagName);
			for(int i=0;i<list.getLength();i++)
				{
				Node node=(Node) list.item(i);
				if(node.getNodeType()==Node.ELEMENT_NODE)
					{
					Element element=(Element)node;
					ls.add(element.getElementsByTagName("type").item(0).getTextContent()+"`"+element.getElementsByTagName("value").item(0).getTextContent());
					}
				}
					
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	
}
