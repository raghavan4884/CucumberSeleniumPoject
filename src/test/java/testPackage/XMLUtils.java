package testPackage;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtils {
	
	public ArrayList<String> xmlReader(String fileName) 
	{
		ArrayList<String> ls=new ArrayList<String>();
		try
		{
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=dbf.newDocumentBuilder();
		
	Document doc=db.parse(fileName);
		doc.getDocumentElement().normalize();
		
		NodeList list=doc.getElementsByTagName("locator");
		for(int i=0;i<list.getLength();i++)
		{
			Node node=list.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE)
			{
				Element element=(Element) node;
				ls.add(element.getElementsByTagName("name").item(0).getTextContent()+"`"+element.getElementsByTagName("type").item(0).getTextContent()+"`"+element.getElementsByTagName("value").item(0).getTextContent());
				//System.out.println(ls);
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(ls);
		return ls;
		
	}
	
/*	public static void main(String args[])
	{
		XMLUtils xu=new XMLUtils();
		xu.xmlReader("D:\\1.xml");
	}
*/
}
