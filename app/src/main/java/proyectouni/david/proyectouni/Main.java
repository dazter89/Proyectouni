package proyectouni.david.proyectouni;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import Fragmentos.fragmento_ingelectrica;
import Fragmentos.fragmento_introduccion;
import Fragmentos.fragmento_postgrado;
import Fragmentos.fragmento_requisitos;
import Fragmentos.fragmentoingindustrial;
import Fragmentos.fragmentoingmecanica;
import Fragmentos.fragmentoinicio;
import Fragmentos.fragmentomain;
import Fragmentos.fragmentosistemas;


public class Main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        /////////////

        android.app.FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.contenedor, new fragmentoinicio()).commit();
        //trae el contenedor que creamos en content main

        /////////////
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        android.app.FragmentManager fm = getFragmentManager();


        int id = item.getItemId();

        if (id == R.id.Faccienytec) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmento_postgrado()).commit();

        } else if (id == R.id.ingcivil) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmentomain()).commit();

        }else if (id== R.id.Requisitos){
            fm.beginTransaction().replace(R.id.contenedor, new fragmento_requisitos()).commit();

        } else if (id == R.id.Conocenos) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmento_introduccion()).commit();

        }
        else if (id == R.id.ingelect) {
        fm.beginTransaction().replace(R.id.contenedor, new fragmento_ingelectrica()).commit();

        }
        else if (id == R.id.ingindustrial) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmentoingindustrial()).commit();

        }

        else if (id == R.id.ingmec) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmentoingmecanica()).commit();

        }

        else if (id == R.id.ingmec) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmentoingmecanica()).commit();

        }
        else if (id == R.id.ingsis ) {
            fm.beginTransaction().replace(R.id.contenedor, new fragmentosistemas()).commit();

        }
        else if (id == R.id.correo ) {


           Intent intento = new Intent(Main.this, Correo.class);
            startActivity(intento);

            }





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
