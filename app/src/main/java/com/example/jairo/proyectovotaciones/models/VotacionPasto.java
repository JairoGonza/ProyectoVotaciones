package com.example.jairo.proyectovotaciones.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jairo on 4/06/17.
 */

public class VotacionPasto {

    @SerializedName("apellidos")
    @Expose
    private String apellidos;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("sum_votacion")
    @Expose
    private String sumVotacion;
    @SerializedName("boletin")
    @Expose
    private String boletin;
    @SerializedName("nombres")
    @Expose
    private String nombres;
    @SerializedName("nombre_partido")
    @Expose
    private String nombre_partido;



    public String getApellidos() {
        return apellidos;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getSumVotacion() {
        return sumVotacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getBoletin() {
        return boletin;
    }

    public String getNombre_partido() {
        return nombre_partido;
    }
}
