package com.impacta.microservices.debito.demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "debito")
public class Debito {

    @Id
    @Column(name = "id")
    private UUID id = UUID.randomUUID();

    @Column(name = "contaId")
    private Integer contaId;
    @Column(name = "valorDebito")
    private Double valorDebito;
    @Column(name = "clienteId")
    private Integer clienteId;
    @Column(name = "tipoConta")
    private String tipoConta;

    @JsonCreator
    public Debito(@JsonProperty("conta_id") Integer contaId,
                  @JsonProperty("valor_debito") double valorDebito,
                  @JsonProperty("cliente_id") Integer clienteId,
                  @JsonProperty("tipo_conta") String tipoConta) {
        this.contaId = contaId;
        this.valorDebito = valorDebito;
        this.clienteId = clienteId;
        this.tipoConta = tipoConta;
    }

    public Debito(){

    }

    public double getValorDebito() {return valorDebito;}

    public Integer getContaId() {return contaId;}

    public Integer getClienteId() {return clienteId;}

    public String getTipoConta() {return tipoConta;}

    public void setValorDebito(Double valorDebito) {
        this.valorDebito = valorDebito;
    }

    public void setContaId(Integer contaId) {this.contaId = contaId;}

    public void setClienteId(Integer clienteId) {this.clienteId = clienteId;}

    public void setTipoConta(String tipoConta) {this.tipoConta = tipoConta;}
}
