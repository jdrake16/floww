package edu.cnm.deepdive.floww;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity3 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void play(View v) {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.chronone);
            player.setOnCompletionListener(new OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }

        player.start();
    }

    public void pause(View v) {
        if (player != null){
            player.pause();
        }
    }

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null ) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}