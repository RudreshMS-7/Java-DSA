package in.java8.demo;

public class EvenOddByMultithtread implements Runnable {
	
	static int count =1;
	Object obj ;

	
	public EvenOddByMultithtread(Object obj) {
		super();
		this.obj = obj;
	}


	@Override
	public void run() {
		
		while(count<=10) {
		
		if (count%2==0 && Thread.currentThread().getName().equals("even")) {
			synchronized (obj) {
				System.out.println("Thread Name : "+Thread.currentThread().getName()+" value - "+count);
				count++;
				try {
					obj.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		}
		
		if(count%2 != 0 && Thread.currentThread().getName().equals("odd")) {
			synchronized (obj) {
				System.out.println("Thread name : "+Thread.currentThread().getName()+" Value - " +count);
				count++;
				obj.notify();
			}
			
		}
		
		}
	}
	

	public static void main(String[] args) {
		Object lock = new Object();
		
		Runnable run1 = new EvenOddByMultithtread(lock);
		Runnable run2 = new EvenOddByMultithtread(lock);
		new Thread(run1, "even").start();
		new Thread(run2, "odd").start();
		

	}


}
