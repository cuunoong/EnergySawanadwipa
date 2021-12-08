package com.example.energyswarnadwipa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    //inisialisasi textview nilai
    private TextView pointk ;
    private TextView pointk1 ;
    private TextView pointacs ;
    private TextView nilaizmpt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //baca komponen nilai(textview)
        pointk = (TextView)findViewById(R.id.pointk) ;
        pointk1 = (TextView)findViewById(R.id.pointk1);
        pointacs = (TextView)findViewById(R.id.pointacs);
        nilaizmpt = findViewById(R.id.nilaizmpt);
        //buka koneksi ke firebase
        Firebase mRef = new Firebase("https://energiswarnadwipa.firebaseio.com/energiswarnadwipa/nilaik");
        Firebase mPap = new Firebase("https://energiswarnadwipa.firebaseio.com/energiswarnadwipa/nilaisms");
        Firebase mBap = new Firebase( "https://energiswarnadwipa.firebaseio.com/energiswarnadwipa/nilaiacs");
        Firebase mCap = new Firebase( "https://energiswarnadwipa.firebaseio.com/energiswarnadwipa/nilaizmpt");

        //proses realtime
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //ambil nilai field value
                String nilaik = dataSnapshot.getValue(String.class);
                //tampilkan ke komponen nilai
                pointk.setText(nilaik);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });

        mPap.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nilaisms = dataSnapshot.getValue(String.class);
                pointk1.setText(nilaisms);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mBap.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nilaiacs = dataSnapshot.getValue(String.class);
                pointacs.setText(nilaiacs);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mCap.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nilaitegangan = dataSnapshot.getValue(String.class);
                nilaizmpt.setText(nilaitegangan);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}