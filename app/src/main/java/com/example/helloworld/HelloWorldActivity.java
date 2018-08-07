package com.example.helloworld;

import android.support.v7.app.ActionBar;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class HelloWorldActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private ProgressBar progressBar;
    private byte i = 0;

    private static final String TAG = "HelloWorldActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.hide();
        }
        Log.d("HelloWorldActivity", "onCreate execute");
        Button button = (Button) findViewById(R.id.button_1);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progerss_bar);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                /*if(i == 0){
                    i = 1;
                    imageView.setImageResource(R.mipmap.ic_launcher);
                }else if(i == 1){i = 0; imageView.setImageResource(R.mipmap.ic_launcher_round);}*/
                /*
                AlertDialog.Builder dialog = new AlertDialog.Builder(HelloWorldActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                    }
                });
                dialog.show();*/
                ProgressDialog progressDialog = new ProgressDialog(HelloWorldActivity.this);
                progressDialog.setTitle("This is progressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            case R.id.image_view:
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                if(progress > 100){progressBar.setProgress(0);}
                break;
            default:
                break;
        }
    }
}
