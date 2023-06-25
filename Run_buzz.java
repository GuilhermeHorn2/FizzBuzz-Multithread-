package misc;

public class Run_buzz implements Runnable{
	
	
	//permission 3
	
		private boolean stop_requested = false;
		private Counter c;
		
		Run_buzz(Counter c){
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
				
				if(c.get_permission(3)){
					
					if(c.get_count() % 5 == 0){
						
						if(!c.get_printed()) {
							System.out.println("BUZZ");
							c.set_printed(true);
						}
						
					}
					c.set_permission(false, 3);
					c.set_permission(true, 0);
					
				}
				
			}
			
		}

}
