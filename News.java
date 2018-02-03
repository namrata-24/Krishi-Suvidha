package namrata.hack1;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class News extends AppCompatActivity implements GestureDetector.OnGestureListener{

    private GestureDetectorCompat gesture ;
    public ImageView img;
    public TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
         img = (ImageView)findViewById(R.id.img);
        text = (TextView)findViewById(R.id.text);
        gesture = new GestureDetectorCompat(this,this);
img.setImageResource(R.drawable.text1);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        text.setText("Succesful");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        int id = getApplicationContext().getResources().getIdentifier("img","drawable",getPackageName());
        if(id==R.drawable.text1) {
            img.setImageResource(R.drawable.text2);
        }
      /*  if (img.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.text1).getConstantState()){
            img.setImageResource(R.drawable.text2);
        }else
            if(img.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.text2).getConstantState()){
                img.setImageResource(R.drawable.text3);
            }
            if(img.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.text3).getConstantState()){
                img.setImageResource(R.drawable.text4);
            } */
            return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
