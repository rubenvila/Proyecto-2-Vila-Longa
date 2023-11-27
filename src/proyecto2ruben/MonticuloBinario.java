/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2ruben;


public class MonticuloBinario {
    public Documento[] monticulo;
    public int registrados;
    private int tamano;

    public MonticuloBinario() {
        this.tamano = 500;
        this.registrados = 0;
        this.monticulo = new Documento[tamano];
    }

public void insertar(String titulo, int tamano, String tipo, int tiempo) {
    Documento doc = new Documento(titulo,tamano,tipo, tiempo);
    if (registrados != tamano) {
        registrados++;
        int currentIndex = registrados - 1;
        monticulo[currentIndex] = doc;

        while (currentIndex != 0 && monticulo[indicePadre(currentIndex)].etiqueta_de_tiempo > monticulo[currentIndex].etiqueta_de_tiempo) {
            intercambiar(currentIndex, indicePadre(currentIndex));
            currentIndex = indicePadre(currentIndex);
        }}
}
private void heapify(int indice) {
    int menor = indice;
    int hijoIzq = indiceIzq(indice);
    int hijoDer = indiceDer(indice);

    if (hijoIzq < registrados && monticulo[hijoIzq].etiqueta_de_tiempo < monticulo[menor].etiqueta_de_tiempo) {
        menor = hijoIzq;
    }

    if (hijoDer < registrados && monticulo[hijoDer].etiqueta_de_tiempo < monticulo[menor].etiqueta_de_tiempo) {
        menor = hijoDer;
    }

    if (menor != indice) {
        intercambiar(indice, menor);
        heapify(menor);
    }
}
private void intercambiar(int index1, int index2) {
    Documento temp = monticulo[index1];
    monticulo[index1] = monticulo[index2];
    monticulo[index2] = temp;
}
private int indicePadre(int index) {
    return (index - 1) / 2;
}

public int indiceIzq(int index) {
    return (2 * index) + 1;
}

public int indiceDer(int index) {
    return (2 * index) + 2;
}



public Documento eliminar_min() {
    if (registrados == 0) {
        return null;
    }else if (registrados == 1) {
        registrados--;
        return monticulo[0];
    }else{
        Documento root = monticulo[0];
        monticulo[0] = monticulo[registrados - 1];
        registrados--;
        heapify(0);

        return root;}
}

public void eliminar_doc(Documento doc){
    if(this.monticulo[0].titulo.equals(doc.titulo)){
        this.eliminar_min();
    }else{
        if(this.monticulo[0]!= null){
        Documento aux = this.eliminar_min();
        this.eliminar_doc(doc);
        this.insertar(aux.titulo, aux.tamano,aux.tipo_de_archivo, aux.etiqueta_de_tiempo);}
        
    }
}

public String imprimir(String resultado){
    Documento aux = this.eliminar_min();
    if(aux!= null){
        resultado += "Titulo: " + aux.titulo + "\n";
        resultado = imprimir(resultado);
        this.insertar(aux.titulo, aux.tamano,aux.tipo_de_archivo, aux.etiqueta_de_tiempo);}
    return resultado;
}

}


