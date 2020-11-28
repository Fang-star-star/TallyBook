package com.example.tallybook;

import java.util.Calendar;
import java.util.TimeZone;

public class DataTime {

    public static Calendar calendar = Calendar.getInstance();

    public static int getDate(char data_info){
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+8:00")) ;
        switch (data_info){
            case 'Y':
                return calendar.get(Calendar.YEAR) ;
            case 'M':
                return calendar.get(Calendar.MONTH) + 1 ;
            case 'w':
                return calendar.get(Calendar.DAY_OF_WEEK) - 1 ;
            case 'd':
                return calendar.get(Calendar.DAY_OF_MONTH) ;
        }
        return 0 ;
    }


    public static int getMonthOfDay(int year,int month){
        int day;
        day = (year%4==0&&year%100!=0||year%400==0) ? 29 : 28 ;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return day;
        }
        return 0;
    }


    public static String getFirstDayOfWeek(int week){
//        String week1 = "日一二三四五六" ;
//        String week2 = week1.substring(week , week + 1) ;
        int mPreDay ;
        String month = "月" ;
        String day = "日" ;

        switch (week){
            case 0: {
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') - 6) ;
                mPreDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mPreDay > getDate('d')) {
                    int mPreMonth = getDate('M') == 1 ? 12 : getDate('M') - 1 ;
                    return mPreMonth >= 10 ? mPreMonth + month + mPreDay + day : "0" + mPreMonth + month + mPreDay + day ;
                }
                return getDate('M') >=10 ? getDate('M') + month + mPreDay + day : "0" + getDate('M')+ month + mPreDay + day ;
            }
            case 1:
                return getDate('M') >=10 ? getDate('M') + month + getDate('d') + day : "0" + getDate('M')+ month + getDate('d') + day ;
            case 2:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') - 1);
                mPreDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (mPreDay > getDate('d')) {
                    int mPreMonth = getDate('M') == 1 ? 12 : getDate('M') - 1;
                    return mPreMonth >= 10 ? mPreMonth + month + mPreDay + day : "0" + mPreMonth + month + mPreDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mPreDay + day : "0" + getDate('M') + month + mPreDay + day ;
            }
            case 3:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') - 2) ;
                mPreDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mPreDay > getDate('d')) {
                    int mPreMonth = getDate('M') == 1 ? 12 : getDate('M') - 1 ;
                    return mPreMonth >= 10 ? mPreMonth + month + mPreDay + day : "0" + mPreMonth + mPreDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mPreDay + day : "0" + getDate('M') + month + mPreDay + day ;
            }
            case 4:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') - 3);
                mPreDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (mPreDay > getDate('d')) {
                    int mPreMonth = getDate('M') == 1 ? 12 : getDate('M') - 1;
                    return mPreMonth >= 10 ? mPreMonth + month + mPreDay + day : "0" + mPreMonth + month + mPreDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mPreDay + day : "0" + getDate('M') + month + mPreDay + day ;
            }
            case 5:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') - 4);
                mPreDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (mPreDay > getDate('d')) {
                    int mPreMonth = getDate('M') == 1 ? 12 : getDate('M') - 1;
                    return mPreMonth >= 10 ? mPreMonth + month + mPreDay + day : "0" + mPreMonth + month + mPreDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mPreDay + day : "0" + getDate('M') + month + mPreDay + day ;
            }
            case 6:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') - 5);
                mPreDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (mPreDay > getDate('d')) {
                    int mPreMonth = getDate('M') == 1 ? 12 : getDate('M') - 1;
                    return mPreMonth >= 10 ?
                            mPreMonth + month + mPreDay + day
                            : "0" + mPreMonth + month + mPreDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mPreDay + day : "0" + getDate('M') + month + mPreDay + day ;
            }
        }
        return  "0000" ;
    }

    public static String getLastDayOfWeek(int week){
//        String week1 = "日一二三四五六" ;
//        String week2 = week1.substring(week , week + 1) ;
        int mNextDay , mNextMouth ;
        String month = "月" ;
        String day = "日" ;

        switch (week){
            case 0: {
                return getDate('M') >=10 ? getDate('M') + month + getDate('d') + day : "0" + getDate('M') + month + getDate('d') + day ;
            }
            case 1: {
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') + 6);
                mNextDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (mNextDay < getDate('d')) {
                    mNextMouth = getDate('M') == 12 ? getDate('M') + 1 : 1;
                    return mNextMouth >= 10 ?
                            mNextMouth + month + mNextDay + day : "0" + mNextMouth + month + mNextDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mNextDay + day : "0" + getDate('M') + month + mNextDay + day ;
            }
            case 2:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') + 5) ;
                mNextDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mNextDay < getDate('d')) {
                    mNextMouth = getDate('M') == 12 ? getDate('M') + 1 : 1 ;
                    return mNextMouth >= 10 ?
                            mNextMouth + month + mNextDay + day : "0" + mNextMouth + month + mNextDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mNextDay + day : "0" + getDate('M') + month + mNextDay + day ;
            }
            case 3:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') + 4) ;
                mNextDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mNextDay < getDate('d')) {
                    mNextMouth = getDate('M') == 12 ? getDate('M') + 1 : 1 ;
                    return mNextMouth >= 10 ?
                            mNextMouth + month + mNextDay + day : "0" + mNextMouth + month + mNextDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mNextDay + day : "0" + getDate('M') + month + mNextDay + day ;
            }
            case 4:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') + 3) ;
                mNextDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mNextDay < getDate('d')) {
                    mNextMouth = getDate('M') == 12 ? getDate('M') + 1 : 1 ;
                    return mNextMouth >= 10 ?
                            mNextMouth + month + mNextDay + day : "0" + mNextMouth + month + mNextDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mNextDay + day : "0" + getDate('M') + month + mNextDay + day ;
            }
            case 5:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') + 2) ;
                mNextDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mNextDay < getDate('d')) {
                    mNextMouth = getDate('M') == 12 ? getDate('M') + 1 : 1 ;
                    return mNextMouth >= 10 ?
                            mNextMouth + month + mNextDay + day : "0" + mNextMouth + month + mNextDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mNextDay + day : "0" + getDate('M') + month + mNextDay + day ;
            }
            case 6:{
                calendar.set(Calendar.DAY_OF_MONTH, getDate('d') + 1) ;
                mNextDay = calendar.get(Calendar.DAY_OF_MONTH) ;
                if (mNextDay < getDate('d')) {
                    mNextMouth = getDate('M') == 12 ? getDate('M') + 1 : 1 ;
                    return mNextMouth >= 10 ?
                            mNextMouth + month + mNextDay + day : "0" + mNextMouth + month + mNextDay + day ;
                }
                return getDate('M') >= 10 ? getDate('M') + month + mNextDay + day : "0" + getDate('M') + month + mNextDay + day ;
            }
        }
        return "0000" ;
    }
}
