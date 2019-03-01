package com.example.familia.paginaf;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottonnav=findViewById(R.id.bottom_navigation);
        bottonnav.setOnNavigationItemSelectedListener(navListener);


    }
    public void Mensaje(View view){
        EditText salon=(EditText)findViewById(R.id.editText);
        EditText sede=(EditText)findViewById(R.id.editText3);

        String mesage=String.format("el salon %s, de la sede%,esta agregado",salon.getText().toString(),sede.getText().toString());
        Toast.makeText(MainActivity.this,mesage,Toast.LENGTH_SHORT).show();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
            Fragment  selectedFragment=null;
            switch (Item.getItemId()){
                case R.id.nav_home:
                    selectedFragment=new HomeFragment();
                    break;
                case R.id.nav_accesible:
                    selectedFragment=new AccesibleFragment();
                    break;
                case R.id.nav_agegrar:
                    selectedFragment=new AgregarFragment();
                    break;



            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };
}
