package vn.poly.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();

        Log.e("LOG","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LOG","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LOG","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("LOG","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LOG","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LOG","onDestroy");
    }

    private EditText edtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // cau lenh lien ket giao dien voi file chua code
        setContentView(R.layout.activity_main);
        Log.e("LOG","onCreate");


        // tham chieu Edittext thong qua id edtNumber
        edtNumber = findViewById(R.id.edtNumber);
    }


    // phuong thuc dung de set su kien click nen phai co tham so la View
    public void openNewWindows(View view){

        Log.e("onClick","OnCLick Button OK");

        String number = edtNumber.getText().toString();


        Intent intent = new Intent(MainActivity.this,SubActivity.class);
        intent.putExtra("num",number);

        startActivity(intent);

    }

}
