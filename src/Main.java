import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caso = 0;

        while (sc.hasNext()) {
            String entrada = sc.next();
            String sequencia = sc.next();
            caso++;
            int qtd = contardor(entrada, sequencia);
            int pos = sequencia.lastIndexOf(entrada) + 1;

            System.out.println("Caso #" +caso +":");
            if(qtd == 0){
                System.out.println("Nao existe subsequencia");
                System.out.println();
            }else{
                System.out.println("Qtd.Subsequencias: " +qtd);
                System.out.println("Pos: " +pos);// mostra a ultima vez que o caractere aparece aparti do 0
                System.out.println();
            }
            
        }

        sc.close();

    }

    // metodo que faz a comparacao
    public static int contardor(String a, String b) {
        int total = 0;
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(b);

        while (m.find()) {
            total++;
        }

        return total;
    }
}
