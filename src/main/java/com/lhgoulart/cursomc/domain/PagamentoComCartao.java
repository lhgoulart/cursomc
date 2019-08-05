package com.lhgoulart.cursomc.domain;

import javax.persistence.Entity;

import com.lhgoulart.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDep;

	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroDep) {
		super(id, estadoPagamento, pedido);
		this.numeroDep = numeroDep;
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroDep() {
		return numeroDep;
	}

	public void setNumeroDep(Integer numeroDep) {
		this.numeroDep = numeroDep;
	}
	
	
}
