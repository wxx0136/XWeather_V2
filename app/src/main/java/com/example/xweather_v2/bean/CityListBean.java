package com.example.xweather_v2.bean;

public class CityListBean {

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

    public static class CoordBean {
        /**
         * lon : 47.159401
         * lat : 34.330502
         */

        private double lon;
        private double lat;

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
