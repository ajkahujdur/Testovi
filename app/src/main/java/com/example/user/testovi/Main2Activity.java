package com.example.user.testovi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    PitanjaTeorija[] nizPitanja = new PitanjaTeorija[]{
            new PitanjaTeorija(R.string.pitanje1,R.string.pitanje1_odgovor1,R.string.pitanje1_odgovor2,R.string.pitanje1_odgovor3,R.string.pitanje1_odgovor1,2),
            new PitanjaTeorija(R.string.pitanje2,R.string.pitanje2_odgovor1,R.string.pitanje2_odgovor2,R.string.pitanje2_odgovor3,R.string.pitanje2_odgovor3,2),
            new PitanjaTeorija(R.string.pitanje3,R.string.pitanje3_odgovor1,R.string.pitanje3_odgovor2,R.string.pitanje3_odgovor3,R.string.pitanje3_odgovor1,2),
            new PitanjaTeorija(R.string.pitanje4,R.string.pitanje4_odgovor1,R.string.pitanje4_odgovor2,R.string.pitanje4_odgovor3,R.string.pitanje4_odgovor2,2),
            new PitanjaTeorija(R.string.pitanje5,R.string.pitanje5_odgovor1,R.string.pitanje5_odgovor2,R.string.pitanje5_odgovor3,R.string.pitanje5_odgovor2,2),
            new PitanjaTeorija(R.string.pitanje6,R.string.pitanje6_odgovor1,R.string.pitanje6_odgovor2,R.string.pitanje6_odgovor3,R.string.pitanje6_odgovor3,2),
            new PitanjaTeorija(R.string.pitanje7,R.string.pitanje7_odgovor1,R.string.pitanje7_odgovor2,R.string.pitanje7_odgovor3,R.string.pitanje7_odgovor3,2),
            new PitanjaTeorija(R.string.pitanje8,R.string.pitanje8_odgovor1,R.string.pitanje8_odgovor2,R.string.pitanje8_odgovor3,R.string.pitanje8_odgovor2,2),
            new PitanjaTeorija(R.string.pitanje9,R.string.pitanje9_odgovor1,R.string.pitanje9_odgovor2,R.string.pitanje9_odgovor3,R.string.pitanje9_odgovor1,2),
            new PitanjaTeorija(R.string.pitanje10,R.string.pitanje10_odgovor1,R.string.pitanje10_odgovor2,R.string.pitanje10_odgovor3,R.string.pitanje10_odgovor2,2)
    };

    int r1,r2,r3;
    TextView mTextPitanja;
    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;
    Button mSljedece;
    Button mProvjeri;
    int trenutniIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextPitanja = (TextView) findViewById(R.id.pitanje_text_view);
        mRadioButton1 = (RadioButton) findViewById(R.id.odgovor1);
        mRadioButton2 = (RadioButton) findViewById(R.id.odgovor2);
        mRadioButton3 = (RadioButton) findViewById(R.id.odgovor3);
        updatePitanje(trenutniIndex);
        mRadioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProvjeri.setVisibility(View.VISIBLE);
            }
        });
        mRadioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProvjeri.setVisibility(View.VISIBLE);
            }
        });
        mRadioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProvjeri.setVisibility(View.VISIBLE);
            }
        });

        mSljedece = (Button) findViewById(R.id.sljedece);
        mSljedece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trenutniIndex = (trenutniIndex +1)%nizPitanja.length;
                updatePitanje(trenutniIndex);
            }
        });
        mProvjeri = (Button) findViewById(R.id.provjeri);
        mProvjeri.setVisibility(View.INVISIBLE);
        mProvjeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nizPitanja[trenutniIndex].getTacanOdgovor() == r1){
                    mRadioButton1.setBackgroundColor(getResources().getColor(R.color.zelena));
                    mRadioButton2.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton3.setBackgroundColor(getResources().getColor(R.color.crvena));
                }
                else if(nizPitanja[trenutniIndex].getTacanOdgovor() == r2){
                    mRadioButton2.setBackgroundColor(getResources().getColor(R.color.zelena));
                    mRadioButton1.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton3.setBackgroundColor(getResources().getColor(R.color.crvena));
                }
                else if(nizPitanja[trenutniIndex].getTacanOdgovor() == r3){
                    mRadioButton3.setBackgroundColor(getResources().getColor(R.color.zelena));
                    mRadioButton1.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton2.setBackgroundColor(getResources().getColor(R.color.crvena));
                }
            }
        });
    }

    public void updatePitanje(int i){
        mRadioButton1.setBackgroundColor(getResources().getColor(R.color.bijela));
        mRadioButton1.setChecked(false);
        mRadioButton2.setBackgroundColor(getResources().getColor(R.color.bijela));
        mRadioButton2.setChecked(false);
        mRadioButton3.setBackgroundColor(getResources().getColor(R.color.bijela));
        mRadioButton3.setChecked(false);
        PitanjaTeorija trenutnoPitanje = nizPitanja[i];
        mTextPitanja.setText(trenutnoPitanje.getPitanje());
        mRadioButton1.setText(trenutnoPitanje.getOdgovor1());
        mRadioButton2.setText(trenutnoPitanje.getOdgovor2());
        mRadioButton3.setText(trenutnoPitanje.getOdgovor3());
        r1 = trenutnoPitanje.getOdgovor1();
        r2 = trenutnoPitanje.getOdgovor2();
        r3 = trenutnoPitanje.getOdgovor3();
    }


}
