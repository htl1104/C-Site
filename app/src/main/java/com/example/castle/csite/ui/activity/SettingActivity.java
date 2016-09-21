package com.example.castle.csite.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.castle.csite.ui.base.BaseActivity;
import com.example.castle.csite.view.BindLayout;

/**
 * @author 灰太狼
 * @time 2016/9/21  16:12
 * @desc 设置与帮助的页面
 */
@BindLayout(id =R.layout.)
public class SettingActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
    }

    /**
     * 初始化ui
     */
    private void initUI() {
        //ListView list_set = (ListView) findViewById(R.id.lv_set);
    }
}
