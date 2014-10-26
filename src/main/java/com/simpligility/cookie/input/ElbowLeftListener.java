package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ElbowLeftListener extends AbstractArmClickListener {

  Context context;
  
  public ElbowLeftListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Elbow Left mnn ", 5).show();
  }
}
