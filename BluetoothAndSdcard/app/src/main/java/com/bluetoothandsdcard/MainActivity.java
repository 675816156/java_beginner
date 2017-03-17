package com.bluetoothandsdcard;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/*
    static {
        // load library: libsdtest.so
        ///system/etc/public.libraries.txt 添加这个so
        //不然会报错误：
        //dlopen failed: library "/system/lib64/libsdtest.so" needed or dlopened by "/system/lib64/libnativeloader.so" is not accessible for the namespace "classloader-namespace"
        try {
            System.loadLibrary("sdtest");
        } catch (Exception e) {
            System.out.println("WARNING: Could not load library!" + e.getMessage());
        }
    }
*/
    private BroadcastReceiver BTReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            TextView tv = (TextView)findViewById(R.id.textView);
            final String BTAction = intent.getAction();
            if (BTAction.equals(BluetoothAdapter.ACTION_STATE_CHANGED)) {
                final int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, BluetoothAdapter.ERROR);
                if (state == BluetoothAdapter.STATE_ON)
                    tv.setText("蓝牙已开启");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter BTFilter = new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED);
        registerReceiver(BTReceiver, BTFilter);
    }

    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(BTReceiver);
    }

    private void ShowMsg(String s) {
        if (s == null) return;
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }

    /*
    public static native int sdtest();
    private void SdTest() {
        try {
            int ret = sdtest();
            ShowMsg("sdtest = " + ret);
        } catch (Exception e) {
            ShowMsg("sdtest function not found" + e.getMessage());
        }

    }*/

    public void onClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView);
        BluetoothAdapter BTAdapter = BluetoothAdapter.getDefaultAdapter();

        try {
            if (BTAdapter == null) {
                tv.setText("Fail1");
                return;
            }

            tv.setText("蓝牙测试中");
            if (BTAdapter.isEnabled())
                tv.setText("蓝牙已开启");
            else
                BTAdapter.enable();
        } catch (Exception e) {
            Log.d("BT_TEST", "BT open fail" + e.getMessage());
            tv.setText("Fail");
        }
    }
}
