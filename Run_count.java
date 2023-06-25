package misc;

public class Run_count implements Runnable{
	
	//permission 0
	
	private boolean stop_requested = false;
	private Counter c;
	
	Run_count(Counter c){
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
			
			if(c.get_permission(0)){
				
				if(!c.get_printed()) {
					System.out.println(c.get_count());
					//c.set_printed(true);
				}
				c.inc();
				c.set_printed(false);
				c.set_permission(false, 0);
				c.set_permission(true, 1);
				
			}
			
		}
		
	}
	
	

}
