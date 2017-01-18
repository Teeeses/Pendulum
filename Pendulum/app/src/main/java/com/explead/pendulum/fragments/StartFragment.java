package com.explead.pendulum.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.explead.pendulum.R;
import com.explead.pendulum.Surface;


/**
 * Created by Александр on 05.12.2016.
 */
public class StartFragment extends Fragment {


    private Surface viewSurface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);

        viewSurface = (Surface) view.findViewById(R.id.viewSurface);

        return view;
    }
}
