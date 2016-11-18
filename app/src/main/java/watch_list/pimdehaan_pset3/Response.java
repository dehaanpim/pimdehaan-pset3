package watch_list.pimdehaan_pset3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pim on 18-11-2016.
 */

public class Response {


    String movieTitle;
    String movieYear;
    //private PosterEntity moviePoster;

    private List<Response> movieDataList = new ArrayList<Response>();

    public List<Response> getMovieDataList() {
        return movieDataList;
    }

    public Response(String movieTitle, String movieYear) {
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieYear() {
        return movieYear;
    }

    /*
    public PosterEntity getPoster(){
        return moviePoster;
    }

    class PosterEntity {
        private String posters;

        public void setPosters(String posters){
            this.posters = posters;
        }
    }
    */

}
