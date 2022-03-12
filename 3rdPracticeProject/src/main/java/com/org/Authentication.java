package com.org;

public class Authentication {

	boolean authenticate(String uname, String pwd)
	{
		if(uname.equals("admin") && pwd.equals("admin123"))
			return true;
		else
			return false;
	}
}