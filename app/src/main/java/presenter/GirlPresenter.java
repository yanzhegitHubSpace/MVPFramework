package presenter;

import java.lang.ref.WeakReference;
import java.util.List;

import bean.Girl;
import model.GirlModelImp;
import model.IGirlModel;
import view.IGirlView;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T>{

    // 1、view层的引用
//    IGirlView iGirlView;
    // 2、model层的引用
    IGirlModel girlModel = new GirlModelImp();
    // 3、构造方法
    public GirlPresenter() {
    }

    // 4、执行操作(UI逻辑)
    public void fetch(){
        if(mViewRef != null){
            mViewRef.get().showLoading();
        }
        if(girlModel != null){
            girlModel.loadGirl(new IGirlModel.GirlOnLoadingListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    if(mViewRef != null){
                        mViewRef.get().showGirls(girls);
                    }
                }
            });
        }
    }

}
