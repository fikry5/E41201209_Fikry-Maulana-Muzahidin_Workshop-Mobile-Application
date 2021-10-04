package com.fikry.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements TextWatcher {

    AutoCompleteTextView auto1; //jenis sapi
    AutoCompleteTextView auto2; //asal daerah

    //Membuat list array untuk jenis
    String[] jenis = new String[]{
            "Brahman", "Bali", "Peranakan Ongole", "Madura", "Limosin", "Simental", "Pegon"
    };

    //Membuat list array untuk asal daerah
    String[] daerah = new String[]{
            "Majalengka", "Depok", "Cirebon", "Sumedang", "Kuningan", "Indramayu", "Tasikmalaya",
            "Bogor", "Cimahi", "Garut", "Sukabumi", "Bekasi", "Purwakarta", "Ciamis", "Karawang",
            "Subang", "Bandung", "Banjar", "Pangandaran"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Memanggil id auto complete text view yang ada pada layout
        auto1 = (AutoCompleteTextView) findViewById(R.id.actJenis);
        auto2 = (AutoCompleteTextView) findViewById(R.id.actAsal);

        //Membuat adapter untuk string ACTV jenis (auto1)
        auto1.addTextChangedListener(this);
        auto1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, jenis));

        //Membuat adapter untuk string ACTV daerah (auto2)
        auto2.addTextChangedListener(this);
        auto2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, daerah));

        //Membuat action mengganti kata "submit" yang ada di dalam button  menjadi kata "Success" ketika diklik
        Button btnSubmit;
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnSubmit.setText("Success");
            }
        });

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}