package misc;



public class main {

	public static void main(String[] args) {
		
		Counter c = new Counter(15);
		
		Run_fizz fizz = new Run_fizz(c);
		Run_buzz buzz = new Run_buzz(c);
		Run_fizz_buzz fizz_buzz = new Run_fizz_buzz(c);
		Run_count count = new Run_count(c);
		
		Thread t2 = new Thread(fizz);
		Thread t3 = new Thread(buzz);
		Thread t1 = new Thread(fizz_buzz);
		Thread t0 = new Thread(count);
		
		t1.start();
		t2.start();
		t3.start();
		t0.start();

		
		
		
}
	
	
}	
