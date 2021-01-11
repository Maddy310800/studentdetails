# studentdetails


This project contains two controller api call which demonstrates get and post method.
Demo project to show one to many relationship between student and address class.


==============================================================
post method to insert data in DB

uri:-  http://localhost:8080/post

{
	"studentName":"shyam",
	"totalMarks":24,
	"avgMarks":578,
	"address":[{
			"city":"delhi",
				"streetName":"gaya road"
	},
	{
			"city":"goa",
				"streetName":"satara road"
	}]
	
}

===============================================================
get method to fetch data from db

http://localhost:8080/get?id=54

================================================================
