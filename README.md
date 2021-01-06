# Introduction
I used Java to build a Weather Forecast Application on Android.

This project incorporates the following techniques: Fragment, ScrollView, ListView, PagerAdapter, Activity Lifecycle management, AndroidX PreferenceLibrary, SQLite database, Network Connectivity(Interaction with APIs), JSON Parser, Java Bean, etc.

Video Demo: https://youtu.be/7ocbZrPZ_3I

# Contents 

This App consists of 5 pages: Current Weather, City Management, City Search, City Delete, and Settings.

**Current Weather:** It is a fragment that is dynamically generated on ViewPager and consists of LinerLayout, LinerLayout, RecycleView, and ListView; 

<div align=center>
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104200.png">
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104205.png">
</div>

**City Management:** Add or remove cities that you want to collect. It shows the cities that are currently stored in the database (SQLite) through a ListView;

<div align=center>
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104212.png">
</div>

**City Search:** Parses the local JSON file to get the city's latitude and longitude and returns it to the current weather for API query. It fudges the query by entering city keywords via SearchView and presents the results on the corresponding ListView.

<div align=center>
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104227.png">
</div>

**City Deletion:** Use CardView and ListView together to display the city information that exists in the current database, and return the updated data set to the database to update the city list.

<div align=center>
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104241.png">
</div>

**Settings:** Android X's reference is used to set the unit system ID, which is used to query the API and convert the display results to the unit standard.

<div align=center>
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104252.png">
<img width="300" src="https://github.com/wxx0136/XWeather_V2/blob/dev_gps/demo_images/Screenshot_1607104356.png">
</div>

# Resource
- Plug-in: https://plugins.jetbrains.com/plugin/7654-gsonformat
- API: https://openweathermap.org/api/one-call-api
- Online Tool: http://www.bejson.com/jsonviewernew/
- Unit System: https://openweathermap.org/weather-data

# Tutorials:
- Animee: https://www.bilibili.com/video/BV1QE411i7oQ?p=1&spm_id_from=333.788.b_6d756c74695f70616765.1
- EDMT Dev: https://www.youtube.com/watch?v=awYSrhUZQL0&t=88s

# Note
I remove the **API_KEY** from **gradle.properties** in github for safety reason. Please contact me to get the API key or apply a free one from [openweathermap](https://openweathermap.org/)
