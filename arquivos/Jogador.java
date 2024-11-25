public class Jogador {
    
    final private int  MAXVIDAS = 5;
    public int num=0;//atributo da classe Jogador
    private int vidas = 3;

    public Jogador(int n){//método construtor do objeto
        
        this.num = n;//this é usado para manipular os atributos da classe
        System.out.printf("Jogador %d criado\n", num);
    }
    public void addVidas(){
        setVidas(this.vidas + 1);
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int valor){
        if (valor > MAXVIDAS){
            valor = 5;
        }else if(valor < 0){
            valor = 1;
        }
        this.vidas = valor;
    }
}