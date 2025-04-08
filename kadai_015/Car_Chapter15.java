package kadai_015;

public class Car_Chapter15 {
	
	private int gear = 1;
	private int speed = 10;
	
	public void gearChange(int afterGear) {
		int oldGear = gear;
		if (afterGear > 0 && afterGear <= 5) {
			gear = afterGear;
		}else {
			System.out.println("異常な入力値を検出したためギア1に切り替えます");
			gear = 1;
		}
		speed = gear * 10;
		System.out.println("ギア" + oldGear + "から" + gear + "に切り替えました");
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}

}
