/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2ruben;


public class Documento {
    public String titulo;
    public int tamano;
    public String tipo_de_archivo;
    public int etiqueta_de_tiempo;
    public boolean enviado;
    
    public Documento(String title, int seconds, String type, int time){
        this.titulo = title;
        this.tamano = seconds;
        this.tipo_de_archivo = type;
        this.etiqueta_de_tiempo = time;
        this.enviado = false;
    }
    
    
}
