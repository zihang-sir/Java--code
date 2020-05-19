package cn.dianzi.duotai;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus=new Bus("公交车",40);
		Boat boat=new Boat("轮船",200);
		Plane plane=new Plane("飞机",100);		
		show(bus);
		show(boat);
		show(plane);
	}
	public static void show(Transportation t) {
		if(t instanceof Bus) {
			Bus bus=(Bus)t;
			bus.zouQi();
			bus.run();
		}else if(t instanceof Boat) {
			Boat boat=(Boat)t;
			boat.zouQi();
			boat.run();
		}else {
			Plane plane=(Plane)t;
			plane.zouQi();
			plane.run();
		}
	}

}
