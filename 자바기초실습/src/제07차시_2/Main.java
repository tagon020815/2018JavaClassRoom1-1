package 제07차시_2;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.beagi = 145;
		myCar.carjong = "몰라";
		myCar.carColor = "black";
		myCar.carHost = "me";
		myCar.carNum = "1234";
		myCar.guree = 464;
		myCar.jejo = "i don't know ";
		myCar.sangtea = 1;
		myCar.speed = 60.1;
		myCar.yeonbe = 62.1;
		myCar.yeonbeNow = 62.4;

		System.out.println(myCar.beagi);
		System.out.println(myCar.carjong);
		System.out.println(myCar.carColor);
		System.out.println(myCar.carHost);
		System.out.println(myCar.carNum);
		System.out.println(myCar.guree);
		System.out.println(myCar.jejo);
		System.out.println(myCar.sangtea);
		System.out.println(myCar.speed);
		System.out.println(myCar.yeonbe);
		System.out.println(myCar.yeonbeNow);

		myCar.banghyang();
		myCar.bbang();
		myCar.bisag();
		myCar.gear();
		myCar.hoodOpen();
		myCar.jisi();
		myCar.open();
		myCar.sidong();
		myCar.speed();
		myCar.sunRoof();
		myCar.trunkOpen();
	}

}
