package ArrayList;

import java.util.ArrayList;

public class BookDriver {

	public static void main(String[] args) {
		
		ArrayList<Book> a=new ArrayList<Book>();
		
		Book b=new Book(1,"History","Kiran","sk pandey");
		Book b1=new Book(2,"Geography","Ghatna chkar","sk");
		
		a.add(b);
		a.add(b1);
		
		for(Book i:a)
		{
			System.out.println(i.id+" "+i.name+" "+i.publisher+" "+i.author);
		}
	}
}
