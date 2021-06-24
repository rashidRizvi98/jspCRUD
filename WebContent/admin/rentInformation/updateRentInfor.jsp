
     <%@page import="helper.rInforHelper,model.rInforModel,controller.*, java.util.ArrayList" %>
    
      <%@page import="helper.RLoginHelper,model.RRegistration,controller.*, java.util.ArrayList" %>
    
    
<jsp:include page="../common/header.jsp" />  






		
		
		<%
				rInforModel r = new rInforModel();
				r.setrInforId(Integer.parseInt(request.getParameter("rInforId")));
	
				rInforHelper rh =new rInforHelper();
				ArrayList<rInforModel> rInforList= rh.displayRInformation(r);
				
		for (rInforModel rinfor:rInforList)
		{
		%>
		
			
		
		
		
		
		
		
		
		<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Update Rent Information</h1>
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
          <div class="col-md-6">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
            <h3 class="card-title">Start updating rent information</h3>
    </div>
              <!-- /.card-header -->






<form role="form" method="post" action="../../updateRInforController">

	 <div class="card-body">
               
	
	
	              <div class="form-group">
                    <label for="exampleInputEmail1" >Tenant Id</label>
              <!--       <input name="rId" type="text" value="<%=rinfor.getrId() %>" class="form-control" id="exampleInputEmail1" placeholder="Type here">
                 -->
                         <select  name="rId"  class="form-control" id="exampleInputEmail1">
        		<option ><%=rinfor.getrId() %></option>
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
                    <label for="exampleInputEmail1" >Rent Amount</label>
                    <input name="rAmount" type="number" value="<%=rinfor.getrAmount() %>" class="form-control" id="exampleInputEmail1" placeholder="Type here">
                  </div>
                
	
	
		 <div class="form-group">
                    <label for="exampleInputEmail1" >Month</label>
	 		<select name="month"  class="form-control" id="exampleInputEmail1">
				<option ><%=rinfor.getMonth() %></option>
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
                 <input type="hidden" value="<%=rinfor.getrInforId() %>" name="rInforId">
	
                 
                  <button type="submit" class="btn btn-success">Update</button>
                </div>
              </form>
            </div>
            <!-- /.card -->
				
		
		
		<%
			}
			%>
			
		
		</div>
</div>
</div>
</section>	
</div>


<jsp:include page="../common/footer.jsp" />  