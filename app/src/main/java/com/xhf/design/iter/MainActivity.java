package com.xhf.design.iter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.xhf.design.R;

public class MainActivity extends Activity {
	private RelativeLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
    }
}
