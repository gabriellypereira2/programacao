package aula23.arquivoObjeto;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class EscreverObjeto {

        public static void main (String[] args){
            //Objeto para manipular o caminho para o diretório.
            File caminho = new File("C:\\Users\\gabri\\OneDrive\\Documentos\\Aula23");

            //Testando se o caminho existe
            if(caminho.exists()){
                System.out.println("A pasta existe!");
            }

            //Criando ele se não existir.
            else{
                caminho.mkdirs();
                System.out.println("Caminho criado!");
            }

            //Declarando o arquivo para salvar a pessoa.
            File arquivo = new File(caminho, "pessoas.db");
            System.out.println(arquivo.getAbsolutePath()); //pegar o caminho completo do arquivo.


            try{
                ObjectOutputStream arquivoObj = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));

                //Criando uma lista de pessoas.
                Pessoa[] lista = new Pessoa[10];
                Scanner ler = new Scanner(System.in);
                String opc;
                int cont = 0;
                do{
                    System.out.println("Lendo informações da pessoa "+(cont+1));
                    System.out.println("Qual o nome: ");
                    String nome = ler.next();
                    System.out.println("Qual o sobrenome: ");
                    String sobrenome = ler.next();
                    lista[cont] = new Pessoa();
                    lista[cont].setNome(nome);
                    lista[cont].setSobrenome(sobrenome);
                    System.out.println("Tem mais pessoas (s - sim/ n - não: ");
                    opc = ler.next().toLowerCase();
                    cont++;
                }
                while (opc.equals("s"));

                //Gravar a pessoa nos arquivo
                arquivoObj.writeObject(lista);

                //Fechar o arquivo
                arquivoObj.close();

                //Criar uma instancia de Pessoa.
                // Pessoa p1 = new Pessoa();
                //p1.setNome("Jonas");
                //p1.setSobrenome("Silva");

                //Gravar a pessoa no arquivo
                //arquivoObj.writeObject(lista);

                //Fechar o arquivo
                //arquivoObj.close();

            }
            catch (IOException e){
                System.out.println("Erro ao criar o arquivo!"+e);
            }
        }
    }

