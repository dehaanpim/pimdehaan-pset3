package watch_list.pimdehaan_pset3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pim on 15-11-2016.
 */

public class CustomAdapter extends BaseAdapter{
    private List<Response> movieDataList;
    private Context context;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, int movieDataList) {
        this.context = context;
        this.movieDataList = movieDataList;
    }

    @Override
    public int getCount() {
        return movieDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return movieDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);

        Response item = (Response) getItem(position);

        //ImageView imagePoster = (ImageView) rowView.findViewById(R.id.imagePoster);
        TextView textView1 = (TextView) rowView.findViewById(R.id.textView1);
        TextView textView2 = (TextView) rowView.findViewById(R.id.textView2);

        textView1.setText(item.getMovieTitle());
        textView2.setText(item.getMovieYear());


        return rowView;
    }
}



    /*
    private LayoutInflater lInflater;
    private List<ItemObject> listStorage;
    public CustomAdapter(Context context, List<ItemObject> customizedListView) {
        lInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }



public class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, int values) {
        super(context, R.layout.row_layout, values);
    }

        @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout, parent, false);

        String movieRow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(movieRow);

        return theView;
    }
    */

