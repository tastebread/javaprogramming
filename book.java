package week10;

class Book {
	private String number; //관리 번호
	private String title;  //제목
	private String author; //저자
	private boolean status = false; //대출 상태 (대출 중 -> true, 대출가능 -> false)
	
	public Book(String number, String title, String author, boolean status)
	{
		this.number = number;
		this.title = title;
		this.author = author;
		this.status = status;
	}
		public String toString()
		{
			return "[관리번호 : " +number+",제목 : "+title+",저자 : "+author+",대출 상태 : "+status +"]";
		}
		void rentBook()
		{
			if(status != true)
			{
				status = true;
				System.out.println("대출완료");
			}
			else
			{
				System.out.println("대출 불가");
			}
		}
		public String getNumber(){
			return number;
		}
		public String getTitle()
		{
			return title;
		}
		public String getAuthor()
		{
			return author;
		}
		public boolean getStatus()
		{
			return status;
		}
	}
