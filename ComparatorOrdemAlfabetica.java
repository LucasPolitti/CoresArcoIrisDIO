import java.util.Comparator;


public class ComparatorOrdemAlfabetica implements Comparator <coresArcoIris> {

    @Override
    public int compare(coresArcoIris cor1, coresArcoIris cor2) {
        if(cor1.getNome().compareTo(cor2.getNome()) > 0) {
           return 1;
            
        }
        return -1;
    }


}
    

