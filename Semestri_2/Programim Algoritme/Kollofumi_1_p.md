<details><summary>Cka është Algoritmi</summary>

Algorimti është një varg i fundëm i hapave që ndiqen për të zgjidhur një problem të caktuar.

</details>

<br />

<details><summary>Çka është Kompleksiteti? Pse ështe i rëndesishëm dhe për cka përdoret</summary>

Kompliciteti është një mënyrë për të përcaktuar sa kohë dhe memorie do të na nevoitet per një zgjithen e nje problemi.

Eshtë i rëndësishëm sepse përdoret për të përcaktuar performancën e një programi dhe për të optimizuar kodin për të arritur një ekzekutim më të shpejtë dhe më efikas.

</details>

<br />

<details><summary>Vizato familjet e komplisiteti</summary>

![image](https://user-images.githubusercontent.com/50520333/230749328-70597424-c364-411d-ae3c-3b73901ea475.png)

![big-o-complexity-graph](https://user-images.githubusercontent.com/50520333/230749192-17fbbdc6-6e27-4add-b909-4c3b9d81a5cb.png)

</details>

<br />

<details><summary>Renditni këto funksione O(n) në bazë të kompleksitetit, duke filluar nga funksioni më i komplikuar dhe paraqiteni grafikishte funkcionet te dhena:

- O(n<sup>n</sup>),
- O(n),
- O(log n),
- O(c),
- O(n<sup>2</sup>)
- O(2<sup>n</sup>)

</summary>

- O(n<sup>n</sup>) - Eksponencial
- O(2<sup>n</sup>) - Eksponencial
- O(n<sup>2</sup>) - Quadrik
- O(n), - Linar
- O(log n), - Logaritmik
- O(c), - Konstant

</details>

<br />

<details><summary>Implento Klasen Node</summary>
<br />

Klasa Note ka 2 Element:

- Next: Node
- Data: Object

```java
public class Node {
    //variablat e objekteve te klases Node
    Object data; //e dhena qe permbahet ne nyjen
    Node next; //referenca (treguesi, pointeri) qe tregon ne nyjen e ardhshme

    //konstruktori per inicializimin e variablave te objekteve te kesaj klase
    public Node(Object value) {
        data = value;
        next = null;
    }
}
```

</details>
<br />

<details><summary>Implentoni kodin per kermimin sekuencial dhe per vetrradhitje.</summary>

`Sekuncial`

```java
public static int sequencialSearch(int[] vargu, int find) {
   for (int i = 0; i < v.length; i++) {
      if (vargu[i] == find) {
         return i;
      }
   }
   return -1;
}
```

`Veterrathitur`

```java
public static boolean seqFindSelfSort(int[] vargu, int find) {
    for (int i = 0; i < v.length - 1; i++) {
        if (vargu[i] == find) {
            swap(vargu[i], vargu[i + 1]);
            return true;
        }
    }

    return false;
}


public static void swap(int x, int y){
    int temp = x;
    x = y;
    y = temp;
}
```

</details>

<br />

<details><summary>Kodi për kërkim në vargun e rredhitur (<i>Binary Search</i>)
</summary>

**Binary Seach** paraqet kerkim me komplekistet Logarimti. **Paraqitet vetem tek varget e renditura**

Funksioni:

- I ka 3 variabe (pointer) (fillimin , mesin dhe mbarimin)
- Ne fillim e shikon elementin e mesit.
- Nese elementi i mesit është me i madh e vazhdon kerkimin ne te djath
- Nese elementi i mesit është me i vogel e vazhdon kerkimin ne te majt
- Nese nuk e gjen elementin kthen _-1_;

![image](https://user-images.githubusercontent.com/50520333/230810914-9f8e29ea-774c-4c46-bb66-0f3b26b87324.png)

```java
public static int binarySearch(int arr[], int find){
//  worst case: O(log2n) - logaritmik, best case: O(1) ose O(c) - konstant
    // Arrays.sort(arr);

    int start = 0;
    int end = arr.length - 1;

    while (start <= end){
        int mid = (end + start) / 2;

        if(arr[mid] == find)
            return mid;

         else if(arr[mid] < find)
            start = mid + 1;

        else
            end = mid - 1;
    }

}
```

`Binary Serach Recursion`

```java
public static void binaryRecursion(int arr[], int value, int low, int hight){
    Arrays.sort(arr);

    int mid = (low + hight) / 2;

    if(hight < low){
        System.out.println("Not ka vlera");
        return;
    }

    if (value == arr[mid])
        System.out.println(mid);

    else if (value < arr[mid])
        binaryRecursion(arr, value, mid + 1, hight);

    else
        binaryRecursion(arr, value, low, mid - 1);

}
```

</details>
<br />

<details><summary> Shiko a jane vlerat e vargut te renditura </summary>

// Worst case O(n)

- I krahasojm elemetin elementin me elemetin e rradhës.
- Nëse është më i madh kthe false
- Nëse kushti nuk plotesohet ateher vargu eshte i renditur

```java
public static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }

    return true;
}
```

</details>
<br />

![ArrayListIntegerObjecttype-660x268](https://user-images.githubusercontent.com/50520333/230811875-82dd18af-963e-4c12-973d-37748267477c.png)

<details><summary>Implentimi i ArrayList</summary>

Cfare ka ArrayList:

- 1 array
- size
- maxSize

```java
public class ArrayList {
    int[] array;
    int size;
    int maxSize;
}
```

Funskionet:

- add(int Index)
  - Nese vargu eshte i mbushur rrite per 2 fish
  - Shto elemetin ne fund te array dhe rrit size per 1
- find / search (int value)
  - Përdor kërkimin sekuencial dhe kthe indexin ne elemtin e thene
- remove(int index)
  - Nese indexi eshte i sakte ( x <= 0 )
  - Shikojme nëse vargu është bosh
  - Për heqjen e një elemnti ne varg ne fillim e gjejm indexin e elemenit
  - Kur e gjejm indexin, e shtyjm vleren e atij indeksi deri sa te shkojn ne fund
  - dhe ne fund e zvogelojm size per 1
- display
  - Trego te gjitha elemente ne ArrayList

Impimentimi:

```java
// Konstruktori
public ArrayList() {
    maxSize = 8; // Maksimumi fillestar
    size = 0;    // Vlear Fillester e vargut
    array = new int[maxSize];
}
```

Funksioni `add`

- Nese vargu eshte i mbushur rrite per 2 fish
- Shto elemetin ne fund te array dhe rrit size per 1

```java
public void add(int value){
    inereaseSize();

    if (size >= maxSize) { // mundet edhe pa if nese e kemi në inereaseSize()
        array[size] = value;
        size++;
    }
}

private void inereaseSize() {  // privat - vetem klasa ArrayList mund te qaset ne kete funksion
    if (size >= maxSize) {
        array = Arrays.copyOf(array, maxSize * 2);
    }
}
```

Funksioni `find()`

```java
public int find(int value) {
    for (int i = 0; i < size; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -1;
}
```

Funksioni `remove(value)`

- Nese indexi eshte i sakte ( x <= 0 )
- Shikojme nëse vargu është bosh
- Për heqjen e një elemnti ne varg ne fillim e gjejm indexin e elemenit
- Kur e gjejm indexin, e shtyjm vleren e atij indeksi deri sa te shkojn ne fund
- dhe ne fund e zvogelojm size per 1

```java
public void remove(int value) {
     if (size == 0) { // Shikojm nese vargu ka elemente
        System.out.println("Array është bosh");
        return;
    }

    decreaseSize(); // nese vargu perdoret me pak se gjymsa e madhesis e zvogelojm per 2fishin

    int index = find(value); // Gjej indeksin e vlerës

    if (index != -1) {// kontrollo nese elementi eshte ne varg

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1]; // largo elementin e nga vargu array duke e quar elementin ne fund te vargut
        }

        // dhe zvogeloje per 1
        size--;
    }
}

private void decreaseSize() {
    if (size == maxSize / 2) {
        array = Arrays.copyOf(array, maxSize / 2);
        maxSize /= 2;
    }
}
```

![Delete-element-from-an-array-in-C](https://user-images.githubusercontent.com/50520333/230817060-725967f8-d6e2-4c1f-bedc-3f508eae20bb.png)

Funksioni `display()`

```java
public void display() {
    for (int i = 0; i < size; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}
```

Funksioni: `addFirst()`

```java
 public void addFirst(int value) {

    if (maxSize == size) 
        increaseArray();

    for (int i = size; i > 0; i--)
        v[i] = v[i - 1];

    v[0] = value;
    size++;
}
```



</details>
<br />

![Array-vs-Linked-List-insertion-ll v2-800x344](https://user-images.githubusercontent.com/50520333/230811933-b7837b4c-13f3-48ed-b12b-c20d368ce734.png)

<details><summary>Implentimi i LinkedList</summary>

```java
public class LinkedList {
    // krijimi i struktures se nyjes
    public class Node {
        //variablat e objekteve te klases Node
        Object data; //e dhena qe permbahet ne nyjen
        Node next; //referenca (treguesi, pointeri) qe tregon ne nyjen e ardhshme

        //konstruktori per inicializimin e variablave te objekteve te kesaj klase
        public Node(Object d) {
            data = d;
            next = null;
        }
    }

    //lista e lidhur eshte nje grup i nyjeve te lidhura njera me tjetren, linkedlist eshte strukture dinamike

    //variablat e objekteve te klases LinkedList
    Node head, tail;
    private int size; //size eshte e dukshme vetem brenda kesaj klase
    //konstruktori
    public LinkedList() {
        //ne fillim lista e lidhur eshte e zbrazte
        head = tail = null;
        size = 0;
    }

    //shtimi ne fillim te listes
    public void addFirst(Object e) {
        //kompleksiteti: O(1) - konstant

        //krijimi i nje nyjeje te re
        Node n = new Node(e);
        //kontrollo nese lista eshte e zbrazte
        if (size == 0) {
            head = tail = n;
        }
        //perndryshe, shto elementin e ri ne fillim te listes
        else {
            n.next = head;
            head = n;
        }
        size++;
    }

    //metodat e objekteve te kesaj klase

    //shtimi ne fund te listes
    public void addLast(Object e) {
        //kompleksiteti: O(1) - konstant

        //krijimi i nje nyjeje te re
        Node n = new Node(e);
        //kontrollo nese lista eshte e zbrazte
        if (size == 0) {
            head = tail = n;
        }
        //perndryshe, shto elementin e ri ne fund te listes
        else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public Object get(int in) {
        //kompleksiteti: best case: O(1) - konstant
        //kompleksiteti: worst case: O(n) - linear

        //kontrollo nese indeksi in nuk eshte valid
        if (in < 0 || in >= size) return null;
        //perndryshe kthe nyjen ne poziten in
        Node tmp = head;
        for (int i = 0; i < in; i++)
            tmp = tmp.next;
        return tmp.data;
    }

    //leximi i elementeve ne listen
    public void display() {
        //kompleksiteti: O(n) - linear

        Node tmp = head;
        //perderisa ka nyje ne listen
        while (tmp != null) {
            System.out.print(tmp.data + " "); //printo vleren e nyjes aktuale
            tmp = tmp.next; //leviz ne nyjen e ardhshme
        }
        System.out.println();
    }

}

```

</details>

| Operacion           | Array    | ArrayList | LinkedList |
| ------------------- | -------- | --------- | ---------- |
| Find (index)        | O(1)     | O(1)      | O(n)       |
| Find (value)        | O(n)     | O(n)      | O(n)       |
| Find (value) sorted | O(log n) | O(log n)  | O(n)       |
| Add (në fillim)     | O(n)     | O(n)      | O(1)       |
| Add (ne mes)        | O(n)     | O(n)      | O(n)       |
| Add (në fund)       | O(1)     | O(1)\*    | O(1)       |
| Delete              | O(n)     | O(n)      | O(n)       |
| Delete (në fillim)  | O(n)     | O(n)      | O(1)       |
| Delete (ne mes)     | O(n)     | O(n)      | O(n)       |
| Delete (në fund)    | O(1)     | O(1)      | O(1)       |
