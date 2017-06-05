package com.example.jairo.proyectovotaciones;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import xyz.hanks.library.SmallBang;
import xyz.hanks.library.SmallBangListener;

public class MainActivity extends AppCompatActivity {

    private SmallBang mSmallBang;
    private ImageView imageView,imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSmallBang = SmallBang.attach2Window(this);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zonas(v);
            }
        });

        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                todos(v);
            }
        });
    }

    public void zonas(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosZonas.class);
                startActivity(intent);
            }
        });
    }
    public void todos(final View view){
        mSmallBang.bang(view);
        mSmallBang.setmListener(new SmallBangListener() {
            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationEnd()
            {
                Intent intent = new Intent (view.getContext(), ResultadosCandidatos.class);
                startActivity(intent);
            }
        });
    }
    public void acercade(View view)
    {
        Intent i = new Intent(this, AcercaDe.class);
        startActivity(i);
    }
}
