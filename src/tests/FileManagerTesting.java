package tests;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import manager.FileManager;
public class FileManagerTesting {

	@Test
	public void testFileCreate() {
		FileManager fileManager = new FileManager();
		fileManager.createFile("testing", "/home/rares");
		File file = new File("/home/rares/testing");	
		File file1 = new File("/home/rares/notexisting");
		assertEquals(true, file.exists());
		assertEquals(false, file1.exists());
	}
}
