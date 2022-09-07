package com.supremepole.b03springbootjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName eft
 * @Description
 * @Date 2022/8/8 17:00
 * @Version 1.0.0
 **/
@Entity(name="eft")
public class eft {

    @Id
    private long id;
    private String name;
    private Date date;
    private double open;
    private double high;
    private double low;
    private double close;
    private int volume;
    private int openInt;

    public eft() {
    }

    public eft(long id, String name, Date date, double open, double high, double low, double close, int volume, int openInt) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.openInt = openInt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getOpenInt() {
        return openInt;
    }

    public void setOpenInt(int openInt) {
        this.openInt = openInt;
    }
}
