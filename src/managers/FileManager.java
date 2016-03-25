package managers;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager extends AbstractManager {
//dsds
	
	public void createFile(String path,String fileName)
	{
		File f = new File(path+"/"+fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteFile(String path)
	{
		if(Files.exists(Paths.get(path)))
			try {
				Files.delete(Paths.get(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
