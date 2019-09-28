/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MetodosUsuario {

    private static ArrayList<Usuario> usuarios = null;

    private static MetodosUsuario instancia;

    private MetodosUsuario() {
        usuarios = new ArrayList();
    }

    public static MetodosUsuario getIntance() {
        if (instancia == null) {
            instancia = new MetodosUsuario();
        }
        return instancia;
    }

    public ArrayList<Usuario> getArray() {
        return this.usuarios;
    }

    public void registrarUsuario(Usuario user) {
        try {
            usuarios.add(user);
            JOptionPane.showMessageDialog(null, "Usuario Registrado" + this.getArray().size());
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Usuario No Registrado");
        }

    }

    public boolean validarUsuario(String usuario, String password) {
        boolean band = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getUser().equals(usuario) && usuarios.get(i).getPass().equals(password)){
                band = true;

                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
            }
        }
       

        return band;
    }

    public void actualizarContraseña(String user, String pass1, String pass2) {
        Usuario u = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(user) && pass1.equals(pass2)) {
                u = usuario;
            }
        }
        u.setPass(pass2);
        JOptionPane.showMessageDialog(null, "Contraseña actualizada");
        System.out.println(u.getPass());
        usuarios.add(u);
    }

}
