package com.api.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties extends com.api.base.AppObjectRespo{
	
	public void readProperties() throws IOException {
		
		FileReader reader=new FileReader(com.api.base.AppObjectRespo.propertiesFile);
        Properties props=new Properties();
        props.load(reader);
        
        com.api.base.AppObjectRespo.baseUrl = props.getProperty("baseUrl");
	}
}
