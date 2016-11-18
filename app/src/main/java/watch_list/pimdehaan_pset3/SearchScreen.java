package watch_list.pimdehaan_pset3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Pim on 15-11-2016.
 */

public class SearchScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.search_screen);
    }

    ListAdapter theAdapter = new CustomAdapter(this, R.layout.row_layout);


    /*

    Context context;
    MainActivity activity;

    // constructor
    public SearchScreen (MainActivity activity){
        this.activity = activity;
        this.context = this.activity.getApplicationContext();
    }

    //  pre execute
    protected void onPreExecute(){
        Toast.makeText(context, "Getting data from server", Toast.LENGTH_SHORT).show();
    }

    // do in background
    protected JSONObject doInBackground(String... params) throws JSONException {
        return HttpRequest.downloadFromServer(params);
    }

    // post execute
    protected void onPostExecute(String result){
        //super.onPostExecute(result);

        if (result.length() == 0){
            Toast.makeText(context, "No movie was found", Toast.LENGTH_SHORT).show();
        }
        else {
            ArrayList<MovieData> moviedata = new ArrayList<>();
            try {
                JSONObject respObj = new JSONObject(result);

                for (int i = 0; i < respObj.length(); i++){
                    JSONObject movie = respObj.getJSONObject(String.valueOf(i));
                    String movieTitle = movie.getString("title");
                    String movieYear = movie.getString("year");
                    moviedata.add(new MovieData(movieTitle, movieYear));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.activity.setData(moviedata);
        }
    }

*/