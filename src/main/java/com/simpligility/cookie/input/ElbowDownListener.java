package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ElbowDownListener extends AbstractArmClickListener {

  Context context;
  
  public ElbowDownListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Elbow Down", 5).show();
  }
}
