package android.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressbar = findViewById(R.id.progressBar);
    }

    public void startDownload(View view) {
        DownloadTask downloadtask = new DownloadTask(progressbar);
        downloadtask.execute("http://youtube.com/movie");
    }
}