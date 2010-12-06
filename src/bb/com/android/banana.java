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
				Game thegame = new Game();
				PlayerClass winner = null;
				PlayerClass speler1 = new Sniper(200, 100);
				PlayerClass speler2 = new Assault(100, 250);
				// Assault is attacked by Sniper
				winner = thegame.calculate(speler2, speler1);
				System.out.println("winnaar is: "
						+ winner.getClass().getName() + " met "
						+ winner.healthpoints + " levenspunten");
				Context context = getApplicationContext();
				CharSequence text = "winnaar is: "
					+ winner.getClass().getName() + " met "
					+ winner.healthpoints + " levenspunten";
				int duration = Toast.LENGTH_LONG;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}

		});

	}
}
