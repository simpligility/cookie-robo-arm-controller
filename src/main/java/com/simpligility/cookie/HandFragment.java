package com.simpligility.cookie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HandFragment extends Fragment {

  public HandFragment() {
    super();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
          Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_hand, container, false);
      return rootView;
  }
}
