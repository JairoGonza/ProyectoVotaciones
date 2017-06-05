package com.example.jairo.proyectovotaciones;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.jairo.proyectovotaciones.resultadosZonas.ResultadosPasto;
import com.example.jairo.proyectovotaciones.resultadosZonas.ResultadosZonaCordillera;
import com.example.jairo.proyectovotaciones.resultadosZonas.ResultadosZonaCosta;
import com.example.jairo.proyectovotaciones.resultadosZonas.ResultadosZonaNorte;
import com.example.jairo.proyectovotaciones.resultadosZonas.ResultadosZonaOccidente;
import com.example.jairo.proyectovotaciones.resultadosZonas.ResultadosZonaSur;

import xyz.hanks.library.SmallBang;
import xyz.hanks.library.SmallBangListener;

public class ResultadosZonas extends AppCompatActivity {

    private SmallBang mSmallBang;
    private ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_zonas);

        mSmallBang = SmallBang.attach2Window(this);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasto(v);
            }
        });

        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cordillera(v);
            }
        });

        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                costa(v);
            }
        });

        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                norte(v);
            }
        });

        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                occidente(v);
            }
        });

        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sur(v);
            }
        });

    }

    public void pasto(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosPasto.class);
                startActivity(intent);
            }
        });

    }
    public void cordillera(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosZonaCordillera.class);
                startActivity(intent);
            }
        });

    }
    public void costa(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosZonaCosta.class);
                startActivity(intent);
            }
        });

    }
    public void norte(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosZonaNorte.class);
                startActivity(intent);
            }
        });

    }
    public void occidente(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosZonaOccidente.class);
                startActivity(intent);
            }
        });

    }
    public void sur(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosZonaSur.class);
                startActivity(intent);
            }
        });

    }
    public void acercade(View view)
    {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
    public void resultadosporcandidatos(View view)
    {
        Intent i = new Intent(this, ResultadosCandidatos.class);
        startActivity(i);
    }
}
