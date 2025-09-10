import models.Partida;
import models.ResultadoTorneio;
import models.Time;
import models.Torneio;

public class Principal {
    public static void main(String[] args) throws Exception {
        Torneio torneio = new Torneio();

        // Adicionando times
        torneio.adicionarTime(new Time("Brasil"));
        torneio.adicionarTime(new Time("")); // ❌ Erro: Nome inválido
        torneio.adicionarTime(new Time("Canadá"));
        torneio.adicionarTime(new Time("Argentina"));
        torneio.adicionarTime(new Time("Angola"));

        // Criando partidas
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Brasil"), torneio.getBuscarPorNome("Canadá"), 1, 0));
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Argentina"), torneio.getBuscarPorNome("Angola"), 2, 0));
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Brasil"), torneio.getBuscarPorNome("Argentina"), -10, -2)); // ❌ Erro: Número inválido de gols
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Brasil"), torneio.getBuscarPorNome("Argentina"), 0, 2));
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Angola"), torneio.getBuscarPorNome("Canadá"), 1, 1));
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Brasil"), torneio.getBuscarPorNome("Angola"), 3, 2));
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Argentina"), torneio.getBuscarPorNome("Nigéria"), 3, 3)); // ❌ Erro: Time não existe
        torneio.criarPartida(new Partida(torneio.getBuscarPorNome("Argentina"), torneio.getBuscarPorNome("Canadá"), 2, 4));

        // Exibe a classificação final e o resultado de cada partida
        ResultadoTorneio resultados = torneio.jogar();
        resultados.imprimirClassificacao();
        resultados.imprimirResultados();
    }
}
