package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BaseLeftListener extends AbstractArmClickListener {

  Context context;
  
  public BaseLeftListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Base Left", 5).show();
  }
}
