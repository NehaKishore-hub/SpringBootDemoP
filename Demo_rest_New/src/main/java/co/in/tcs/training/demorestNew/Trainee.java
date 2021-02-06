package co.in.tcs.training.demorestNew;


class Trainee{
	
	private int empId;
	private String name;
	
	public Trainee()
	{
		
	}
	public Trainee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;

	}
	public int  getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}		
	@Override public String toString() {     
	      return (this.getName());           
	                                
	            
	   }

}


