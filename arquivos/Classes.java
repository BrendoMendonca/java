public class Classes {

    public static void main(String[] args){

        int num = 0;
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        j1.num = 55;//manipula o valor do atributo de j1
        j2.num = 41;
        System.out.printf("%d\n", j1.num);
        System.out.printf("%d\n", j2.num);
    }
    
}
