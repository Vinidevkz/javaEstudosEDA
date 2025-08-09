public class binarysearch {
    public static void main(String[] args){
        int[] nums = {5, 10, 15, 20, 25, 40, 67, 98};

        System.out.println(PesquisaBinaria(nums, 98));
    }

    public static int PesquisaBinaria(int array[], int item){

        int baixo = 0; //posição mais baixa do array
        int alto = array.length -1; //posição mais alta do array, -1 pois se não ultrapassa o limite do array

        while(baixo <= alto){ //enquanto os dois não se encontrarem, o loop se repetirá
            int meio = (baixo + alto) / 2; //pega o meio da lista
            int chute = array[meio]; // nosso primeiro chute será com a posição do meio

            if(chute == item){
                return meio; // se o primeiro chute já for o item desejado, retorna a posição dele
            }else if(chute > item){
                alto = meio - 1;//se o chute passar a posição do item, o alto vira meio -1, ignorando todo o lado direito da lista
            }else{
                baixo = meio + 1; //se for menor, o baixo agora recebe o meio -1, ignorando todo o lado esquerdo da lista
            }
        }
        return item; // se o item não estiver na lista, apenas retorna o valor do mesmo
    }
}
