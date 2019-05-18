package vn.poly.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {



    private TextView tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tvTitle = findViewById(R.id.tvTitle);


        String num = getIntent().getStringExtra("num");


        tvTitle.setText(num);




    }
}
