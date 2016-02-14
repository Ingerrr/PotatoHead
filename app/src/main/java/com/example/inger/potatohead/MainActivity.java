// Mr. Potato Head, by Inger Bij de Vaate

package com.example.inger.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int item;

    // Sets visibility of item that is passed onto the function
    public void putOn(int item){
        if(findViewById(item).getVisibility() == View.VISIBLE){
            findViewById(item).setVisibility(View.INVISIBLE);
        }
        else{
            findViewById(item).setVisibility(View.VISIBLE);
        }
    }

    // Functions that will be called by clicking the checkboxes all call the same function (PutOn) but with different input
    public void shoesOn(View view) {
        putOn(R.id.shoes);
    }

    public void glassesOn(View view) {
        putOn(R.id.glasses);
    }

    public void hatOn(View view) {
        putOn(R.id.hat);
    }

    public void armsOn(View view) {
        putOn(R.id.arms);
    }

    public void mustacheOn(View view) {
        putOn(R.id.mustache);
    }

    public void noseOn(View view) {
        putOn(R.id.nose);
    }

    public void mouthOn(View view) {
        putOn(R.id.mouth);
    }

    public void eyebrowsOn(View view) {
        putOn(R.id.eyebrows);
    }

    public void eyesOn(View view) {
        putOn(R.id.eyes);
    }

    public void earsOn(View view) {
        putOn(R.id.ears);
    }

}
