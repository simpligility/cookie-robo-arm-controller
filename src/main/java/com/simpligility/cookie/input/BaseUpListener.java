package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BaseUpListener extends AbstractArmClickListener {

  Context context;
  
  public BaseUpListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Base Up", 5).show();
  }
}
