package model;

import java.util.List;

import bean.Girl;

/**
 * Created by Administrator on 2018/7/3 0003.
 * 用来加载数据
 */

public interface IGirlModel {

    void loadGirl(GirlOnLoadingListener listener);
    // 设计一个内部回调接口
    interface GirlOnLoadingListener{
        void onComplete(List<Girl> girls);
    }
}
