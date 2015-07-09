package com.bm.roundtest.activity;

import android.app.Activity;
import android.os.Bundle;

import com.bm.roundtest.R;

public class MainActivity extends Activity {

    private CircleMenuLayout layout;
    private int[] arr2 = { 11, 22, 33, 44, 55, 66 };
    private int[] arr3 = { 1, 2, 3, 4, 5, 6 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initView();
    }

    private void initView() {
        int[] arr1 = { R.drawable.address, R.drawable.address, R.drawable.address,
                R.drawable.address, R.drawable.address, R.drawable.address };
        layout = (CircleMenuLayout) findViewById(R.id.round);
        layout.setMenuResource(arr1, arr2, arr3);
    }
}
