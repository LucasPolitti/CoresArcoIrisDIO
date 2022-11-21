import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArcoIris {
    public static void main(String[] args) {
        
        List <coresArcoIris> listaCores = new ArrayList <>();

        listaCores.add(new coresArcoIris("vermelha"));
        listaCores.add(new coresArcoIris("laranja"));
        listaCores.add(new coresArcoIris("amarela"));
        listaCores.add(new coresArcoIris("verde"));
        listaCores.add(new coresArcoIris("azul"));
        listaCores.add(new coresArcoIris("anil"));
        listaCores.add(new coresArcoIris("violeta"));

        System.out.println("LISTA ORIGINAL");
        for (coresArcoIris coresArcoIris : listaCores ) {
            System.out.println(coresArcoIris.getNome());

        }

        System.out.println("LISTA ORDENADA POR ORDEM ALFABÉTICA");
        Collections.sort(listaCores, new ComparatorOrdemAlfabetica());
        for (coresArcoIris coresArcoIris : listaCores ) {

            System.out.println(coresArcoIris.getNome());




        }


        System.out.println("LISTA ORDENADA POR ORDEM DECRESCENTE");
        Collections.sort(listaCores, new ComparatorOrdemDecrescente());
        for (coresArcoIris coresArcoIris : listaCores ) {
             
            System.out.println(coresArcoIris.getNome());




        }



        System.out.println("LISTA SEM AS CORES QUE COMEÇAM COM A LETRA V");
        
        listaCores.removeIf(coresArcoIris -> coresArcoIris.getNome().startsWith("v"));

        for (coresArcoIris coresArcoIris : listaCores ) {
             
            System.out.println(coresArcoIris.getNome());


        }

        System.out.println("LISTA SOMENTE COM AS CORES QUE COMEÇAM COM A LETRA A");
        
        for (coresArcoIris coresArcoIris : listaCores ) {
            if (coresArcoIris.getNome().startsWith("a")) {
                
            System.out.println(coresArcoIris.getNome());


            }


             
    }

}

}





  
    
        

        

