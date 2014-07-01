package supermarkt;

public class Ware {
	private String name;
	private double preis;

	public Ware(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
}