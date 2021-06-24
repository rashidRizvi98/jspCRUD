<jsp:include page="../common/header.jsp" />  







<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
         <!--   <h1>Rent Information</h1>  --> 
          	 <h1>Rent Information</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    
    
    <section class="content">

			<div class="container-fluid">
				<div class="row">
					<div class="col-12">
						<!-- Default box -->
						<div class="card">
							<div class="card-header">
								<div class="container text-right">
				 <a href="../home.jsp"><button type="button" class="btn btn-default btn-sm">
           <i class="fa fa-angle-left"></i> Back  
        </button></a>	
				</div>
							</div>
							<div class="card-body">
			
	
	
			
			
            
		             <a href="addRentInfor.jsp">
                     <button type="button" class="btn btn-block bg-gradient-primary btn-lg">            
                     <h1>Add Rent Information</h1>
                     <h5>keep rent information records</h5> 
	                 </button>
	                 </a>
					
			<br>
					 <a href="viewRentInfor.jsp">
					 <button type="button" class="btn btn-block bg-gradient-orange btn-lg">
                     <h1>View Rent Informations</h1>
                     <h5>list of rent informations</h5>
	                 </button>
	                 </a>
				<br>		

		<form method="post" action="../../rInforReport">

					 <button type="submit" class="btn btn-block bg-gradient-success btn-lg">
                     <h1>Generate Report</h1>
                     <h5>get the data into a pdf</h5>
	                 </button>

		</form>
					


			</div>
			
			
			
				


	
			
								<div class="card-footer"><h6 class="container text-right"></h6></div>
								<!-- /.card-footer-->
							</div>
							<!-- /.card -->
						</div>
					</div>
				</div>
			</section>
    
    
    
    
    
    </div>


<jsp:include page="../common/footer.jsp" />  