<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Leads Management</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
.id{
background-image:url('sample1.jpg');
background-color:#3498db;
}

</style>

</head>
<body>
<div class="container mt-5">
    <h2>Update Leads</h2>
<div id="1">
    <!-- Create Lead Form -->
    <form action="updatedata" id="leadForm" method="post" >
        <div class="form-group">
            <label>First_Name</label>
            <input type="text" id="fname" name="fname" class="form-control" value="${lead.fname}" required />
        </div>
        <div class="form-group">
            <label>Last_Name</label>
            <input type="text" id="lname" name="lname" class="form-control" value="${lead.lname}" required />
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" id="email" name="email"class="form-control" value="${lead.email}" required />
        </div>
        <div class="form-group">
            <label>Phone</label>
            <input type="text" id="phone" name="mobile"  class="form-control" required  value="${lead.mobile}"/>
        </div>
        <button type="submit" class="btn btn-primary">Update Lead</button>
    </form>

    <hr />
   </div> 
  </div>
  </body>
  </html>
