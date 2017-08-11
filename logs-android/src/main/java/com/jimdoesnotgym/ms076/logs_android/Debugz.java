package com.jimdoesnotgym.ms076.logs_android;

import android.util.Log;

import com.jimdoesnotgym.ms076.logs_android.enums.Type;

public class Debugz {

    private static boolean mIsEnable;
    public static int LOGLEVEL;
    public static boolean ERROR;
    public static boolean WARN;
    public static boolean INFO;
    public static boolean DEBUG;
    public static boolean VERBOSE;
    public static final String DEFAULT_MESSAGE = "debugz";

    public static void setEnable(boolean isEnable){
        mIsEnable = isEnable;
        ERROR = true;
        WARN = true;
        INFO = true;
        DEBUG = true;
        VERBOSE = true;
    }

    public static void errorOnly(){
        setOnly(Type.E);
    };
    public static void warnOnly(){
        setOnly(Type.W);
    };
    public static void infoOnly(){
        setOnly(Type.I);
    };
    public static void debugOnly(){
        setOnly(Type.D);;
    };
    public static void verboseOnly(){
        setOnly(Type.V);
    }

    public static void enableError(){
        ERROR = true;
    }
    public static void enableWarn(){
        WARN = true;
    }
    public static void enableInfo(){
        INFO = true;
    }
    public static void enableDebug(){
        DEBUG = true;
    }
    public static void enableVerbose(){
        VERBOSE = true;
    }
    private static void setOnly(Type t){
        switch (t){
            case V:
                DEBUG = INFO = WARN = ERROR = false;
                VERBOSE = true;
                break;

            case E:
                DEBUG = INFO = WARN = VERBOSE = false;
                ERROR = true;
                break;

            case I:
                DEBUG = VERBOSE = WARN = ERROR = false;
                INFO = true;
                break;

            case W:
                DEBUG = INFO = VERBOSE = ERROR = false;
                WARN = true;
                break;

            case D:
                VERBOSE = INFO = WARN = ERROR = false;
                DEBUG = true;
                break;

            default:
                break;
        }
    }

    public static void out(String tag){
        if(mIsEnable){
            if(DEBUG) Log.d(tag, DEFAULT_MESSAGE);
        }
    }
    
    public static void out(String tag, String message){
        if(mIsEnable){
            if(DEBUG) Log.d(tag, message);
        }
    }

    public static void out(String tag, String message, boolean showStackTrace){
        if(mIsEnable){
            if(DEBUG) Log.d(tag, message);
        }
        if(showStackTrace){
            new Exception().printStackTrace();
        }
    }

    public static void out(String tag, Type type){
        out(tag, "", type);
    }

    public static void out(String tag, String message, Type type) {
        if(message.equals("")){
            message = DEFAULT_MESSAGE;
        }
        if(mIsEnable){
            switch (type){
                case V:
                    if(VERBOSE) Log.v(tag, message);
                    break;

                case E:
                    if(ERROR) Log.e(tag, message);
                    break;

                case I:
                    if(INFO) Log.i(tag, message);
                    break;

                case W:
                    if(WARN) Log.w(tag, message);
                    break;

                case D:
                    if(DEBUG) Log.d(tag, message);
                    break;

                default:
                    break;
            }

        }
    }

    public static void out(String tag, String message, boolean showStackTrace, Type type) {
        out(tag, message, showStackTrace, type);
        if(showStackTrace){
            new Exception().printStackTrace();
        }
    }

    public static StackTraceElement[] getStackTraceElements(){
        return Thread.currentThread().getStackTrace();
    }
}
