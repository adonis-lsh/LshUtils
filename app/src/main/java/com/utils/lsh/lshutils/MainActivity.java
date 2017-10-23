package com.utils.lsh.lshutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lsh.utils.ObjectUtils;

/**
 * 对commons-lang3-3.6这个常用的工具类的一个更换包名的操作,为什么会如此无聊的
 * 去更换包名,因为当你的项目引用commons-lang3-3.6这个工具类时,调用ObjectUtils这个类
 * 会直接在小米5上面报错,原因就是小米5的rom也引用了这个第三方库,但是没有更改包名导致,他不改
 * 肯定需要咱们去改.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Object o = new Object();
        if (ObjectUtils.allNotNull(o)) {
            Toast.makeText(this, "sdfsadf", Toast.LENGTH_SHORT).show();
        }
    }
}
