public class CarroCombate extends Carro{

    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qnt_armamento;
    
    public CarroCombate(String nome, int blindagem){
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
    }

    public void setQntArmamento(int valor){
        this.qnt_armamento += valor;
        if(this.qnt_armamento > MAX_ARMAMENTO)
            this.qnt_armamento = MAX_ARMAMENTO;
        if(this.qnt_armamento < MIN_ARMAMENTO)
            this.qnt_armamento = MIN_ARMAMENTO;
    }

    public int getQntArmamento(){
        return this.qnt_armamento;
    }

    public void atirar(){
        if(this.qnt_armamento > MIN_ARMAMENTO)
            setQntArmamento(-1);
        else
            System.out.println("Sem armamento");
    }

    public void info(){
        super.info();
        System.out.printf("Quantidade de Armamento: %d\n", this.qnt_armamento);
    }
}
