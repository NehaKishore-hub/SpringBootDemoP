package co.in.tcs.training.Demo_rest_New;

import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class MyController {

	    @GetMapping(value="/welcome", produces = MediaType.TEXT_PLAIN_VALUE)
	    public String index() {
	        return "This is Home page";
	    }
	    
	    @GetMapping(value="/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	    public String sayHello() {

	        return "Hello there!";
	    }
	    @GetMapping(value="/say/{id}")
	    public Trainee sayEmployee(@PathVariable(name ="id") int id) {
	    	 ArrayList<Trainee> li=new ArrayList<>();
		     
		     li.add(new Trainee(1779620,"Tarun Timmidi"));
		     li.add(new Trainee(1204066,"Anusha R"));
		     
		     for(Trainee t :li) {
		    	 if(id==t.getEmpId())
			     return t;
		     }
		     return null;
	        
	    }
	}

