import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        
        int parametroUm = scanner.nextInt() ;
        int parametroDois = scanner.nextInt();
        try{
        contar(parametroUm , parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }
    
    static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = parametroDois-parametroUm;

            for (int i = 0; i <= contagem; i++){
                System.out.println("Imprimindo N° "+i);
            }

        }
    }
}
