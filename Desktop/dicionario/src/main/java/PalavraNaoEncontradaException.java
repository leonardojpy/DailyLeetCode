public class PalavraNaoEncontradaException extends RuntimeException {
    public PalavraNaoEncontradaException(){
        super("Não foi possível encontrar a palavra");
    }
}
