import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.println();
        System.out.println("========================");
        System.out.println("=======Programa 1=======");
        System.out.println("========================");
        System.out.println();

        System.out.println("Qual o numero a ser procurado na sequencia de Fibonacci?");

        int entrada = sc.nextInt();

        List<Integer> lista = new ArrayList<>();

        int x = 0, y = 1;
        lista.add(x, y);

        int aux = 0;

        while(aux < entrada){
            aux = x + y;
            x = y;
            y = aux;
            lista.add(aux);
        }

        if(lista.contains(entrada)){
            
            System.out.println();
            System.out.println("O numero especificado esta contido na sequencia de Fibonacci");

        }
        else{

            System.out.println();
            System.out.println("O numero especificado nao esta contido na sequencia de Fibonacci");

        }


        System.out.println();
        System.out.println("========================");
        System.out.println("=======Programa 2=======");
        System.out.println("========================");
        System.out.println();

        System.out.println("Digite a palavra a ser analisada por letras A");
        sc.nextLine();
        String palavra = sc.nextLine();

        int contagem = 0;
        for(int i = 0; i <= palavra.length() - 1; i++){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A'){
                contagem++;
            }
        }

        if(contagem == 0){

            System.out.println();
            System.out.println("Nao existem letras A na palavra digitada");

        }
        else{

            System.out.println();
            System.out.println("Existem " + contagem + " letras A na palavra digitada");
            
        }


        sc.close();
    }
}
