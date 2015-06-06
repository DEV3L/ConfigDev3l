package com.dev3l.config;

import java.net.URL;

import org.apache.commons.configuration.AbstractConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigurationReader {
	protected AbstractConfiguration configuration = null;

	@Deprecated
	public ConfigurationReader() {
	}

	public ConfigurationReader(final String fileName) throws ConfigurationException {
		configuration = new PropertiesConfiguration(getFilePath(fileName).getPath());
	}

	public String get(final String key) {
		return configuration.getString(key);
	}

	private URL getFilePath(final String fileName) {
		URL configFilePath = this.getClass().getClassLoader().getResource(fileName);

		if (configFilePath == null) {
			configFilePath = this.getClass().getResource(fileName);
			if (configFilePath == null) {
				throw new RuntimeException("Resource not found: " + fileName);
			}
		}

		return configFilePath;
	}
}
