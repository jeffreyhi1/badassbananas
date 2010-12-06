package bb.com.android;

public class Game {
	
	public Game(){
		
	}
	
	public PlayerClass calculate(PlayerClass defender, PlayerClass opponent) {
		PlayerClass winner = null;
		/*if (defender.healthpoints > 1) {
			if (defender.healthpoints > 1) {
				winner = defender;
			}
			if (opponent instanceof Sniper) {
				System.out.println("Opponent is a Sniper");
				if (opponent.power >= defender.healthpoints) {
					winner = opponent;
					System.out.println("It makes opponent winner.");
				}
			} else if (opponent instanceof Assault) {
				System.out.println("Opponent is a Assault");
				int realpower = (int) ((opponent.power) * (Math
						.random() * 2));
				if (realpower >= defender.healthpoints) {
					System.out
							.println("realpower: " + realpower);
					winner = opponent;
				}
			} else {
				System.out.println("Somethings wrong");
			}

		}*/

		return winner;
	}
}
