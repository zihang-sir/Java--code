package cn.dianzi.task2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class CheckInfo {
	public static HashSet<User>USER_DATA=new HashSet<User>();
	public CheckInfo(HashSet<User>USER_DATA) {
		this.USER_DATA=USER_DATA;
	}
	public String checkAction(String userName,String password,String repassword,String birthday,String phone,String email) {
		StringBuilder result =new StringBuilder();
		int state=1;
		if(!password.equals(repassword)) {
			result.append("�����������벻һ��!\r\n");
			state=2;
		}
		if(birthday.length()!=10) {
			result.append("���ո�ʽ����ȷ\r\n");
			state=2;;
		}else {
			for(int i=0;i<birthday.length();i++) {
				Character thisChar=birthday.charAt(i);
				if(i==4||i==7) {
					if(!(thisChar=='-')) {
						result.append("���ո�ʽ����ȷ\r\n");
						state=2;
					}
				}else {
					if(!(Character.isDigit(thisChar))) {
						result.append("���ո�ʽ����ȷ\r\n");
						state=2;
					}
				}
			}
		}
		if(phone.length()!=11) {
			result.append("�ֻ��Ų���ȷ\r\n");
			state=2;
		}else if(!(phone.startsWith("13")||phone.startsWith("15")||phone.startsWith("17")||phone.startsWith("18"))){
			result.append("�ֻ��Ų���ȷ\r\n");
			state=2;
		}
		if(!email.contains("@")) {
			result.append("���䲻��ȷ\r\n");
			state=2;
		}
		if(state==1) {
			DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
			Date dateBirthday=null;
			try {
				dateBirthday=format.parse(birthday);
			}catch(ParseException e) {
				e.printStackTrace();
			}
			User newUser =new User(userName,repassword,dateBirthday,phone,email);
				if(!USER_DATA.add(newUser)) {
					result.append("�û����ظ�");
					state=2;
				}
				if(state==1) {
					result.append("ע��ɹ�");
				}
			}
		
		return result.toString();
	}
}
