package javaday12;

public class MutexMain {

	public static void main(String[] args) {
		//Runnable 인터페이스를 implements 한 클래스의 인스턴스 생성
		ThreadImpl threadImpl = new ThreadImpl();
		
		//Thread 클래스의 생성자에 대입해서 Thread 인스턴스 생성		
		Thread th1 = new Thread(threadImpl);
		Thread th2 = new Thread(threadImpl);
		
		
		//스레드(기본적으로 비동기) 시작
		th1.start();
		th2.start();
		
		try {
			//스레드의 수행이 끝나면 결과를 출력
			Thread.sleep(30000);
			System.out.println(threadImpl.getResult());
		}catch(Exception e) {}
		

	}

}
