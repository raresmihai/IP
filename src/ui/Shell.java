package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Shell implements UserInterface {

	@Override
	public void createFile(String name, String path) {
		// TODO Auto-generated method
		
	}

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			BufferedReader fr =  new BufferedReader(new FileReader("Memory/users.txt"));
			String u=fr.readLine();
			String p=fr.readLine();
			
			if(userName.compareTo(u.trim())==0 && password.compareTo(p.trim())==0)
				return true;
			return false;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void exit()
	{
		System.out.println("goodbye");
		System.exit(0);
	}
	
	

}
