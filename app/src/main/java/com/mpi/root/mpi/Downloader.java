package com.mpi.root.mpi;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
/**
 * Created by root on 5/23/15.
 * Downloader class lets the tracks
 * download without breakage
 */
public class Downloader extends  BroadcastReceiver{

    private long enqueue;
    private DownloadManager dm;

    private String newTrack = "";


    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
            long downloadId = intent.getLongExtra(
                    DownloadManager.EXTRA_DOWNLOAD_ID, 0);
            Query query = new Query();
            query.setFilterById(enqueue);
            Cursor c = dm.query(query);
            if (c.moveToFirst()) {
                int columnIndex = c
                        .getColumnIndex(DownloadManager.COLUMN_STATUS);
                if (DownloadManager.STATUS_SUCCESSFUL == c
                        .getInt(columnIndex)) {
                    this.newTrack = c.getString(c.getColumnIndex(DownloadManager.COLUMN_TITLE));
                }
            }
        }

    }

    public String getNewTrack(){
        return newTrack;
    }



}
