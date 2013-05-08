package edu.neumont.csc380.services;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import edu.neumont.csc380.models.Game;

@ContextConfiguration(locations="beans.xml")
public class TTTGameServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired TTTGameService service;
	
	@Test
	public void test() {
		Game game = service.newGame();
		Assert.assertEquals(null, game);
	}

}
