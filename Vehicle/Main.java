package Vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master vehicle=new Master(2010,999,"Blue");
		System.out.println(vehicle.toString());
		vehicle.MasterOut();
		bike b=new bike(2015,99,"orange","Sports");
		System.out.println(b.toString());
		b.bikeout();
	}

}
