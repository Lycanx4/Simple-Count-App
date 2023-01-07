package iss.workshop.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvCount;
    int tvCountId = R.id.text_count;

    Button buttCount;
    int buttCountId = R.id.count_click;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(tvCountId);
        tvCount.setText(String.valueOf(count));

        buttCount = findViewById(buttCountId);
        buttCount.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        count++;
        tvCount.setText(String.valueOf(count));

    }

}
