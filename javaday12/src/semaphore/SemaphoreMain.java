package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		
		//동시에 3개 까지 실행되는 세마포어 생성
		Semaphore sem = new Semaphore(3);
		for(int i=0; i<20; i=i+1) {
			ThreadEx th = new ThreadEx(sem);
			th.start();
		}

	}

}
