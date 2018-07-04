package view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import bean.Girl;
import dream.yan.com.mvpuse.R;
import presenter.GirlPresenter;
import view.BaseActivity;
import view.IGirlView;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView{

    private TextView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView = (TextView) findViewById(R.id.mView);
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BoyActivity.class);
                startActivity(intent);
            }
        });
        // 获取数据
        girlPresenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        // 返回当前处理的引用
        return new GirlPresenter<>();
    }

    @Override
    public void showLoading() {
        Toast.makeText(MainActivity.this,"加载中。。。",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        mView.setText(girls.size() + "            " + girls.get(0).getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 解绑视图
    }
}