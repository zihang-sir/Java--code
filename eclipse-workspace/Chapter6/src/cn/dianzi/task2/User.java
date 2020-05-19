package cn.dianzi.task2;

import java.util.Date;

public class User {
	private String userName;
	private String password;
	private Date birthday;
	private String telNumber;
	private String email;
	public User(){
		
	}
	public User(String userName,String password,Date birthday,String telNumber,String email) {
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.birthday=birthday;
		this.telNumber=telNumber;
	}
	public int hashCode() {
		return userName.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		User other=(User)obj;
		if(userName==null) {
			if(other.userName!=null) {
				return false;
			}
		}else if(!userName.equals(other.userName)){
			return false;
		}
		return true;
	}
}
