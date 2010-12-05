package bb.com.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class banana extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final Button button = (Button) findViewById(R.id.Button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Klasse winnaar = null;
				Klasse speler1 = new Sniper(200, 100);
				Klasse speler2 = new Assault(100, 250);
				// Assault wordt aangevallen door Sniper
				winnaar = speler2.bereken(speler1);
				System.out.println("winnaar is: "
						+ winnaar.getClass().getName() + " met "
						+ winnaar.levenspunten + " levenspunten");
				Context context = getApplicationContext();
				CharSequence text = "winnaar is: "
					+ winnaar.getClass().getName() + " met "
					+ winnaar.levenspunten + " levenspunten";
				int duration = Toast.LENGTH_LONG;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}

		});

	}
}
