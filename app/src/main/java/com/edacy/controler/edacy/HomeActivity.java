package com.edacy.controler.edacy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{


    private LinearLayout present;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        present= (LinearLayout) findViewById(R.id.presentation);


        present.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId()){
            case R.id.presentation :intent= new Intent(this,PresentationActivity.class); startActivity(intent); break;
            default:break;
        }

    }
}
