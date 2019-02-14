package com.example.ruman.navdrawer;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageView home,doctors,emergency,ambulance,setting,about,help,exit;
        TextView thome,tdoctors,temergency,tambulance,tsetting,tabout,thelp,texit;
/*
        home=(ImageView)findViewById(R.id.ghome);
        thome=(TextView)findViewById(R.id.gthome);
        */

        doctors=(ImageView)findViewById(R.id.gdoctors);
        tdoctors=(TextView)findViewById(R.id.gtdoctors);

        emergency=(ImageView)findViewById(R.id.gemergency);
        temergency=(TextView)findViewById(R.id.gtemergency);

        ambulance=(ImageView)findViewById(R.id.gambulance);
        tambulance=(TextView)findViewById(R.id.gtambulance);

        setting=(ImageView)findViewById(R.id.gsetting);
        tsetting=(TextView)findViewById(R.id.gtsetting);

        about=(ImageView)findViewById(R.id.gabout);
        tabout=(TextView)findViewById(R.id.gtabout);

        help=(ImageView)findViewById(R.id.ghelp);
        thelp=(TextView)findViewById(R.id.gthelp);
/*
        exit=(ImageView)findViewById(R.id.gexit);
        texit=(TextView)findViewById(R.id.gtexit);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.SPLASH"));
            }
        });
        thome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.SPLASH"));
            }
        });
*/
        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.AMBULANCE"));
            }
        });
        tambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.AMBULANCE"));
            }
        });

        doctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.DOCTORS"));
            }
        });
        tdoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.DOCTORS"));
            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.EMERGENCY"));
            }
        });
        temergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.EMERGENCY"));
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.HELP"));
            }
        });
        thelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.HELP"));
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.SETTING"));
            }
        });
        tsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.SETTING"));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.ABOUT"));
            }
        });
        tabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.ABOUT"));
            }
        });
/*
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.EXIT"));
            }
        });
        texit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("com.example.ruman.navdrawer.EXIT"));
            }
        });
        */

/*
        Button doctor = (Button) findViewById(R.id.bdoc);
        Button ambulance = (Button) findViewById(R.id.bamb);
        Button emergency = (Button) findViewById(R.id.bemergency);
        Button about = (Button)findViewById(R.id.babout);
        doctor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent=new Intent("com.example.ruman.navdrawer.DOCTORS");
                startActivity(intent);
            }
        });

        ambulance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.ruman.navdrawer.AMBULANCE"));
            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.ruman.navdrawer.EMERGENCY"));
            }
        });
        about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent("com.example.ruman.navdrawer.ABOUT"));
            }
        });
*/
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
        if (id == R.id.menu_login) {
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        else if(id==R.id.menu_register){
            Intent intent=new Intent(this,RegistrationActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            Intent intent =new Intent(this,SplashActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_doctors) {
            Intent intent=new Intent(this,Doctors.class);
            startActivity(intent);

        } else if (id == R.id.nav_emergency) {
            Intent intent=new Intent(this,EmergencyActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_ambulance) {
            Intent intent=new Intent(this,AmbulanceActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_about) {
            Intent intent=new Intent(this,AboutActivity.class);
            startActivity(intent);

        } else if(id==R.id.nav_exit){
            Intent intent=new Intent(this,Exit.class);
            startActivity(intent);

        }else if (id == R.id.nav_help) {
            Intent intent=new Intent(this,help.class);
            startActivity(intent);

        }else if(id==R.id.nav_setting){
            Intent intent=new Intent(this,SettingActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
}
