package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ElbowRightListener extends AbstractArmClickListener {

  Context context;
  
  public ElbowRightListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Elbow Right", 5).show();
  }
}
