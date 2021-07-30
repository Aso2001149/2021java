import java.util.Random;

public class Ship {
    public static void main(String[] args) {
		int min = 1;
		int max = 4;

		Random random = new Random();
		int x1 = random.nextInt(max);
		System.out.println(x1);
		Random Random = new Random();
		int y1 = random.nextInt(max) ;
		System.out.println(y1);

        Random random2 = new Random();
		int x2 = random.nextInt(max);
		System.out.println(x2);
		Random Random2 = new Random();
		int y2 = random.nextInt(max) ;
		System.out.println(y2);

        Random random3 = new Random();
		int x3 = random.nextInt(max);
		System.out.println(x3);
		Random Random3 = new Random();
		int y3 = random.nextInt(max) ;
		System.out.println(y3);
    }
}