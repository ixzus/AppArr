package com.yltx.applib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/applib/libactivity")
public class LibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);
        String strinfo = getIntent().getStringExtra("strinfo");
        Toast.makeText(this, "MainActivity" + strinfo, Toast.LENGTH_SHORT).show();
        findViewById(R.id.tv_lib).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/applib/nextactivity")
                        .withString("strinfo", "fromlib")
                        .navigation();
            }
        });
    }
}
