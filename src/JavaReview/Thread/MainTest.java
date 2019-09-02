package JavaReview.Thread;

public class MainTest {
	public static void main(String[] args) {
		
		// 1. thread 클래스
		Print100 thread1 = new Print100();
		thread1.start();
		
		// 2. runnable 인터페이스
		Thread thread2 = new Thread(new Print300());
		thread2.start();
		
		// 3. 무명 클래스
		Thread thread3 = new Thread(new Runnable() { // JS 익명함수와 쓰는 방법 거의 같다
			@Override
			public void run() {
				for(int i = 1000; i < 1100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread3.start();
		
		// 4. 람다식 : 오버라이딩 메서드가 하나뿐인 인터페이스 구현 클래스를 만들 때
		Thread thread4 = new Thread( () -> {
			for(int i = 2000; i < 2100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} );
		thread4.start();
		
		for(int i = 100; i<200; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 첫 번째 for문이 실행된 후에 두번째 for문이 실행된다.
		// 두개의 for가 동시에 실행되게 바꿔보자 -> 쓰레드 활용
		
	}
}
