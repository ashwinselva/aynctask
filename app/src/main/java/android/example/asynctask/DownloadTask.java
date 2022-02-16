package android.example.asynctask;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

public class DownloadTask extends AsyncTask<String, Integer, Void> {

    public static String TAG =DownloadTask.class.getSimpleName();

    ProgressBar mProgressbar;
    public DownloadTask(ProgressBar progressbar) {
        mProgressbar = progressbar;
    }

    @Override
    protected Void doInBackground(String... url) {
        Log.i(TAG, "Downloading movie from the url"+url[0]);
        for(int i=1;i<100;i++) {
            try {
                Thread.sleep(200);
                publishProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        mProgressbar.setProgress(values[0]);
    }
}
