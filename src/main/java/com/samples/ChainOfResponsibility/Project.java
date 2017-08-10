package com.samples.ChainOfResponsibility;


public class Project {
	
	public void start() {
		Workflow phase = Workflow.Planning;
		while(phase != null){
			phase.process();
			phase = phase.getNext();
		}
	}
	
	public static void main(String [] args) throws Exception{
		new Project().start();
	}

}
