package app.rocketship.metabolicb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.rocketship.metabolicb.utils.PageSlidesHandler;

public class MainActivity extends AppCompatActivity {

    public static PageSlidesHandler.Page selectedPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
