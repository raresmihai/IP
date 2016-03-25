package tests;

import static org.junit.Assert.*;

import managers.AbstractManager;
import managers.ManagerFactory;
import managers.MemoryManager;
import managers.NetworkManager;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
public class ManagerFactoryTester {

	@Test
	public void testGetManager() {
		MemoryManager memoryManager = new MemoryManager();
		AbstractManager manager = ManagerFactory.getManager("Memory Manager");
		boolean ok = manager instanceof MemoryManager;		
		assertEquals(ok, true);
		assertFalse(manager instanceof NetworkManager);	
	}
	
	@Test
	public void testSingleTon() {
		AbstractManager am1 = ManagerFactory.getManager("Device Manager");
		AbstractManager am2 = ManagerFactory.getManager("Device Manager");
		assertEquals(am1, am2);
		AbstractManager memoryManager = ManagerFactory.getManager("Memory Manager");
		assertNotEquals(am1, memoryManager);
	}

}
