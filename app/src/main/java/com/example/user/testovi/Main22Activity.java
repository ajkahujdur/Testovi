package com.example.user.testovi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {

    PitanjaZnakovi[] nizPitanja = new PitanjaZnakovi[]{
            new PitanjaZnakovi(R.drawable.z1,R.string.pitanjez1,R.string.pitanjez1_odgovor1,R.string.pitanjez1_odgovor2,R.string.pitanjez1_odgovor3,R.string.pitanjez1_odgovor2,3),
            new PitanjaZnakovi(R.drawable.z2,R.string.pitanjez2,R.string.pitanjez2_odgovor1,R.string.pitanjez2_odgovor2,R.string.pitanjez2_odgovor3,R.string.pitanjez2_odgovor3,3),
            new PitanjaZnakovi(R.drawable.z3,R.string.pitanjez3,R.string.pitanjez3_odgovor1,R.string.pitanjez3_odgovor2,R.string.pitanjez3_odgovor3,R.string.pitanjez3_odgovor1,3),
            new PitanjaZnakovi(R.drawable.z4,R.string.pitanjez4,R.string.pitanjez4_odgovor1,R.string.pitanjez4_odgovor2,R.string.pitanjez4_odgovor3,R.string.pitanjez4_odgovor3,3),
            new PitanjaZnakovi(R.drawable.z5,R.string.pitanjez5,R.string.pitanjez5_odgovor1,R.string.pitanjez5_odgovor2,R.string.pitanjez5_odgovor3,R.string.pitanjez5_odgovor2,3),
            new PitanjaZnakovi(R.drawable.z6,R.string.pitanjez6,R.string.pitanjez6_odgovor1,R.string.pitanjez6_odgovor2,R.string.pitanjez6_odgovor3,R.string.pitanjez6_odgovor3,3),
            new PitanjaZnakovi(R.drawable.z7,R.string.pitanjez7,R.string.pitanjez7_odgovor1,R.string.pitanjez7_odgovor2,R.string.pitanjez7_odgovor3,R.string.pitanjez7_odgovor3,3),
            new PitanjaZnakovi(R.drawable.z8,R.string.pitanjez8,R.string.pitanjez8_odgovor1,R.string.pitanjez8_odgovor2,R.string.pitanjez8_odgovor3,R.string.pitanjez8_odgovor2,3),
            new PitanjaZnakovi(R.drawable.z9,R.string.pitanjez9,R.string.pitanjez9_odgovor1,R.string.pitanjez9_odgovor2,R.string.pitanjez9_odgovor3,R.string.pitanjez9_odgovor3,3),
            new PitanjaZnakovi(R.drawable.z10,R.string.pitanjez10,R.string.pitanjez10_odgovor1,R.string.pitanjez10_odgovor2,R.string.pitanjez10_odgovor3,R.string.pitanjez10_odgovor2,3)
              };

    TextView mTextView;
    ImageView mImageView;
    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;
    Button mSljedece;
    Button mProvjeri;
    int mTrenutniIndex = 0;
    int r1,r2, r3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        mTextView = (TextView)findViewById(R.id.text_pitanja);
        mImageView = (ImageView)findViewById(R.id.slika);
        mRadioButton1 = (RadioButton)findViewById(R.id.odgovor1);
        mRadioButton2 = (RadioButton)findViewById(R.id.odgovor2);
        mRadioButton3 = (RadioButton)findViewById(R.id.odgovor3);
        mSljedece = (Button)findViewById(R.id.sljedece);
        mProvjeri = (Button)findViewById(R.id.provjeri);
        mProvjeri.setVisibility(View.INVISIBLE);
        updatePitanje(mTrenutniIndex);

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
        mSljedece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTrenutniIndex = (mTrenutniIndex + 1) % nizPitanja.length;
                updatePitanje(mTrenutniIndex);
            }
        });
        mProvjeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nizPitanja[mTrenutniIndex].getTacanOdgovor() == r1){
                    mRadioButton1.setBackgroundColor(getResources().getColor(R.color.zelena));
                    mRadioButton2.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton3.setBackgroundColor(getResources().getColor(R.color.crvena));
                }
                else if(nizPitanja[mTrenutniIndex].getTacanOdgovor() == r2){
                    mRadioButton1.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton2.setBackgroundColor(getResources().getColor(R.color.zelena));
                    mRadioButton3.setBackgroundColor(getResources().getColor(R.color.crvena));
                }
                else if(nizPitanja[mTrenutniIndex].getTacanOdgovor() == r3){
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
        PitanjaZnakovi trenutnoPitanje = nizPitanja[i];
        mImageView.setImageResource(trenutnoPitanje.getZnak());
        mTextView.setText(trenutnoPitanje.getPitanje());
        mRadioButton1.setText(trenutnoPitanje.getOdgovor1());
        mRadioButton2.setText(trenutnoPitanje.getOdgovor2());
        mRadioButton3.setText(trenutnoPitanje.getOdgovor3());
        r1 = trenutnoPitanje.getOdgovor1();
        r2 = trenutnoPitanje.getOdgovor2();
        r3 = trenutnoPitanje.getOdgovor3();
    }
}
