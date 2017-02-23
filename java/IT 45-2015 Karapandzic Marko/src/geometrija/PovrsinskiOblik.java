package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public abstract class PovrsinskiOblik extends Oblik {
	private String bojaUnutrasnjosti = "bela";
	private Color bojaUnutrasnjoti2;
	private Color krUnutrasnjost;
	
	public abstract void popuni(Graphics g);

	public String getBojaUnutrasnjosti() {
		return bojaUnutrasnjosti;
	}

	public void setBojaUnutrasnjosti(String bojaUnutrasnjosti) {
		this.bojaUnutrasnjosti = bojaUnutrasnjosti;
	}

	public Color getBojaUnutrasnjoti2() {
		return bojaUnutrasnjoti2;
	}

	public void setBojaUnutrasnjoti2(Color bojaUnutrasnjoti2) {
		this.bojaUnutrasnjoti2 = bojaUnutrasnjoti2;
	}

	public Color getKrUnutrasnjost() {
		return krUnutrasnjost;
	}

	public void setKrUnutrasnjost(Color krUnutrasnjost) {
		this.krUnutrasnjost = krUnutrasnjost;
	}
}
