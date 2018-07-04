package presenter;

import java.lang.ref.WeakReference;


/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class BasePresenter<T> {

    // View层的引用
    protected WeakReference<T> mViewRef;
    // 绑定和解绑
    // 进行绑定
    public void attachView(T view){
        mViewRef = new WeakReference<T>(view);
    }
    // 进行解绑
    public void detatch(){
        mViewRef.clear();
    }

}
