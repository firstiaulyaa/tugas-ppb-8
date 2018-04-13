package com.example.aunise.aulyastudykasus8;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tanggal,waktu, salon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String sln = getIntent().getStringExtra("salon");
        String tgl = getIntent().getStringExtra("tanggal");
        String wkt = getIntent().getStringExtra("waktu");

        salon = (TextView) findViewById(R.id.tvBilling);
        tanggal = (TextView) findViewById(R.id.tvTanggal);
        waktu = (TextView) findViewById(R.id.tvWaktu);

        salon.setText("Treatment : "+sln);
        tanggal.setText("Tanggal : "+tgl);
        waktu.setText("Waktu : "+wkt);

    }

}
