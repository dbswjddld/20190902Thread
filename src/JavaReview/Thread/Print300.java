package JavaReview.Thread;


// 2. Runnable 인터페이스 구현 클래스
// 다중 상속
public class Print300 implements Runnable{

	@Override
	public void run() {
		for(int i = 300; i < 400; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
