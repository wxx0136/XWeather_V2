# Note
You can't run this project without the **gradle.properties** file which I remove from github for the API key safety reason. Please contact me to get that file and put it under the root fold of this project.

# Introduction
This is a weather forecasting app for Android. It consists of 5 pages: Current Weather, City Management, City Search, City Delete, and Settings.
**Current Weather:** It is a fragment that is dynamically generated on ViewPager and consists of LinerLayout, LinerLayout, RecycleView, and ListView; 
**City Management:** Add or remove cities that you want to collect. It shows the cities that are currently stored in the database (SQLite) through a ListView;
**City Search:** Parses the local JSON file to get the city's latitude and longitude and returns it to the current weather for API query. It fudges the query by entering city keywords via SearchView and presents the results on the corresponding ListView.
**City Deletion:** Use CardView and ListView together to display the city information that exists in the current database, and return the updated data set to the database to update the city list.
**Settings:** Android X's reference is used to set the unit system ID, which is used to query the API and convert the display results to the unit standard.

# Resource
- Plug-in: https://plugins.jetbrains.com/plugin/7654-gsonformat
- API: https://openweathermap.org/api/one-call-api
- Online Tool: http://www.bejson.com/jsonviewernew/
- Unit System: https://openweathermap.org/weather-data

# Tutorials:
- Animee: https://www.bilibili.com/video/BV1QE411i7oQ?p=1&spm_id_from=333.788.b_6d756c74695f70616765.1
- EDMT Dev: https://www.youtube.com/watch?v=awYSrhUZQL0&t=88s
