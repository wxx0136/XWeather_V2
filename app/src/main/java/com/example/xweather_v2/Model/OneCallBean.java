package com.example.xweather_v2.Model;

import java.util.List;

public class OneCallBean {

    /**
     * lat : 49.85
     * lon : -99.95
     * timezone : America/Winnipeg
     * timezone_offset : -21600
     * current : {"dt":1606550609,"sunrise":1606572773,"sunset":1606603408,"temp":266.15,"feels_like":260.38,"pressure":1008,"humidity":92,"dew_point":265.19,"uvi":0,"clouds":75,"visibility":10000,"wind_speed":4.1,"wind_deg":290,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}]}
     * hourly : [{"dt":1606550400,"temp":266.15,"feels_like":260.5,"pressure":1008,"humidity":92,"dew_point":265.19,"uvi":0,"clouds":75,"visibility":10000,"wind_speed":3.93,"wind_deg":265,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"pop":0},{"dt":1606554000,"temp":268.17,"feels_like":262.85,"pressure":1009,"humidity":95,"dew_point":267.57,"uvi":0,"clouds":87,"visibility":10000,"wind_speed":3.78,"wind_deg":269,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606557600,"temp":269.22,"feels_like":264.1,"pressure":1010,"humidity":96,"dew_point":268.74,"uvi":0,"clouds":95,"visibility":10000,"wind_speed":3.67,"wind_deg":269,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606561200,"temp":269.33,"feels_like":264.64,"pressure":1010,"humidity":96,"dew_point":268.85,"uvi":0,"clouds":88,"visibility":10000,"wind_speed":3.07,"wind_deg":277,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606564800,"temp":269.15,"feels_like":265.13,"pressure":1010,"humidity":96,"dew_point":268.67,"uvi":0,"clouds":88,"visibility":10000,"wind_speed":2.08,"wind_deg":287,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606568400,"temp":268.88,"feels_like":265.02,"pressure":1010,"humidity":96,"dew_point":267.1,"uvi":0,"clouds":100,"visibility":10000,"wind_speed":1.82,"wind_deg":248,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606572000,"temp":268.66,"feels_like":265.33,"pressure":1010,"humidity":96,"dew_point":267.02,"uvi":0,"clouds":100,"visibility":10000,"wind_speed":1.02,"wind_deg":218,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606575600,"temp":269.07,"feels_like":265.15,"pressure":1009,"humidity":97,"dew_point":267.6,"uvi":0,"clouds":95,"visibility":10000,"wind_speed":1.95,"wind_deg":219,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606579200,"temp":270.22,"feels_like":266.25,"pressure":1009,"humidity":97,"dew_point":268.64,"uvi":0.25,"clouds":96,"visibility":10000,"wind_speed":2.21,"wind_deg":209,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606582800,"temp":271.5,"feels_like":267.55,"pressure":1008,"humidity":96,"dew_point":269.35,"uvi":0.51,"clouds":97,"visibility":10000,"wind_speed":2.38,"wind_deg":235,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606586400,"temp":272.42,"feels_like":268.05,"pressure":1007,"humidity":95,"dew_point":269.72,"uvi":0.73,"clouds":97,"visibility":10000,"wind_speed":3.12,"wind_deg":242,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606590000,"temp":273.26,"feels_like":268.64,"pressure":1007,"humidity":93,"dew_point":269.72,"uvi":0.85,"clouds":100,"visibility":10000,"wind_speed":3.59,"wind_deg":248,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606593600,"temp":273.79,"feels_like":268.86,"pressure":1006,"humidity":89,"dew_point":269.51,"uvi":0.67,"clouds":100,"visibility":10000,"wind_speed":4.01,"wind_deg":251,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606597200,"temp":273.64,"feels_like":268.8,"pressure":1006,"humidity":90,"dew_point":269.44,"uvi":0.39,"clouds":100,"visibility":10000,"wind_speed":3.89,"wind_deg":253,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606600800,"temp":272.89,"feels_like":268,"pressure":1007,"humidity":94,"dew_point":269.48,"uvi":0.12,"clouds":100,"visibility":10000,"wind_speed":3.92,"wind_deg":279,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0},{"dt":1606604400,"temp":271.73,"feels_like":266.5,"pressure":1008,"humidity":95,"dew_point":269.25,"uvi":0,"clouds":100,"visibility":10000,"wind_speed":4.22,"wind_deg":291,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606608000,"temp":271.12,"feels_like":264.72,"pressure":1010,"humidity":95,"dew_point":268.74,"uvi":0,"clouds":83,"visibility":10000,"wind_speed":5.78,"wind_deg":306,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"pop":0},{"dt":1606611600,"temp":270.16,"feels_like":263.2,"pressure":1012,"humidity":96,"dew_point":268.33,"uvi":0,"clouds":2,"visibility":10000,"wind_speed":6.44,"wind_deg":318,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606615200,"temp":269.76,"feels_like":262.43,"pressure":1014,"humidity":95,"dew_point":267.61,"uvi":0,"clouds":16,"visibility":10000,"wind_speed":6.89,"wind_deg":319,"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"pop":0.01},{"dt":1606618800,"temp":269.12,"feels_like":262.53,"pressure":1017,"humidity":96,"dew_point":267.2,"uvi":0,"clouds":11,"visibility":10000,"wind_speed":5.75,"wind_deg":312,"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"pop":0.04},{"dt":1606622400,"temp":269.41,"feels_like":262.43,"pressure":1019,"humidity":96,"dew_point":267.41,"uvi":0,"clouds":20,"visibility":10000,"wind_speed":6.35,"wind_deg":305,"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"pop":0.03},{"dt":1606626000,"temp":268.96,"feels_like":261.29,"pressure":1021,"humidity":94,"dew_point":266.21,"uvi":0,"clouds":34,"visibility":10000,"wind_speed":7.23,"wind_deg":310,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0.02},{"dt":1606629600,"temp":267.63,"feels_like":260.09,"pressure":1022,"humidity":94,"dew_point":264.76,"uvi":0,"clouds":30,"visibility":10000,"wind_speed":6.85,"wind_deg":311,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0},{"dt":1606633200,"temp":266.57,"feels_like":258.93,"pressure":1023,"humidity":93,"dew_point":263.44,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":6.83,"wind_deg":310,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606636800,"temp":265.62,"feels_like":258.03,"pressure":1025,"humidity":93,"dew_point":262.51,"uvi":0,"clouds":5,"visibility":10000,"wind_speed":6.65,"wind_deg":310,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606640400,"temp":265.2,"feels_like":257.96,"pressure":1026,"humidity":94,"dew_point":262.57,"uvi":0,"clouds":20,"visibility":10000,"wind_speed":6.11,"wind_deg":301,"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"pop":0},{"dt":1606644000,"temp":264.35,"feels_like":256.41,"pressure":1027,"humidity":92,"dew_point":260.93,"uvi":0,"clouds":33,"visibility":10000,"wind_speed":6.99,"wind_deg":302,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0},{"dt":1606647600,"temp":263.48,"feels_like":256.08,"pressure":1028,"humidity":92,"dew_point":260.14,"uvi":0,"clouds":26,"visibility":10000,"wind_speed":6.13,"wind_deg":302,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0},{"dt":1606651200,"temp":263.02,"feels_like":256.1,"pressure":1029,"humidity":92,"dew_point":259.99,"uvi":0,"clouds":22,"visibility":10000,"wind_speed":5.4,"wind_deg":301,"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"pop":0},{"dt":1606654800,"temp":262.68,"feels_like":256.24,"pressure":1030,"humidity":93,"dew_point":260.07,"uvi":0,"clouds":2,"visibility":10000,"wind_speed":4.69,"wind_deg":295,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606658400,"temp":262.54,"feels_like":256.32,"pressure":1030,"humidity":94,"dew_point":260.2,"uvi":0,"clouds":2,"visibility":10000,"wind_speed":4.38,"wind_deg":288,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606662000,"temp":262.81,"feels_like":256.61,"pressure":1031,"humidity":94,"dew_point":260.32,"uvi":0,"clouds":1,"visibility":10000,"wind_speed":4.38,"wind_deg":284,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606665600,"temp":264.12,"feels_like":257.37,"pressure":1032,"humidity":91,"dew_point":260.57,"uvi":0.31,"clouds":1,"visibility":10000,"wind_speed":5.25,"wind_deg":295,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606669200,"temp":265.33,"feels_like":259.08,"pressure":1032,"humidity":90,"dew_point":261.12,"uvi":0.63,"clouds":1,"visibility":10000,"wind_speed":4.65,"wind_deg":297,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606672800,"temp":266.37,"feels_like":260.53,"pressure":1031,"humidity":89,"dew_point":261.7,"uvi":0.89,"clouds":1,"visibility":10000,"wind_speed":4.17,"wind_deg":292,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606676400,"temp":267.15,"feels_like":261.33,"pressure":1031,"humidity":89,"dew_point":262.22,"uvi":0.93,"clouds":0,"visibility":10000,"wind_speed":4.24,"wind_deg":285,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606680000,"temp":267.78,"feels_like":262.22,"pressure":1031,"humidity":89,"dew_point":262.68,"uvi":0.73,"clouds":0,"visibility":10000,"wind_speed":3.95,"wind_deg":275,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606683600,"temp":268.01,"feels_like":262.66,"pressure":1031,"humidity":90,"dew_point":263.18,"uvi":0.42,"clouds":0,"visibility":10000,"wind_speed":3.7,"wind_deg":268,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606687200,"temp":266.9,"feels_like":262.12,"pressure":1031,"humidity":92,"dew_point":263.29,"uvi":0.15,"clouds":0,"visibility":10000,"wind_speed":2.77,"wind_deg":254,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606690800,"temp":265.85,"feels_like":260.88,"pressure":1031,"humidity":93,"dew_point":262.77,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.94,"wind_deg":242,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606694400,"temp":265.56,"feels_like":260.24,"pressure":1030,"humidity":93,"dew_point":262.65,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":3.4,"wind_deg":241,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606698000,"temp":265.45,"feels_like":260.03,"pressure":1029,"humidity":93,"dew_point":262.71,"uvi":0,"clouds":71,"visibility":10000,"wind_speed":3.53,"wind_deg":241,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"pop":0},{"dt":1606701600,"temp":265.65,"feels_like":260.4,"pressure":1029,"humidity":94,"dew_point":263,"uvi":0,"clouds":85,"visibility":10000,"wind_speed":3.33,"wind_deg":239,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606705200,"temp":265.66,"feels_like":260.6,"pressure":1028,"humidity":94,"dew_point":262.99,"uvi":0,"clouds":90,"visibility":10000,"wind_speed":3.06,"wind_deg":239,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606708800,"temp":265.95,"feels_like":260.91,"pressure":1027,"humidity":93,"dew_point":263.08,"uvi":0,"clouds":93,"visibility":10000,"wind_speed":3.04,"wind_deg":232,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606712400,"temp":265.76,"feels_like":260.82,"pressure":1026,"humidity":92,"dew_point":262.47,"uvi":0,"clouds":87,"visibility":10000,"wind_speed":2.86,"wind_deg":236,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606716000,"temp":266.46,"feels_like":261.6,"pressure":1025,"humidity":91,"dew_point":262.42,"uvi":0,"clouds":85,"visibility":10000,"wind_speed":2.82,"wind_deg":220,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606719600,"temp":266.81,"feels_like":261.8,"pressure":1024,"humidity":90,"dew_point":262.22,"uvi":0,"clouds":72,"visibility":10000,"wind_speed":3.06,"wind_deg":208,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"pop":0}]
     * daily : [{"dt":1606586400,"sunrise":1606572773,"sunset":1606603408,"temp":{"day":272.42,"min":266.15,"max":273.79,"night":268.96,"eve":271.12,"morn":269.15},"feels_like":{"day":268.05,"night":261.29,"eve":264.72,"morn":265.13},"pressure":1007,"humidity":95,"dew_point":269.72,"wind_speed":3.12,"wind_deg":242,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":97,"pop":0.04,"uvi":0.85},{"dt":1606672800,"sunrise":1606659255,"sunset":1606689768,"temp":{"day":266.37,"min":262.54,"max":268.01,"night":265.76,"eve":265.56,"morn":263.02},"feels_like":{"day":260.53,"night":260.82,"eve":260.24,"morn":256.1},"pressure":1031,"humidity":89,"dew_point":261.7,"wind_speed":4.17,"wind_deg":292,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":1,"pop":0,"uvi":0.93},{"dt":1606759200,"sunrise":1606745736,"sunset":1606776131,"temp":{"day":272.76,"min":266.46,"max":274.24,"night":270.18,"eve":269.87,"morn":267.11},"feels_like":{"day":267.36,"night":265.49,"eve":264.97,"morn":262.25},"pressure":1014,"humidity":84,"dew_point":264.47,"wind_speed":4.35,"wind_deg":206,"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":17,"pop":0,"uvi":1.04},{"dt":1606845600,"sunrise":1606832215,"sunset":1606862497,"temp":{"day":274.26,"min":269.42,"max":274.26,"night":269.42,"eve":270.62,"morn":270},"feels_like":{"day":268.94,"night":265.28,"eve":267.13,"morn":265.66},"pressure":1010,"humidity":87,"dew_point":270.3,"wind_speed":4.6,"wind_deg":271,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":94,"pop":0,"uvi":0.86},{"dt":1606932000,"sunrise":1606918692,"sunset":1606948866,"temp":{"day":270.11,"min":265.15,"max":270.11,"night":265.15,"eve":265.82,"morn":266.29},"feels_like":{"day":264.54,"night":259.1,"eve":259.4,"morn":261.4},"pressure":1033,"humidity":94,"dew_point":267.1,"wind_speed":4.41,"wind_deg":313,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":72,"pop":0,"uvi":1},{"dt":1607018400,"sunrise":1607005168,"sunset":1607035238,"temp":{"day":270.3,"min":264.9,"max":272.51,"night":271.18,"eve":270.92,"morn":265.3},"feels_like":{"day":263.43,"night":264.3,"eve":264.34,"morn":258.98},"pressure":1025,"humidity":90,"dew_point":265.28,"wind_speed":6.2,"wind_deg":280,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":9,"pop":0,"uvi":1},{"dt":1607104800,"sunrise":1607091641,"sunset":1607121612,"temp":{"day":275.35,"min":270.34,"max":276.39,"night":271.73,"eve":272.22,"morn":270.65},"feels_like":{"day":268.48,"night":265.54,"eve":266.02,"morn":264.61},"pressure":1020,"humidity":79,"dew_point":269.06,"wind_speed":6.77,"wind_deg":288,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":1},{"dt":1607191200,"sunrise":1607178112,"sunset":1607207990,"temp":{"day":272.07,"min":268.76,"max":273.48,"night":271.57,"eve":271.57,"morn":269.15},"feels_like":{"day":265.83,"night":263.85,"eve":263.85,"morn":263.47},"pressure":1025,"humidity":92,"dew_point":267.98,"wind_speed":5.65,"wind_deg":266,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":1}]
     */

