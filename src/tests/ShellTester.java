package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ui.GUI;
import ui.Shell;
import ui.UserInterface;

public class ShellTester {

	@Test
	public void testLogin() {
		UserInterface ui = new Shell();
		assertEquals(true, ui.login("admin", "admin23"));
		assertEquals(false, ui.login("test", "testing"));
	}
}
