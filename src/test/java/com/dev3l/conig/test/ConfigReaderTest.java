package com.dev3l.conig.test;

import org.apache.commons.configuration.ConfigurationException;
import org.junit.Assert;
import org.junit.Test;

import com.dev3l.config.ConfigReader;

public class ConfigReaderTest {
	private static final String TEST_PROPERTIES_FILE = "test.properties";
	
	@Test
	public void testConfigReader() throws ConfigurationException  {
		ConfigReader configReader = new ConfigReader(TEST_PROPERTIES_FILE);
		Assert.assertNotNull(configReader.getProperty("key"));
	}
	
	@Test(expected=RuntimeException.class)
	public void testInvalidConfigReader() throws ConfigurationException {
		new ConfigReader("invalid-" + TEST_PROPERTIES_FILE);
	}
}
