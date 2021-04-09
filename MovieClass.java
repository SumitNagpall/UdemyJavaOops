
class Date
{
	private int day;
	private int month;
	private int year;
	Date(){}
	Date(int day,int month,int year)
	{
		if(day <1 || day >31 || month < 1 || month>12 ||year<1939|| year>2099)
		{
			System.out.println("invalid date");
			this.day=1;
			this.month=1;
			this.year=1940;	
		}
		else
		{
			this.day=day;
			this.month=month;
			this.year=year;
		}
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setDay(int day)
	{
		if(day <1 || day >31)
		{
			System.out.println("Invalid day");
			this.day=1;
		}
		else
			this.day = day;
	}
	public void setMonth(int month)
	{
		if(month <1 || month >12)
		{
			System.out.println("Invalid month");
			this.month=1;
		}
		else
			this.month = month;
	}
	public void setYear(int year)
	{
		if(year <1939 || year >2099)
		{
			System.out.println("Invalid year");
			this.year=1940;
		}
		else
			this.year = year;
	}
	public void setDate(int day,int month,int year)
	{
		new Date(day,month,year);
	}
	public String getDate()
	{
		return this.day+"/"+this.month+"/"+this.year;
	}
	public String toString()
	{
		return this.day+"/"+this.month+"/"+this.year;	
	}
}

class Director
{
	private String name;
	private String surname;
	private int numDirectedMovie;
	private Date dob;

	Director()
	{}
	Director(String name,String surname)
	{
		this.name = name;
		this.surname = surname; 
	}
	public String getName()
	{
		return this.name;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	public void setNumberOfMovies(int numDirectedMovie)
	{
		this.numDirectedMovie = numDirectedMovie;
	}
	public int getNumberOfMovies()
	{
		return this.numDirectedMovie;
	}
	public Date getDob()
	{
		return this.dob;
	}
	public String toString()
	{
		return "Name : "+getName()+" "+getSurname()+", DOB: "+dob+", Number of Movies: "+getNumberOfMovies();
	}

}

class Movie
{
	private String title;
	private String category;
	private Director director;
	private int numAward;

	Movie(){}
	Movie(String title,String category,Director director)
	{
		this.title = title;
		this.category = category;
		this.director = director;
	}
	public String getTitle()
	{
		return this.title;
	}
	public String getCategory()
	{
		return this.category;
	}
	public Director getDirector()
	{
		return this.director;
	}
	public void setNumAward(int numAward)
	{
		this.numAward = numAward;
	}
	public int getNumAward()
	{
		return this.numAward;
	}
	public String toString()
	{
		//Movie[title = Avatar,category = Fantasy, director name = James ,director surname = Cameron , number of awards =3]
	    return "Movie [ title: "+getTitle()+", category : "+getCategory()+", director: "+director.getName() +" "+director.getSurname()+", Number of awards "+getNumAward()+"]";
	}

}

class MovieClass
{
	public static void main(String[] args)
	{
		Director director=new Director("James","Cameron");
		Date dob = new Date(16,8,1954);
		director.setDob(dob);
		director.setNumberOfMovies(23);
		System.out.println(director);

		Movie movie = new Movie("Avatar","Fantasy",director);
		movie.setNumAward(21);
		System.out.println(movie);
	}
}