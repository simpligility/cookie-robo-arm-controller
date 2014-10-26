package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BaseDownListener extends AbstractArmClickListener {

  Context context;
  
  public BaseDownListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Base Down", 5).show();
  }
}
