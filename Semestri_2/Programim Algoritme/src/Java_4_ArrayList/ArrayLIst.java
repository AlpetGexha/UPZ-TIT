// Made on Class

package Java_4_ArrayList;
public class ArrayLIst {


    //variablat e objekteve te kesaj klase (variablat me fusheveprim global)
    int[] array; //vargu ku do te ruhen te dhenat tona
    int maxSize; //numri maksimal i elementeve ne vargun array
    int size; //numri i elementeve ne vargun array
    //konstruktori
    public ArrayLIst(int max) {
        maxSize = max; //merret hyrja nga jashte per te definuar numrin maksimal te elementeve ne vargun array
        array = new int[maxSize];
        size = 0; //ne fillim vargu eshte i zbrazte
    }

    public static void main(String[] args) {
        ArrayLIst al = new ArrayLIst(10);
        al.add(8);
        al.add(15);
        al.add(1);
        al.add(4);
        al.display();
        al.remove(12);
        al.display();
        al.remove(15);
        al.display();

    }

    //metodat e objekteve te kesaj klase

    //shtimi i nje elementi te ri ne vargun array
    public void add(int e) {
        //best case: O(1) - konstant; worst case: O(1) - konstant

        //kontrollo nese vargu eshte i mbushur
        if (size == maxSize) System.out.println("vargu eshte i mbushur");
            //perndryshe, vargu array ka te pakten edhe nje hapesire te lire
        else {
            //shto elementin e ri e ne fund te vargut
            array[size] = e;
            //sapo u shtua nje element i ri ne vargun, rrite size per 1
            size++;
        }
    }

    //largimi i nje elementi e nga vargu
    public void remove(int e) {
        //best case: O(1) - konstant (nese largohet elementi i fundit nga vargu);
        //worst case: O(n) - linear (nese largohet elementi i pare nga vargu)

        //kontrollo nese vargu eshte i zbrazte
        if (size == 0) System.out.println("vargu eshte i zbrazte");
            //perndryshe vargu ka te pakten nje element
        else {
            //kerko elementin e ne vargun array
            int in = find(e);
            //kontrollo nese elementi e nuk u gjet ne vargun array
            if (in == -1) System.out.println("elementi nuk u gjet");
                //perndryshe elementi u gjet ne poziten/indeksin in
            else {
                //largo elementin e nga vargu array
                for (int i = in; i < size - 1; i++)
                    array[i] = array[i + 1];
                //sapo u largua nje element nga vargu, zvogeloje size per 1
                size--;
            }
        }
    }

    //kerkimi sekuencial
    public int find(int e) {
        int i = 0;
        while (i < size) {
            if (e == array[i]) // u gjet elementi i kerkuar ne poziten i
                return i;
            i++;
        }
        return -1; //elementi i kerkuar nuk u gjet
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
