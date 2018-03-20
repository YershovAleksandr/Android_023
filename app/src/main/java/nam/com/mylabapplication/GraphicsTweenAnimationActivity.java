package nam.com.mylabapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class GraphicsTweenAnimationActivity extends AppCompatActivity {

	private ImageView mImageView;
	private Animation mAnim;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graphicstweenanimation);

		mImageView = (ImageView) findViewById(R.id.icon);

		mAnim = AnimationUtils.loadAnimation(this, R.anim.view_animation);

	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			mImageView.startAnimation(mAnim);
		}
	}
}