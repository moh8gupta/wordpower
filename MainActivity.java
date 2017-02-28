package com.example.mohit.hhh;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static Button notifCount;
    static int count = 0;

    //Button alertbox = (Button)findViewById(R.id.alert);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       // CustomDialogClass cdd = new CustomDialogClass(MainActivity.this);
        //cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //cdd.show();

    }


    public void click(View view)
    {
        CustomDialogClass cdd = new CustomDialogClass(MainActivity.this);
        cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        cdd.show();
    }








}

