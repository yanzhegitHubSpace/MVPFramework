package model;

import java.util.ArrayList;

import bean.Boy;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class BoyModelImpl implements IBoyModel{

    @Override
    public void loadBoyData(OnLoadBoyDataListener listener) {
        ArrayList<Boy> boys = new ArrayList<>();
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        boys.add(new Boy("zz","cc"));
        // 创建的数据需要回调回去
        listener.LoadBoyData(boys);
    }
}
