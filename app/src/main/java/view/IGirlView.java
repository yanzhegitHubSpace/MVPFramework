package view;

import java.util.List;

import bean.Girl;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public interface IGirlView {

    void showLoading();
    // 显示listView中的数据（使用回调的方式返回数据，也就是使用该接口）
    void showGirls(List<Girl> girls);
}
