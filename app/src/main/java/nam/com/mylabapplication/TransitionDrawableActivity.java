package nam.com.mylabapplication;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class TransitionDrawableActivity extends AppCompatActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.graphicstransitiondrawable);
		
		TransitionDrawable transition = (TransitionDrawable) getResources().getDrawable(R.drawable.shape_transition);

		transition.setCrossFadeEnabled(true);

		((ImageView) findViewById(R.id.image_view)).setImageDrawable(transition);
		
		transition.startTransition(2000);
	}
}