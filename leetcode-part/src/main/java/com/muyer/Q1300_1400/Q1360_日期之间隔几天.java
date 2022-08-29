package com.muyer.Q1300_1400;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/29 19:10
 */
public class Q1360_日期之间隔几天 {

    int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) {
        if(date1.equals(date2)){
            return 0;
        }
        int year1 = Integer.valueOf(date1.split("-")[0]);
        int month1 = Integer.valueOf(date1.split("-")[1]);
        int day1 = Integer.valueOf(date1.split("-")[2]);
        int year2 = Integer.valueOf(date2.split("-")[0]);
        int month2 = Integer.valueOf(date2.split("-")[1]);
        int day2 = Integer.valueOf(date2.split("-")[2]);
        //已经过了多少天
        for(int i = 1 ; i<month1 ; i++){
            day1 = getDays(year1,i) + day1;
        }
        for(int i=1 ;i<month2 ; i++){
            day2 = getDays(year2,i) + day2;
        }
        if(year1 == year2){
            return Math.abs(day1 - day2);
        }
        int yearDays = 0;
        if(Math.abs(year1-year2) > 1){
            for(int i=Math.min(year1,year2)+1 ; i<=Math.max(year1,year2)-1 ; i++){
                yearDays = yearDays + (isRunYear(i)? 366 : 365);
            }
        }
        int days = 0;
        if(year1 < year2){
            days = (isRunYear(year1)? 366 : 365)  - day1 + day2;
        } else {
            days = (isRunYear(year2)? 366 : 365) - day2 + day1;
        }
        return yearDays + days;
    }

    public int getDays(int year,int month){
        if(month == 2){
            return isRunYear(year) ? 29 : 28;
        }
        return days[month-1];
    }

    public boolean isRunYear(int year){
        return year % 4 == 0 && year % 100 !=0 || year % 400 == 0;
    }
}
