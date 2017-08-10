package com.samples;

import static org.junit.Assert.*;
import org.junit.Test;

import com.samples.ChainOfResponsibility.Workflow;

public class ChainOfResponsibilityTest {
	@Test
	public void testNextPhase(){
		assertEquals(Workflow.Design,Workflow.Planning.getNext());
		assertEquals(Workflow.Implementation,Workflow.Design.getNext());
		assertEquals(Workflow.Testing,Workflow.Implementation.getNext());
		assertEquals(Workflow.Production,Workflow.Testing.getNext());
	}
}
