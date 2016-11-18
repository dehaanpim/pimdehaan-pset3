package watch_list.pimdehaan_pset3;

import android.content.Context;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Pim on 18-11-2016.
 */

public class AsyncTask {
    Context context;
    MainActivity activity;
    Gson gson;
    CustomAdapter adapter;
    ListView movieList;

    // constructor
    public AsyncTask(MainActivity activity){
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
            ArrayList<Response> moviedata = new ArrayList<>();
            try {
                JSONObject respObj = new JSONObject(result);

                for (int i = 0; i < respObj.length(); i++){
                    gson = new Gson();
                    byte[] responseBody = new byte[0];
                    String responsestr = new String(responseBody);
                    
                    gson.fromJson(respObj,MainActivity.class);
                    JSONObject movie = respObj.getJSONObject(String.valueOf(i));
                    String movieTitle = movie.getString("title");
                    String movieYear = movie.getString("year");
                    moviedata.add(new Response(movieTitle, movieYear));
                }
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
