package daggersample.yamschikovdima.dima.ua.daggersample;

import android.app.Application;

import daggersample.yamschikovdima.dima.ua.daggersample.component.AppComponent;
import daggersample.yamschikovdima.dima.ua.daggersample.component.DaggerAppComponent;

/**
 * Created by 1 on 15.04.2018.
 */

public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public static AppComponent getComponent() {
        return component;
    }
}
