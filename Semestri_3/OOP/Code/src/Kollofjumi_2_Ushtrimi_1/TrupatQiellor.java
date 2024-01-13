package Kollofjumi_2_Ushtrimi_1;

public class TrupatQiellor {
    long pesha;
    Pika pozita;

    public TrupatQiellor(long pesha, Pika pozita) {
        this.pesha = pesha;
        this.pozita = pozita;
    }

    @Override
    public String toString() {
        return "TrupatQiellor{" +
                "pesha=" + pesha +
                ", pozita=" + pozita +
                '}';
    }

    public long getPesha() {
        return pesha;
    }

    public void setPesha(long pesha) {
        this.pesha = pesha;
    }

    public Pika getPozita() {
        return pozita;
    }

    public void setPozita(Pika pozita) {
        this.pozita = pozita;
    }
}
