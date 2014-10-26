package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ElbowUpListener extends AbstractArmClickListener {

  Context context;
  
  public ElbowUpListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Elbow Up", 5).show();
  }
}
