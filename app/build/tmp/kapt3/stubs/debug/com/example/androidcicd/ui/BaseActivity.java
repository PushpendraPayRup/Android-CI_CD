package com.example.androidcicd.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH&R\u0018\u0010\u0005\u001a\u00028\u0000X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidcicd/ui/BaseActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActivity", "app_debug"})
public abstract class BaseActivity<T extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    public abstract void onCreateActivity();
    
    @org.jetbrains.annotations.NotNull
    public abstract T getBinding();
    
    public abstract void setBinding(@org.jetbrains.annotations.NotNull
    T p0);
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}