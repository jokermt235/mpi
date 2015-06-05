package com.mpi.root.mpi;

import android.app.Activity;
import android.content.Context;
import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.BroadcastReceiver;
import android.net.Uri;
import android.os.Bundle;
/**
 * Created by root on 5/23/15.
 * Downloader class lets the tracks
 * download without breakage
 */
class Downloader extends  Activity{

    public boolean startDownload(String url){
        DownloadManager dm = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        return true;
    };


}
