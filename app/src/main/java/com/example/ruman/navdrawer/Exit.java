package com.example.ruman.navdrawer;

import android.app.Activity;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by RUMAN on 6/12/2017.
 */

public class Exit extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("              Do you want to exit?");
        builder.setCancelable(true);

        builder.setPositiveButton("Ok               ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                moveTaskToBack(true);
                finish();

            }
        });
        builder.setNegativeButton("Cancel                        ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
                Intent intent;
                intent=new Intent("android.intent.action.MAIN");
                startActivity(intent);
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }
}
