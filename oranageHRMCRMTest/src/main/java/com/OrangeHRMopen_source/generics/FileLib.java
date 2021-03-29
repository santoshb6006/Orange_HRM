package com.OrangeHRMopen_source.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
public String getPropertyValue(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Data/test_data.property");	
	Properties p=new Properties();
	p.load(fis);
	 String value = p.getProperty(key);
	System.out.println(value);
	return value;
}
}   
