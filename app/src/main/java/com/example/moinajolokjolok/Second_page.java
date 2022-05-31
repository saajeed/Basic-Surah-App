package com.example.moinajolokjolok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Second_page extends AppCompatActivity {
    MediaPlayer player;
     TextView t1;
    String[] a = new String[5];
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        t1 = (TextView)findViewById(R.id.txt2);
        Intent i2 = getIntent();
         x = i2.getIntExtra("Surah_no",0);
        a[0]= "Surah Fatiha"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَـٰلَمِينَ"+"\n"+"ٱلرَّحْمَـٰنِ ٱلرَّحِيمِ"+"\n"+"مَـٰلِكِ يَوْمِ ٱلدِّينِ"+"\n"
                +"إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ"+"\n"+"ٱهْدِنَا ٱلصِّرَٰطَ ٱلْمُسْتَقِيمَ"+"\n"+"صِرَٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ";
        a[1]="Surah Falaq"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقَِ"+"\n"+"مِن شَرِّ مَا خَلَقَ"+"\n"+"وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ"+"\n"
                +"وَمِن شَرِّ ٱلنَّفَّـٰثَـٰتِ فِى ٱلْعُقَدُِ"+"\n"+"وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدََ"+"\n";
        a[2]="Surah Nas"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ"+"\n"+"مَلِكِ ٱلنَّاسِ"+"\n"+"إِلَـٰهِ ٱلنَّاسَِ"+"\n"
                +"مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسُِِ"+"\n"+"ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسََِ"+"\n"+"مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ"+"\n";
        a[3]="Surah Iqlas"+"\n"+"بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِِ"+"\n"+"قُلْ هُوَ ٱللَّهُ أَحَدٌ"+"\n"+"ٱللَّهُ ٱلصَّمَدُِ"+"\n"+"لَمْ يَلِدْ وَلَمْ يُولَدَْ"+"\n"
                +"وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌُِِۢ"+"\n";


       // Intent i1 = getIntent();
       // String str= i1.getStringExtra("User");
        if(x==4)
            t1.setText(R.string.Surah_Rahman);
        else
            t1.setText(a[x]);

    }
    public void play (View V)
    {
        if (player == null)
        {
            if(x==0)
                player = MediaPlayer.create(this,R.raw.fatiha);
            else if(x==1)
                player = MediaPlayer.create(this,R.raw.falaq);
            if(x==2)
                player = MediaPlayer.create(this,R.raw.falaq);
            if(x==3)
                player = MediaPlayer.create(this,R.raw.iklas);
            if(x==4)
                player = MediaPlayer.create(this,R.raw.rahman);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();

    }
    public void pause(View V)
    {
        if(player!=null)
        {
            player.pause();
        }

    }
    public void stop(View V)
    {
      stopPlayer();
    }
    private void stopPlayer()
    {
        if(player!= null)
            player.release();
        player=null;
        Toast.makeText(this, "MediaPlayer reasled", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}