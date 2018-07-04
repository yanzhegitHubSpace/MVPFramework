package model;

import java.util.ArrayList;
import java.util.List;

import bean.Girl;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class GirlModelImp implements IGirlModel{

    List<Girl> data = new ArrayList<Girl>();

    @Override
    public void loadGirl(GirlOnLoadingListener listener) {
        data.add(new Girl("杨艳",18));
        data.add(new Girl("yy",19));
        data.add(new Girl("yy",20));
        data.add(new Girl("yy",21));
        data.add(new Girl("yy",22));
        data.add(new Girl("yy",23));
        data.add(new Girl("yy",24));
        data.add(new Girl("yy",25));
        data.add(new Girl("yy",26));
        data.add(new Girl("yy",27));
        data.add(new Girl("yy",28));
        // 发送数据
        listener.onComplete(data);
    }
}
