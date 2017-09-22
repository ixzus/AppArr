package com.yltx.apparr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


@Route(path = "/apparr/mainactivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String strinfo = getIntent().getStringExtra("strinfo");
        Toast.makeText(this, "MainActivity" + strinfo, Toast.LENGTH_SHORT).show();
        findViewById(R.id.tv_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/applib/libactivity")
                        .withString("strinfo", "frommain")
                        .navigation();
            }
        });
    }
}
