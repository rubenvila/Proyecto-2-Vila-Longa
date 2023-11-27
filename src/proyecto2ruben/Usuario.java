/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2ruben;
import java.util.Arrays;


public class Usuario {
    public String nombre_usuario;
    public String prioridad;
    public Documento[] documentos_creados;
    
    public Usuario(String usuario, String priorida){
        this.nombre_usuario = usuario;
        this.prioridad = priorida;
        this.documentos_creados = new Documento[5];
       
        
    }
    
    public void añadir_documento(String titulo, int segundos, String tipo, int tiempo){
        boolean found = false;
        for (int i = 0; i < this.documentos_creados.length; i++) {
            if(this.documentos_creados[i] == null || this.documentos_creados[i].titulo.equals("")){
                this.documentos_creados[i] =  new Documento(titulo,segundos,tipo,tiempo);
                found = true;
                break;
            }
                
        }
        if(!found){
            Documento[] more_documents = new Documento[this.documentos_creados.length+1];
            Arrays.fill(more_documents, new Documento("", 0, "",0));
            for(int i = 0; i < this.documentos_creados.length; i++) {
                more_documents[i] = this.documentos_creados[i];
            }
            more_documents[this.documentos_creados.length] = new Documento(titulo,segundos,tipo,tiempo);
            this.documentos_creados = more_documents;
        }
    }
        
    public String imprimir_documentos(){
        String docs = "";
        for (int i = 0; i < documentos_creados.length; i++) {
            if (documentos_creados[i] != null && !documentos_creados[i].titulo.equals("")) {
                String send = "";
                if(documentos_creados[i].enviado){
                    send = "Enviado a impresion";
                }
                docs += "-----Titulo: " + documentos_creados[i].titulo + " -Tipo:   "+documentos_creados[i].tipo_de_archivo + ": " + send + "\n";
            }
        }
        return docs;
    }
    
    
    
    public void enviar_para_imprimir(Documento documento, MonticuloBinario monticulo){
        monticulo.insertar(documento.titulo, documento.tamano, documento.tipo_de_archivo, documento.etiqueta_de_tiempo);
    }

}
