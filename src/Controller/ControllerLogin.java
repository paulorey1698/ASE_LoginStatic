/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MetodosUsuario;
import View.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControllerLogin implements ActionListener {

    MetodosUsuario cu =MetodosUsuario.getIntance();
    Login log;

    public void eventos() {
        log.btnLoginIn.addActionListener(this);
    }

    public ControllerLogin(Login login) {
        this.log = login;
        eventos();
    }

    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if(evt.equals(log.btnLoginIn)){
           
            String us,pas;
            us=log.txtUsuario.getText();
            pas=log.txtPass.getText();
            cu.validarUsuario(us, pas);
        }
        if(evt.equals(log.btnRecuperar)){
            String user,pass;
            user=log.txtUsuario.getText();
            pass=log.txtPass.getText();
            cu.actualizarContraseña(user, pass, pass);
        }
    }

}
