package com.example.exo1tp;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button compter;
    private RadioButton Pommes;
    private RadioButton Poires;
    private TextView pommesResult;
    private TextView poiresResult;
    private int pommetotal=0;
    private int poiretotal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        compter= (Button) findViewById(R.id.CompterBID);
        Poires=(RadioButton) findViewById(R.id.PoiresRID);
        Pommes=(RadioButton) findViewById(R.id.PommesRID);
        pommesResult=(TextView) findViewById(R.id.PommesResult);
        poiresResult=(TextView) findViewById(R.id.PoiresResult);


        compter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ( !(Pommes.isChecked()) && !(Poires.isChecked())){


                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Aucun fruit selectionné !")
                            .setMessage("veuillez selectionner un fruit")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            }).show();

                }
                else{

                            if (Pommes.isChecked()){
                                pommetotal++;
                                pommesResult.setText(""+pommetotal);
                            }else if (Poires.isChecked()){
                                poiretotal++;
                                poiresResult.setText(""+poiretotal);

                    }


                }

            }
        });




    }


}
