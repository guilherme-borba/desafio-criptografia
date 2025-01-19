import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DesafioSuperClient {

    public static void main(String[] args) {
        String arquivo = "arquivo.txt";  // Caminho do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            int numCasos = Integer.parseInt(br.readLine());  // Lê a quantidade de casos
            for (int i = 0; i < numCasos; i++) {
                String mensagemCriptografada = br.readLine();
                String[] partes = mensagemCriptografada.split(" ");  // Divide a mensagem pelos espaços
                StringBuilder mensagemDecodificada = new StringBuilder();

                for (String parte : partes) {
                    int qtdPontos = parte.length();  // Conta o número de pontos em cada parte
                    char letra = (char) ('a' + qtdPontos - 1);  // Mapeia para a letra correspondente
                    mensagemDecodificada.append(letra);
                }

                System.out.println(mensagemDecodificada.toString() + "-" + mensagemCriptografada);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
