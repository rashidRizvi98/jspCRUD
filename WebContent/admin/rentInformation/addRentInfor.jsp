




 
<jsp:include page="../common/header.jsp" />  


 <%@page import="helper.RLoginHelper,model.RRegistration,controller.*, java.util.ArrayList" %>




<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6  ml-3">
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
          <!-- left column -->
          <div class="col-md-10 ml-3">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
               <h3 class="card-title">Start adding rent information</h3>
              </div>
              <!-- /.card-header -->








<form role="form" method="post" action="../../addRInforController">

	 <div class="card-body">
               
	
	
	              <div class="form-group">
                    <label for="exampleInputEmail1" >Tenant ID</label>
<!--                     <input name="rId" type="text" class="form-control" id="exampleInputEmail1" placeholder="Type here">  -->
                 <select  name="rId"  class="form-control" id="exampleInputEmail1">
        		<option value="-1">Select user name</option>
                <%
		
		RLoginHelper rlh=new RLoginHelper();
		   ArrayList<RRegistration> UserNamesList= rlh.displayUserNames();
		
		for (RRegistration userNames: UserNamesList)
		{
	    %>
                <option><%=userNames.getUserName() %></option>
                
                
                                
        <%} %>        
                </select>
                  </div>
                

	
	
	 <div class="form-group">
                    <label for="exampleInputEmail1" >Amount</label>
                    <input name="rAmount" type="number" class="form-control" id="exampleInputEmail1" placeholder="Type here">
                  </div>
                
	
	
		 <div class="form-group">
                    <label for="exampleInputEmail1" >Name</label>
	
 		<select name="month"  class="form-control" id="exampleInputEmail1">
				<option value="january" >January</option>
				<option value="february" >February</option>
				<option value="march" >March</option>
				<option value="april" >April</option>
				<option value="may" >May</option>
				<option value="june" >June</option>
				<option value="july" >July</option>
				<option value="august" >August</option>
				<option value="september" >September</option>
				<option value="october" >October</option>
				<option value="november" >November</option>
				<option value="december" >December</option>
				
		</select>
                  </div>
		
		
	  <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-success">Submit</button>
                </div>
              </form>
            </div>
            <!-- /.card -->


<!--  	
<form method="post" action="../../rInforReport">

<button type="submit" value="submit">Generate</button>


</form>
-->


</div>
</div>
</div>
</section>	
</div>


<jsp:include page="../common/footer.jsp" />  