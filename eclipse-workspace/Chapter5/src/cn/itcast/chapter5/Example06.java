package cn.itcast.chapter5;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="羽毛球-篮球-乒乓球";
		System.out.println("从第五个字符截取到末尾的结果："+str.substring(4));
		System.out.println("从第五个字符截取到第六个的结果:"+str.substring(4, 6));//截取时只包含开始，不包含结束；
		System.out.print("分割后的字符串数组中元素依次为：");
		String[]strArray =str.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i!=strArray.length-1) {
				System.out.print(strArray[i]+",");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}

}
