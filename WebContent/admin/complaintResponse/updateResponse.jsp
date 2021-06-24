
        <%@page import="helper.responseHelper,model.responseModel,controller.*, java.util.ArrayList" %>
 

<jsp:include page="../common/header.jsp" />  


		
		
		
		<%
				responseModel re = new responseModel();
				re.setResponseId(Integer.parseInt(request.getParameter("responseId")));
	
				responseHelper reh =new responseHelper();
				ArrayList<responseModel> responseList= reh.displayResponse(re);
				
		for (responseModel resp:responseList)
		{
		%>
		
		





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
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              
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







  <!-- form start -->
            
	<form role="form" method="post" action= "../../updateResponseController">
	 <div class="card-body">
                  <div class="form-group">
                    <label for="exampleInputEmail1" >Respond</label>
                    <textarea rows="6" name="response" type="textarea"  class="form-control" id="exampleInputEmail1" placeholder="Type here"><%=resp.getResponse() %></textarea>
                  </div>
                                  </div>
                <!-- /.card-body -->

                <div class="card-footer">
                <input type="hidden" value="<%=resp.getResponseId() %>" name="responseId">
		
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