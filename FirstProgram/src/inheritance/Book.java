package inheritance;

// super/base/parent class
public class Book {
	String title;
	int numPages;
	int curPage;
	String[] pageContent;
	
	public void turnPage() {
		// change page
		if (curPage + 1 <= numPages)
			curPage++;
		
		System.out.println(pageContent[curPage]);
	}
}
