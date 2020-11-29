package com.example.xweather_v2.bean;

import java.util.List;

public class FiveDaysForecastBean {


    /**
     * cod : 200
     * message : 0
     * cnt : 40
     * list : [{"dt":1606651200,"main":{"temp":265.5,"feels_like":257.65,"temp_min":262.87,"temp_max":265.5,"pressure":1022,"sea_level":1022,"grnd_level":995,"humidity":86,"temp_kf":2.63},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":76},"wind":{"speed":6.89,"deg":322},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-11-29 12:00:00"},{"dt":1606662000,"main":{"temp":263.09,"feels_like":255.85,"temp_min":261.73,"temp_max":263.09,"pressure":1027,"sea_level":1027,"grnd_level":998,"humidity":89,"temp_kf":1.36},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":35},"wind":{"speed":5.82,"deg":322},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-11-29 15:00:00"},{"dt":1606672800,"main":{"temp":263.82,"feels_like":256.62,"temp_min":263.53,"temp_max":263.82,"pressure":1029,"sea_level":1029,"grnd_level":1000,"humidity":91,"temp_kf":0.29},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":41},"wind":{"speed":5.87,"deg":320},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-11-29 18:00:00"},{"dt":1606683600,"main":{"temp":264.05,"feels_like":258.39,"temp_min":264.02,"temp_max":264.05,"pressure":1030,"sea_level":1030,"grnd_level":1000,"humidity":92,"temp_kf":0.03},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":70},"wind":{"speed":3.7,"deg":319},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-11-29 21:00:00"},{"dt":1606694400,"main":{"temp":261.05,"feels_like":257.09,"temp_min":261.05,"temp_max":261.05,"pressure":1030,"sea_level":1030,"grnd_level":1000,"humidity":94,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":36},"wind":{"speed":1.01,"deg":316},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-11-30 00:00:00"},{"dt":1606705200,"main":{"temp":261.01,"feels_like":256.25,"temp_min":261.01,"temp_max":261.01,"pressure":1030,"sea_level":1030,"grnd_level":999,"humidity":94,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.16,"deg":162},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-11-30 03:00:00"},{"dt":1606716000,"main":{"temp":260.99,"feels_like":255.43,"temp_min":260.99,"temp_max":260.99,"pressure":1029,"sea_level":1029,"grnd_level":998,"humidity":94,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.29,"deg":163},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-11-30 06:00:00"},{"dt":1606726800,"main":{"temp":261.42,"feels_like":255.62,"temp_min":261.42,"temp_max":261.42,"pressure":1026,"sea_level":1026,"grnd_level":996,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":3.69,"deg":169},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-11-30 09:00:00"},{"dt":1606737600,"main":{"temp":262.09,"feels_like":255.79,"temp_min":262.09,"temp_max":262.09,"pressure":1024,"sea_level":1024,"grnd_level":994,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":4.46,"deg":160},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-11-30 12:00:00"},{"dt":1606748400,"main":{"temp":263.8,"feels_like":256.98,"temp_min":263.8,"temp_max":263.8,"pressure":1022,"sea_level":1022,"grnd_level":992,"humidity":93,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":5.35,"deg":167},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-11-30 15:00:00"},{"dt":1606759200,"main":{"temp":267.91,"feels_like":260.66,"temp_min":267.91,"temp_max":267.91,"pressure":1019,"sea_level":1019,"grnd_level":989,"humidity":92,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":6.44,"deg":168},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-11-30 18:00:00"},{"dt":1606770000,"main":{"temp":269.53,"feels_like":262.72,"temp_min":269.53,"temp_max":269.53,"pressure":1016,"sea_level":1016,"grnd_level":987,"humidity":91,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":6.02,"deg":163},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-11-30 21:00:00"},{"dt":1606780800,"main":{"temp":268.43,"feels_like":261.37,"temp_min":268.43,"temp_max":268.43,"pressure":1014,"sea_level":1014,"grnd_level":985,"humidity":90,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":6.2,"deg":161},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-01 00:00:00"},{"dt":1606791600,"main":{"temp":268.43,"feels_like":261.28,"temp_min":268.43,"temp_max":268.43,"pressure":1013,"sea_level":1013,"grnd_level":983,"humidity":90,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":6.32,"deg":166},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-01 03:00:00"},{"dt":1606802400,"main":{"temp":267.93,"feels_like":260.51,"temp_min":267.93,"temp_max":267.93,"pressure":1012,"sea_level":1012,"grnd_level":982,"humidity":90,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":6.64,"deg":170},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-01 06:00:00"},{"dt":1606813200,"main":{"temp":267.36,"feels_like":260.31,"temp_min":267.36,"temp_max":267.36,"pressure":1011,"sea_level":1011,"grnd_level":982,"humidity":91,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":6.06,"deg":173},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-01 09:00:00"},{"dt":1606824000,"main":{"temp":266.69,"feels_like":259.87,"temp_min":266.69,"temp_max":266.69,"pressure":1011,"sea_level":1011,"grnd_level":982,"humidity":91,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":7},"wind":{"speed":5.64,"deg":175},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-01 12:00:00"},{"dt":1606834800,"main":{"temp":266.92,"feels_like":260.09,"temp_min":266.92,"temp_max":266.92,"pressure":1012,"sea_level":1012,"grnd_level":982,"humidity":92,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":99},"wind":{"speed":5.7,"deg":177},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-01 15:00:00"},{"dt":1606845600,"main":{"temp":269.21,"feels_like":263,"temp_min":269.21,"temp_max":269.21,"pressure":1012,"sea_level":1012,"grnd_level":983,"humidity":92,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":92},"wind":{"speed":5.14,"deg":180},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-01 18:00:00"},{"dt":1606856400,"main":{"temp":269.89,"feels_like":264.8,"temp_min":269.89,"temp_max":269.89,"pressure":1013,"sea_level":1013,"grnd_level":984,"humidity":92,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":45},"wind":{"speed":3.64,"deg":165},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-01 21:00:00"},{"dt":1606867200,"main":{"temp":267.37,"feels_like":262.78,"temp_min":267.37,"temp_max":267.37,"pressure":1016,"sea_level":1016,"grnd_level":987,"humidity":93,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":47},"wind":{"speed":2.58,"deg":160},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-02 00:00:00"},{"dt":1606878000,"main":{"temp":266.31,"feels_like":263.34,"temp_min":266.31,"temp_max":266.31,"pressure":1019,"sea_level":1019,"grnd_level":989,"humidity":92,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":70},"wind":{"speed":0.12,"deg":41},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-02 03:00:00"},{"dt":1606888800,"main":{"temp":265.97,"feels_like":261.26,"temp_min":265.97,"temp_max":265.97,"pressure":1021,"sea_level":1021,"grnd_level":992,"humidity":95,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":78},"wind":{"speed":2.61,"deg":354},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-02 06:00:00"},{"dt":1606899600,"main":{"temp":264.69,"feels_like":259.48,"temp_min":264.69,"temp_max":264.69,"pressure":1024,"sea_level":1024,"grnd_level":995,"humidity":97,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":33},"wind":{"speed":3.21,"deg":344},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-02 09:00:00"},{"dt":1606910400,"main":{"temp":264.17,"feels_like":258.54,"temp_min":264.17,"temp_max":264.17,"pressure":1027,"sea_level":1027,"grnd_level":997,"humidity":97,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":48},"wind":{"speed":3.74,"deg":330},"visibility":5006,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-02 12:00:00"},{"dt":1606921200,"main":{"temp":264.37,"feels_like":258.49,"temp_min":264.37,"temp_max":264.37,"pressure":1029,"sea_level":1029,"grnd_level":999,"humidity":97,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":85},"wind":{"speed":4.13,"deg":324},"visibility":7827,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-02 15:00:00"},{"dt":1606932000,"main":{"temp":266.71,"feels_like":261.07,"temp_min":266.71,"temp_max":266.71,"pressure":1029,"sea_level":1029,"grnd_level":999,"humidity":95,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":89},"wind":{"speed":4.03,"deg":312},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-02 18:00:00"},{"dt":1606942800,"main":{"temp":266.55,"feels_like":260.91,"temp_min":266.55,"temp_max":266.55,"pressure":1029,"sea_level":1029,"grnd_level":999,"humidity":95,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":70},"wind":{"speed":4.01,"deg":304},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-02 21:00:00"},{"dt":1606953600,"main":{"temp":264.34,"feels_like":259.07,"temp_min":264.34,"temp_max":264.34,"pressure":1028,"sea_level":1028,"grnd_level":998,"humidity":96,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":45},"wind":{"speed":3.24,"deg":308},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-03 00:00:00"},{"dt":1606964400,"main":{"temp":263.7,"feels_like":258.97,"temp_min":263.7,"temp_max":263.7,"pressure":1028,"sea_level":1028,"grnd_level":998,"humidity":96,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.4,"deg":312},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-03 03:00:00"},{"dt":1606975200,"main":{"temp":263.18,"feels_like":258.47,"temp_min":263.18,"temp_max":263.18,"pressure":1027,"sea_level":1027,"grnd_level":997,"humidity":96,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.31,"deg":290},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-03 06:00:00"},{"dt":1606986000,"main":{"temp":263.05,"feels_like":258.61,"temp_min":263.05,"temp_max":263.05,"pressure":1026,"sea_level":1026,"grnd_level":996,"humidity":96,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":1},"wind":{"speed":1.91,"deg":281},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-03 09:00:00"},{"dt":1606996800,"main":{"temp":263.16,"feels_like":258.44,"temp_min":263.16,"temp_max":263.16,"pressure":1025,"sea_level":1025,"grnd_level":995,"humidity":95,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":11},"wind":{"speed":2.31,"deg":223},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-03 12:00:00"},{"dt":1607007600,"main":{"temp":264.14,"feels_like":259.04,"temp_min":264.14,"temp_max":264.14,"pressure":1023,"sea_level":1023,"grnd_level":993,"humidity":93,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":53},"wind":{"speed":2.92,"deg":218},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-03 15:00:00"},{"dt":1607018400,"main":{"temp":268,"feels_like":262.89,"temp_min":268,"temp_max":268,"pressure":1021,"sea_level":1021,"grnd_level":992,"humidity":91,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":77},"wind":{"speed":3.37,"deg":208},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-03 18:00:00"},{"dt":1607029200,"main":{"temp":269.27,"feels_like":264.37,"temp_min":269.27,"temp_max":269.27,"pressure":1019,"sea_level":1019,"grnd_level":990,"humidity":93,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":78},"wind":{"speed":3.29,"deg":220},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2020-12-03 21:00:00"},{"dt":1607040000,"main":{"temp":267.88,"feels_like":263.07,"temp_min":267.88,"temp_max":267.88,"pressure":1019,"sea_level":1019,"grnd_level":990,"humidity":93,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":39},"wind":{"speed":2.96,"deg":231},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-04 00:00:00"},{"dt":1607050800,"main":{"temp":267.88,"feels_like":263.2,"temp_min":267.88,"temp_max":267.88,"pressure":1018,"sea_level":1018,"grnd_level":988,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.82,"deg":264},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-04 03:00:00"},{"dt":1607061600,"main":{"temp":268.35,"feels_like":264.27,"temp_min":268.35,"temp_max":268.35,"pressure":1018,"sea_level":1018,"grnd_level":989,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":2.03,"deg":283},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-04 06:00:00"},{"dt":1607072400,"main":{"temp":268.35,"feels_like":264.42,"temp_min":268.35,"temp_max":268.35,"pressure":1018,"sea_level":1018,"grnd_level":988,"humidity":95,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":0},"wind":{"speed":1.81,"deg":249},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2020-12-04 09:00:00"}]
     * city : {"id":6183235,"name":"Winnipeg","coord":{"lat":49.8844,"lon":-97.147},"country":"CA","population":632063,"timezone":-21600,"sunrise":1606658591,"sunset":1606689087}
     */

