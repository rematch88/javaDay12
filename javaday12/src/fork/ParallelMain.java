package fork;

import java.util.concurrent.ForkJoinPool;

public class ParallelMain {

	public static void main(String[] args) {
		ParallelProcessing p = new ParallelProcessing(1, 60);
		//위의 작업을 나누어서 할 수 있는 pool을 실행
		ForkJoinPool pool = new ForkJoinPool();
		//pool에 작업을 대입해서 실행
		System.out.println(pool.invoke(p));

	}

}
