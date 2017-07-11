package com.jimdoesnotgym.ms076.logs_android;

import android.util.Log;

public class Debugz {

    private static boolean mIsEnable;

    public static void setEnable(boolean isEnable){
        mIsEnable = isEnable;
    }

    public static void out(String tag, String message, boolean showStackTrace){
        if(mIsEnable){
            Log.d(tag, message);
            if(showStackTrace){
                new Exception().printStackTrace();
            }
        }
    }

    public static StackTraceElement getStackTraceElement(){
        if(Thread.currentThread().getStackTrace().length > 0){
            return Thread.currentThread().getStackTrace()[0];
        }else{
            return null;
        }
    }

    public static StackTraceElement[] getStackTraceElements(){
        return Thread.currentThread().getStackTrace();
    }
}
