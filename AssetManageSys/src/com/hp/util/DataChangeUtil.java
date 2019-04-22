package com.hp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataChangeUtil {
	 public  Date dateTimeChange(Date date){
		 if(date!=null){
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 String datesss = sdf.format(date);
			 try {
				Date dd = sdf.parse(datesss);
				return dd;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			return null;
		}	

}	
