package controllers;

import java.util.List;
import models.Equipamento;
import play.mvc.Controller;
import play.mvc.With;
import security.Seguranca;

@With(Seguranca.class)
public class Equipamentos extends Controller {

    public static void form() {
        render();
    }

    public static void salvar(Equipamento e) {
        e.save();
        Usuarios.listar();
    }
}