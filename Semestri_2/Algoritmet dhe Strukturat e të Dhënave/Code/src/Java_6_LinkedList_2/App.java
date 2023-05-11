import Java_6_LinkedList_2.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addLast(12);
		l.addLast(24);
		l.addLast(80);
		l.addFirst(-9);
		l.addFirst(18);
		l.addFirst(72);
		l.display(); //72, 18, -9, 12, 24, 80
		System.out.println("get: " + l.get(8)); //null
		System.out.println("get: " + l.get(-1)); //null
		System.out.println("get: " + l.get(3)); //12
		System.out.println("remove: " + l.removeAtPosition(8)); //null
		l.display();
		System.out.println("remove: " + l.removeAtPosition(0)); //72
		l.display();
		System.out.println("remove: " + l.removeAtPosition(2)); //12
		l.display();
		System.out.println("remove: " + l.removeAtPosition(l.size()-1)); //80
		l.display();
		l.addLast(17);
		l.display();
		System.out.println("find: " + l.find(-1)); //-1
		System.out.println("find: " + l.find(24)); //2
		l.insertAtPosition(15, 2);
		l.display();
	}
}






