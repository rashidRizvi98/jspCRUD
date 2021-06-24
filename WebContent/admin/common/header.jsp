<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">



<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Add Rent Information</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../../dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">






</head>
<body  class="hold-transition sidebar-mini">






<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="../../index3.html" class="nav-link">Home</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Contact</a>
      </li>
    </ul>

    <!-- SEARCH FORM -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Right navbar links -->
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="../../index3.html" class="brand-link">
      <img src="../../dist/img/AdminLTELogo.png"
           alt="AdminLTE Logo"
           class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">Sunshine Court</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="../../dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">Admin</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
       
       
           <li class="nav-item ">
            
              
              <p>
                
                <a href="../../index.html" class="nav-link">
              <!--    <i class="right fas fa-angle-left"></i> -->
                Dashboard
                </a>
              </p>
           
            
          </li>
       
       
       
          <li class="nav-item">
            <a href="../widgets.html" class="nav-link">
			 <i class="nav-icon fas fa-home"></i>
			<p>
                Floors
               </p>
            </a>
          </li>
			
			   <li class="nav-item has-treeview">
            <a href="#" class="nav-link active menu-open">
              <i class="nav-icon fas fa-person-booth"></i>
              <p>
                Employees
                <i class="fas fa-angle-left right"></i>
                <span class="badge badge-info right">5</span>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="viewEmployees.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Employees List</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="addSalaryPay.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Salary Payments</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="viewRosters.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Rosters </p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="viewNotices.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Notices</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../viewLeaveRequests.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Leave Requests</p>
                </a>
              </li>
              
              
              
            </ul>
          </li>

	        <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user-alt"></i>
              <p>
                Residents
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Owners</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../charts/flot.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Tenants</p>
                </a>
              </li>
              
            </ul>
          </li>
    
	
	     <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-dollar-sign"></i>
              <p>
               Funds
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="../UI/general.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Maintenance</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../UI/icons.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Salary</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../UI/buttons.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Purchases</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../rentInformation/rentInforDash.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Rent Informations</p>
                </a>
              </li>
              
            </ul>
          </li>

		
	       <li class="nav-item has-treeview ">
            <a href="#" class="nav-link ">
              <i class="nav-icon fas fa-edit"></i>
              <p>
                Complaints
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="../complaintResponse/viewComplaintAdmin.jsp" class="nav-link ">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Residents</p>
                </a>
              </li>
            
            </ul>
          </li>
          
	        <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-table"></i>
              <p>
               Facilities
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="../tables/simple.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Facility</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../tables/data.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>memberships</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../tables/jsgrid.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Fee</p>
                </a>
              </li>
            </ul>
          </li>

	          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon far fa-hammer"></i>
              <p>
               Assets
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="../mailbox/mailbox.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Assets</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="../mailbox/compose.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Job status</p>
                </a>
              </li>
            </ul> 
         </li> 



	  <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-parking"></i>
              <p>
                Visitors
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="../examples/invoice.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Visits</p>
                </a>
              </li>
            </ul>
          </li>


	      <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-table"></i>
              <p>
               House Allocation
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="../tables/simple.html" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Houses</p>
                </a>
              </li>
              
            </ul>
          </li>




<li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-user-alt"></i>
              <p>
                Accounts
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Admin</p>
                </a>
              </li>
              
              <li class="nav-item">
                <a href="../viewLeaveRequests.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Employee </p>
                </a>
              </li>
              
              
            </ul>
          </li>






          </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>







