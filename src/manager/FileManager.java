package manager;
import java.io.File;
import java.io.IOException;
public class FileManager {
	public void createFile(String fileName,String path) {
		String filePath = path + "/" + fileName;
		File file=new File(filePath);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
