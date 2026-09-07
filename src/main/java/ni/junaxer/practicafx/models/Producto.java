package ni.junaxer.practicafx.models;

import java.time.LocalDate;
import java.util.List;

public class Producto {

    private String id;
    private String rutaFoto;
    private String nombre;
    private String categoria;
    private List<String> etiquetas;
    private LocalDate fechaRegistro;
    private Boolean estado;
    private Boolean envioGratis;
    private Boolean aplicarImpuesto;


    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getEnvioGratis() {
        return envioGratis;
    }

    public void setEnvioGratis(Boolean envioGratis) {
        this.envioGratis = envioGratis;
    }

    public Boolean getAplicarImpuesto() {
        return aplicarImpuesto;
    }

    public void setAplicarImpuesto(Boolean aplicarImpuesto) {
        this.aplicarImpuesto = aplicarImpuesto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Producto(
            String rutaFoto,
            String nombre,
            String categoria,
            List<String> etiquetas,
            LocalDate fechaRegistro,
            Boolean estado,
            Boolean envioGratis,
            Boolean aplicarImpuesto
    ) {
        this.id = java.util.UUID.randomUUID().toString();
        this.rutaFoto = rutaFoto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.envioGratis = envioGratis;
        this.aplicarImpuesto = aplicarImpuesto;

    }
}
