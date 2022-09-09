package excecoes;


public class AcabouASenhaExcecao extends Exception{
    public AcabouASenhaExcecao(){
        super("Não há mais horário disponível hoje! Retorne no próximo dia útil, por favor!");
    }
}
