package com.fikry.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Inisialisasi
    ImageView profil;
    EditText nama, nim, alamat, nomor;
    Spinner prodi;
    Button go;
    TextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mengarahkan variable dengan data berdasarkan id
        profil = (ImageView) findViewById(R.id.image);
        nama = (EditText) findViewById(R.id.etNama);
        nim = (EditText) findViewById(R.id.etNim);
        prodi = (Spinner) findViewById(R.id.spnProdi);
        alamat = (EditText) findViewById(R.id.etAlamat);
        nomor = (EditText) findViewById(R.id.etNomor);
        go = (Button) findViewById(R.id.btnGo);
        deskripsi = (TextView) findViewById(R.id.tvDeskripsi);

        //Membuat list data untuk spinner prodi
        List<String> listProdi = new ArrayList<String>();
        listProdi.add("Teknik Informatika");
        listProdi.add("Manajemen Informatika");
        listProdi.add("Teknik Komputer");

        //Membuat adapter untuk spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listProdi);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        prodi.setAdapter(adapter);

        //Membuat event click ketika button GO di klik yaitu menampilkan teks deskripsi perkenalan
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deskripsi.setText("Hai, perkenalkan nama saya "+nama.getText().toString()+ ", dengan NIM "+nim.getText().toString()
                +", program studi "+prodi.getSelectedItem().toString()+ ". Saya berasal dari "+alamat.getText().toString()
                        +". Kita bisa berkenalan lebih lanjut dengan menghubungi kontak saya "+nomor.getText().toString()
                            +". Haturnuhun...");

            }
        });
    }
}