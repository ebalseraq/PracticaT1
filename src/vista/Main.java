package vista;

import java.util.ArrayList;

import modelo.Usuario;
public class Main {

    public static ArrayList<Usuario> usuarios;
   
    public static void main(String[] args) {
        
        usuarios = new ArrayList<>();
        Usuario nuevo = new Usuario("admin", "admin");
        usuarios.add(nuevo);
        
        Login log = new Login();
        log.setVisible(true);
        
        
        
    }
    
}
