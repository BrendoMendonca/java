public class Jogador {
    
    public int num=0;//atributo da classe Jogador

    public Jogador(int n){//método construtor do objeto
        
        this.num = n;//this é usado para manipular os atributos da classe
        System.out.printf("Jogador %d criado\n", num);
    }
}
