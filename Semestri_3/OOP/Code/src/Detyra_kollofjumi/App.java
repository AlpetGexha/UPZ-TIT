package Detyra_kollofjumi;

public class App {
    public static void main(String[] args) {

        WebSite uni_pz = new WebSite(
                "https://www.uni-prizren.com",
                "Universiteti i Prizrenit",
                50000
        );

        System.out.println(uni_pz);

        System.out.println("uni_pz është " + uni_pz.popullarity());
        uni_pz.printDataOnFile();
    }
}
