//Write a program in Java to create a thread by extending the ‘Thread’ class
package assignment;

public class MyThread extends Thread {
	public void run() {
		System.out.println("concurrent thread started running..");
	}

	public static void main(String args[]) {
		MyThread mt = new MyThread();
		mt.start();
	}
}
