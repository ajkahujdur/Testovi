package com.example.user.testovi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main23Activity extends AppCompatActivity {

    TextView mTextView;
    ImageView mImageView;
    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;
    Button mSljedece;
    Button mProvjeri;
    int mTrenutniIndex = 0;
    int r1, r2, r3;

   PitanjaRaskrsnice[] nizPitanja = new PitanjaRaskrsnice[]{
           new PitanjaRaskrsnice(R.drawable.r1,R.string.r1_odgovor1,R.string.r1_odgovor2,R.string.r1_odgovor3,R.string.r1_odgovor2,5),
           new PitanjaRaskrsnice(R.drawable.r2,R.string.r2_odgovor1,R.string.r2_odgovor2,R.string.r2_odgovor3,R.string.r2_odgovor1,5),
           new PitanjaRaskrsnice(R.drawable.r3,R.string.r3_odgovor1,R.string.r3_odgovor2,R.string.r3_odgovor3,R.string.r3_odgovor2,5),
           new PitanjaRaskrsnice(R.drawable.r4,R.string.r4_odgovor1,R.string.r4_odgovor2,R.string.r4_odgovor3,R.string.r4_odgovor3,5),
           new PitanjaRaskrsnice(R.drawable.r5,R.string.r5_odgovor1,R.string.r5_odgovor2,R.string.r5_odgovor3,R.string.r5_odgovor3,5),
           new PitanjaRaskrsnice(R.drawable.r6,R.string.r6_odgovor1,R.string.r6_odgovor2,R.string.r6_odgovor3,R.string.r6_odgovor3,5),
           new PitanjaRaskrsnice(R.drawable.r7,R.string.r7_odgovor1,R.string.r7_odgovor2,R.string.r7_odgovor3,R.string.r7_odgovor1,5),
           new PitanjaRaskrsnice(R.drawable.r8,R.string.r8_odgovor1,R.string.r8_odgovor2,R.string.r8_odgovor3,R.string.r8_odgovor1,5),
           new PitanjaRaskrsnice(R.drawable.r9,R.string.r9_odgovor1,R.string.r9_odgovor2,R.string.r9_odgovor3,R.string.r9_odgovor2,5),
           new PitanjaRaskrsnice(R.drawable.r10,R.string.r10_odgovor1,R.string.r10_odgovor2,R.string.r10_odgovor3,R.string.r10_odgovor3,5)
   };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        mTextView = (TextView)findViewById(R.id.text_pitanja);
        mTextView.setText(R.string.pitanje_raskrsnice);
        mImageView = (ImageView)findViewById(R.id.slika);
        mRadioButton1 = (RadioButton) findViewById(R.id.odgovor1);
        mRadioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProvjeri.setVisibility(View.VISIBLE);
            }
        });
        mRadioButton2 = (RadioButton) findViewById(R.id.odgovor2);
        mRadioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProvjeri.setVisibility(View.VISIBLE);
            }
        });
        mRadioButton3 = (RadioButton) findViewById(R.id.odgovor3);
        mRadioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProvjeri.setVisibility(View.VISIBLE);
            }
        });
        updatePitanje(mTrenutniIndex);
        mSljedece = (Button)findViewById(R.id.sljedece);
        mSljedece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTrenutniIndex = (mTrenutniIndex+1)%nizPitanja.length;
                updatePitanje(mTrenutniIndex);
            }
        });
        mProvjeri = (Button) findViewById(R.id.provjeri);
        mProvjeri.setVisibility(View.INVISIBLE);
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
                    mRadioButton1.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton2.setBackgroundColor(getResources().getColor(R.color.crvena));
                    mRadioButton3.setBackgroundColor(getResources().getColor(R.color.zelena));
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
        PitanjaRaskrsnice pitanjeRaskrsnice = nizPitanja[i];
        mImageView.setImageResource(pitanjeRaskrsnice.getSlika());
        mRadioButton1.setText(pitanjeRaskrsnice.getOdgovor1());
        mRadioButton2.setText(pitanjeRaskrsnice.getOdgovor2());
        mRadioButton3.setText(pitanjeRaskrsnice.getOdgovor3());
        r1 = pitanjeRaskrsnice.getOdgovor1();
        r2 = pitanjeRaskrsnice.getOdgovor2();
        r3 = pitanjeRaskrsnice.getOdgovor3();
    }
}
