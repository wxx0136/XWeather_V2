package com.example.xweather_v2.bean;

import java.util.List;

public class CurrentWeatherBean {

    /**
     * coord : {"lon":-97.15,"lat":49.88}
     * weather : [{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}]
     * base : stations
     * main : {"temp":274.23,"feels_like":270.82,"temp_min":273.71,"temp_max":274.82,"pressure":1015,"humidity":59,"sea_level":1015,"grnd_level":986}
     * visibility : 10000
     * wind : {"speed":1,"deg":280}
     * clouds : {"all":100}
     * dt : 1607020854
     * sys : {"type":1,"id":738,"country":"CA","sunrise":1607004503,"sunset":1607034558}
     * timezone : -21600
     * id : 6183235
     * name : Winnipeg
     * cod : 200
     */

    private CoordBean coord;
    private String base;
    private MainBean main;
    private Integer visibility;
    private WindBean wind;
    private CloudsBean clouds;
    private Integer dt;
    private SysBean sys;
    private Integer timezone;
    private Integer id;
    private String name;
    private Integer cod;
    private List<WeatherBean> weather;

    public CoordBean getCoord() {
        return coord;
    }

    public void setCoord(CoordBean coord) {
        this.coord = coord;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainBean getMain() {
        return main;
    }

    public void setMain(MainBean main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    public CloudsBean getClouds() {
        return clouds;
    }

    public void setClouds(CloudsBean clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public SysBean getSys() {
        return sys;
    }

    public void setSys(SysBean sys) {
        this.sys = sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public List<WeatherBean> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherBean> weather) {
        this.weather = weather;
    }

    public static class CoordBean {
        /**
         * lon : -97.15
         * lat : 49.88
         */

        private Double lon;
        private Double lat;

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }
    }

    public static class MainBean {
        /**
         * temp : 274.23
         * feels_like : 270.82
         * temp_min : 273.71
         * temp_max : 274.82
         * pressure : 1015
         * humidity : 59
         * sea_level : 1015
         * grnd_level : 986
         */

        private Double temp;
        private Double feels_like;
        private Double temp_min;
        private Double temp_max;
        private Integer pressure;
        private Integer humidity;
        private Integer sea_level;
        private Integer grnd_level;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(Double feels_like) {
            this.feels_like = feels_like;
        }

        public Double getTemp_min() {
            return temp_min;
        }

        public void setTemp_min(Double temp_min) {
            this.temp_min = temp_min;
        }

        public Double getTemp_max() {
            return temp_max;
        }

        public void setTemp_max(Double temp_max) {
            this.temp_max = temp_max;
        }

        public Integer getPressure() {
            return pressure;
        }

        public void setPressure(Integer pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Integer getSea_level() {
            return sea_level;
        }

        public void setSea_level(Integer sea_level) {
            this.sea_level = sea_level;
        }

        public Integer getGrnd_level() {
            return grnd_level;
        }

        public void setGrnd_level(Integer grnd_level) {
            this.grnd_level = grnd_level;
        }
    }

    public static class WindBean {
        /**
         * speed : 1
         * deg : 280
         */

        private Integer speed;
        private Integer deg;

        public Integer getSpeed() {
            return speed;
        }

        public void setSpeed(Integer speed) {
            this.speed = speed;
        }

        public Integer getDeg() {
            return deg;
        }

        public void setDeg(Integer deg) {
            this.deg = deg;
        }
    }

    public static class CloudsBean {
        /**
         * all : 100
         */

        private Integer all;

        public Integer getAll() {
            return all;
        }

        public void setAll(Integer all) {
            this.all = all;
        }
    }

    public static class SysBean {
        /**
         * type : 1
         * id : 738
         * country : CA
         * sunrise : 1607004503
         * sunset : 1607034558
         */

        private Integer type;
        private Integer id;
        private String country;
        private Integer sunrise;
        private Integer sunset;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Integer getSunrise() {
            return sunrise;
        }

        public void setSunrise(Integer sunrise) {
            this.sunrise = sunrise;
        }

        public Integer getSunset() {
            return sunset;
        }

        public void setSunset(Integer sunset) {
            this.sunset = sunset;
        }
    }

    public static class WeatherBean {
        /**
         * id : 804
         * main : Clouds
         * description : overcast clouds
         * icon : 04d
         */

        private Integer id;
        private String main;
        private String description;
        private String icon;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }
}
