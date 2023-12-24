package visao;

import java.util.Random;
import java.util.Scanner;
import dominio.Chave;
import dominio.CifraDeCesar;
import dominio.DecifragemInvalidaException;
import servicos.ManipulaArquivoTexto;

public class Enigma {

    public static void main (String[] args) throws DecifragemInvalidaException {

        Scanner input = new Scanner(System.in);
        
        Chave chave = new Chave(3);
        CifraDeCesar cifraDeCesar = new CifraDeCesar(chave);

        System.out.println("Menu:\n1-Adicionar frase no arquivo\n2-Tentar decifrar uma frase");
        int resposta = input.nextInt();

        if (resposta==1){
            int tipoFrase;
            do {
                System.out.println("Digite 1 para adicionar uma frase já cifrada, 2 para adicionar uma já decifrada ou 0 para sair: ");
                tipoFrase = input.nextInt();
                input.nextLine();
                if (tipoFrase==1){
                    System.out.print("Insira a frase: ");
                    String fraseAdd = input.next();
                    cifraDeCesar.addFraseCifrada(fraseAdd);
                    cifraDeCesar.addFraseDecifrada(cifraDeCesar.decifrar(fraseAdd));
                }
                else if (tipoFrase==2){
                    System.out.print("Insira a frase: ");
                    String fraseAdd = input.next();
                    cifraDeCesar.addFraseDecifrada(fraseAdd);
                    cifraDeCesar.addFraseCifrada(cifraDeCesar.cifrar(fraseAdd));
                }
            } while(tipoFrase!=0);

            ManipulaArquivoTexto.gravarArquivo(cifraDeCesar.getFrasesCifradas(), "mensagemCifrada.txt");
            ManipulaArquivoTexto.gravarArquivo(cifraDeCesar.getFrasesDecifradas(), "mensagemDecifrada.txt");
        }

        else if (resposta==2){
            ManipulaArquivoTexto.lerArquivo("mensagemCifrada.txt");
            Random random = new Random();
            int randomNum = random.nextInt(cifraDeCesar.getFrasesCifradas().size());
            System.out.println("Decifre: " + cifraDeCesar.getFrasesCifradas().get(randomNum));
            String respostaFrase = input.next();
            
            if (respostaFrase.equals(cifraDeCesar.getFrasesDecifradas().get(randomNum))){
                System.out.println("Parabéns, você acertou");
            }
            else {
                throw new DecifragemInvalidaException();
            }
        }

        input.close();
    }
}