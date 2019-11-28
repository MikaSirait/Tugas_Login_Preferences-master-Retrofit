package androidretrofit;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.proteintracker.androidretrofit.Model.Dosen;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    DataDosenService dataDosenService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataDosenService = RetrofitClient.getRetrofitInstance().create(DataDosenService.class);
        getAllDataDosen();
    }
    private void getAllDataDosen()
    {
        Call<List<Dosen>> call = dataDosenService.getDosenAll("1");
        call.enqueue(new Callback<List<Dosen>>() {
            @Override
            public void onResponse(Call<List<Dosen>> call, Response<List<Dosen>> response) {
                for (Dosen dosen : response.body()) {
                 System.out.println("Nama : "+dosen.getNama());
                 System.out.println("Nidn : "+dosen.getNidn());

                }


            }

            @Override
            public void onFailure(Call<List<Dosen>> call, Throwable t) {
                Toast.makeText(MainActivity.this,
                        "", Toast.LENGTH_SHORT).show();
                System.out.println(t.getMessage());

            }
        });
    }
}
