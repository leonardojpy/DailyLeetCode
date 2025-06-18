import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> palavrasEmPortugues = new HashMap<>();
    Map<String, String> palavrasEmIngles = new HashMap<>();

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario){

        if (dicionario == TipoDicionario.PORTUGUES){
            palavrasEmPortugues.put(palavra.toLowerCase(), traducao);
        }

        if (dicionario == TipoDicionario.INGLES){
            palavrasEmIngles.put(palavra.toLowerCase(), traducao);
        }

    }

    public String traduzir(String palavra, TipoDicionario tipoDicionario){
        if (palavrasEmPortugues.containsKey(palavra.toLowerCase())){
            return palavrasEmPortugues.get(palavra.toLowerCase());
        }

        if (palavrasEmIngles.containsKey(palavra.toLowerCase())){
            return palavrasEmIngles.get(palavra.toLowerCase());
        }

        throw new PalavraNaoEncontradaException();

    }
}
