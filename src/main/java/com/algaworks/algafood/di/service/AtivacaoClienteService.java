package com.algaworks.algafood.di.service;


import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void ativar (Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistemal está ativo!");



    }

}
