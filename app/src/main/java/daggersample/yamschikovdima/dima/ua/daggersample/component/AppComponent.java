package daggersample.yamschikovdima.dima.ua.daggersample.component;

import dagger.Component;
import daggersample.yamschikovdima.dima.ua.daggersample.MainActivity;
import daggersample.yamschikovdima.dima.ua.daggersample.modules.NetworkModule;
import daggersample.yamschikovdima.dima.ua.daggersample.modules.StorageModule;

/**
 * Created by 1 on 15.04.2018.
 */

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    void injectsMainActivity(MainActivity mainActivity);
}
