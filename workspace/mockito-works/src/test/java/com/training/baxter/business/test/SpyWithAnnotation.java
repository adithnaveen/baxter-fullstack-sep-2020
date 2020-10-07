package com.training.baxter.business.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

//@RunWith(MockitoJUnitRunner.class)
class SpyWithAnnotation {

	@Spy
	List<String> list = new ArrayList<String>();  
	
	@Test
	void test() {
		MockitoAnnotations.initMocks(this);
		
		doReturn(100).when(list).size(); 
		assertEquals(100, list.size());	
	}

}
