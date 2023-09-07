package sistemaSuporte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.security.SecureRandom;

public class SuporteTecnico {
    
    private HashMap<String,String> bancoSolucao;
    private ArrayList<String> respostaPadrao;

    public SuporteTecnico (){
        bancoSolucao = new HashMap<>();
        respostaPadrao = new ArrayList<>();

        for (String solucoes : inicializaBancoSolucao()){
            String[] chaveValor = solucoes.split(":");
            if (chaveValor.length==2){
                String chave = chaveValor[0];
                String valor = chaveValor[1];
                bancoSolucao.put(chave, valor);
            }
        }

        for (String respostas : inicializaRespostaPadrao()){
            respostaPadrao.add(respostas);
        }
    }

    public SuporteTecnico (HashMap<String,String> bancoSolucao, ArrayList<String> respostaPadrao){
        this.bancoSolucao = bancoSolucao;
        this.respostaPadrao = respostaPadrao;
    }

    public HashMap<String,String> getBancoSolucao (){
        return bancoSolucao;
    }

    public void setBancoSolucao (HashMap<String,String> bancoSolucao){
        this.bancoSolucao = bancoSolucao;
    }

    public ArrayList<String> getRespostaPadrao (){
        return respostaPadrao;
    }

    public void setRespostaPadrao (ArrayList<String> respostaPadrao){
        this.respostaPadrao = respostaPadrao;
    }

    private String[] inicializaBancoSolucao (){
        String[] respostasSolucao = {"danificou:Bom, nosso software não danificaria seu sistema. Deve ser algo específico no seu sistema. Diga-me sobre sua configuração.",
        "danificaram:Bom, nosso software não danificaria seu sistema. Deve ser algo específico no seu sistema. Diga-me sobre sua configuração.",
        "linux:Nós consideramos seriamente o suporte Linux. Mas existem muitos problemas. Muitos deles dizem respeito a versões incompatíveis. Você poderia ser mais preciso?",
        "memória:Se você observar detalhadamente os requisitos mínimos de sistema, você verá que a memória requerida é 1.5 giga byte. Você deverá adquirir mais memória. Mais alguma coisa que deseja saber?",
        "instalação:A instalação é simples e direta. Nós temos programas de instalação previamente configurados que farão todo o trabalho para você. Você já leu as instruções de instalação?",
        "caro:O preço do nosso produto é competitivo. Você já fez uma pesquisa de mercado e comparou todas as características do nosso software com outras ofertas de mercado?",
        "macintosh:Este é um problema do sistema operacional Mac. Por favor, entre em contato com a Apple. Não há nada que possamos fazer neste caso.",
        "windows:Este é um problema do sistema operacional Windows. Por favor, entre em contato com a Microsoft. Não há nada que possamos fazer neste caso.",
        "buggy:Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema com mais detalhes?",
        "bug:Bom, você sabe, todo software pode ter algum problema. Mas nossos engenheiros de software já estão atuando no problema para solucioná-lo. Você poderia descrever seu problema com mais detalhes?",
        "performance:A performance está próxima do esperado nos testes que realizamos. Você está executando algum outro processo em paralelo?",
        "lento:Penso que o problema está relacionado com o hardware. Fazer um upgrade do seu processador deve resolver o problema de performance. Você tem algum problema com o software?"};

        return respostasSolucao;
    }

    private String[] inicializaRespostaPadrao (){
        String[] respostasPadrao = {"Isso soa estranho. Você poderia descrever o problema com mais detalhes?", 
        "Nenhum outro cliente detalhou um problema parecido com este. Qual é a sua configuração de sistema?",
        "Isso parece interessante. Diga-me mais a respeito...", "Preciso de maiores informações a respeito.",
        "Você já verificou se existe algum conflito de DLL?", "Isso não é um problema, é apenas uma característica do software!",
        "Isso está descrito no manual. Você já deu uma lida no manual que veio junto do seu software?", 
        "Sua descrição não foi satisfatória. Você já procurou um técnico que poderia detalhar melhor este problema?",
        "Você poderia explicar melhor?"};

        return respostasPadrao;
    }

    public String buscaSolucao (HashSet<String> palavraChave){    
        for (String chaveResposta : palavraChave){
            for (String chaveBanco : bancoSolucao.keySet()){
                if (chaveResposta.equals(chaveBanco)){
                    return bancoSolucao.get(chaveBanco);
                }
            }
        }
        return "";
    }

    public String buscaSolucaoPadrao (){
        SecureRandom randomNumber = new SecureRandom();
        int solucaoAleatoria = randomNumber.nextInt(9);

        return respostaPadrao.get(solucaoAleatoria);
    }
}