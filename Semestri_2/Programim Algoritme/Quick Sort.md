# QuickSort

Supuzojm se keni një disa letra me numra dhe dëshironi t'i rëndisim ato.

_Quick Sort_ është si të luash një lojë ku zgjedh një nga letrat si një kartë speciale të quajtur _"pivot"_. Më pas, merrni të gjitha letrat e tjera dhe i vendosni në dy grumbuj:
një grumbull për letrat më të vogla se _"pivot"_ dhe një grumbull letrat më të mëdha se "_pivot"_.

Ju e përsërisni këtë proces për secilën nga dy grumbujt, duke zgjedhur një _"pivot"_ të ri çdo herë, derisa të gjitha letrat të jenë të rënditura.

Me fjalë më të thjeshta, **QuickSort** është një mënyrë për të renditur një vargu gjërash (si numrat) duke e ndarë vazhdimisht vargun në pjesë më të vogla bazuar në një vlerë të zgjedhur _"pivot"_ dhe duke i renditur ato pjesë derisa të renditet e gjithë lista.

_Definicioni_: **QuickSort** është një algoritëm i përdorur gjerësisht i renditjes që përdor strategjinë **"divide-and-conquer"**(përçaj dhe sundo) për të renditur një listë elementësh.

Kjo nën kupton që problemi ndahet në nënprobleme dhe sgjithen nën problemet

## Si punon Quick Sort

Funksionon

1. Duke zgjedhur një element _"pivot"_ nga vargu dhe duke i ndarë (_partitioning_) elementët e tjerë në dy nën-vargje, duke u bazur nëse ato janë më të vogla ose më të mëdha se "pivot".

2. Nën-vargjet më pas renditen në mënyrë rekursive.

3. Pivot mund të zgjidhet në mënyra të ndryshme, por qasja më e zakonshme është zgjedhja e elementit të parë ose të fundit të grupit.

![Quicksort](https://user-images.githubusercontent.com/50520333/235786083-59c019de-b411-48c5-a5d3-3779175005b8.png)

## Çfarë kompleksiteti ka Quick Sort

**Best Case** në _QuickSort_ është O(n logn) sepse kemi _n_ krahsime dhe _logn_ ndarje

**Worst Case** në _QuickSort_ është O(n^2) sepse kemi _n_ krahsime dhe _n_ ndarje.
Kjo ndoth vetem kur vargu është i rënditur

![Quick-Sort-Worst-Case](https://user-images.githubusercontent.com/50520333/235788470-908fc5e5-667b-4467-bca6-5a8e5126ccd5.png)

Kemi 2 mënyra se si mund ta rregullojm problemin e worst caseit

-   Pivot të jetë random
-   Pivot të jetë elementi i mesit

**POR edhe me këto metoda mund ta kemi wort case _O(n^2)_**

|         | Time Complexity | Space Complexity |
| ------- | --------------- | ---------------- |
| Worst   | O(n^2)          | O(log n)         |
| Average | O(n log n)      | O(log n)         |
| Best    | O(n log n)      | O(log n)         |

**Space Complex** _log n_ - Meqenëse quick sort e therret veten sipas rënditjes _log n_ në çdo thirrje rekursive duhet të ndahet një frame e re stacku me madhësi konstante.

### Pse të përdorim Quick Sort dhe jo Merge Sort kur e kan kompleksitetin pothuajse të njerjt ?

**Quick Sort** në praktik është më i shpejt në shumë raste sepse për shkak të _reduced overhead_ por edhe mënyra se si QuickSort i klasifikon te dhënat është shumë më **cache-friendly** se sa **MergeSort**

**Kjo e bën qe QuickSort të implementohet si sortim në shumë gjuhë programuese**

## Si funksionon kodi

```java
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return i + 1;
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

Tek implementimi i kodit shohim se `quickSort()` merr nje array, inteksi fillestar është `low` dhe i fundit `high`

Nëse `low < high` atëherë kemi një pivot dhe e ndajmë arrayn në dy pjesë duke përdorur `partition()`.
Dy pjesët e arry janë të rënditur në mënyrë rekursive duke thirrur `QuickSort()` me indekset e duhura.

`partition()` - Merr **quickSort()** dhe kthen indeksin e elementit pivot.

-   Fillon duke zgjedhur elementin pivot dhe duke inicializuar "**i**" në indeksin e elementit të parë

-   Më pas kalon nëpër vargje nga e _low_ në e _hight - 1_, duke shkëmbyer elementet sipas nevojës për t'i ndarë ato në dy nën-vargje.

-   Së fundi, ai ndërron elementin e _pivot_ në pozicionin e tij të saktë dhe kthen indeksin e _pivot_.
