/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MetodosUsuario;
import Model.Usuario;
import View.ViewRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControllerUsuario implements ActionListener {

    ViewRegistro registro;
    MetodosUsuario cu=MetodosUsuario.getIntance();

    public void eventos() {
        registro.btnGuardar.addActionListener(this);
    }

    public ControllerUsuario(ViewRegistro vista) {
        this.registro = vista;
        eventos();
    }

    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if (evt.equals(registro.btnGuardar)) {
            String nombre, apellido, user, pass, email;
            nombre = registro.txtNombre.getText();
            apellido = registro.txtApellido.getText();
            user = registro.txtUser.getText();
            pass = registro.txtPass.getText();
            email = registro.txtEmail.getText();
            Usuario us = new Usuario();
            us.setNombre(nombre);
            us.setApellido(apellido);
            us.setUser(user);
            us.setPass(pass);
            us.setEmail(email);

            cu.registrarUsuario(us);

        }
    }

}
