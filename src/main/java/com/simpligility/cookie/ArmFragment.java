package com.simpligility.cookie;

import com.simpligility.cookie.input.BaseUpListener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ArmFragment extends Fragment {

  View rootView;
  Button btnBaseUp;
  
  public ArmFragment() {
    super();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
          Bundle savedInstanceState) {
      rootView = inflater.inflate(R.layout.fragment_arm, container, false);
      btnBaseUp = (Button) rootView.findViewById(R.id.btnBaseUp);
      btnBaseUp.setOnClickListener(new BaseUpListener(getActivity().getBaseContext()));
      return rootView;
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }
}
