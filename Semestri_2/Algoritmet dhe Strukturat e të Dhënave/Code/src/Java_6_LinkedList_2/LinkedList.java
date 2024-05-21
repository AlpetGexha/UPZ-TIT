package Java_6_LinkedList_2;

public class LinkedList {
	public class Node {
		Object data;
		Node next;
		public Node(Object d) {
			data = d;
			next = null;
		}
	}
	Node head, tail;
	private int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	
	//metodat e objekteve te kesaj klase
	
	//metoda qe kthen numrin e nyjeve ne listen e lidhur
	public int size() {
		return size;
	}
	
	//shtimi ne fillim te listes
	public void addFirst(Object e) {
		//kompleksiteti: O(1) - konstant
		
		//krijimi i nje nyjeje te re
		Node n = new Node(e);
		//kontrollo nese lista eshte e zbrazte
		if(size == 0) {
		head = tail = n;
		}
		//perndryshe, shto elementin e ri ne fillim te listes
		else {
			n.next = head;
			head = n;
		}
		size++;
	}
	
	//shtimi ne fund te listes
	public void addLast(Object e) {
		//kompleksiteti: O(1) - konstant
		
		//krijimi i nje nyjeje te re
		Node n = new Node(e);
		//kontrollo nese lista eshte e zbrazte
		if(size == 0) {
			head = tail = n;
		}
		//perndryshe, shto elementin e ri ne fund te listes
		else {
			tail.next = n;
			tail = n;
		}
		size++;
	}
	
	//shtimi i nyjes e ne poziten in
	public void insertAtPosition(Object e, int in) {
		//kompleksiteti: best case: O(1) - konstant - nese elementi shtohet ne fillim te listen e lidhur
		//kompleksiteti: worst case: O(n) - linear - nese elementi shtohet ne fund te listes se lidhur
		
		//kontrollojme nese indeksi nuk eshte valid
		if(in < 0 || in > size)
			System.out.println("Pozita jo-valide!"); //nuk mund te realizohet shtimi i nyjes se re ne listen e lidhur
		//perndryshe shqyrtojme disa raste per shtimin e nyjes se re ne listen e lidhur
		else {
			//krijojme fillimisht nyjen e re
			Node n = new Node(e);
			//kontrollojme nese lista eshte e zbrazte
			if(size == 0)
				head = tail = n; //nyja e re do te jete edhe head edhe tail
			//kontrollojme nese nyja e re do te shtohet ne fillim te listes
			else if(in == 0) {
				n.next = head;
				head = n; //nyja e re do te jete head
			}
			//perndrshye nyja e re do te shtohet ne ndonje pozite te caktuar, por pas nyjes se pare
			else {
				//fillojme levizjen nga fillimi i listes, per te arritur ne poziten e deshiruar in
				Node curr = head;
				for(int i = 0; i < in-1; i++)
					curr = curr.next;
				//realizojme shtimin e nyjes se re ne listen e lidhur
				n.next = curr.next;
				curr.next = n;
				//kontrollojme nese nyja e re u shtua ne fund te listes
				if(n.next == null)
					tail = n; //nyja e re do te jete tail
			}
			//sapo u shtua nje nyje e re ne listen e lidhur, size rritet per nje
			size++;
		}
	}
	
