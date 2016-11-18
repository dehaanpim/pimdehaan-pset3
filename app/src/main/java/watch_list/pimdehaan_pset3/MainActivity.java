package watch_list.pimdehaan_pset3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MovieData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartSearching(View view) {
        Intent StartSearchingIntent = new Intent(this,
                SearchScreen.class);
        final int result = 1;
        startActivity(StartSearchingIntent);
    }

    public void setData(ArrayList<MovieData> data) {
        this.data = data;
    }
}
