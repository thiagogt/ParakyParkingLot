package paraky.domain;

import java.util.Date;

public class Boletos {
    private Integer idBoleto;

    private Integer idFamilia;

    private Date dataDoPagamento;

    private Boolean boletoPago;

    public Integer getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(Integer idBoleto) {
        this.idBoleto = idBoleto;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Date getDataDoPagamento() {
        return dataDoPagamento;
    }

    public void setDataDoPagamento(Date dataDoPagamento) {
        this.dataDoPagamento = dataDoPagamento;
    }

    public Boolean getBoletoPago() {
        return boletoPago;
    }

    public void setBoletoPago(Boolean boletoPago) {
        this.boletoPago = boletoPago;
    }
}