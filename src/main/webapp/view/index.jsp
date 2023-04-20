<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Registration Page</title>
  <link rel="stylesheet" href="./style1.css">

</head>
<body>
<p><a href =http://localhost:8080/login"></a>
<!-- partial:index.partial.html -->
<div id="bg"></div>

<form action="/saveData">
 <div class="form-field">
    <input type="name" placeholder="Name" name="name" required>
  </div>
  <div class="form-field">
    <input type="email" placeholder="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="email" required>
  </div>
  
  <div class="form-field">
    <input type="password" placeholder="password" name="password" required>                        
     </div>
  
  <div class="form-field">  
    <button class="btn" type="submit">Submit</button> 
  </div>
  
</form>
<!-- partial -->
</body>
</html>
