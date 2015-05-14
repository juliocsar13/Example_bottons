package com.example.lenovo.example_bottons;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    /*protected TextView customFont;*/

    Button btn_call_taxi;
    Button btn_cancel_taxi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_disable_button);

        btn_call_taxi = (Button) findViewById(R.id.btn_call);
        btn_cancel_taxi = (Button) findViewById(R.id.btn_cancel);
        btn_call_taxi.setEnabled(true);
        btn_cancel_taxi.setEnabled(false);
        btn_cancel_taxi.setBackgroundResource (R.drawable.botton_number_1);
        btn_call_taxi.setBackgroundResource(R.drawable.button_number_5);
       /* customFont = (TextView)findViewById(R.id.editusuario1);
        Typeface fontusuario = Typeface.createFromAsset(getAssets(),"Balkeno.ttf");
        customFont.setTypeface(fontusuario);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
