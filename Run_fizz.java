package misc;

public class Run_fizz implements Runnable{
	
	//permission 2
	
	private boolean stop_requested = false;
	private Counter c;
	
	Run_fizz(Counter c){
		this.c = c;
	}
	
	public synchronized void request_stop(){
		stop_requested = true;
	}

	
	@Override
	public void run() {
		
		while(!stop_requested){
			
			if(c.get_count() == c.get_goal()){
				this.request_stop();
			}
			
			if(c.get_permission(2)){
				
				if(c.get_count() % 3 == 0){
					
					if(!c.get_printed()){
						System.out.println("FIZZ");
						c.set_printed(true);
					}
					
				}
				c.set_permission(false, 2);
				c.set_permission(true, 3);
				
			}
			
		}
		
	}
	

}
