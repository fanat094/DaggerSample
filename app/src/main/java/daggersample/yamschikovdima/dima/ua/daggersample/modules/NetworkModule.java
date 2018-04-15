package daggersample.yamschikovdima.dima.ua.daggersample.modules;

import dagger.Module;
import dagger.Provides;
import daggersample.yamschikovdima.dima.ua.daggersample.NetworkUtils;

/**
 * Created by 1 on 15.04.2018.
 */

@Module
public class NetworkModule {

    @Provides
    NetworkUtils provideNetworkUtils() {
        return new NetworkUtils();
    }
}
