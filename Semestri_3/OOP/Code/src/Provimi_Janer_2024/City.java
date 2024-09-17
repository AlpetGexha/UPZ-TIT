package Provimi_Janer_2024;

public class City {

    public String emri;
    public long population;
    public boolean isCapital;
    public Komuna komuna;

    public City(String emri, long population, boolean isCapital, Komuna komuna) {
        this.emri = emri;
        this.population = population;
        this.isCapital = isCapital;
        this.komuna = komuna;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public Komuna getKomuna() {
        return komuna;
    }

    public void setKomuna(Komuna komuna) {
        this.komuna = komuna;
    }
}
