package tests;

import static org.junit.Assert.*;

import java.io.File;

import managers.AbstractManager;
import managers.FileManager;

import org.junit.Test;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class FileManagerTester {

	@Test
	public void testCreateFile() {
		FileManager fileManager = new FileManager();
		fileManager.createFile("/home/rares", "testingCreate");
		File file = new File("/home/rares/testingCreate");
		assertEquals(true, file.exists());
		File file2 = new File("/home/rares/nonExistingFile");
		assertEquals(false, file2.exists());		
	}
	
	@Test
	public void testDeleteFile(){
		FileManager fileManager = new FileManager();
		fileManager.createFile("/home/rares", "fileToBeDeleted");
		fileManager.deleteFile("/home/rares/fileToBeDeleted");
		File file = new File("/home/rares/fileToBeDeleted");
		assertEquals(true, !file.exists());
		assertEquals(false,file.exists());
	}
}
