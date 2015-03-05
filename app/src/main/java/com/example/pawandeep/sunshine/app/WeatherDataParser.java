package com.example.pawandeep.sunshine.app;

/**
 * Created by pawandeep on 2/5/15.
 */
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {



    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException{

        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
        return temperatureInfo.getDouble("max");
    }


}
