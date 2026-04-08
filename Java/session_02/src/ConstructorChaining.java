public class ConstructorChaining {
	private String playerName;
	private String playerCountry;

	ConstructorChaining() {
		playerCountry = "India";
	}

	public ConstructorChaining(String playerName) {
		this();
		this.playerName = playerName;
	}

	public String toString() {
		return "Player Details: \n\n" + "Player Name: " + playerName + ", Country: " + playerCountry + "\n\n";
	}

	public static void main(String[] args) {
		ConstructorChaining obj1 = new ConstructorChaining("Rohit Sharma");
		System.out.println(obj1);
	}
}
