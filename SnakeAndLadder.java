public class SnakeAndLadder {
		public static final int dice = 6;
		public static final int WinningPosition = 100;
		public static final int NoPlay  = 1;
		public static final int Ladder = 2;
		public static final int Snake = 3;
		
		public static void main(String[] args) {
		
			int Position = 0;
			int NewPosition =
					0;
			int DiceRolled = 0;
				
			int dieCheck = (int)(Math.floor(Math.random() * 10) % 5) + 1;
				System.out.println("Number came is: " + dieCheck);
				switch (dieCheck) {
				case 1:
					if (NewPosition <= WinningPosition) {
					
						int value = (int) (Math.floor(Math.random() * 10) % 3) + 1;
						System.out.println("The value is: " + value);
							switch (value) {
								case 1:
									NewPosition = 0;
									System.out.println("Its NoPlay, Player position iss: " + NewPosition);
									break;
								case 2:
									NewPosition = (Position + dieCheck);
									System.out.println("It is Ladder, Player position is: " + NewPosition);
									break;
								case 3:
									System.out.println("Its Snake, Go back to the starting position: " + Position);
									break;
								
								default:
									System.out.println("Invalid Inputs");
							}
					}
					case 2:
						if (NewPosition <= WinningPosition) {
							
							int value = (int) (Math.floor(Math.random() * 10) % 3) + 1;
							System.out.println("The value is: " + value);
								switch (value) {
									case 1:
										NewPosition = 0;
										System.out.println("Its NoPlay, Player position iss: " + NewPosition);
										break;
									case 2:
										NewPosition = (Position + dieCheck);
										System.out.println("It is Ladder, Player position is: " + NewPosition);
										break;
									case 3:
										System.out.println("Its Snake, Go back to the starting position: " + Position);
										break;
									
									default:
										System.out.println("Invalid Inputs");
								}
						}
					case 3:
						if (NewPosition <= WinningPosition) {
							
							int value = (int) (Math.floor(Math.random() * 10) % 3) + 1;
							System.out.println("The value is: " + value);
								switch (value) {
									case 1:
										NewPosition = 0;
										System.out.println("Its NoPlay, Player position iss: " + NewPosition);
										break;
									case 2:
										NewPosition = (Position + dieCheck);
										System.out.println("It is Ladder, Player position is: " + NewPosition);
										break;
									case 3:
										System.out.println("Its Snake, Go back to the starting position: " + Position);
										break;
									
									default:
										System.out.println("Invalid Inputs");
								}
						}
					case 4:
						if (NewPosition <= WinningPosition) {
							
							int value = (int) (Math.floor(Math.random() * 10) % 3) + 1;
							System.out.println("The value is: " + value);
								switch (value) {
									case 1:
										NewPosition = 0;
										System.out.println("Its NoPlay, Player position iss: " + NewPosition);
										break;
									case 2:
										NewPosition = (Position + dieCheck);
										System.out.println("It is Ladder, Player position is: " + NewPosition);
										break;
									case 3:
										System.out.println("Its Snake, Go back to the starting position: " + Position);
										break;
									
									default:
										System.out.println("Invalid Inputs");
								}
						}
					case 5:
						if (NewPosition <= WinningPosition) {
							
							int value = (int) (Math.floor(Math.random() * 10) % 3) + 1;
							System.out.println("The value is: " + value);
								switch (value) {
									case 1:
										NewPosition = 0;
										System.out.println("Its NoPlay, Player position iss: " + NewPosition);
										break;
									case 2:
										NewPosition = (Position + dieCheck);
										System.out.println("It is Ladder, Player position is: " + NewPosition);
										break;
									case 3:
										System.out.println("Its Snake, Go back to the starting position: " + Position);
										break;
									
									default:
										System.out.println("Invalid Inputs");
								}
						}
					case 6:
						if (NewPosition <= WinningPosition) {
							
							int value = (int) (Math.floor(Math.random() * 10) % 3) + 1;
							System.out.println("The value is: " + value);
								switch (value) {
									case 1:
										NewPosition = 0;
										System.out.println("Its NoPlay, Player position iss: " + NewPosition);
										break;
									case 2:
										NewPosition = (Position + dieCheck);
										System.out.println("It is Ladder, Player position is: " + NewPosition);
										break;
									case 3:
										System.out.println("Its Snake, Go back to the starting position: " + Position);
										break;
									
									default:
										System.out.println("Invalid Inputs");
								}
						}
					default:
						System.out.println("Dice got missed");
			}
			System.out.println("Player is at: " + NewPosition);
		}
			
	}


