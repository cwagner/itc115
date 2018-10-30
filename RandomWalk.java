import java.util.Random;

public class RandomWalk {

	public static void main(String[] args) {
		randomWalk();
	}
	
	public static void randomWalk() {
		Random rand = new Random();
		
		//initialize variables
		int position = 0;
		int max = 0;
		
		//runs loop until position is -3 or 3
		while (Math.abs(position) != 3) {
			//randomly generates either 1 or -1
			int direction = 2 * rand.nextInt(2) - 1;
			//add direction to the value of position
			position += direction;
			//assigns max or position to the variable max, whichever is highest
			max = Math.max(max, position);
			System.out.println("position = " + position);
		}
		System.out.println("max position = " + max);
	}

}
