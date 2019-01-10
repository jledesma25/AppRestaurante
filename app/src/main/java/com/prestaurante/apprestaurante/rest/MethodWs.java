package com.prestaurante.apprestaurante.rest;

import com.prestaurante.apprestaurante.entities.DatosPersonaUsuario;
import com.prestaurante.apprestaurante.entities.request.LoguinRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by jledesma on 4/01/19.
 */

public interface MethodWs {

    @POST("Bismarck/LoginUser")
    @Headers("Content-Type: application/json")
    Call<DatosPersonaUsuario> autenticarCredenciales(@Body LoguinRequest loguinRequest);
}