	//largimi i nje nyjeje ne indeksin in
	public Object removeAtPosition(int in) {
		//kompleksiteti: best case: O(1) - konstant - nese largohet elementi i pare ne listen e lidhur
		//kompleksiteti: worst case: O(n) - linear - nese largohet elementi fundit i listes se lidhur
		
		//nje nyje largohet nga lista nese mbetet pa reference (garbage collection, memory leak)
		
		//kontrollojme nese indeksi in nuk eshte valid (nese jemi jashte kufijve te listes)
		if(in < 0 || in >= size)
			return null; //nuk mund te largohet ndonje gje nga lista e lidhur
		//ruajme te dhenen e nyjes qe do te largojme nga lista e lidhur, e cila ne fillim eshte head.data 
		Object r = head.data;
		//kontrollojme nese lista ka vetem nje nyje (nyja qe do te largojme eshte e vetme)
		if(head == tail) {
			head = tail = null; //lista e lidhur mbetet e zbraztet
		}
		//perndryshe lista ka me shume se nje nyje
		else {
			//kontrollojme nese nyja qe do te largohet gjendet ne fillim te listes (head)
			if(in == 0) {
				head = head.next; //head leviz ne nyjes pasuese
			}
			//perndryshe nyja qe do te largohet gjendet pas pozites 0 (pas head)
			else {
				//levizja neper listen fillon nga nyja e pare (head)
				Node tmp = head;
				//per te mbetur nyja ne indeksin in pa reference, duhet te ndalojme levizjen ne in-1 
				//levizim deri ne nyjen para nyjes qe do te largohet nga lista e lidhur
				for(int i = 0; i < in-1; i++)
					tmp = tmp.next; //levizim cdo here ne nyjen pasuese
				//ruajme te dhenen e nyjes qe do te largohet, para se ajo realisht te largohet (te mos jete me pjese e listes se lidhur)
				r = tmp.next.data; //meqe e ndaluam levizjen ne nyjen paraprake, atehere ne r e ruajme te dhenen e nyjes pasuese
				//shkeputet lidhja me nyjes qe po largohet nga lista e lidhur, e cila mbetet pa reference
				tmp.next = tmp.next.next;
				//kontrollojme nese nyja qe u fshi eshte e fundit
				if(tmp.next == null)
					tail = tmp; //atehere nyja e parafundit (tmp) tashme duhet te behet e fundit (tail)
			}
		}
		//ne secilin nga rastet qe i shqyrtuam me larte u realizua nje largim nga lista, size zvogelohet per nje
		size--;
		//ne fund kthehet si rezultat e dhena e nyjes qe u largua nga lista e lidhur
		return r;
	}
	
	//kerkimi i nje nyjeje brenda listes se lidhur
	public int find(Object e) {
		//kompleksiteti: best case: O(1) - konstant - nese elementi i kerkuar gjendet ne fillim te listes se lidhur
		//kompleksiteti: worst case: O(n) - linear - nese elementi i kerkuar gjendet ne fund te listes se lidhur
		
		//kontrollojme nese lista e lidhur nuk ka asnje element
		if(size == 0) {
			System.out.println("lista eshte e zbrazte");
			return -1;
		}
		//fillojme kerkimin nga fillimi i listes
		Node tmp = head;
		int i = 0;
		//levizim neper listen derisa nuk gjendet elementi i kerkuar ne listen e lidhur
		while(tmp.data != e) {
			tmp = tmp.next;
			i++;
			//nese gjate levizjes kemi arritur fundin pa gjetur elementin e kerkuar
			if(tmp == null) {
				System.out.println("elementi nuk u gjet");
				//kthejme -1 si rezultat
				return -1;
			}
		}
		return i;
	}
	
	public Object get(int in) {
		//kompleksiteti: best case: O(1) - konstant
		//kompleksiteti: worst case: O(n) - linear
		
		//kontrollo nese indeksi in nuk eshte valid
		if(in < 0 || in >= size)
			return null;
		//perndryshe kthe nyjen ne poziten in
		Node tmp = head;
		for(int i = 0; i < in; i++)
			tmp = tmp.next;
		return tmp.data;
	}
	
	//leximi i elementeve ne listen
	public void display() {
		//kompleksiteti: O(n) - linear
		
		Node tmp = head;
		//perderisa ka nyje ne listen
		while(tmp != null) {
			System.out.print(tmp.data + " "); //printo vleren e nyjes aktuale
			tmp = tmp.next; //leviz ne nyjen e ardhshme
		}
		System.out.println();
	}
}
