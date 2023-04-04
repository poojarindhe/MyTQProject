
package com.fifthAssignment;

class Kid1 {
    public void readBook() {
        System.out.println("I'm reading a picture book.");
    }
}
class Teenager extends Kid1 {
    public void readBook() {
        System.out.println("I'm reading a book about social media.");
    }
}
class BigKid1 extends Kid1 {
    @Override
    public void readBook() {
        System.out.println("Big kid is reading a big book.");
    }
}

public class Q9 {

	public static void main(String[] args) {

		    Kid1 k1 = new BigKid1();
		    Kid1 k2 = new Teenager();
		    k1.readBook();
		    k2.readBook();
		}
	}