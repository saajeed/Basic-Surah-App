package com.example.moinajolokjolok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     TextView txt2;
     Button[] btn = new Button[5];
    String S1;

     //String[] a = new String[5];
     EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt2=(TextView)findViewById(R.id.txt2);
        btn[0]=(Button)findViewById(R.id.btn_fatiha);
        btn[1]=(Button)findViewById(R.id.btn_falaq);
        btn[2]=(Button)findViewById(R.id.btn_nas);
        btn[3]=(Button)findViewById(R.id.btn_iqlas);
        btn[4]=(Button)findViewById(R.id.btn_arrahman);
        e1=(EditText)findViewById(R.id.etxt1);
        for(int i=0;i<5;i++)
        btn[i].setOnClickListener(this);



        /* a[0]= "Surah Fatiha"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَـٰلَمِينَ"+"\n"+"ٱلرَّحْمَـٰنِ ٱلرَّحِيمِ"+"\n"+"مَـٰلِكِ يَوْمِ ٱلدِّينِ"+"\n"
                +"إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ"+"\n"+"ٱهْدِنَا ٱلصِّرَٰطَ ٱلْمُسْتَقِيمَ"+"\n"+"صِرَٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ";
        a[1]="Surah Falaq"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقَِ"+"\n"+"مِن شَرِّ مَا خَلَقَ"+"\n"+"وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ"+"\n"
                +"وَمِن شَرِّ ٱلنَّفَّـٰثَـٰتِ فِى ٱلْعُقَدُِ"+"\n"+"وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدََ"+"\n";
        a[2]="Surah Nas"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ"+"\n"+"مَلِكِ ٱلنَّاسِ"+"\n"+"إِلَـٰهِ ٱلنَّاسَِ"+"\n"
                +"مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسُِِ"+"\n"+"ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسََِ"+"\n"+"مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ"+"\n";
        a[3]="Surah Iqlas"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"قُلْ هُوَ ٱللَّهُ أَحَدٌ"+"\n"+"ٱللَّهُ ٱلصَّمَدُِ"+"\n"+"لَمْ يَلِدْ وَلَمْ يُولَدَْ"+"\n"
                +"وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌُِِۢ"+"\n";

      */

    }

    @Override
    public void onClick(View v) {
     /*if(v==btn[4])
         txt2.setText(R.string.Surah_Rahman); */
    // else {
        S1=e1.getText().toString();
        if(TextUtils.isEmpty(S1)) {

            Toast.makeText(this, "You Forgot To Provide Your Name", Toast.LENGTH_SHORT).show();
        }
        else {
            for (int i = 0; i < 5; i++) {

                if (v == btn[i]) {
                    Intent i1 = new Intent(this, Second_page.class);
                    i1.putExtra("Surah_no", i);
                    startActivity(i1);
                }
                //   }
            }
        }



    }
    public void doSomething(View view)
    {
        String str = e1.getText().toString();
      Intent i1= new Intent(this,Second_page.class) ;

      i1.putExtra("User",str);
      startActivity(i1);
    }
}