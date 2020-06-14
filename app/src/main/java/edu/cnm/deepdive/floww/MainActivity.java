package edu.cnm.deepdive.floww;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener {

  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button = findViewById(R.id.button);
    button.setOnClickListener(this);

    Button button2 = findViewById(R.id.button2);
    button2.setOnClickListener(this);
  }


  @Override
  public void onClick(View v) {
    openActivity2();
    }

public void openActivity2() {
  Intent intent  = new Intent(this, Activity2.class);
  startActivity(intent);


}


}
