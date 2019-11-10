package com.example.demo.Util;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class TemporalUtilities {

    public Long getStartOfDate(String dateTime, String dateTimeFormat){

        Calendar calendar = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat(dateTimeFormat);

        try {
            Date date = format.parse(dateTime);
            calendar.setTime(date);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            return calendar.getTimeInMillis();
        } catch (ParseException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public Long getEndOfDate(String dateTime, String dateTimeFormat){

        Calendar calendar = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat(dateTimeFormat);

        try {
            Date date = format.parse(dateTime);
            calendar.setTime(date);
            calendar.set(Calendar.HOUR_OF_DAY, 23);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 59);
            calendar.set(Calendar.MILLISECOND, 999);
            return calendar.getTimeInMillis();
        } catch (ParseException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    /**
     * String to long using given format
     * */
    public Long parseDateTimeToLong(String time, String timeFormat) {

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(timeFormat);

        try {
            Date date = dateFormat.parse(time);
            calendar.setTime(date);
            return calendar.getTimeInMillis();
        } catch (ParseException e) {
            System.out.println((" cannot parse time : "
                    + time
                    + " using format : "
                    + timeFormat));
            return null;
        }
    }

    /**
     *  Long to dateTime String using default dateTime format
     * */
    public String parseDateTimeToString(Long timeMillis) {

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(Constants.DEFAULT_DATE_TIME_FORMAT);
        calendar.setTimeInMillis(timeMillis);

        return dateFormat.format(calendar.getTime());
    }

    /**
     *  Long to date String using default date format
     * */
    public String parseDateToString(Long timeMillis) {

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(Constants.DEFAULT_DATE_FORMAT);
        calendar.setTimeInMillis(timeMillis);

        return dateFormat.format(calendar.getTime());
    }

}
