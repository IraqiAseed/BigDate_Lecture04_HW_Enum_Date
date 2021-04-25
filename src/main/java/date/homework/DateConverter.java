package date.homework;

import lombok.SneakyThrows;


import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class DateConverter {

    public DateConverter(){}

    //write a method which take 2 params Dates in string format and return difference in days between them "yyyy-mm-dd"
    @SneakyThrows
    public static long calcDiffInDaysBetweenDates(String date1, String date2)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDate = LocalDate.parse(date1,formatter);
        LocalDate secondDate = LocalDate.parse(date2,formatter);
        long between = ChronoUnit.DAYS.between(firstDate,secondDate);

        return between;


    }
    //write a method which takes a sting in format yyyy-dd-mm and return string in format yyyy-mm-dd
    public static String changeDateFormat(String date)
    {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date,formatter1);
        String dateStr = localDate.format(formatter2);

        return dateStr;
    }
    public static void main(String[] args) {
        long between = DateConverter.calcDiffInDaysBetweenDates("1985-12-27","2020-01-14");
        System.out.println(between);

        System.out.println(changeDateFormat("2021-25-04"));

    }
}
