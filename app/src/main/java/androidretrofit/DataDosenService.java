package androidretrofit;

/*retrofit interface to get data
/*
 */

import com.proteintracker.androidretrofit.Model.Dosen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DataDosenService {
    @GET("/api/progmob/dosen/{nim_progmob}")
    Call<List<Dosen>> getDosenAll(@Path("nim_progmob") String nimProgmob);
}
