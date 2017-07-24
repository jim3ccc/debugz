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

        Debugz.setEnable(true);
        randomFunction();

        StackTraceElement[] stackTraceElements = Debugz.getStackTraceElements();
        for(int i=0; i< stackTraceElements.length; i++){
            System.out.println("Sample: " + stackTraceElements[i].getMethodName());
        }
    }

    public void randomFunction(){
        Debugz.out(this.getClass().getSimpleName());
        Debugz.out(this.getClass().getSimpleName(), "message1", Debugz.Type.E);
        Debugz.out(this.getClass().getSimpleName(), "message2", true, Debugz.Type.I);
        Random random = new Random();
    }
}
