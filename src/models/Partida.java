package models;

public class Partida {
    private Time time1, time2;
    private Integer gols1, gols2;

    public Partida(Time time1, Time time2, Integer gols1, Integer gols2) {
        try {
            verificaGols(gols1);
            verificaGols(gols2);
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        this.time1 = time1;
        this.time2 = time2;
        this.gols1 = gols1;
        this.gols2 = gols2;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Integer getGols1() {
        return gols1;
    }

    public void setGols1(Integer gols1) {
        this.gols1 = gols1;
    }

    public Integer getGols2() {
        return gols2;
    }

    public void setGols2(Integer gols2) {
        this.gols2 = gols2;
    }

    private void verificaGols(Integer gols) throws Exception {
        if(gols < 0){
            System.out.println("Erro: Número inválido de gols");
            throw new Exception("Erro: Número inválido de gols");
        }
    }
}
