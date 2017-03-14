package app.rocketship.metabolicb.slides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.IOException;

import app.rocketship.metabolicb.R;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ABCholestryl1Fragment extends Fragment {

    GifImageView abc1;

    public ABCholestryl1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_abcholestryl1, container, false);

        abc1 = (GifImageView) v.findViewById(R.id.gif_abc1);

        if(this.isHidden())
            ((GifDrawable)abc1.getDrawable()).stop();

        Log.d("AB1 Fragment", ((GifDrawable)abc1.getDrawable()).getNumberOfFrames() + "");
        Log.d("AB1 Fragment", ((GifDrawable)abc1.getDrawable()).getDuration() + "");

        // Inflate the layout for this fragment
        return v;
    }

}
