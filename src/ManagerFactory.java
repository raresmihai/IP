
public class ManagerFactory {
	
	private static ProcessManager processManagerSingleton;
	private static MemoryManager memoryManagerSingleton;
	private static FileManager fileManagerSingleton;
	private static DeviceManager deviceManagerSingleton;
	private static NetworkManager networkManagerSingleton;
	
	
	private ManagerFactory()
	{
		
	}
	
	public static AbstractManager getManager(String type)
	{
		switch(type)
		{
			case "Process Manager":
				if(processManagerSingleton==null)
					processManagerSingleton=new ProcessManager();
				return processManagerSingleton;
			case "Memory Manager":
				if(memoryManagerSingleton==null)
					memoryManagerSingleton=new MemoryManager();
				return memoryManagerSingleton;
			case "File Manager":
				if(fileManagerSingleton==null)
					fileManagerSingleton=new FileManager();
				return fileManagerSingleton;
			case "Device Manager":
				if(deviceManagerSingleton==null)
					deviceManagerSingleton=new DeviceManager();
				return deviceManagerSingleton;
			case "Network Manager":
				if(networkManagerSingleton==null)
					networkManagerSingleton=new NetworkManager();
				return networkManagerSingleton;
			default:
				return null;
		}
	}
	

}
