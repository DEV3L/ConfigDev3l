package com.dev3l.config;

import java.net.URL;

import org.apache.commons.configuration.AbstractConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigReader {
	protected AbstractConfiguration configuration = null;
	
	public ConfigReader(final String fileName) throws ConfigurationException {
		configuration = new PropertiesConfiguration(getFilePath(fileName).getPath());
	}
	
	public String getProperty(final String key) {
		return configuration.getString(key);
	}
	
	private URL getFilePath(String fileName) {
		URL configFilePath = this.getClass().getClassLoader().getResource(fileName);

		if (configFilePath == null) {
			configFilePath = this.getClass().getResource(fileName);
			if (configFilePath == null) {
				throw new RuntimeException("Config resource " + fileName + " was not found on the classpath.");
			}
		}
		
		return configFilePath;
	}
}
