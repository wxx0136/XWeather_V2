package com.example.xweather_v2.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OneCallBean {


    /**
     * lat : 33.44
     * lon : -94.04
     * timezone : America/Chicago
     * timezone_offset : -21600
     * current : {"dt":1606643677,"sunrise":1606654865,"sunset":1606691322,"temp":279.56,"feels_like":275.8,"pressure":1017,"humidity":87,"dew_point":277.56,"uvi":0,"clouds":90,"visibility":10000,"wind_speed":3.6,"wind_deg":10,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}]}
     * minutely : [{"dt":1606643700,"precipitation":0},{"dt":1606643760,"precipitation":0},{"dt":1606643820,"precipitation":0},{"dt":1606643880,"precipitation":0},{"dt":1606643940,"precipitation":0},{"dt":1606644000,"precipitation":0},{"dt":1606644060,"precipitation":0},{"dt":1606644120,"precipitation":0},{"dt":1606644180,"precipitation":0},{"dt":1606644240,"precipitation":0},{"dt":1606644300,"precipitation":0},{"dt":1606644360,"precipitation":0},{"dt":1606644420,"precipitation":0},{"dt":1606644480,"precipitation":0},{"dt":1606644540,"precipitation":0},{"dt":1606644600,"precipitation":0},{"dt":1606644660,"precipitation":0},{"dt":1606644720,"precipitation":0},{"dt":1606644780,"precipitation":0},{"dt":1606644840,"precipitation":0},{"dt":1606644900,"precipitation":0},{"dt":1606644960,"precipitation":0},{"dt":1606645020,"precipitation":0},{"dt":1606645080,"precipitation":0},{"dt":1606645140,"precipitation":0},{"dt":1606645200,"precipitation":0},{"dt":1606645260,"precipitation":0},{"dt":1606645320,"precipitation":0},{"dt":1606645380,"precipitation":0},{"dt":1606645440,"precipitation":0},{"dt":1606645500,"precipitation":0},{"dt":1606645560,"precipitation":0},{"dt":1606645620,"precipitation":0},{"dt":1606645680,"precipitation":0},{"dt":1606645740,"precipitation":0},{"dt":1606645800,"precipitation":0},{"dt":1606645860,"precipitation":0},{"dt":1606645920,"precipitation":0},{"dt":1606645980,"precipitation":0},{"dt":1606646040,"precipitation":0},{"dt":1606646100,"precipitation":0},{"dt":1606646160,"precipitation":0},{"dt":1606646220,"precipitation":0},{"dt":1606646280,"precipitation":0},{"dt":1606646340,"precipitation":0},{"dt":1606646400,"precipitation":0},{"dt":1606646460,"precipitation":0},{"dt":1606646520,"precipitation":0},{"dt":1606646580,"precipitation":0},{"dt":1606646640,"precipitation":0},{"dt":1606646700,"precipitation":0},{"dt":1606646760,"precipitation":0},{"dt":1606646820,"precipitation":0},{"dt":1606646880,"precipitation":0},{"dt":1606646940,"precipitation":0},{"dt":1606647000,"precipitation":0},{"dt":1606647060,"precipitation":0},{"dt":1606647120,"precipitation":0},{"dt":1606647180,"precipitation":0},{"dt":1606647240,"precipitation":0},{"dt":1606647300,"precipitation":0}]
     * hourly : [{"dt":1606640400,"temp":279.56,"feels_like":276.56,"pressure":1017,"humidity":87,"dew_point":277.56,"uvi":0,"clouds":90,"visibility":10000,"wind_speed":2.51,"wind_deg":17,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"pop":0.93,"rain":{"1h":0.61}},{"dt":1606644000,"temp":279.87,"feels_like":275.85,"pressure":1017,"humidity":87,"dew_point":277.86,"uvi":0,"clouds":95,"visibility":10000,"wind_speed":4.06,"wind_deg":25,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0.77},{"dt":1606647600,"temp":279.9,"feels_like":276.13,"pressure":1017,"humidity":88,"dew_point":278.06,"uvi":0,"clouds":98,"visibility":10000,"wind_speed":3.75,"wind_deg":13,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0.8},{"dt":1606651200,"temp":279.71,"feels_like":276.63,"pressure":1017,"humidity":91,"dew_point":278.35,"uvi":0,"clouds":99,"visibility":6979,"wind_speed":2.85,"wind_deg":25,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0.8},{"dt":1606654800,"temp":279.43,"feels_like":275.57,"pressure":1017,"humidity":94,"dew_point":278.54,"uvi":0,"clouds":100,"visibility":8869,"wind_speed":4.02,"wind_deg":34,"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10n"}],"pop":1,"rain":{"1h":4.44}},{"dt":1606658400,"temp":279.58,"feels_like":276.7,"pressure":1018,"humidity":94,"dew_point":278.83,"uvi":0.14,"clouds":100,"visibility":5066,"wind_speed":2.66,"wind_deg":353,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"pop":1,"rain":{"1h":1.94}},{"dt":1606662000,"temp":279.6,"feels_like":276.11,"pressure":1018,"humidity":95,"dew_point":278.87,"uvi":0.59,"clouds":100,"visibility":10000,"wind_speed":3.58,"wind_deg":45,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"pop":1,"rain":{"1h":1.17}},{"dt":1606665600,"temp":280.02,"feels_like":277.14,"pressure":1018,"humidity":94,"dew_point":279.19,"uvi":0.7,"clouds":100,"visibility":10000,"wind_speed":2.79,"wind_deg":355,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"pop":1,"rain":{"1h":0.88}},{"dt":1606669200,"temp":280.56,"feels_like":278.23,"pressure":1018,"humidity":93,"dew_point":279.59,"uvi":1.11,"clouds":100,"visibility":10000,"wind_speed":2.13,"wind_deg":15,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"pop":1,"rain":{"1h":0.32}},{"dt":1606672800,"temp":281.91,"feels_like":279.53,"pressure":1018,"humidity":88,"dew_point":280.2,"uvi":1.33,"clouds":99,"visibility":10000,"wind_speed":2.37,"wind_deg":346,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0.8},{"dt":1606676400,"temp":282.1,"feels_like":279.33,"pressure":1017,"humidity":89,"dew_point":280.45,"uvi":0.94,"clouds":100,"visibility":10000,"wind_speed":3.04,"wind_deg":338,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0.06},{"dt":1606680000,"temp":282.26,"feels_like":278.89,"pressure":1017,"humidity":89,"dew_point":280.71,"uvi":0.7,"clouds":100,"visibility":10000,"wind_speed":3.94,"wind_deg":321,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0.13},{"dt":1606683600,"temp":281.98,"feels_like":277.87,"pressure":1017,"humidity":89,"dew_point":280.41,"uvi":0.4,"clouds":100,"visibility":10000,"wind_speed":4.91,"wind_deg":331,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"pop":0.24,"rain":{"1h":0.11}},{"dt":1606687200,"temp":280.88,"feels_like":275.59,"pressure":1018,"humidity":85,"dew_point":278.58,"uvi":0.17,"clouds":100,"visibility":10000,"wind_speed":6.06,"wind_deg":338,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0.16},{"dt":1606690800,"temp":280.63,"feels_like":276.01,"pressure":1018,"humidity":85,"dew_point":278.33,"uvi":0,"clouds":100,"visibility":10000,"wind_speed":5.03,"wind_deg":345,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"pop":0.1},{"dt":1606694400,"temp":280.28,"feels_like":275.89,"pressure":1019,"humidity":84,"dew_point":277.79,"uvi":0,"clouds":97,"visibility":10000,"wind_speed":4.55,"wind_deg":346,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0.1},{"dt":1606698000,"temp":280.31,"feels_like":276.87,"pressure":1019,"humidity":85,"dew_point":278.05,"uvi":0,"clouds":90,"visibility":10000,"wind_speed":3.25,"wind_deg":332,"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"pop":0},{"dt":1606701600,"temp":279.64,"feels_like":276.65,"pressure":1019,"humidity":88,"dew_point":277.86,"uvi":0,"clouds":76,"visibility":10000,"wind_speed":2.56,"wind_deg":297,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"pop":0},{"dt":1606705200,"temp":279.2,"feels_like":275.42,"pressure":1019,"humidity":90,"dew_point":277.72,"uvi":0,"clouds":54,"visibility":10000,"wind_speed":3.66,"wind_deg":287,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"pop":0},{"dt":1606708800,"temp":280.15,"feels_like":275.53,"pressure":1020,"humidity":88,"dew_point":278.32,"uvi":0,"clouds":47,"visibility":10000,"wind_speed":5.04,"wind_deg":313,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0},{"dt":1606712400,"temp":279.88,"feels_like":274.28,"pressure":1021,"humidity":81,"dew_point":276.93,"uvi":0,"clouds":37,"visibility":10000,"wind_speed":6.04,"wind_deg":331,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0},{"dt":1606716000,"temp":278.83,"feels_like":272.72,"pressure":1021,"humidity":79,"dew_point":275.52,"uvi":0,"clouds":31,"visibility":10000,"wind_speed":6.42,"wind_deg":334,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"pop":0},{"dt":1606719600,"temp":277.83,"feels_like":271.4,"pressure":1022,"humidity":75,"dew_point":273.91,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":6.49,"wind_deg":337,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606723200,"temp":276.89,"feels_like":270.5,"pressure":1022,"humidity":75,"dew_point":272.57,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":6.24,"wind_deg":336,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606726800,"temp":276.09,"feels_like":270.09,"pressure":1023,"humidity":79,"dew_point":271.8,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":5.67,"wind_deg":335,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606730400,"temp":275.4,"feels_like":269.4,"pressure":1024,"humidity":81,"dew_point":270.8,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":5.6,"wind_deg":333,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606734000,"temp":274.56,"feels_like":268.65,"pressure":1025,"humidity":84,"dew_point":269.69,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":5.41,"wind_deg":332,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606737600,"temp":273.91,"feels_like":268.29,"pressure":1025,"humidity":87,"dew_point":269,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":4.96,"wind_deg":328,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606741200,"temp":273.3,"feels_like":267.96,"pressure":1026,"humidity":90,"dew_point":268.5,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":4.53,"wind_deg":323,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606744800,"temp":273.95,"feels_like":268.37,"pressure":1027,"humidity":85,"dew_point":268.04,"uvi":0.17,"clouds":0,"visibility":10000,"wind_speed":4.85,"wind_deg":324,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606748400,"temp":275.4,"feels_like":268.96,"pressure":1027,"humidity":75,"dew_point":266.88,"uvi":0.68,"clouds":0,"visibility":10000,"wind_speed":6.03,"wind_deg":337,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606752000,"temp":276.85,"feels_like":270.74,"pressure":1028,"humidity":68,"dew_point":266.83,"uvi":1.51,"clouds":0,"visibility":10000,"wind_speed":5.57,"wind_deg":338,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606755600,"temp":278.41,"feels_like":272.49,"pressure":1027,"humidity":61,"dew_point":266.86,"uvi":2.38,"clouds":0,"visibility":10000,"wind_speed":5.3,"wind_deg":334,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606759200,"temp":279.78,"feels_like":274.02,"pressure":1026,"humidity":55,"dew_point":266.98,"uvi":2.86,"clouds":0,"visibility":10000,"wind_speed":5.05,"wind_deg":329,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606762800,"temp":280.9,"feels_like":275.06,"pressure":1026,"humidity":51,"dew_point":267.15,"uvi":2.74,"clouds":0,"visibility":10000,"wind_speed":5.16,"wind_deg":324,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606766400,"temp":281.52,"feels_like":275.62,"pressure":1025,"humidity":49,"dew_point":267.44,"uvi":2.06,"clouds":0,"visibility":10000,"wind_speed":5.25,"wind_deg":319,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606770000,"temp":281.55,"feels_like":275.8,"pressure":1024,"humidity":50,"dew_point":267.89,"uvi":1.16,"clouds":0,"visibility":10000,"wind_speed":5.1,"wind_deg":317,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606773600,"temp":280.88,"feels_like":276.09,"pressure":1024,"humidity":53,"dew_point":269.15,"uvi":0.42,"clouds":0,"visibility":10000,"wind_speed":3.76,"wind_deg":317,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606777200,"temp":278.2,"feels_like":273.95,"pressure":1025,"humidity":64,"dew_point":268.6,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.99,"wind_deg":308,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"pop":0},{"dt":1606780800,"temp":276.66,"feels_like":272.34,"pressure":1025,"humidity":70,"dew_point":267.69,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":3.05,"wind_deg":297,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606784400,"temp":275.91,"feels_like":271.65,"pressure":1025,"humidity":74,"dew_point":267.71,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.97,"wind_deg":296,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606788000,"temp":275.29,"feels_like":271.07,"pressure":1025,"humidity":78,"dew_point":268.02,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.93,"wind_deg":293,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606791600,"temp":274.8,"feels_like":270.78,"pressure":1025,"humidity":80,"dew_point":268.09,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.62,"wind_deg":297,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606795200,"temp":274.45,"feels_like":270.82,"pressure":1025,"humidity":82,"dew_point":267.77,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.07,"wind_deg":297,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606798800,"temp":274.19,"feels_like":270.75,"pressure":1025,"humidity":83,"dew_point":267.37,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":1.78,"wind_deg":284,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606802400,"temp":274.05,"feels_like":270.36,"pressure":1025,"humidity":83,"dew_point":267.09,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.11,"wind_deg":255,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606806000,"temp":273.71,"feels_like":269.74,"pressure":1024,"humidity":85,"dew_point":266.86,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.5,"wind_deg":252,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0},{"dt":1606809600,"temp":273.29,"feels_like":269.63,"pressure":1024,"humidity":87,"dew_point":266.55,"uvi":0,"clouds":0,"visibility":10000,"wind_speed":2.04,"wind_deg":246,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"pop":0}]
     * daily : [{"dt":1606672800,"sunrise":1606654865,"sunset":1606691322,"temp":{"day":281.91,"min":279.2,"max":282.73,"night":279.88,"eve":280.28,"morn":279.71},"feels_like":{"day":279.53,"night":274.28,"eve":275.89,"morn":276.63},"pressure":1018,"humidity":88,"dew_point":280.2,"wind_speed":2.37,"wind_deg":346,"weather":[{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10d"}],"clouds":99,"pop":1,"rain":10.03,"uvi":1.33},{"dt":1606759200,"sunrise":1606741317,"sunset":1606777713,"temp":{"day":279.78,"min":273.3,"max":281.55,"night":274.19,"eve":276.66,"morn":273.91},"feels_like":{"day":274.02,"night":270.75,"eve":272.34,"morn":268.29},"pressure":1026,"humidity":55,"dew_point":266.98,"wind_speed":5.05,"wind_deg":329,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":2.86},{"dt":1606845600,"sunrise":1606827768,"sunset":1606864107,"temp":{"day":283.5,"min":272.36,"max":285.03,"night":277.5,"eve":279.33,"morn":272.47},"feels_like":{"day":278.29,"night":273.35,"eve":274.96,"morn":268.84},"pressure":1021,"humidity":45,"dew_point":269,"wind_speed":4.39,"wind_deg":212,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":2.76},{"dt":1606932000,"sunrise":1606914219,"sunset":1606950502,"temp":{"day":284.83,"min":276.77,"max":285.39,"night":278.09,"eve":281.91,"morn":276.8},"feels_like":{"day":283.34,"night":273.63,"eve":277.72,"morn":274.1},"pressure":1019,"humidity":72,"dew_point":280.13,"wind_speed":1.06,"wind_deg":312,"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":64,"pop":0.01,"uvi":2.72},{"dt":1607018400,"sunrise":1607000669,"sunset":1607036899,"temp":{"day":280.99,"min":274.14,"max":281.42,"night":274.91,"eve":276.96,"morn":274.14},"feels_like":{"day":276.02,"night":270.65,"eve":272.62,"morn":269.83},"pressure":1024,"humidity":56,"dew_point":271.99,"wind_speed":4.19,"wind_deg":306,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":3},{"dt":1607104800,"sunrise":1607087118,"sunset":1607123298,"temp":{"day":280.77,"min":271.79,"max":281.77,"night":275.45,"eve":276.94,"morn":271.79},"feels_like":{"day":275.9,"night":271.54,"eve":272.48,"morn":268},"pressure":1024,"humidity":54,"dew_point":269.55,"wind_speed":3.9,"wind_deg":297,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":3},{"dt":1607191200,"sunrise":1607173566,"sunset":1607209699,"temp":{"day":283.93,"min":273.44,"max":285.13,"night":277.92,"eve":279.78,"morn":273.44},"feels_like":{"day":279,"night":273.76,"eve":275.47,"morn":269.45},"pressure":1021,"humidity":45,"dew_point":271.06,"wind_speed":4.07,"wind_deg":290,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":3},{"dt":1607277600,"sunrise":1607260014,"sunset":1607296101,"temp":{"day":286.49,"min":275.7,"max":288.67,"night":282.87,"eve":282.87,"morn":275.7},"feels_like":{"day":283.11,"night":279.89,"eve":279.89,"morn":272.05},"pressure":1021,"humidity":50,"dew_point":276.38,"wind_speed":2.72,"wind_deg":265,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":0,"pop":0,"uvi":3}]
     */

    private double lat;
    private double lon;
    private String timezone;
    private int timezone_offset;
    private CurrentBean current;
    private List<MinutelyBean> minutely;
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

    public List<MinutelyBean> getMinutely() {
        return minutely;
    }

    public void setMinutely(List<MinutelyBean> minutely) {
        this.minutely = minutely;
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
         * dt : 1606643677
         * sunrise : 1606654865
         * sunset : 1606691322
         * temp : 279.56
         * feels_like : 275.8
         * pressure : 1017
         * humidity : 87
         * dew_point : 277.56
         * uvi : 0
         * clouds : 90
         * visibility : 10000
         * wind_speed : 3.6
         * wind_deg : 10
         * weather : [{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}]
         */

        private int dt;
        private int sunrise;
        private int sunset;
        private double temp;
        private double feels_like;
        private int pressure;
        private int humidity;
        private double dew_point;
        private double uvi;
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

        public double getUvi() {
            return uvi;
        }

        public void setUvi(double uvi) {
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
             * id : 804
             * main : Clouds
             * description : overcast clouds
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

    public static class MinutelyBean {
        /**
         * dt : 1606643700
         * precipitation : 0
         */

        private int dt;
        private double precipitation;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public double getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(double precipitation) {
            this.precipitation = precipitation;
        }
    }

    public static class HourlyBean {
        /**
         * dt : 1606640400
         * temp : 279.56
         * feels_like : 276.56
         * pressure : 1017
         * humidity : 87
         * dew_point : 277.56
         * uvi : 0
         * clouds : 90
         * visibility : 10000
         * wind_speed : 2.51
         * wind_deg : 17
         * weather : [{"id":500,"main":"Rain","description":"light rain","icon":"10n"}]
         * pop : 0.93
         * rain : {"1h":0.61}
         */

        private int dt;
        private double temp;
        private double feels_like;
        private int pressure;
        private int humidity;
        private double dew_point;
        private double uvi;
        private int clouds;
        private int visibility;
        private double wind_speed;
        private int wind_deg;
        private double pop;
        private RainBean rain;
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

        public double getUvi() {
            return uvi;
        }

        public void setUvi(double uvi) {
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

        public double getPop() {
            return pop;
        }

        public void setPop(double pop) {
            this.pop = pop;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public List<WeatherBeanX> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBeanX> weather) {
            this.weather = weather;
        }

        public static class RainBean {
            /**
             * 1h : 0.61
             */

            @SerializedName("1h")
            private double _$1h;

            public double get_$1h() {
                return _$1h;
            }

            public void set_$1h(double _$1h) {
                this._$1h = _$1h;
            }
        }

        public static class WeatherBeanX {
            /**
             * id : 500
             * main : Rain
             * description : light rain
             * icon : 10n
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
         * dt : 1606672800
         * sunrise : 1606654865
         * sunset : 1606691322
         * temp : {"day":281.91,"min":279.2,"max":282.73,"night":279.88,"eve":280.28,"morn":279.71}
         * feels_like : {"day":279.53,"night":274.28,"eve":275.89,"morn":276.63}
         * pressure : 1018
         * humidity : 88
         * dew_point : 280.2
         * wind_speed : 2.37
         * wind_deg : 346
         * weather : [{"id":502,"main":"Rain","description":"heavy intensity rain","icon":"10d"}]
         * clouds : 99
         * pop : 1
         * rain : 10.03
         * uvi : 1.33
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
        private double rain;
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

        public double getRain() {
            return rain;
        }

        public void setRain(double rain) {
            this.rain = rain;
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
             * day : 281.91
             * min : 279.2
             * max : 282.73
             * night : 279.88
             * eve : 280.28
             * morn : 279.71
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
             * day : 279.53
             * night : 274.28
             * eve : 275.89
             * morn : 276.63
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
             * id : 502
             * main : Rain
             * description : heavy intensity rain
             * icon : 10d
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
