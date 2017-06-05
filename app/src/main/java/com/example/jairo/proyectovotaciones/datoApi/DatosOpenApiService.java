package com.example.jairo.proyectovotaciones.datoApi;

import com.example.jairo.proyectovotaciones.models.VotacionPasto;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jairo on 4/06/17.
 */

public interface DatosOpenApiService
{
    //VotacionPasto
    @GET("3qc4-xhgr.json")
    Call<ArrayList<VotacionPasto>> obtenerListaPasto();

    //VotacionZonaNorte
    @GET("wp7u-8p77.json")
    Call<ArrayList<VotacionPasto>> obtenerListaZonaNorte();

    //VotacionZonaCordillera
    @GET("gsj8-99p9.json")
    Call<ArrayList<VotacionPasto>> obtenerListaZonaCordillera();

    //VotacionZonaCosta
    @GET("rran-ep8q.json")
    Call<ArrayList<VotacionPasto>> obtenerListaZonaCosta();

    //VotacionZonaOccidental
    @GET("c8fe-k9j5.json")
    Call<ArrayList<VotacionPasto>> obtenerListaZonaOccidente();

    //VotacionZonaSur
    @GET("7mis-bvxd.json")
    Call<ArrayList<VotacionPasto>> obtenerListaZonaSur();

    //VotacionGustavo
    @GET("a3xq-fsah.json")
    Call<ArrayList<VotacionPasto>> obtenerListaGustavo();

    //BERNER
    @GET("yin6-bix5.json")
    Call<ArrayList<VotacionPasto>> obtenerListaBerner();

    //OSCAR BRAVO
    @GET("nczd-pj4q.json")
    Call<ArrayList<VotacionPasto>> obtenerListaOscar();

    //GUILLERMO JORGE
    @GET("erq9-7gis.json")
    Call<ArrayList<VotacionPasto>> obtenerListaGuillermo();

    //DIELA LILIANA
    @GET("pt5h-sdrw.json")
    Call<ArrayList<VotacionPasto>> obtenerListaLiliana();

    //BAYARDO GILBERTO
    @GET("9pu8-s5wv.json")
    Call<ArrayList<VotacionPasto>> obtenerListaGilberto();

    //NEFTALI
    @GET("p6x4-rpag.json")
    Call<ArrayList<VotacionPasto>> obtenerListaNeftali();
}
