import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class somaSimples {
    public static void main(String[] args){
        int[] numeros = {5, 10, 15, 20};
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            //System.out.println(i);
            soma += numeros[i];
        }
        System.out.println("Soma total: " + soma);
    }
}