    private String cod;
    private int message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 6183235
         * name : Winnipeg
         * coord : {"lat":49.8844,"lon":-97.147}
         * country : CA
         * population : 632063
         * timezone : -21600
         * sunrise : 1606658591
         * sunset : 1606689087
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;
        private int timezone;
        private int sunrise;
        private int sunset;

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

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getTimezone() {
            return timezone;
        }

        public void setTimezone(int timezone) {
            this.timezone = timezone;
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

        public static class CoordBean {
            /**
             * lat : 49.8844
             * lon : -97.147
             */

            private double lat;
            private double lon;

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
        }
    }

    public static class ListBean {
        /**
         * dt : 1606651200
         * main : {"temp":265.5,"feels_like":257.65,"temp_min":262.87,"temp_max":265.5,"pressure":1022,"sea_level":1022,"grnd_level":995,"humidity":86,"temp_kf":2.63}
         * weather : [{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}]
         * clouds : {"all":76}
         * wind : {"speed":6.89,"deg":322}
         * visibility : 10000
         * pop : 0
         * sys : {"pod":"n"}
         * dt_txt : 2020-11-29 12:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private int visibility;
        private int pop;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public int getPop() {
            return pop;
        }

        public void setPop(int pop) {
            this.pop = pop;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 265.5
             * feels_like : 257.65
             * temp_min : 262.87
             * temp_max : 265.5
             * pressure : 1022
             * sea_level : 1022
             * grnd_level : 995
             * humidity : 86
             * temp_kf : 2.63
             */

            private double temp;
            private double feels_like;
            private double temp_min;
            private double temp_max;
            private int pressure;
            private int sea_level;
            private int grnd_level;
            private int humidity;
            private double temp_kf;

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

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public int getPressure() {
                return pressure;
            }

            public void setPressure(int pressure) {
                this.pressure = pressure;
            }

            public int getSea_level() {
                return sea_level;
            }

            public void setSea_level(int sea_level) {
                this.sea_level = sea_level;
            }

            public int getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(int grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 76
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 6.89
             * deg : 322
             */

            private double speed;
            private int deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public int getDeg() {
                return deg;
            }

            public void setDeg(int deg) {
                this.deg = deg;
            }
        }

        public static class SysBean {
            /**
             * pod : n
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
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
}
