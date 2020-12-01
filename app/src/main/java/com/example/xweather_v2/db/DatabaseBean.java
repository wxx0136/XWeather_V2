package com.example.xweather_v2.db;

public class DatabaseBean {
    private int _pk;
    private int id;
    private String city;
    private double lat;
    private double lon;
    private String content;

    public DatabaseBean() {
    }

    public DatabaseBean(int _pk, int id, String city, double lat, double lon, String content) {
        this._pk = _pk;
        this.id = id;
        this.city = city;
        this.lat = lat;
        this.lon = lon;
        this.content = content;
    }

    public int get_pk() {
        return _pk;
    }

    public void set_pk(int _pk) {
        this._pk = _pk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //    public DatabaseBean() {
//    }
//
//    public DatabaseBean(int _id, String city, String content) {
//        this._id = _id;
//        this.city = city;
//        this.content = content;
//    }
//
//    public int get_id() {
//        return _id;
//    }
//
//    public void set_id(int _id) {
//        this._id = _id;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
}
