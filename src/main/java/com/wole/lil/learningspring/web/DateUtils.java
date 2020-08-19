package com.wole.lil.learningspring.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date createDateFromDateString(String dateString){
        Date date = null;

        if (dateString != null){
            try{
                date = DATE_FORMAT.parse(dateString);
            }
            catch(ParseException pEx){
                date = new Date();
            }
        }
        else{
            return new Date();
        }
        return date;
    }
}
