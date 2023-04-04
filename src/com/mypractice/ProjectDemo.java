package com.mypractice;

 class Book 
{
	
		int book_id;
		String book_title;
		int price;
		String author_name;
		Book book[];
		int count = 0;

		Book() {

		}

		void createBook() {
			book = new Book[3];
		}

		Book(int bid, String title, int price, String author) {
			this.book_id = bid;
			this.book_title = title;
			this.price = price;
			this.author_name = author;
		}

		void InsertBookRecords(int book_id, String title, int price, String author) {
			book[count] = new Book(book_id, title, price, author);
			count++;
		}

		void showAllBooks() {
			// display all books record
			for (Book b : book) {
				if (b != null) {
					System.out.println(b);
				}
			}

		}

		void showBookById(int id) {
			// display book record of given id
			for (Book b : book) {
				if (b != null) {
					if (id == b.book_id) {
						System.out.println(b);
					}
				}
			}
		}

		void updateBookById(int id) {

		}

		void deleteBook(int id) {

		}

		public String toString() {
			return book_id + " " + book_title + " " + price + " " + author_name;
		}

	}

	public class ProjectDemo {

		public static void main(String[] args) {
			Book book = new Book();
			book.createBook();
			book.InsertBookRecords(101, "100Days", 670, "Merry");

			book.InsertBookRecords(500, "HarryPotter", 100, "Rolling");

			book.showAllBooks();

			System.out.println("....................");

			book.showBookById(500);
		}

	}


