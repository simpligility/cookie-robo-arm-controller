package com.simpligility.cookie.input;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class BaseRightListener extends AbstractArmClickListener {

  Context context;
  
  public BaseRightListener(Context context) {
    super();
    this.context = context;
  }

  public void onClick(View v) {
    Toast.makeText(context, "Base Right", 5).show();
  }
}
