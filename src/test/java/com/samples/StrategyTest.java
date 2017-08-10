package com.samples;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import Strategy.SortStrategy;
import Strategy.SortableList;

public class StrategyTest {
	
	@Test
	public void testSortAscending(){
		List<String> list = Arrays.asList("java", "oracle", "c++");
		List<String> ascList = Arrays.asList("c++", "java", "oracle");
		SortableList sortable = new SortableList(list);
		List<String> sorted = sortable.sort(SortStrategy.SortAscending);
		assertTrue(sorted.equals(ascList));
	}
	
	@Test
	public void testSortDescending(){
		List<String> list = Arrays.asList("java", "oracle", "c++");
		List<String> descList = Arrays.asList("oracle", "java", "c++");
		SortableList sortable = new SortableList(list);
		List<String> sorted = sortable.sort(SortStrategy.SortDescending);
		assertTrue(sorted.equals(descList));
	}

}
