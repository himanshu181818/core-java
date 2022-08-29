package com.question;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdate {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String sd = sdf.format(d);
		System.out.println(sd);

		String dd = "05/10/2019";
		Date d1 = sdf.parse(dd);
		System.out.println(d1);

	}
}
