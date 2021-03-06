package logger.dingo.com.okhttplogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import logger.dingo.com.lib.MyHttpLoggerInterceptor;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyHttpLoggerInterceptor interceptor = new MyHttpLoggerInterceptor();
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
    }
}
