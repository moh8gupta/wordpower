package com.example.mohit.hhh;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by mohit on 1/21/2017.
 */
public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public static int noticount=0;
    public Activity c;
    public Dialog d;
    public Button small,middle,large,xlarge,dxlarge;

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
       // s = (Button) findViewById(R.id.btn_yes);
       // no = (Button) findViewById(R.id.btn_no);
        //yes.setOnClickListener(this);
        //no.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.s:
               noticount++;
                c.finish();
                break;
            case R.id.l:
                noticount++;
                c.finish();
                break;
            case R.id.xl:
                noticount++;
                c.finish();
                break;
            case R.id.dxl:
                noticount++;
                c.finish();
                break;
            case R.id.txl:
                noticount++;
               dismiss();
            default:
                break;
        }

        dismiss();
    }







}