package com.api.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.api.base.Base;
import com.api.objectrespo.AppObjectRespo;

public class ReadProperties extends Base{
	
	public void readProperties() throws IOException {
		
		FileReader reader=new FileReader(AppObjectRespo.propertiesFile);
        Properties props=new Properties();
        props.load(reader);
        
        AppObjectRespo.baseUrl = props.getProperty("baseUrl");
	}
}
