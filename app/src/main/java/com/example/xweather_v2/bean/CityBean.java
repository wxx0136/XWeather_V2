package com.example.xweather_v2.bean;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

public class CityBean implements Serializable {

    /**
     * id : 833
     * name : Ḩeşār-e Sefīd
     * state :
     * country : IR
     * coord : {"lon":47.159401,"lat":34.330502}
     */
    private int id;
    private String name;
    private String state;
    private String country;
    private CoordBean coord;

    @Override
    public @NotNull String toString() {
        String str;
        if (Objects.equals(state, "")) {
            str = name + ", (Prov/State), " + country;
        } else {
            str = name + ", " + state + ", " + country;
        }
        return str;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public CoordBean getCoord() {
        return coord;
    }

    public void setCoord(CoordBean coord) {
        this.coord = coord;
    }

    public static class CoordBean implements Serializable {
        /**
         * lon : 47.159401
         * lat : 34.330502
         */

        private double lon;
        private double lat;

        public CoordBean(double lon, double lat){
            this.lon = lon;
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }
    }
}
