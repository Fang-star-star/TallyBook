package com.example.tallybook;

public class ListInfo {
    private String time , info , payout , income ;
    private Integer icon_front , icon_last;

    public ListInfo() {
    }

    public Integer getIcon_front() {
        return icon_front;
    }

    public void setIcon_front(Integer icon_front) {
        this.icon_front = icon_front;
    }

    public Integer getIcon_last() {
        return icon_last;
    }

    public void setIcon_last(Integer icon_last) {
        this.icon_last = icon_last;
    }

    public ListInfo(String time, String info, String payout, String income, Integer icon_front , Integer icon_last) {
        this.time = time;
        this.info = info;
        this.payout = payout;
        this.income = income;
        this.icon_front = icon_front;
        this.icon_last = icon_last;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPayout() {
        return payout;
    }

    public void setPayout(String payout) {
        this.payout = payout;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
