package com.dev3l.config.test;

import org.apache.commons.configuration.ConfigurationException;
import org.junit.Assert;
import org.junit.Test;

import com.dev3l.config.ConfigurationReader;

public class ConfigurationReaderTest {
	private static final String TEST_PROPERTIES_FILE = "test.properties";

	@Test
	public void testConfigReader() throws ConfigurationException {
		final ConfigurationReader configurationReader = new ConfigurationReader(TEST_PROPERTIES_FILE);
		Assert.assertNotNull(configurationReader.get("key"));
	}

	@Test(expected = RuntimeException.class)
	public void testInvalidConfigReader() throws ConfigurationException {
		new ConfigurationReader("invalid-" + TEST_PROPERTIES_FILE);
	}
}
