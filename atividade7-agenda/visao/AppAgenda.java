package visao;

import java.util.ArrayList;
import negocio.*;
import servicos.*;

public class AppAgenda {

    public static void main (String[] args) throws ContatoInexistenteException {

        Agenda agendaPessoal = new Agenda();

        ManipulaArquivoTexto manipulaAgenda = new ManipulaArquivoTexto("novaAgenda.txt");

        Contato contato1 = new Contato("Baby Yoda", "2222-2222", "Arvala-7", "babyoda@st.com");
        Contato contato2 = new Contato("Din Djarin", "3333-3333", "Mandalore", "dindjarin@st.com");
        Contato contato3 = new Contato("Boba Fett", "4444-4444", "Kamino", "bobafett@st.com");

        agendaPessoal.addContato(contato1);
        agendaPessoal.addContato(contato2);
        agendaPessoal.addContato(contato3);

        manipulaAgenda.abrirArquivoParaGravacao();
        manipulaAgenda.gravarContato(agendaPessoal.getContatos());

        manipulaAgenda.abrirArquivoParaLeitura();
        ArrayList<Contato> mostraContatos = manipulaAgenda.lerArquivo();
        for (Contato contato : mostraContatos) {
            System.out.println("Nome: " + contato.getNome() + " Telefone: " + contato.getTelefone());
        }

        agendaPessoal.existeContato("Ashoka");
    }
}