package enum_Constructor;

public enum Fruit {
	APPLE("초록색"), BANANA("노란색"), ORANGE("주황색");

	private String color;

	Fruit(String color){
		this.color=color;
	}

	public String toString() {
		return super.toString().toLowerCase() + "(" + color + ")";
	}
}
