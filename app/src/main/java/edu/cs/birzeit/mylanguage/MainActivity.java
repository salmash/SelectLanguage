package edu.cs.birzeit.mylanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_OnClick(View view) {
        Spinner spnLangueges = findViewById(R.id.spnLanguages);
        String str = spnLangueges.getSelectedItem().toString();
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}