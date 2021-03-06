package com.example.ioclapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout mappingForm, Searchform, IdentifyForm,GetDetailsFoorm,InventoryForm;
ImageView setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mappingForm = findViewById(R.id.Mapping);
        IdentifyForm = findViewById(R.id.Identifyform);
        Searchform = findViewById(R.id.SearchForml);
        GetDetailsFoorm=findViewById(R.id.GetDetailsFoorm);
        InventoryForm=findViewById(R.id.InventoryFoorm);
         setting=findViewById(R.id.imageView4);

         setting.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(MainActivity.this, AppConfigureForm.class));

             }
         });

        InventoryForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Inventory.class));
            }
        });

        GetDetailsFoorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ViewSearchItemDetails.class));
            }
        });
        Searchform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SearchForm.class));
            }
        });
        IdentifyForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Identify.class));

            }
        });
        mappingForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Mapping.class));
            }
        });


    }

    @Override
    public void onBackPressed() {
        //Dialog Box for Exit User
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.exitapp)
                .setTitle("Quit")
                .setMessage("Are you sure you want to Quit this App ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
}