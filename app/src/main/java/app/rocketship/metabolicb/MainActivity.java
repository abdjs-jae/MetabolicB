package app.rocketship.metabolicb;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import app.rocketship.metabolicb.utils.PageSlidesHandler;
import app.rocketship.metabolicb.utils.SliderActivity;
import app.rocketship.natrapharmutil.ActivityHandler;
import app.rocketship.natrapharmutil.DataHandler;
import app.rocketship.natrapharmutil.ProfileActivity;
import app.rocketship.natrapharmutil.sqlite.SQLiteSingleton;

public class MainActivity extends AppCompatActivity {

    ImageView ivABC, ivVelmetia, ivBack, ivProfile;

    public static PageSlidesHandler.Page selectedPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBack = (ImageView) findViewById(R.id.iv_back);
        ivBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityHandler.goHome(MainActivity.this);

            }

        });

        ivProfile = (ImageView) findViewById(R.id.iv_profile);
        ivProfile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ActivityHandler.goToProfile(MainActivity.this);

            }

        });

        // ivABC = (ImageView) findViewById(R.id.iv_abcholestryl);
        ivVelmetia = (ImageView) findViewById(R.id.iv_velmetia);

        /*
        ivABC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSliderActivity(PageSlidesHandler.Page.ABCHOLESTRYL);
            }
        });
        */

        ivVelmetia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSliderActivity(PageSlidesHandler.Page.VELMETIA);
            }
        });
    }

    private void goToSliderActivity(PageSlidesHandler.Page page){

        DataHandler.setCurrentContext(this);
        DataHandler.savePageClick(page.getKey());

        // DataHandler.printClicks();

        selectedPage = page;

        Intent i = new Intent(this, SliderActivity.class);

        startActivity(i);
        finish();
        overridePendingTransition(0, R.anim.fade_in);
    }

    @Override
    public void onBackPressed() {
        ActivityHandler.goHome(MainActivity.this);
    }

    @Override
    protected void onDestroy(){

        SQLiteSingleton.getInstance(this).close();

        super.onDestroy();
    }
}
