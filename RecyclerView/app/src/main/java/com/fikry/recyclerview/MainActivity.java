package com.fikry.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> logoklub = new ArrayList<>();
    private ArrayList<String> namaklub = new ArrayList<>();
    private ArrayList<String> tanggalklub = new ArrayList<>();
    private ArrayList<String> julukanklub = new ArrayList<>();
    private ArrayList<String> daerahklub = new ArrayList<>();
    private ArrayList<String> deskripsiklub = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet(); //Menjalankan method
    }
    //Method untuk memproses RecyclerView
    protected  void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.rcvKlub); //Deklarasi object yang akan digunakan
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(logoklub, namaklub, tanggalklub, julukanklub, daerahklub, deskripsiklub, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        //Arema FC
        namaklub.add("Arema FC");
        tanggalklub.add("11 Agustus 1987");
        logoklub.add("https://i2.wp.com/mediansport.com/wp-content/uploads/2020/01/Logo_Arema_FC.png?w=403&ssl=1");
        julukanklub.add("Singo Edan");
        daerahklub.add("Malang");
        deskripsiklub.add("Arema merupakan identitas, simbol dan karakter bagi masyarakat Malang. Sehingga kelahiran tim sepak bola Arema adalah sebuah keniscayaan.");

        //Bali United
        namaklub.add("Bali United");
        tanggalklub.add("15 Februari 2015");
        logoklub.add("https://i0.wp.com/mediansport.com/wp-content/uploads/2020/01/Bali_United_logo.png?w=400&ssl=1");
        julukanklub.add("Serdadu Tridatu");
        daerahklub.add("Bali");
        deskripsiklub.add("Bali United dulunya bernama Persisam yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama.");

        //Borneo FC
        namaklub.add("Borneo FC");
        tanggalklub.add("7 Maret 2014");
        logoklub.add("https://i0.wp.com/mediansport.com/wp-content/uploads/2020/01/Borneo_New_Logo.png?resize=180%2C233&ssl=1");
        julukanklub.add("Pesut Etam");
        daerahklub.add("Samarinda");
        deskripsiklub.add("Awal berdirinya klub ini setelah mengakuisisi klub Perseba Super Bangkalan pada 7 Maret 2014, menggantikan Persisam Samarinda.");

        //Persebaya Surabaya
        namaklub.add("Persebaya Surabaya");
        tanggalklub.add("18 Juni 1927");
        logoklub.add("https://i2.wp.com/mediansport.com/wp-content/uploads/2020/01/Persebaya_logo.svg_.png?resize=348%2C420&ssl=1");
        julukanklub.add("Bajul Ijo");
        daerahklub.add("Surabaya");
        deskripsiklub.add("Persebaya didirikan oleh M. Pamudji dengan nama awalnya Soerabajasche Indonesische Voetbal Bond (SIVB).");

        //Persib Bandung
        namaklub.add("Persib Bandung");
        tanggalklub.add("14 Maret 1933");
        logoklub.add("https://i1.wp.com/mediansport.com/wp-content/uploads/2020/01/Persib_logo.svg_.png?w=403&ssl=1");
        julukanklub.add("Maung Bandung");
        daerahklub.add("Bandung");
        deskripsiklub.add("Lahir berdasarkan hasil fusi dua perkumpulan yakni Persatuan Sepak bola Indonesia Bandung (PSIB) dan National Voetball Bond (NVB).");

        //Persija Jakarta
        namaklub.add("Persija Jakarta");
        tanggalklub.add("28 November 1928");
        logoklub.add("https://i0.wp.com/mediansport.com/wp-content/uploads/2020/01/Persija_Jakarta_logo.png?w=400&ssl=1");
        julukanklub.add("Macan Kemayoran");
        daerahklub.add("Jakarta");
        deskripsiklub.add("Pada zaman Hindia Belanda, nama awal Persija adalah VIJ (Voetbalbond Indonesische Jacatra), kemudian berganti nama menjadi Persija.");

        //Persipura Jayapura
        namaklub.add("Persipura Jayapura");
        tanggalklub.add("1 Mei 1963");
        logoklub.add("https://i0.wp.com/mediansport.com/wp-content/uploads/2020/01/Persipura_logo.svg_.png?resize=373%2C420&ssl=1");
        julukanklub.add("Mutiara Hitam");
        daerahklub.add("Jayapura");
        deskripsiklub.add("Persatuan Sepak bola Indonesia Jayapura (disingkat Persipura Jayapura) bermarkas di Jayapura, Papua.");

        //PSM Makasar
        namaklub.add("PSM Makasar");
        tanggalklub.add("2 November 1915");
        logoklub.add("https://i2.wp.com/mediansport.com/wp-content/uploads/2020/01/PSM_Makassar_logo.svg_.png?resize=369%2C420&ssl=1");
        julukanklub.add("Juku Eja");
        daerahklub.add("Makasar");
        deskripsiklub.add("Berdirinya sebuah perkumpulan sepak bola bernama Makassar Voetbal Bond (MVB) yang di kemudian tercatat sebagai embrio PSM.");

        //Persiraja Banda Aceh
        namaklub.add("Persiraja Banda Aceh");
        tanggalklub.add("28 Juli 1957");
        logoklub.add("https://i0.wp.com/mediansport.com/wp-content/uploads/2019/10/Logo-Persiraja-Banda-Aceh.png?w=480&ssl=1");
        julukanklub.add("Laskar Rencong");
        daerahklub.add("Banda Aceh");
        deskripsiklub.add("Persiraja Banda Aceh didirikan pada tanggal 28 Juli 1957 dan telah mengikuti berbagai kompetisi sepak bola tanah air.");

        prosesRecyclerViewAdapter();
    }
}