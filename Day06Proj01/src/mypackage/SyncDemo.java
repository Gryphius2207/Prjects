package mypackage;

class Sender {
	public void send(String msg) {
		System.out.println("Sending\t"+msg);
	
	try {
		Thread.sleep(1000);
	}catch(Exception e) {
		System.out.println("Thread interupted");
	}
	System.out.println("\n"+msg+"Sent");
	}
}
class ThreadedSend extends Thread {
	private String msg;
	private Thread t;
	Sender sender;
	ThreadedSend(String m,Sender obj){
		msg = m;
		sender = obj;
	}
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender snd = new Sender();
		ThreadedSend S1 = new ThreadedSend("Hi ",snd);
		ThreadedSend S2 = new ThreadedSend("Bye ",snd);
		ThreadedSend S3 = new ThreadedSend("2 ",snd);
		//ThreadedSend S4 = new ThreadedSend("3 ",snd);
		//ThreadedSend S5 = new ThreadedSend("4 ",snd);
		//ThreadedSend S6 = new ThreadedSend("5 ",snd);
		//ThreadedSend S7 = new ThreadedSend("6 ",snd);
		//ThreadedSend S8 = new ThreadedSend("7 ",snd);
		S1.start();
		S2.start();
		S3.start();
		//S4.start();
		//S5.start();
		//S6.start();
		//S7.start();
		//S8.start();
		try {
			S1.join();
			S2.join();
			S3.join();
			//S4.join();
			//S5.join();
			//S6.join();
			//S7.join();
			//S8.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
