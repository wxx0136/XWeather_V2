package com.example.xweather_v2.db;

public class DatabaseBean {
    private int _pk;
    private int id;
    private String city;
    private String state;
    private String country;
    private double lat;
    private double lon;
    private String content;

    public DatabaseBean() {
    }

    public DatabaseBean(int _pk, int id, String city, String state, String country, double lat, double lon, String content) {
        this._pk = _pk;
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.content = content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

}
