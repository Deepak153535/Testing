package HashSet;

import java.util.HashSet;

public class BookDriver {

	public static void main(String[] args) {
		
		HashSet<Book> a=new HashSet();
		
		
		Book b=new Book(1,100,"Story","Dk","chuhan");
		Book b1=new Book(2,200,"History","sk Pandey","Kiran");
		
		a.add(b);
		a.add(b1);
		
		for(Book i:a)
		{
			System.out.println(i.id+" "+i.quantity+" "+i.name+" "+i.author+" "+i.publisher);
		}
	}
}
