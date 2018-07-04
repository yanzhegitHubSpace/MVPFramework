package presenter;

import java.util.List;

import bean.Boy;
import model.BoyModelImpl;
import model.IBoyModel;
import view.IBoyView;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class BoyPresenter<T extends IBoyView> extends BasePresenter<T> {

    // model层的引用
    private IBoyModel boyModel = new BoyModelImpl();
    // 构造方法
    public BoyPresenter() {
    }
    // 执行操作
    public void fetch(){
        if(mViewRef != null){
            mViewRef.get().showLoding();
            }
        if(boyModel!=null){
            boyModel.loadBoyData(new IBoyModel.OnLoadBoyDataListener() {

                @Override
                public void LoadBoyData(List<Boy> boys) {
                    // 将数据返回给View层
                    mViewRef.get().getBoyData(boys);
                }
            });
        }

    }
}
