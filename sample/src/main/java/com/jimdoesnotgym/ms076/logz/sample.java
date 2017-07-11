package com.jimdoesnotgym.ms076.logz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jimdoesnotgym.ms076.logs_android.Debugz;

import java.util.Random;

public class sample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        randomFunction();

        StackTraceElement stackTraceElement = Debugz.getStackTraceElement();
        StackTraceElement[] stackTraceElements = Debugz.getStackTraceElements();

        System.out.println(Debugz.getStackTraceElement());
        System.out.println(Debugz.getStackTraceElements());
    }



    public void randomFunction(){
        Debugz.out(this.getClass().getSimpleName(), "Hello", true);
        Random random = new Random();
        System.out.println(random.nextInt());
    }
}
