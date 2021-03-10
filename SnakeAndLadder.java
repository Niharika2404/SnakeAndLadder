
public class SnakeAndLadder {
	public static void Player() {
		SnakeAndLadder p1 = new SnakeAndLadder();
	}

	public static void main(String[] args) {
		SnakeAndLadder.Player();
		int Position = 0;
		double dieCheck = (Math.floor(Math.random() * 10) % 5) + 1;
		System.out.println("Rolled diced number is: " + dieCheck);

	}

}
