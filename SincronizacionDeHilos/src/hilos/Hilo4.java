package hilos;

public class Hilo4 extends Thread{
	
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 5; i++) {
			
			System.out.println("K");
			
			
			try {
				Hilo4.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print("erro en la clase hilo 4 " + e);
			}
			
			
			
			
		}
		
		
	}

}
