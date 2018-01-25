package com.example.user.testovi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class TestoviActivity extends AppCompatActivity {

    PitanjaTeorija[] nizPitanjaTeorija = new PitanjaTeorija[]{
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
    PitanjaZnakovi[] nizPitanjaZnakovi = new PitanjaZnakovi[]{
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
    PitanjaRaskrsnice[] nizPitanjaRaskrsnice = new PitanjaRaskrsnice[]{
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


    TextView mTextPitanja;
    ImageView mSlika;
    RadioButton mRadioButton1;
    RadioButton mRadioButton2;
    RadioButton mRadioButton3;
    Button mSljedece;
    Button mProvjeri;
    Random r;
    int r1, r2, r3;
    int trenutniIndex = 0;
    int bodovi=0;
    TextView brojBodova;

    PitanjaTeorija[] teorijaTest = new PitanjaTeorija[5];
    PitanjaZnakovi[] znakoviTest = new PitanjaZnakovi[5];
    PitanjaRaskrsnice[] raskrsniceTest = new PitanjaRaskrsnice[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testovi);

        mTextPitanja = (TextView) findViewById(R.id.text_pitanja);
        mSlika = (ImageView) findViewById(R.id.slika);
        mRadioButton1 = (RadioButton)findViewById(R.id.odgovor1);
        mRadioButton2 = (RadioButton)findViewById(R.id.odgovor2);
        mRadioButton3 = (RadioButton)findViewById(R.id.odgovor3);
        mSljedece = (Button)findViewById(R.id.sljedece);
        mProvjeri = (Button)findViewById(R.id.provjeri);
        mProvjeri.setVisibility(View.INVISIBLE);
        brojBodova = (TextView) findViewById(R.id.broj_bodova);

        r = new Random();
        int index1 = r.nextInt(9);
        teorijaTest[0] = nizPitanjaTeorija[index1];
        znakoviTest[0] = nizPitanjaZnakovi[index1];
        raskrsniceTest[0] = nizPitanjaRaskrsnice[index1];
        int index2=0;
        while(index1 == index2){
            index2 = r.nextInt(9);
        }
        teorijaTest[1] = nizPitanjaTeorija[index2];
        znakoviTest[1] = nizPitanjaZnakovi[index2];
        raskrsniceTest[1] = nizPitanjaRaskrsnice[index2];

        int index3=0;
        while(index3 == index2 || index3 == index1){
            index3 = r.nextInt(9);
        }
        teorijaTest[2] = nizPitanjaTeorija[index3];
        znakoviTest[2] = nizPitanjaZnakovi[index3];
        raskrsniceTest[2] = nizPitanjaRaskrsnice[index3];

        int index4=0;
        while(index4 == index2 || index4 == index3 || index4 == index1){
            index4 = r.nextInt(9);
        }
        teorijaTest[3] = nizPitanjaTeorija[index4];
        znakoviTest[3] = nizPitanjaZnakovi[index4];
        raskrsniceTest[3] = nizPitanjaRaskrsnice[index4];
        int index5=0;
        while(index5 == index4 || index5 == index3 || index5 == index2 || index5 == index1){
            index5 = r.nextInt(9);
        }
        teorijaTest[4] = nizPitanjaTeorija[index5];
        znakoviTest[4] = nizPitanjaZnakovi[index5];
        raskrsniceTest[4] = nizPitanjaRaskrsnice[index5];

        updatePitanje(trenutniIndex);
        mSljedece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (trenutniIndex < 15) {
                    trenutniIndex++;
                    updatePitanje(trenutniIndex);
                } else {
                    brojBodova.setText("Broj bodova koji ste osvojili je:" + bodovi);
                }

            }
        });
       /* mProvjeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brojBodova.setText("Broj bodova koji ste osvojili je:" + bodovi);
            }
        });*/
        mRadioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                provjeriOdgovor(r1);
            }
        });
        mRadioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                provjeriOdgovor(r2);
            }
        });
        mRadioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                provjeriOdgovor(r3);
            }
        });
    }

    public void provjeriOdgovor(int x){
        if(trenutniIndex < 5){
            if(nizPitanjaTeorija[trenutniIndex].getTacanOdgovor() == x){
                bodovi+=2;
            }
        }
        else if(trenutniIndex >= 5 && trenutniIndex < 10){
            if(nizPitanjaZnakovi[trenutniIndex%5].getTacanOdgovor() == x){
                bodovi+=3;
            }
        }
        else{
            if(nizPitanjaRaskrsnice[trenutniIndex%5].getTacanOdgovor() == x){
                bodovi+=5;
            }
        }
    }

    public void updatePitanje(int i){
        mRadioButton1.setBackgroundColor(getResources().getColor(R.color.bijela));
        mRadioButton1.setChecked(false);
        mRadioButton2.setBackgroundColor(getResources().getColor(R.color.bijela));
        mRadioButton2.setChecked(false);
        mRadioButton3.setBackgroundColor(getResources().getColor(R.color.bijela));
        mRadioButton3.setChecked(false);
        if(i < 5){
            PitanjaTeorija pitanjaTeorija = nizPitanjaTeorija[i%5];
            mTextPitanja.setText(pitanjaTeorija.getPitanje());
            mRadioButton1.setText(pitanjaTeorija.getOdgovor1());
            mRadioButton2.setText(pitanjaTeorija.getOdgovor2());
            mRadioButton3.setText(pitanjaTeorija.getOdgovor3());
            r1 = pitanjaTeorija.getOdgovor1();
            r2 = pitanjaTeorija.getOdgovor2();
            r3 = pitanjaTeorija.getOdgovor3();
        }
        else if(i >=5 && i < 10){
            PitanjaZnakovi pitanjaZnakovi = nizPitanjaZnakovi[i%5];
            mTextPitanja.setText(pitanjaZnakovi.getPitanje());
            mSlika.setImageResource(pitanjaZnakovi.getZnak());
            mRadioButton1.setText(pitanjaZnakovi.getOdgovor1());
            mRadioButton2.setText(pitanjaZnakovi.getOdgovor2());
            mRadioButton3.setText(pitanjaZnakovi.getOdgovor3());
            r1 = pitanjaZnakovi.getOdgovor1();
            r2 = pitanjaZnakovi.getOdgovor2();
            r3 = pitanjaZnakovi.getOdgovor3();
        }
        else if(i >= 10 && i < 15){
            PitanjaRaskrsnice pitanjaRaskrsnice = nizPitanjaRaskrsnice[i%5];
            mTextPitanja.setText(R.string.pitanje_raskrsnice);
            mSlika.setImageResource(pitanjaRaskrsnice.getSlika());
            mRadioButton1.setText(pitanjaRaskrsnice.getOdgovor1());
            mRadioButton2.setText(pitanjaRaskrsnice.getOdgovor2());
            mRadioButton3.setText(pitanjaRaskrsnice.getOdgovor3());

        }
    }
}
