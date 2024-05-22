package Vehicle;

public class bike extends Master {
	private String Type;

	public bike(int model, int engine, String color, String type) {
		super(model, engine, color);
		Type = type;
	}

	@Override
	public String toString() {
		return "bike [Type=" + Type+" "+ super.toString() + "]";
	}
	void bikeout()
	{
		super.MasterOut();
		System.out.println("Type "+ Type);
	}
}
