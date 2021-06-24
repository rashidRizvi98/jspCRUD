   
     <%@page import="helper.complaintHelper,model.complaintModel,controller.*, java.util.ArrayList" %>
    

<jsp:include page="../common/header.jsp" />  









<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Respond</h1>
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
                <h3 class="card-title">Start here</h3>
              </div>
              <!-- /.card-header -->






	<%
				complaintModel cm = new complaintModel();
				cm.setComplaintId(Integer.parseInt(request.getParameter("complaintId")));
				
				
				
				
				complaintHelper ch =new complaintHelper();
				ArrayList<complaintModel> complaintList= ch.displayComplaint(cm);
				
		for (complaintModel comp:complaintList)
		{
		%>










  <!-- form start -->
            
	<form role="form" method="post" action= "../../addResponseController">
	 <div class="card-body">
                  <div class="form-group">
                    <label for="exampleInputEmail1" >Respond</label>
                    <textarea name="response" type="textarea" class="form-control" id="exampleInputEmail1" placeholder="Type here" rows="6"></textarea>
                  </div>
                                  </div>
                <!-- /.card-body -->

                <div class="card-footer">
                 
                  <input type="hidden" value="<%=comp.getComplaintId() %>" name="complaintId">
                
                
                  <button type="submit" class="btn btn-success">Submit</button>
                </div>

	</form>
<%} %>
	            </div>
            <!-- /.card -->

</div>
</div>
</div>
</section>	
</div>


<jsp:include page="../common/footer.jsp" />  