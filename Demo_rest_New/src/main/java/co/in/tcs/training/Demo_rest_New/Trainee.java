package co.in.tcs.training.Demo_rest_New;


class Trainee{
	
	private int empId;
	private String Name;
	
	public Trainee()
	{
		
	}
	public Trainee(int empId,String Name)
	{
		this.empId=empId;
		this.Name=Name;

	}
	public int  getEmpId() {
		return empId;
	}

	public String getName() {
		return Name;
	}		
	@Override public String toString() {     
	      return (this.getName());           
	                                
	            
	   }

}


