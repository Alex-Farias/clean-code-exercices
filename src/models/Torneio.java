package models;

import java.util.*;

public class Torneio {
    private List<Time> times;
    private List<Partida> partidas;

    public void adicionarTime(Time time){
        times.add(time);
        System.out.println("Time: ''" + time.getNome() + "''  adicionado com sucesso!");
    }

    public void criarPartida(Partida partida){
        partidas.add(partida);
        System.out.println("Partida entre ''" + partida.getTime1().getNome() + "'' e ''" + partida.getTime2().getNome() + "'' criada com sucesso!");
    }

    public Time getBuscarPorNome(String nome) throws Exception {
        Time timeEcontrado = null;
        try {
            for(Time time : times){
                if(time.getNome().equals(nome)){
                    timeEcontrado = time;
                }
            }

            if(timeEcontrado == null){
                throw new Exception("Erro: Time não existe");
            }

            return timeEcontrado;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ResultadoTorneio jogar(){
        List<String> listClassificacoes = new ArrayList<String>();
        List<String> listResultados = new ArrayList<String>();

        return new ResultadoTorneio(listClassificacoes, listResultados);
    }

    private getClassificacoes(){
        for(Partida partida : partidas){
            if(partida.getGols1() > partida.getGols2()){
                partida
                continue;
            }else if(partida.getGols1() < partida.getGols2()){
                continue;
            }

        }
    }

    private getResultados(){

    }
}
