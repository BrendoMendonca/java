public class Vetor {
    public static void main(String [] args){
        int[] num = new int[5];//declaração do array
        int[] vetor = {2,3,9};//array preenchido
        for(int i = 0; i < num.length; i++){//preenchendo array
            num[i] = (i+1)*10;
        }
        
        for(int n:num){//estrutura for para exibir valores no array
            System.out.printf("%d ", n);
        }
    }
}
