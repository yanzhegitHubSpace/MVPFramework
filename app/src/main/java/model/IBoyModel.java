package model;

import java.util.List;

import bean.Boy;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public interface IBoyModel {

    void loadBoyData(OnLoadBoyDataListener listener);

    // 写个用于传递数据的回调接口
    interface OnLoadBoyDataListener{
        void LoadBoyData(List<Boy> boys);
    }
}
