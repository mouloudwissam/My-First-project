package MyFirstPyramid;

public class Pyramid {

	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			for (int y = 10; y >= i; y--) {
				System.out.print(" ");
			}
			for (int F = 0; F <= i; F++) {
				System.out.print(" *");
			}
			try {
				 System.out.println(" ");
			} catch (Exception e) {
				System.out.println();
				
			}

		}
	}
}
