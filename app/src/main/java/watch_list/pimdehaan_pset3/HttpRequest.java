package watch_list.pimdehaan_pset3;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Pim on 15-11-2016.
 *
 * SOURCE: http://mobilesiri.com/json-parsing-in-android-using-android-studio/
 */
public class HttpRequest {
    public static final String MOVIE_TITLE = "Title";
    public static final String MOVIE_INFO = "MovieInfo";
    public static final String MOVIE_YEAR = "Year";
    public static final String MOVIE_RATED = "Rated";
    public static final String MOVIE_RELEASED = "Released";
    public static final String MOVIE_RUNTIME = "Runtime";
    public static final String MOVIE_GENRE = "Genre";
    public static final String MOVIE_DIRECTOR = "Director";
    public static final String MOVIE_WRITER = "Writer";
    public static final String MOVIE_ACTORS = "Actors";
    public static final String MOVIE_PLOT = "Plot";
    public static final String MOVIE_AWARDS = "Awards";
    public static final String MOVIE_TYPE = "Type";
    public static final String MOVIE_RATING = "imdbRating";


    protected static synchronized JSONObject downloadFromServer(String... params) throws JSONException {
        // initialise connection
        HttpURLConnection urlConnection = null;

        final String url1 = "http://www.omdbapi.com/?";

        // get title movie
        String title = params[0];

        // declare string result
        String result = "";

        // complete string from url
        String completeURL = url1 + title;

        URL url = null;

        try {
            url = new URL(completeURL);
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (url != null) {
            try {
                // open connection, set request method
                urlConnection = (HttpURLConnection) url.openConnection();

                urlConnection.setRequestMethod("GET");

                // get response code
                Integer responseCode = urlConnection.getResponseCode();

                // only read inputstream while valid
                if (200 <= responseCode && responseCode <= 299) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                    String line;

                    while ((line = br.readLine()) != null) {
                        result = result + line;
                    }
                } else {
                    BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getErrorStream()));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //jsonString = result.toString();
        return new JSONObject(result);
    }
}