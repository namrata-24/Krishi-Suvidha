package namrata.hack1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Shop extends AppCompatActivity {

    private RecyclerView recycle;
    private Adapt adapt;
    String sd[] = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
recycle = (RecyclerView)findViewById(R.id.recycle);
       // RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recycle.setLayoutManager(layoutManager);
        recycle.setItemAnimator(new DefaultItemAnimator());
        recycle.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        adapt = new Adapt(sd);
        recycle.setAdapter(adapt);
        sd[0]="Agricultural Equipments";
        sd[1]="Agricultural Tools";
        sd[2]="Fertilisers";
    }
}
