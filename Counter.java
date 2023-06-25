package misc;

public class Counter {
	
	private final int goal;
	private int count = 0;
	private boolean[] permission = {true,false,false,false};
	
	private boolean printed = false;
	
	Counter(int goal){
		this.goal = goal+1;
	}
	
	public synchronized boolean get_printed(){
		return printed;
	}
	
	public synchronized void set_printed(boolean setter){
		printed = setter;
	}
	
	public  int get_goal(){
		return goal;
	}
	
	public synchronized void inc(){
		count++;
	}
	
	public synchronized int get_count() {
		return count;
	}
	
	public synchronized boolean get_permission(int i) {
		return permission[i];
	}
	
	public synchronized void set_permission(boolean setter,int i){
		permission[i] = setter;
	}
	
	
}
