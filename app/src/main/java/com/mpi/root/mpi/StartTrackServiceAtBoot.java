package com.mpi.root.mpi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by root on 6/10/15.
 */
public class StartTrackServiceAtBoot extends BroadcastReceiver {
    public  void  onReceive(Context context, Intent intent){
        Intent i = new Intent(context, MpiActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
