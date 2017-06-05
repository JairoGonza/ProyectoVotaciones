package com.example.jairo.proyectovotaciones.resultadosCandidatos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.jairo.proyectovotaciones.ListaVotacionAdapter;
import com.example.jairo.proyectovotaciones.MainActivity;
import com.example.jairo.proyectovotaciones.R;
import com.example.jairo.proyectovotaciones.ResultadosCandidatos;
import com.example.jairo.proyectovotaciones.datoApi.DatosOpenApiService;
import com.example.jairo.proyectovotaciones.models.VotacionPasto;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResultadosNeftali extends AppCompatActivity {

    private static final String TAG = "POKEDEX";
    private Retrofit retrofit;
    private RecyclerView recyclerView;
    private ListaVotacionAdapter listaVotacionAdapter;
    private boolean aptoParaCargar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_neftali);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        listaVotacionAdapter = new ListaVotacionAdapter(this);
        recyclerView.setAdapter(listaVotacionAdapter);
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                    if (aptoParaCargar) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, " Llegamos al final.");

                            aptoParaCargar = false;
                            obtenerListaNeftali();
                        }
                    }
                }
            }
        });


        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        obtenerListaNeftali();
    }

    public void principal(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void candidatos(View view)
    {
        Intent i = new Intent(this, ResultadosCandidatos.class);
        startActivity(i);
    }
    private void obtenerListaNeftali()
    {

        DatosOpenApiService service = retrofit.create(DatosOpenApiService.class);
        Call<ArrayList<VotacionPasto>> votacionRespuestaCall = service.obtenerListaNeftali();
        votacionRespuestaCall.enqueue(new Callback<ArrayList<VotacionPasto>>() {
            @Override
            public void onResponse(Call<ArrayList<VotacionPasto>> call, Response<ArrayList<VotacionPasto>> response) {
                if(response.isSuccessful()){
                    ArrayList lista = response.body();
                    listaVotacionAdapter.adicionarListaVotacion(lista);
                }
                else
                {
                    Log.e(TAG, "onResponse: "+response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<ArrayList<VotacionPasto>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }
        });

    }
}