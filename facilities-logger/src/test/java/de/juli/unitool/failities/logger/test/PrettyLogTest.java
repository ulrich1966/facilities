package de.juli.unitool.failities.logger.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.juli.unitool.failities.logger.PrettyLog;

public class PrettyLogTest {
	private static final Logger LOG = LoggerFactory.getLogger(PrettyLogTest.class);
	private static final PrettyLog LOG_PRETTY = new PrettyLog(LOG);


	@Test
	public void testPrettyLog() {
		Assert.assertNotNull(LOG);
		Assert.assertNotNull(LOG_PRETTY);
	}

	@Test
	public void testInfoObject() {
		LOG_PRETTY.info(new String("test"));
	}

	@Test
	public void testInfoStringArray() {
		LOG_PRETTY.info("test", "test", "test", "test");
	}

	@Test
	public void testInfoStringObject() {
		LOG_PRETTY.info("key", new String("value"));
	}

	@Test
	public void testInfoStringListOfQ() {
		List<String> list = new ArrayList<>();
		list.add("entry01");
		list.add("entry02");
		list.add("entry03");
		list.add("entry04");
		LOG_PRETTY.info("liste", list);
	}

	@Test
	public void testDebugObject() {
		LOG_PRETTY.debug(new String("value"));
	}

	@Test
	public void testDebugStringObject() {
		LOG_PRETTY.debug("key", new String("value"));
	}

	@Test
	public void testDebugStringArray() {
		LOG_PRETTY.debug("test", "test", "test", "test");
	}

	@Test
	public void testErrorException() {
		LOG_PRETTY.error(new NullPointerException("test NullPointer"));
	}

	@Test
	public void testErrorStringObject() {
		LOG_PRETTY.error("error", new NullPointerException("test NullPointer"));
	}

	@Test
	public void testErrorStringException() {
	}

	@Test
	public void testErrorStringObjectException() {
		LOG_PRETTY.error("error", new String("ein Fehler ist aufgetreten"), new NullPointerException("test NullPointer"));
	}

}
