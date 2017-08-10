package com.samples.ChainOfResponsibility;

public enum Workflow {
	
	Production(null) {
		public void process(){
			System.out.println("Production phase started");
		}
	},
	Testing(Workflow.Production){
		public void process(){
			System.out.println("Testing phase started");
		}
	},
	Implementation(Workflow.Testing) {
		public void process(){
			System.out.println("Implementation phase started");
		}
	},
	Design(Workflow.Implementation) {
		public void process(){
			System.out.println("Design phase started");
		}
		
		
	},
	Planning(Workflow.Design) {
		public void process(){
			System.out.println("Planning phase started");
		}
	};
	
	Workflow(Workflow next){
		this.next = next;
	}
	
	public Workflow getNext() {
		return next;
	}
	
	public abstract void process() ;
	
	
	
	private Workflow next;
	
}
