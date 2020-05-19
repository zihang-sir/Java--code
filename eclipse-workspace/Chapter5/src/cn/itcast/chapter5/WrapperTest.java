package cn.itcast.chapter5;
import java.util.Arrays;
public class WrapperTest {
	private static final String SPACE_SEPARATOR=" ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr="20 78 9 -7 88 36 29";
		System.out.println(numStr);
		numStr=sortStringNumber(numStr);
		System.out.println(numStr.toString());
	}
	public static String sortStringNumber(String numStr) {
		// TODO Auto-generated method stub
		String[]str_arr=stringToArray(numStr);
		int[]num_arr=toIntArray(str_arr);
		mysortArray(num_arr);
		String temp=arrayToString(num_arr);
		return temp;
	}
	public static String arrayToString(int[] num_arr) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		for(int x=0;x<num_arr.length;x++) {
			if(x!=num_arr.length-1) {
				sb.append(num_arr[x]+SPACE_SEPARATOR);
			}else {
				sb.append(num_arr[x]);
			}
		}
		return sb.toString();
	}
	public static void mysortArray(int[] num_arr) {
		// TODO Auto-generated method stub
		Arrays.sort(num_arr);
	}
	public static int[] toIntArray(String[] str_arr) {
		// TODO Auto-generated method stub
		int []arr=new int[str_arr.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(str_arr[i]);
		}
		return arr;
	}
	public static String[] stringToArray(String numStr) {
		// TODO Auto-generated method stub
		String[]str_arr=numStr.split(SPACE_SEPARATOR);
		return str_arr;
	}

}
