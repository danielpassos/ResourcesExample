package me.passos.android.resource;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Spinner gender = (Spinner) findViewById(R.id.gender);
        gender.setAdapter(new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.gender)
        ));
    }
}
