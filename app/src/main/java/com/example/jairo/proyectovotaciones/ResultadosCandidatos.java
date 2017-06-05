package com.example.jairo.proyectovotaciones;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosBerner;
import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosGilberto;
import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosGuillermo;
import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosGustavo;
import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosLiliana;
import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosNeftali;
import com.example.jairo.proyectovotaciones.resultadosCandidatos.ResultadosOscar;

import xyz.hanks.library.SmallBang;
import xyz.hanks.library.SmallBangListener;

public class ResultadosCandidatos extends AppCompatActivity {

    private SmallBang mSmallBang;
    private ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_candidatos);

        mSmallBang = SmallBang.attach2Window(this);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gustavo(v);
            }
        });

        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                neftali(v);
            }
        });

        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bayardo(v);
            }
        });

        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                berner(v);
            }
        });

        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liliana(v);
            }
        });

        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guillermo(v);
            }
        });

        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oscar(v);
            }
        });
    }

    public void gustavo(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosGustavo.class);
                startActivity(intent);
            }
        });
    }
    public void neftali(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosNeftali.class);
                startActivity(intent);
            }
        });
    }
    public void bayardo(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosGilberto.class);
                startActivity(intent);
            }
        });
    }
    public void berner(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosBerner.class);
                startActivity(intent);
            }
        });
    }
    public void liliana(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosLiliana.class);
                startActivity(intent);
            }
        });
    }
    public void guillermo(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosGuillermo.class);
                startActivity(intent);
            }
        });
    }
    public void oscar(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosOscar.class);
                startActivity(intent);
            }
        });
    }
    public void acercade(View view)
    {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
    public void resultadoporzonas(View view)
    {
        Intent i = new Intent(this, ResultadosZonas.class);
        startActivity(i);
    }
}