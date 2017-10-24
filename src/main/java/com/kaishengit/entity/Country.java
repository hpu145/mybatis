package com.kaishengit.entity;

/**
 * Created by zhangyu on 2017/10/24.
 */
public class Country {
    private int id;
    private String countname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountname() {
        return countname;
    }

    public void setCountname(String countname) {
        this.countname = countname;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countname='" + countname + '\'' +
                '}';
    }
}
