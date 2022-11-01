package dev.kim;

public class Main {
	public static void main(String[] args) {
		LinkList<Integer> list = new LinkList();
		
		list.append(83);
		list.append(4);
		list.append(74);
		list.append(91);
		list.append(30);
		list.append(46);
		
		//เพิ่มโหนด 100 ที่ด้านท้ายของลิสต์
		
		list.append(100);
		
		//เพิ่มโหนด 50 ไว้ที่ตำแหน่งแรก (head) 
		
		list.insert(50, 0);
		
		//เพิ่มโหนด 45 ไว้หลังโหนด 91 
		
		list.insert(45, 5);
		
		//print data ของ Node ใน List
		System.out.print("head");
		list.printList();
	}
}
