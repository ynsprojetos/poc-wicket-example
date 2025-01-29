package br.com.poc.yuri;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import java.io.Serial;
import java.io.Serializable;

public class CriarPage extends BasePage implements Serializable {


    @Serial
    private static final long serialVersionUID = -4515837094699844509L;

    public CriarPage() {
        add(new Label("titulo", Model.of("Criação de contato")));
    }
}
