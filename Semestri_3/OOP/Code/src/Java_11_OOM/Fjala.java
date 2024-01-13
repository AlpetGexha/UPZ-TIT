package Java_11_OOM;

public class Fjala extends Teksti {

    private String permbajtja;

    public Fjala(String p) {
        super();
        permbajtja = p;
        gjatesia = permbajtja.length();
    }

    public String toString() {
        return permbajtja + ": " + super.toString();
    }

    public String getPermbajtja() {
        return permbajtja;
    }

    public int setPermbajtja(String p) {
        int gjatesiaParaprake = permbajtja.length();

        permbajtja = p;
        gjatesia = permbajtja.length();

        return Math.abs(gjatesiaParaprake - gjatesia);
    }
}