package hpr.beans;

/**
 *
 * @author Humberto Pinelo Rivera
 */
public class ArqueoBean {

    private String fechaArqueo;
    private String fechaMaxDetener;
    private Integer idSucursal;
    private String tipoTarjeta;
    private Integer invInicioArqueo;
    private Integer invFinalArqueo;
    private Integer faltantes;
    private Integer tarjNoDesliz;
    private String estatus;

    public ArqueoBean(String fechaArqueo, String fechaMaxDetener, Integer idSucursal, String tipoTarjeta, Integer invInicioArqueo, Integer invFinalArqueo, Integer faltantes, Integer tarjNoDesliz, String estatus) {
        this.fechaArqueo = fechaArqueo;
        this.fechaMaxDetener = fechaMaxDetener;
        this.idSucursal = idSucursal;
        this.tipoTarjeta = tipoTarjeta;
        this.invInicioArqueo = invInicioArqueo;
        this.invFinalArqueo = invFinalArqueo;
        this.faltantes = faltantes;
        this.tarjNoDesliz = tarjNoDesliz;
        this.estatus = estatus;
    }

    public ArqueoBean() {
    }

    public String getFechaArqueo() {
        return fechaArqueo;
    }

    public void setFechaArqueo(String fechaArqueo) {
        this.fechaArqueo = fechaArqueo;
    }

    public String getFechaMaxDetener() {
        return fechaMaxDetener;
    }

    public void setFechaMaxDetener(String fechaMaxDetener) {
        this.fechaMaxDetener = fechaMaxDetener;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Integer getInvInicioArqueo() {
        return invInicioArqueo;
    }

    public void setInvInicioArqueo(Integer invInicioArqueo) {
        this.invInicioArqueo = invInicioArqueo;
    }

    public Integer getInvFinalArqueo() {
        return invFinalArqueo;
    }

    public void setInvFinalArqueo(Integer invFinalArqueo) {
        this.invFinalArqueo = invFinalArqueo;
    }

    public Integer getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(Integer faltantes) {
        this.faltantes = faltantes;
    }

    public Integer getTarjNoDesliz() {
        return tarjNoDesliz;
    }

    public void setTarjNoDesliz(Integer tarjNoDesliz) {
        this.tarjNoDesliz = tarjNoDesliz;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}
