/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MetodosUsuario;
import View.Recuperar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class ControllerRecuperar implements ActionListener {

    Recuperar rec;
    MetodosUsuario m = MetodosUsuario.getIntance();

    public void eventos() {
        rec.bgtnRecuperar.addActionListener(this);
    }

    public ControllerRecuperar(Recuperar rec) {
        this.rec = rec;
        eventos();
    }
    
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        if (evt.equals(rec.bgtnRecuperar)) {
            String user,pas,pas1;
            user=rec.txtUser.getText();
            pas=rec.txtPass1.getText();
            pas1=rec.txtPass2.getText();
            m.actualizarContraseña(user, pas1, pas1);
        }
    }
    
}
