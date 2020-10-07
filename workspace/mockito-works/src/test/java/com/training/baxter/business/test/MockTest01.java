package com.training.baxter.business.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import static  org.mockito.Mockito.*;

// given - when - then 


class MockTest01 {

	@Test
	void mockListTest() {
		List list = mock(List.class); 
		when(list.size()).thenReturn(2); 
		assertEquals(2, list.size());
	}

	@Test
	void mockListTest_multipleTimes() {
		List list = mock(List.class); 
		when(list.size()).thenReturn(2).thenReturn(3);  
		assertEquals(2, list.size());
		assertEquals(3, list.size());
		
	}
	
	@Test
	void mockListTest_withException() {
		List list = mock(List.class); 
		
		when(list.get(anyInt())).thenThrow(new RuntimeException("Testing Exception")); 
		
		assertThrows(RuntimeException.class, () -> list.get(0) );
		
	}
	
	
	

}
