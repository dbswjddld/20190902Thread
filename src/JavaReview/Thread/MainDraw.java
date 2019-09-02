package JavaReview.Thread;

//class DrawImpl implements Drawable{
//	@Override
//	public void draw() {
//		System.out.println("사각형 그리기");
//	}
//}

public class MainDraw {
	public static void main(String[] args) {
		Drawable draw = () -> {
			System.out.println("사각형 그리기");
		};
		draw.draw();
	}
}
