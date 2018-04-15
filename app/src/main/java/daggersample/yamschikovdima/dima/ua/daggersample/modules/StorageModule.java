package daggersample.yamschikovdima.dima.ua.daggersample.modules;

import dagger.Module;
import dagger.Provides;
import daggersample.yamschikovdima.dima.ua.daggersample.DataBaseHelper;

/**
 * Created by 1 on 15.04.2018.
 */

@Module
public class StorageModule {

    @Provides
    DataBaseHelper provideDatabaseHelper() {
        return new DataBaseHelper();

    }
}
