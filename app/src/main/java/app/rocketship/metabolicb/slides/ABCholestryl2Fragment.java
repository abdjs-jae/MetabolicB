package app.rocketship.metabolicb.slides;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import app.rocketship.metabolicb.ABCholestryl2VideoActivity;
import app.rocketship.metabolicb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ABCholestryl2Fragment extends Fragment {

    Button buttonPlayVideo;

    public ABCholestryl2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //buttonPlayVideo.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //Intent i = new Intent(, ABCholestryl2VideoActivity.class);
                //startActivity(i);
                //finish();
            //}
        //});

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abcholestryl2, container, false);
    }

}
