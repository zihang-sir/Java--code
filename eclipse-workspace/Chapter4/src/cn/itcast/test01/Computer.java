package cn.itcast.test01;

public class Computer {
	private USB [] usbArr=new USB[4];
	public void add(USB usb) {
		for (int i=0;i<usbArr.length;i++) {
			if(usbArr[i]==null) {
				usbArr[i]=usb;
				break;
			}
		}
	}
	public void powerOn() {
		for(int i=0; i<usbArr.length;i++) {
			if(usbArr[i]!=null) {
				usbArr[i].turnOn();
			}
		}
		System.out.println("计算机开机成功");
	}
	public void powerOff() {
		for(int i=0; i<usbArr.length;i++) {
			if(usbArr[i]!=null) {
				usbArr[i].turnOff();
			}
		}
		System.out.println("计算机关机成功");
	}


}
