import java.util.ArrayList;
import java.util.List;
public class InterarArray{
    public static List<String> amigosEmComum(String[] amigosA, String[] amigosB){ 
        List<String> amigosEmComum= new ArrayList<>();
        for(String amigoA : amigosA){
            for(String amigoB : amigosB){
                if(amigoA.equals(amigoB)){
                    amigosEmComum.add(amigoA);
                }
            }
        }return amigosEmComum;
    }
    public static void main(String[] args){
        String[] amigosDoJoão = {"Laura", "Nath", "Lethicia", "Valadão"};
        String[] amigosDoMiguel = {"João", "Valadão", "Kaian"};

        List <String> amigosComum = amigosEmComum(amigosDoJoão, amigosDoMiguel);
        System.out.println("OS amigos em comum são:" + amigosComum);
    }
}

//Iterar um array é percorrer este array e fazer algo em cada elemento dela