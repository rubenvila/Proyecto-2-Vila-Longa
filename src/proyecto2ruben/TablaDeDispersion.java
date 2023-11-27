/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2ruben;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class TablaDeDispersion {
    public Usuario[] usuarios;
    public int tamano;
    public int ocupados;
    
    public TablaDeDispersion(){
        this.usuarios = new Usuario[499];
        this.tamano = 499;
        ocupados = 0;
        Arrays.fill(this.usuarios, new Usuario("", ""));
    }
    

    public int funcion_hash(String usuario){
        int n = 7;
        int index = 0;
        for (int i = 0; i < usuario.length(); i++) {      
            index = n*index + usuario.charAt(i); 
            if (index< 0){
                index*=-1;
            }
        }
        index = index%499;
        return index;
    }
    public void insertar_usuario(String nombre, String prioridad){
        Usuario user = new Usuario(nombre, prioridad);
        int indice = funcion_hash(nombre);
        if(this.usuarios[indice].nombre_usuario.equals("")){
            this.usuarios[indice] = user;
            ocupados++;
        }else{
            if (ocupados == tamano){
                System.out.println("Maximo de Usuarios Alcanzado. Elimine uno para continuar");
            }else{
            while(indice < tamano && !this.usuarios[indice].nombre_usuario.equals("")){
                indice++;
                if (indice == tamano){
                    indice = 0;
                }
            }
            this.usuarios[indice] = user;
            ocupados++;
            }
        }
    }
    
    
    public void eliminar_usuario(String username){
        int hash = funcion_hash(username);
        if(this.usuarios[hash].nombre_usuario.equals(username)){
            this.usuarios[hash] = new Usuario("", "");
        }else{
            while(hash < tamano && !this.usuarios[hash].nombre_usuario.equals(username)){
            hash++;
            if (hash == tamano){
                    hash = 0;
                }
            }
            this.usuarios[hash] = new Usuario("", "");
        }
        

    }
    
    public Usuario buscar_usuario(String usuario){
        int hash = funcion_hash(usuario);
        if(this.usuarios[hash].nombre_usuario.equals(usuario)){
            return this.usuarios[hash];
        }else{
            
        }
        int cont = 0;
        while(cont < ocupados && hash < tamano && !this.usuarios[hash].nombre_usuario.equals(usuario)){
            hash++;
            if (hash == tamano){
                    hash = 0;
                }
            cont ++;
            }
        if(this.usuarios[hash].nombre_usuario.equals(usuario)){
        return this.usuarios[hash];}
        else{
            System.out.println("No encontrado");
            return null;
        }
    }
    public Documento buscar_documento(String usuario, String titulo){
        Usuario user = buscar_usuario(usuario);
        if (user!= null){
            for (int i = 0; i < user.documentos_creados.length; i++) {
                if (user.documentos_creados[i] != null && user.documentos_creados[i].titulo.equals(titulo)) {
                    return user.documentos_creados[i];
            }
        }}
        return null;
    }
    public boolean eliminar_documento(String usuario, String titulo){
        Usuario user = buscar_usuario(usuario);
        for (int i = 0; i < user.documentos_creados.length; i++) {
            if (user.documentos_creados[i] != null && user.documentos_creados[i].titulo.equals(titulo)) {
                user.documentos_creados[i] = new Documento("", 0, "",0);
                return true;
            }
        }
        return false;
    }
    

    
    public String imprimir_usuario(String lista_usuarios){
        for (int i = 0; i < tamano; i++) {
            if(!usuarios[i].nombre_usuario.equals("")){
                lista_usuarios+= usuarios[i].nombre_usuario + " con prioridad " + usuarios[i].prioridad + "\n";
                lista_usuarios += usuarios[i].imprimir_documentos();
            }
        }
        return lista_usuarios;
    }
}

