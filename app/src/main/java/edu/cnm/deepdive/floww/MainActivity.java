package edu.cnm.deepdive.floww;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button butt1 = findViewById(R.id.button);
    Button butt2 = findViewById(R.id.button2);

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


  }


}
