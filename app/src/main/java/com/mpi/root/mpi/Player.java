package com.mpi.root.mpi;

import android.media.MediaPlayer;
import android.os.Environment;

import java.io.File;

/**
 * Created by root on 8/5/15.
 */
public class Player extends MediaPlayer{

    private String currentTrack;
    {
        currentTrack = "";
    }

    private int currentTrackIdx; {
        currentTrackIdx = 0;
    }


    private Settings settings = new Settings();

    public File[] getLocalTracks(){

        File file = new File((CharSequence) Environment.getExternalStorageDirectory().toString() + settings.TRACK_DIRECTORY);

        File tracks[] = file.listFiles();

        return tracks;
    }

    public  void setCurrentTrack(String path, int idx){

        this.currentTrack = path;

        this.currentTrackIdx = idx;

    }

    public int getCurrentTrackIdx(){
        return currentTrackIdx;
    }

    public String getCurrentTrack(){
        return  currentTrack;
    }



}
