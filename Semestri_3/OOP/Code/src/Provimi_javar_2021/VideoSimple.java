package Provimi_javar_2021;

public class VideoSimple {
    private String titulli;
    private long koha;
    private int rating;

    public VideoSimple(String titulli, long koha, int rating) {
        this.titulli = titulli;
        this.koha = koha;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "VideoSimple{" +
                "titulli='" + titulli + '\'' +
                ", koha='" + koha + '\'' +
                ", rating=" + rating +
                '}' + '\n';
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public long getKoha() {
        return koha;
    }

    public void setKoha(long koha) {
        this.koha = koha;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
