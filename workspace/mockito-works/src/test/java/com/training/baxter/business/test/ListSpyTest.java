package com.training.baxter.business.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

// mock -> interface, use mock  
// spy -> class, legacy code,  


class ListSpyTest {

	@Test
	void spyListTest() {
		// it as good as saying List list = new ArrayList(); 
		 List listSpy = spy(ArrayList.class); 
		 
		 assertEquals(0, listSpy.size()); 
		 listSpy.add("Harry1"); 
		 listSpy.add("Harry2"); 
		 listSpy.add("Harry3"); 
		 listSpy.add("Harry4"); 
		 assertEquals(4, listSpy.size());
		 
	}


	@Test
	void mockListTest() {
		// it as good as saying List list = new List(); 
		 List listMock = mock(List.class); 
		 
		 when(listMock.get(anyInt())).thenReturn("Peter"); 
		 assertEquals("Peter", listMock.get(0)); 
		 
		 listMock.add("Harry"); 
		 assertEquals(2, listMock.size());
		 
	}
	

	@Test
	public void mock_notMock() {
		// real object should not be created 
//		List<String> list = new ArrayList<String>();
		List<String> list = spy(new ArrayList<String>()); 
		
		doReturn(100).when(list).size(); 
		

		assertEquals(100, list.size());
		
	}
	
	
	
	
	
	
}






