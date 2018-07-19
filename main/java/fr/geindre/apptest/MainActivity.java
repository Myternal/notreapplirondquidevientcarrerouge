package fr.geindre.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText(R.string.content_test);
        setContentView(text);

        TextView second_text = new TextView(this);
        second_text.setText(R.string.app_name);
        setContentView(second_text);
    }
}
