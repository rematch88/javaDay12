package semaphore;

import java.util.concurrent.Semaphore;

public class ThreadEx extends Thread {
	//세마포어 변수
	private Semaphore sem;
	
	//외부에서 Semaphore를 주입받습니다.
	public ThreadEx(Semaphore sem) {
		this.sem = sem;
	}
	
	public void run() {
		try {
			//lock를 취득 - 사용 개수가 1개 줄어듦
			sem.acquire();
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("몬스터 생성");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {}
		
		System.out.println("몬스터 소멸");
		//lock를 해재 - 사용 개수가 1개 늘어남
		sem.release();
		
	}

}
