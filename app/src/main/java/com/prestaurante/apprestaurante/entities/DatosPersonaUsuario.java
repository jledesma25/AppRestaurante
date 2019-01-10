package com.prestaurante.apprestaurante.entities;

/**
 * Created by jledesma on 9/01/19.
 */

public class DatosPersonaUsuario {


    public int empleado;
    public String codigousuario;
    public String empresacodigo;
    public String sucursal;
    public String origen;
    public String nombrecompleto;
    public String mensajeresultado;
    public int mensajecodigo;

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public String getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(String codigousuario) {
        this.codigousuario = codigousuario;
    }

    public String getEmpresacodigo() {
        return empresacodigo;
    }

    public void setEmpresacodigo(String empresacodigo) {
        this.empresacodigo = empresacodigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getMensajeresultado() {
        return mensajeresultado;
    }

    public void setMensajeresultado(String mensajeresultado) {
        this.mensajeresultado = mensajeresultado;
    }

    public int getMensajecodigo() {
        return mensajecodigo;
    }

    public void setMensajecodigo(int mensajecodigo) {
        this.mensajecodigo = mensajecodigo;
    }
}
