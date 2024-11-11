public class Metodos {

    public static int soma_array(int... valores){//recebe uma lista de argumentos como parametro
        int soma = 0;
        for(int n:valores){
            soma += n;
        }
        return soma;
    }

    //sobrecarga de método: são métodos de mesmo nome, mas que recebem tipos de parâmetros diferentes
    public static float soma_array(float... valores){
        float soma = 0f;
        for(float n:valores){
            soma+=n;
        }
        return soma;
    }
    
    public static void main(String[] args){

        int[] vetor = {2,3,9};
        float[] vetor2 = {2.5f, 6.7f, 8f}; 
        System.out.println(soma_array(vetor));
        System.out.println(soma_array(vetor2));
    }

}