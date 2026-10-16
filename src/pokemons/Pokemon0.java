package pokemons;

import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private static java.util.Random random;

	public Pokemon0(String nom) {
		this.random = new Random();
		this.nom = nom;
		this.niveau = random.nextInt(1, 11);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
	}

	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public boolean isKO() {
		if (this.hp == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void soigner(int heel) {
		this.hp += heel;
		if (this.hp > this.niveau * 2) {
			this.hp = this.niveau * 2;
		}
	}

	public String attaquer(Pokemon0 p) {
		p.hp -= this.atk;
		return "[ Pokemon " + this.nom + " ] : J'attaque " + p.getNom();
	}

	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", niveau=" + niveau + ", hp=" + hp + ", atk=" + atk + "]";
	}

	public String log(String msg) {
		return msg;
	}

}
