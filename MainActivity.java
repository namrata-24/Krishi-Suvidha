package namrata.hack1;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView name = (TextView)findViewById(R.id.name);
        String a = getIntent().getStringExtra("name");
        if(a!=null){
            name.setText(a);
        }

        ImageView text1 = (ImageView)findViewById(R.id.text1);
        ImageView text2 = (ImageView)findViewById(R.id.text2);
        ImageView text3 = (ImageView)findViewById(R.id.text3);
        ImageView text4 = (ImageView)findViewById(R.id.text4);
        text2.setImageResource(R.drawable.text2);
        text1.setImageResource(R.drawable.text1);
        text3.setImageResource(R.drawable.text3);
        text4.setImageResource(R.drawable.text4);
        final Intent in = new Intent(this,Shops.class);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.putExtra("id",1);
                startActivity(in);
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.putExtra("id",2);
                startActivity(in);
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.putExtra("id",3);
                startActivity(in);
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.shop) {
            Intent in = new Intent(this,Shops.class);
            startActivity(in);
        } else if (id == R.id.diss) {
            Intent in = new Intent(this,Diss.class);
            startActivity(in);
        } else if (id == R.id.news) {
            Intent in = new Intent(this,News.class);
            startActivity(in);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
