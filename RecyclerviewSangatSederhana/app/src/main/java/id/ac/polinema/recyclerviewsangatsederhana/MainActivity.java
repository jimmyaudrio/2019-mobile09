package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;


import id.ac.polinema.recyclerviewsangatsederhana.Models.NightHero;
import id.ac.polinema.recyclerviewsangatsederhana.Models.SuperHero;
import id.ac.polinema.recyclerviewsangatsederhana.adapters.NightHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;


public class MainActivity extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvSuperHero;
    //instansiasi list superhero
    List<NightHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);
        //Membuat object hero
        NightHero hero = new NightHero("Instagram", "https://img.icons8.com/cotton/2x/instagram.png");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);
        //membuat object hero baru
        hero = new NightHero("Facebook", "https://i.pinimg.com/originals/4b/b7/71/4bb7714d4fafdd4426ef8644fde397fc.png");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);
        //Instansiasi Adapter
        NightHeroAdapter nightHeroAdapter = new NightHeroAdapter(listSuperHero);
        //set adapter dan layoutmanager
        rvSuperHero.setAdapter(nightHeroAdapter);
        rvSuperHero.setLayoutManager(new GridLayoutManager(this, 2));


    }
}
