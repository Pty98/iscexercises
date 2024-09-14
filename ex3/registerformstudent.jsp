<html>
   <body>
      
      <form action = "result2" method = "Post">
         First Name: <input type = "text" name = "first_name">
         <br />
         Last Name: <input type = "text" name = "last_name" />
		 <br />
		 Date of Birth: <input type = "date" name = "Date_of_Birth" />
		 <select name = "Date_of_Birth" >
			<option value="">--Please Choose an option--</option>
			<option value="1998">1998</option>
			<option value="1999">1999</option>
			<option value="2000">2000</option>
		</select>
		<% int r=0;
		if(request.getParameter("first_name")==null){
			System.out.println("*");
			r=1 ;
		%>
		<form action ="registerformstudent" method ="post">
			<p style ="color:red;"> First name invalid</p>
		<%} %>
		<% 
		if(request.getParameter("last_name")==null){
					System.out.println("*");
					r=1 ;
		%>
		<p style ="color:red;"> last name invalid</p>
				<%} %>
				if(request.getParameter("Date_of_Birth")==null){
									System.out.println("*");
									r=1 ;
						%>
						<p style ="color:red;"> Date of birth invalid</p>
								<%} %>
		<% if(r==0){%>
		<%}%>
		
		 
		 <input type = "checkbox" name = "maths" checked = "checked" /> Maths
          <input type = "checkbox" name = "physics"  /> Physics
          <input type = "checkbox" name = "chemistry" checked = "checked" /> Chemistry
		  <br />  
         <input type = "submit" value = "Submit" />
		 
		 
      </form>
	  
	 
      
   </body>
</html>