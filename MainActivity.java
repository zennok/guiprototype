package com.example.android.guiprototype;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import java.util.Set;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BluetoothAdapter btAdapt = BluetoothAdapter.getDefaultAdapter();
        int REQUEST_ENABLE_BT = 1;

        if(!btAdapt.isEnabled())
        {
            Intent enableBtIntent = new Intent(btAdapt.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }

        Set<BluetoothDevice> pairedD = btAdapt.getBondedDevices();

        if(pairedD.size() > 0)
        {
            for(BluetoothDevice device : pairedD)
            {
                String deviceName = device.getName();
                String deviceHardwareAddress = device.getAddress();
            }
        }
        else
        {
            btAdapt.startDiscovery();
            IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        }


    }

private final BroadcastReceiver mReceiver = new BroadcastReceiver() {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(BluetoothDevice.ACTION_FOUND.equals(action)){
            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
            String deviceName = device.getName();
            String deviceHardwareAddress = device.getAddress();
        }
    }
};



    public void toConnect(View view)
    {
        Intent i = new Intent(this,connected.class);
        startActivity(i);
    }
}

