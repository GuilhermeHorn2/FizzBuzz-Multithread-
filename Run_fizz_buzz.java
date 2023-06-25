package misc;

public class Run_fizz_buzz implements Runnable{
	
	//permission 1
	
		private boolean stop_requested = false;
		private Counter c;
		
		Run_fizz_buzz(Counter c){
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
				
				if(c.get_permission(1)){
					
					if(c.get_count() % 3 == 0 && c.get_count() % 5 == 0){
						
						if(!c.get_printed()) {
							System.out.println("FIZZ BUZZ");
							c.set_printed(true);
						}
						
						c.set_permission(false, 3);
						c.set_permission(false, 2);
						c.set_permission(false, 1);
						c.set_permission(true, 0);
						continue;
					}
					c.set_permission(false, 1);
					c.set_permission(true, 2);
					
				}
				
			}
			
		}

}
