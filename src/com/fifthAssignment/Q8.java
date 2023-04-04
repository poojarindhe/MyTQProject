package com.fifthAssignment;


class Kid {
    public void readBook() {
        System.out.println("kid is reading a book.");
    }
    
    public void readBook(String bookTitle, int pageNumber) {
        System.out.println("kid is reading \"" + bookTitle + "\" on page " + pageNumber + ".");
    }
}
class BigKid extends Kid {
    @Override
    public void readBook() {
        System.out.println("Big kid is reading a big book.");
    }
}
public class Q8 {

	public static void main(String[] args) {
		
		Kid kid = new Kid();
        kid.readBook();
        kid.readBook("Alice in Wonderland", 20);
        
        BigKid bigKid = new BigKid();
        bigKid.readBook();
        bigKid.readBook("Hamlet", 200);

	}

}
