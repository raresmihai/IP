package files;


public class File implements Cloneable {

	String name,owner,rights,type;
	//.sds
	
	public  Object clone()
	{
		Object clone=null;
		
		try {
			clone=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
}