    private double lat;
    private double lon;
    private String timezone;
    private int timezone_offset;
    private CurrentBean current;
    private List<HourlyBean> hourly;
    private List<DailyBean> daily;

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

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTimezone_offset() {
        return timezone_offset;
    }

    public void setTimezone_offset(int timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    public CurrentBean getCurrent() {
        return current;
    }

    public void setCurrent(CurrentBean current) {
        this.current = current;
    }

    public List<HourlyBean> getHourly() {
        return hourly;
    }

    public void setHourly(List<HourlyBean> hourly) {
        this.hourly = hourly;
    }

    public List<DailyBean> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyBean> daily) {
        this.daily = daily;
    }

    public static class CurrentBean {
        /**
         * dt : 1606550609
         * sunrise : 1606572773
         * sunset : 1606603408
         * temp : 266.15
         * feels_like : 260.38
         * pressure : 1008
         * humidity : 92
         * dew_point : 265.19
         * uvi : 0
         * clouds : 75
         * visibility : 10000
         * wind_speed : 4.1
         * wind_deg : 290
         * weather : [{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}]
         */

        private int dt;
        private int sunrise;
        private int sunset;
        private double temp;
        private double feels_like;
        private int pressure;
        private int humidity;
        private double dew_point;
        private int uvi;
        private int clouds;
        private int visibility;
        private double wind_speed;
        private int wind_deg;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(double feels_like) {
            this.feels_like = feels_like;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDew_point() {
            return dew_point;
        }

        public void setDew_point(double dew_point) {
            this.dew_point = dew_point;
        }

        public int getUvi() {
            return uvi;
        }

        public void setUvi(int uvi) {
            this.uvi = uvi;
        }

        public int getClouds() {
            return clouds;
        }

        public void setClouds(int clouds) {
            this.clouds = clouds;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public double getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(double wind_speed) {
            this.wind_speed = wind_speed;
        }

        public int getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(int wind_deg) {
            this.wind_deg = wind_deg;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class WeatherBean {
            /**
             * id : 803
             * main : Clouds
             * description : broken clouds
             * icon : 04n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
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

    public static class HourlyBean {
        /**
         * dt : 1606550400
         * temp : 266.15
         * feels_like : 260.5
         * pressure : 1008
         * humidity : 92
         * dew_point : 265.19
         * uvi : 0
         * clouds : 75
         * visibility : 10000
         * wind_speed : 3.93
         * wind_deg : 265
         * weather : [{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}]
         * pop : 0
         */

        private int dt;
        private double temp;
        private double feels_like;
        private int pressure;
        private int humidity;
        private double dew_point;
        private int uvi;
        private int clouds;
        private int visibility;
        private double wind_speed;
        private int wind_deg;
        private int pop;
        private List<WeatherBeanX> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(double feels_like) {
            this.feels_like = feels_like;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDew_point() {
            return dew_point;
        }

        public void setDew_point(double dew_point) {
            this.dew_point = dew_point;
        }

        public int getUvi() {
            return uvi;
        }

        public void setUvi(int uvi) {
            this.uvi = uvi;
        }

        public int getClouds() {
            return clouds;
        }

        public void setClouds(int clouds) {
            this.clouds = clouds;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public double getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(double wind_speed) {
            this.wind_speed = wind_speed;
        }

        public int getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(int wind_deg) {
            this.wind_deg = wind_deg;
        }

        public int getPop() {
            return pop;
        }

        public void setPop(int pop) {
            this.pop = pop;
        }

        public List<WeatherBeanX> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBeanX> weather) {
            this.weather = weather;
        }

        public static class WeatherBeanX {
            /**
             * id : 803
             * main : Clouds
             * description : broken clouds
             * icon : 04n
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
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

    public static class DailyBean {
        /**
         * dt : 1606586400
         * sunrise : 1606572773
         * sunset : 1606603408
         * temp : {"day":272.42,"min":266.15,"max":273.79,"night":268.96,"eve":271.12,"morn":269.15}
         * feels_like : {"day":268.05,"night":261.29,"eve":264.72,"morn":265.13}
         * pressure : 1007
         * humidity : 95
         * dew_point : 269.72
         * wind_speed : 3.12
         * wind_deg : 242
         * weather : [{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}]
         * clouds : 97
         * pop : 0.04
         * uvi : 0.85
         */

        private int dt;
        private int sunrise;
        private int sunset;
        private TempBean temp;
        private FeelsLikeBean feels_like;
        private int pressure;
        private int humidity;
        private double dew_point;
        private double wind_speed;
        private int wind_deg;
        private int clouds;
        private double pop;
        private double uvi;
        private List<WeatherBeanXX> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        public TempBean getTemp() {
            return temp;
        }

        public void setTemp(TempBean temp) {
            this.temp = temp;
        }

        public FeelsLikeBean getFeels_like() {
            return feels_like;
        }

        public void setFeels_like(FeelsLikeBean feels_like) {
            this.feels_like = feels_like;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getDew_point() {
            return dew_point;
        }

        public void setDew_point(double dew_point) {
            this.dew_point = dew_point;
        }

        public double getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(double wind_speed) {
            this.wind_speed = wind_speed;
        }

        public int getWind_deg() {
            return wind_deg;
        }

        public void setWind_deg(int wind_deg) {
            this.wind_deg = wind_deg;
        }

        public int getClouds() {
            return clouds;
        }

        public void setClouds(int clouds) {
            this.clouds = clouds;
        }

        public double getPop() {
            return pop;
        }

        public void setPop(double pop) {
            this.pop = pop;
        }

        public double getUvi() {
            return uvi;
        }

        public void setUvi(double uvi) {
            this.uvi = uvi;
        }

        public List<WeatherBeanXX> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBeanXX> weather) {
            this.weather = weather;
        }

        public static class TempBean {
            /**
             * day : 272.42
             * min : 266.15
             * max : 273.79
             * night : 268.96
             * eve : 271.12
             * morn : 269.15
             */

            private double day;
            private double min;
            private double max;
            private double night;
            private double eve;
            private double morn;

            public double getDay() {
                return day;
            }

            public void setDay(double day) {
                this.day = day;
            }

            public double getMin() {
                return min;
            }

            public void setMin(double min) {
                this.min = min;
            }

            public double getMax() {
                return max;
            }

            public void setMax(double max) {
                this.max = max;
            }

            public double getNight() {
                return night;
            }

            public void setNight(double night) {
                this.night = night;
            }

            public double getEve() {
                return eve;
            }

            public void setEve(double eve) {
                this.eve = eve;
            }

            public double getMorn() {
                return morn;
            }

            public void setMorn(double morn) {
                this.morn = morn;
            }
        }

        public static class FeelsLikeBean {
            /**
             * day : 268.05
             * night : 261.29
             * eve : 264.72
             * morn : 265.13
             */

            private double day;
            private double night;
            private double eve;
            private double morn;

            public double getDay() {
                return day;
            }

            public void setDay(double day) {
                this.day = day;
            }

            public double getNight() {
                return night;
            }

            public void setNight(double night) {
                this.night = night;
            }

            public double getEve() {
                return eve;
            }

            public void setEve(double eve) {
                this.eve = eve;
            }

            public double getMorn() {
                return morn;
            }

            public void setMorn(double morn) {
                this.morn = morn;
            }
        }

        public static class WeatherBeanXX {
            /**
             * id : 804
             * main : Clouds
             * description : overcast clouds
             * icon : 04d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
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
}
