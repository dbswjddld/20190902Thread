package JavaReview.Thread;

// thread :Thread를 상속 후, run 메소드를 오버라이딩
public class Print100 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100); // sleep :쓰레드를 지연시킴. 밀리초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			// -> 값 하나 출력할때마다 0.1초씩 지연시킴
		}
	}
	
}
