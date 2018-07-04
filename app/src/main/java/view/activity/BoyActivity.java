package view.activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import bean.Boy;
import dream.yan.com.mvpuse.R;
import presenter.BoyPresenter;
import view.BaseActivity;
import view.IBoyView;

/**
 * Created by Administrator on 2018/7/3 0003.
 */

public class BoyActivity extends BaseActivity<IBoyView, BoyPresenter<IBoyView>> implements IBoyView {

    private TextView mTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_boy);
        super.onCreate(savedInstanceState);
        mTxtView = (TextView)findViewById(R.id.mTxtView);
        girlPresenter.fetch();
    }

    @Override
    protected BoyPresenter<IBoyView> createPresenter() {
        return new BoyPresenter<IBoyView>();
    }

    @Override
    public void showLoding() {
        Toast.makeText(BoyActivity.this,"boy Loading...",Toast.LENGTH_LONG).show();
    }

    @Override
    public void getBoyData(List<Boy> boys) {
        mTxtView.setText(boys.size() + "         " + boys.get(0).getName());
        Toast.makeText(BoyActivity.this,"boy Loading...  " + boys.size(),Toast.LENGTH_LONG).show();
    }
}
