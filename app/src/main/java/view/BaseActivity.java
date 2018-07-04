package view;

import android.app.Activity;
import android.os.Bundle;

import presenter.BasePresenter;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends Activity{
    // 表示层的引用
    public T girlPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 创建视图
        girlPresenter = createPresenter();
        // 绑定视图
        girlPresenter.attachView((V)this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 解绑视图
        girlPresenter.detatch();
    }
}
