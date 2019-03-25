package com.lynu.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyDateFormat {

	public static Date dateFormat(String info) {

		SimpleDateFormat sdate=new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdate.parse(info);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public static String  StringFormat(Date date) {
		if (date!=null) {
			SimpleDateFormat sdate=new SimpleDateFormat("yyyy-MM-dd");
			return sdate.format(date);
		}
		return null;
	}
}
