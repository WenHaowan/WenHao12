package as.bwei.com.wenhao1.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

import as.bwei.com.wenhao1.R;

public class ShanPingActivity extends AppCompatActivity implements Animation.AnimationListener{

    private RelativeLayout splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan_ping);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        splash = (RelativeLayout) findViewById(R.id.splash);
        AlphaAnimation animation = new AlphaAnimation(0, 1);
        animation.setDuration(3000);
        animation.setAnimationListener(this);
        splash.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        tiao();
    }

    private void tiao() {
        Intent intent = new Intent(ShanPingActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
