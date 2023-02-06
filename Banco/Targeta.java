package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Targeta { //voy añadir listas
    private Integer num;
    private String estat;
    private String nom;
    private String dades;
    private static ArrayList <String> listCompras = new ArrayList<>();

    //getters i setters
    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getEstat(){
        return estat;
    }

    public void setEstat(String estat){
        this.estat = estat;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getDades(){
        return dades;
    }

    public void setDades(String dades){
        this.dades = dades;
    }

    public ArrayList <String> getListCompras(){
        return listCompras;
    }

    public void setListaCompras(ArrayList<String> listCompras){
        this.listCompras = listCompras;
    }

    //constructors

    //constructor vacio
    public Targeta(){
        this.num = 0;
        this.estat = "";
        this.nom = "";
        this.dades="";
    }

    //constructo completo
    public Targeta(int num, String estat, String nom, String dades){
        this.setNum(num);
        this.setEstat(estat);
        this.setNom(nom);
        this.setDades(dades);
        this.setListaCompras(listCompras);
    }

    //métodes
    @Override
    public String toString(){
        return "Targeta [num= " + num + ", nom= " + nom + ", estat= " + estat + ", dades= " +dades+']';
    }

    //afegir una compra
    public static void afegirCompra(){
        //importamos el teclado
        Scanner teclado = new Scanner(System.in);
        String establiment = "";
        System.out.println("Donde vas a comprar?");
        //pedimos por teclado el establicimiento al que se va a comprar
        listCompras.add(establiment);
        String importe = "";
        System.out.println("Importe a pagar");
        //pedimos por teclado el importe a pagar
        listCompras.add(importe);
        //de manera que así conseguimos una lista con datos de compra
        //este if comprueba si esta vacia o llena
        if(listCompras.size() == 0){//esta vacia
            System.out.println("No hay compras realizadas");//dime que esta vacia
        }else{//esta llena 
            for(int i = 0; i < listCompras.size(); i ++){//recorremos la lista y si esta completa 
                System.out.println("Se ha añadido la compra");//esta completa por tanto se añade la compra
            }   
        }

    }

    //llistar compres
    public static String retornarCompres(int n){
        String compras= "";//creamos 
        for(int i = 0; i < listCompras.size(); i++ ){
            
        }   
        return compras;
    }

    //tapar numero targeta
    public static String taparNum(Integer num){
        String converted = "";
        for(int i = 0; i < num; i++){
            converted = num + "*";
        }
        return converted;
    }
}
