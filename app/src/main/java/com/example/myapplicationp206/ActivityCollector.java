package com.example.myapplicationp206;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activites=new ArrayList<Activity>();
    //添加
    public static void addActivity(Activity a){
        activites.add(a);
    }
    //删除
    public static void removeActivity(Activity a){
        activites.remove(a);
    }
    //全部关闭
    public static void finishAll(){
        for(Activity a:activites){
            if (!a.isFinishing()){
                a.finish();
            }
        }
    }
}
