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


  }


}
