package com.simpligility.cookie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ActionsFragment extends Fragment {
  /**
   * The fragment argument representing the section number for this
   * fragment.
   */
  public static final String ARG_SECTION_NUMBER = "section_number";

  public ActionsFragment() {
    super();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
          Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_actions, container, false);
      return rootView;
  }
}
