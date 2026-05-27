package edu.uph.m24si1.tugaskedua;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNilaiA, etNilaiB;
    Button btnTambah, btnKali, btnBagi;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilaiA  = findViewById(R.id.etNilaiA);
        etNilaiB  = findViewById(R.id.etNilaiB);
        btnTambah = findViewById(R.id.btnTambah);
        btnKali   = findViewById(R.id.btnKali);
        btnBagi   = findViewById(R.id.btnBagi);
        tvHasil   = findViewById(R.id.tvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etNilaiA.getText().toString());
                double b = Double.parseDouble(etNilaiB.getText().toString());
                double hasil = a + b;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etNilaiA.getText().toString());
                double b = Double.parseDouble(etNilaiB.getText().toString());
                double hasil = a * b;
                tvHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(etNilaiA.getText().toString());
                double b = Double.parseDouble(etNilaiB.getText().toString());
                if (b == 0) {
                    Toast.makeText(MainActivity.this, "Tidak bisa bagi dengan 0!", Toast.LENGTH_SHORT).show();
                } else {
                    double hasil = a / b;
                    tvHasil.setText(String.valueOf(hasil));
                }
            }
        });
    }
}
