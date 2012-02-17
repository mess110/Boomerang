package com.mess110.boomerang;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BoomerangActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		final ToggleButton button = (ToggleButton) findViewById(R.id.toggleButton1);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (button.isChecked()) {
					Toast.makeText(getApplicationContext(), R.string.toast,
							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}