package com.fifthAssignment;


class Student13 {
    private int id;
    private String name;

    public Student13(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id+" "+name;
    }
}

public class Q10 {

	public static void main(String[] args) {

				Student13 s1 = new Student13(1, "monika");
		        //Student13 s2 = new Student13(2, "pooja");
				Student13 s2=s1;

		        System.out.println("s1: " + s1);
		        System.out.println("s2: " + s2);
		    }
}