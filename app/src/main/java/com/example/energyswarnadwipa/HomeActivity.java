package com.example.energyswarnadwipa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void monitor1 (View view){
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
//public class HomeActivity extends AppCompatActivity {
//    //deklarasi tombol
//    private Button tegangan;
//
//    @Override
//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//
//        //inisial tombol
//        tegangan = (Button) findViewById(R.id.tegangan_btn);
//        //function tombol
//        tegangan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //inisialisasi hidden button
//                //tegangan1.setVisibility(View.INVISIBLE);
//                Intent i = new Intent(HomeActivity.this, MainActivity.class);
//                startActivity(i);
//            }
//        });
//
//    }
//}
//    Button explicitintent;
//    //Button implicitintent;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//        explicitintent = (Button) findViewById(R.id.invisible);
//        explicitintent.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View view) {
//              Intent i = new Intent(HomeActivity.this, MainActivity.class);
//              startActivity(i);
//              }
//        });
//    }
//}
//            }
//        }) this);
//    }

//    @Override
//    public void setExplicitintent(View v){
//        switch (v.getId()){
//            case R.id.explicitintent:
//                Intent explicit = new Intent(HomeActivity.this, MainActivity.class);
//                startActivity(explicit);
//                break;
//            default:
//                break;
//        }
//    }
//}