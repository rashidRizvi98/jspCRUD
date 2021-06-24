<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  
   <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="../../plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../../dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  
  
  
<title>Insert title here</title>
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="../../index2.html"><b>Sunshine</b>Court</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Sign in to start your session</p>





<form  method="post"action="../../RLoginController" >

  <div class="input-group mb-3">


     <input type="text" placeholder="Enter Username" name="userName" class="form-control" required> 

 <div class="input-group-append">
            <div class="input-group-text">
              
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
         


  
    <input type="password" placeholder="Enter Password" name="password" class="form-control" required>
 
 
  <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
 
 <div class="row">
          <!-- /.col -->
          <div class="col-4">
 
  <button type="reset" class="btn btn-primary btn-block">Cancel</button>
  
  
</div>

        <div class="col-4">
 
  <button type="submit" class="btn btn-primary btn-block" >Login</button>
  

	
</div>



</div>

 <div class="row">
          <!-- /.col -->
          <div class="col-4">
 
 
   
</div>




          <!-- /.col -->
        </div>

</form>

</div>
</div>
</div>
<!-- jQuery -->
<script src="../../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/adminlte.min.js"></script>





</body>
</html>



