package edu.cnm.deepdive.floww;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

  //New additional code added with nick.
  private int[] audioResources;
  private int position = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //new code.
    audioResources = new int[]{R.raw.chron,R.raw.chronone,R.raw.chrontwo};
    playClips();

    /*ConstraintLayout constraintLayout = findViewById(R.id.layout);
    AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
    animationDrawable.setEnterFadeDuration(2000);
    animationDrawable.setExitFadeDuration(4000);
    animationDrawable.start();

    Button butt1 = findViewById(R.id.button);
    Button butt2 = findViewById(R.id.button2);
    Button butt3 = findViewById(R.id.button3);
    Button butt4 = findViewById(R.id.button4);
    Button butt5 = findViewById(R.id.button5);

    butt1.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int1 = new Intent(MainActivity.this,Activity2.class);
        startActivity(int1);
      }
    });

    butt2.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int2 = new Intent(MainActivity.this,Activity3.class);
        startActivity(int2);
      }
    });

    butt3.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int3 = new Intent(MainActivity.this,Activity5.class);
        startActivity(int3);
      }
    });

    butt4.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int4 = new Intent(MainActivity.this,Activity6.class);
        startActivity(int4);
      }
    });

    butt5.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent int5 = new Intent(MainActivity.this,Activity7.class);
        startActivity(int5);
      }
    });

*/
  }


  public void play(View view) {
  }

  public void pause(View view) {
  }

  public void stop(View view) {
  }


  // new code.
  private void playClips(){
    MediaPlayer mediaPlayer = new MediaPlayer();
    mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
      @Override
      public void onCompletion(MediaPlayer mp) {
        position = playNext(mp,position);
      }
    });
    position = playNext(mediaPlayer, position);
  }

  private int playNext(MediaPlayer mediaPlayer, int position) {
    try {
      if (position < audioResources.length) {
        mediaPlayer.setDataSource(getResources().openRawResourceFd(audioResources[position++]));
        mediaPlayer.prepare();
        mediaPlayer.start();
      }
      return position;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
