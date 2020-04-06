package objects;

import java.util.Random;

public class YamsGame {

	private Player player;
	private int nbPlayers;

	public YamsGame(Player player, int nbPlayers) {
		super();
		this.player = player;
		this.nbPlayers = nbPlayers;
	}

	public int[] launchDice() {
		int[] dice = new int[5];
		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			dice[i] = 1 + r.nextInt(6);
			System.out.print(dice[i] + " ");
		}
		return dice;
	}

}
