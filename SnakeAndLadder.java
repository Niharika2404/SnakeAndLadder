public class SnakeAndLadder {
		public static final int dice = 6;
		
		public static void main(String[] args) {
		
			int Position = 0;
			int NoPlay = 1;
			int Ladder = 2;
			int Snake = 3;
			int NewPosition = 0;

			double dieCheck = (int)(Math.floor(Math.random() * 10) % 5) + 1;
				System.out.println(dieCheck);
					switch (dieCheck) {
							case 1:
								NewPosition = 0;
								System.out.println(NewPosition);
								break;
							case 2:
								NewPosition = (int) (Position + dieCheck);
								break;
							case 3:
								Position--;
								break;
							default:
								System.out.println("Invalid Inputs");
					}
			dieCheck++;
			System.out.println(NewPosition);

		}
}


