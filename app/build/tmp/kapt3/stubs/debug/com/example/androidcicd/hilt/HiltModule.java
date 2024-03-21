package com.example.androidcicd.hilt;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/androidcicd/hilt/HiltModule;", "", "()V", "providesGson", "Lretrofit2/converter/gson/GsonConverterFactory;", "providesHomeApi", "Lcom/example/androidcicd/network/ApiInterface;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "providesRetrofit", "gsonConverterFactory", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class HiltModule {
    
    public HiltModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.converter.gson.GsonConverterFactory providesGson() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
    
    @dagger.Provides
    public final com.example.androidcicd.network.ApiInterface providesHomeApi(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}