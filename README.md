# Note
I remove the **API_KEY** from **gradle.properties** in github for safety reason. Please contact me to get the API key or apply a free one from [openweathermap](https://openweathermap.org/)

# Introduction
This is a weather forecasting app for Android. It consists of 5 pages: Current Weather, City Management, City Search, City Delete, and Settings.

Video Demo: https://youtu.be/7ocbZrPZ_3I

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

# Development Reflection
This is a highly finished application, and I have spent 80-100 hours on this project. It covers many of the Android knowledge points taught in my class and uses them in greater depth and flexibility to meet the needs of the project. During the development process, the biggest challenges came from two things: 

- Because of the free version of the API, many features were blocked by the API vendor (e.g., not supporting the use of city name lookup), so I had to spend at least half of my time to solve it in a roundabout way, which greatly increased the complexity of the project;
- The unfamiliarity with the Android API led to many times, not knowing which widget to use to implement it. I was able to use the project to work on a certain feature or to dynamically load data and control reuse that was not covered in the previous coursework. 

Fortunately, when the project was finally completed, I did have a better understanding of Android development. I had the confidence to interview for entry-level positions in Android development based on this development experience.


# Resource
- Plug-in: https://plugins.jetbrains.com/plugin/7654-gsonformat
- API: https://openweathermap.org/api/one-call-api
- Online Tool: http://www.bejson.com/jsonviewernew/
- Unit System: https://openweathermap.org/weather-data

# Tutorials:
- Animee: https://www.bilibili.com/video/BV1QE411i7oQ?p=1&spm_id_from=333.788.b_6d756c74695f70616765.1
- EDMT Dev: https://www.youtube.com/watch?v=awYSrhUZQL0&t=88s
