package androidretrofit.Model;

import com.google.gson.annotations.SerializedName;

public class Dosen {
    @SerializedName("id")
    private int id;
    @SerializedName("nama")
    private String Nama;
    @SerializedName("nidn")
    private String Nidn;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("email")
    private String email;
    @SerializedName("gelar")
    private String gelar;
    @SerializedName("foto")
    private String foto;

    public String getNama(){
        return Nama;
    }

    public int getId(){
        return id;
    }

    public String getNidn(){
        return Nidn;
    }
}
