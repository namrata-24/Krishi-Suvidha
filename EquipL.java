package namrata.hack1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EquipL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_l);
int id = getIntent().getIntExtra("id",0);
        String name = getIntent().getStringExtra("name");
        String brand = getIntent().getStringExtra("brand");
        String price = getIntent().getStringExtra("price");
        ImageView img = (ImageView)findViewById(R.id.img);
        img.setImageResource(id);
        TextView text1 = (TextView)findViewById(R.id.text1);
        TextView text2 = (TextView)findViewById(R.id.text2);
        TextView text3 = (TextView)findViewById(R.id.text3);
text1.setText(name);
        text2.setText(brand);
        text3.setText(price);
    }
}
