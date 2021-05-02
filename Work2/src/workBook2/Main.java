package workBook2;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"Java","400","Engin Demiroð");
		
		Book book2 = new Book();
		book2.id = 2;
		book2.name = "Python";
		book2.pageNumber = "350";
		book2.author = "Engin Demiroð";
		
		System.out.println(book1.id +" "+ book1.name +" "+ book1.author);
		System.out.println(book2.id +" "+ book2.name +" "+ book2.author);
		
		BookManager bookManager = new BookManager();
		bookManager.addToBook(book1);
		bookManager.like(book2);
		
	}

}
