package controllers;

import models.Chamado;
import play.mvc.Controller;
import play.mvc.With;
import security.Seguranca;

@With(Seguranca.class)
public class Chamados extends Controller {
	
	public static void form() {
		render();
	}
	public static void salvar(Chamado c) {
        c.save();
        Usuarios.listar();
    }

}
