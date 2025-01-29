package br.com.poc.yuri;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class Inicio extends BasePage {

    private static final long serialVersionUID = 1234567890L;

    public Inicio(){
        Label labelMensagemBoasVindas = new Label("mensagemBoasVindas", Model.of("Bem vindo à agenda eletronica!"));
        add(labelMensagemBoasVindas);
    }


}
