package bb.com.android;

public abstract class Klasse {
	int kracht;
	int levenspunten;

	public Klasse(int kracht, int levenspunten) {
		this.kracht = kracht;
		this.levenspunten = levenspunten;
	}

	public Klasse bereken(Klasse tegenstander) {
		Klasse winnaar = null;
		if (levenspunten > 1) {
			if (this.levenspunten > 1) {
				winnaar = this;
			}
			if (tegenstander instanceof Sniper) {
				System.out.println("tegenstander is een Sniper");
				if (tegenstander.kracht >= levenspunten) {
					winnaar = tegenstander;
					System.out.println("hij maakt wel tegenstande winnaar");
				}
			} else if (tegenstander instanceof Assault) {
				System.out.println("tegenstander is een Assault");
				int werkelijkekracht = (int) ((tegenstander.kracht) * (Math
						.random() * 2));
				if (werkelijkekracht >= levenspunten) {
					System.out
							.println("werkelijke kracht: " + werkelijkekracht);
					winnaar = tegenstander;
				}
			} else {
				System.out.println("er klopt iets niet");
			}

		}

		return winnaar;

	}
}
