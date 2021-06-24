    
         <%@page import="helper.responseHelper,model.responseModel,controller.*, java.util.ArrayList" %>
 
    
<jsp:include page="../common/header.jsp" />  





<div class="content-wrapper">
 <div class="card-body table-responsive p-0">
             
<table class="table table-hover text-nowrap">
		<tr><th></th>
			<th></th>
			<th>Response ID</th>
			<th>Response</th>
			<th>Date</th>
			<th>Time</th>
		</tr>
		
		
		
		<%
			
				responseHelper reh =new responseHelper();
				ArrayList<responseModel> responseList= reh.displayResponses();
				
		for (responseModel resp:responseList)
		{
		%>
		
		<tr><td></td>
		<td></td>
			<td><%=resp.getResponseId() %></td> <!-- The code placed within JSP expression tag is written to the output stream of the response. -->
			<td><%=resp.getResponse() %></td>
			<td><%=resp.getResDate() %></td>
			<td><%=resp.getResTime() %></td>
		<td><a href="<%=request.getContextPath() %>/admin/complaintResponse/updateResponse.jsp?responseId=<%=resp.getResponseId() %>"><button class="btn btn-warning">change</button></a></td>
			<td>
				<form method="post" action="../../deleteResponseController">
					
					<input type="hidden" name="responseId" value="<%=resp.getResponseId()%>"> 
					<button class="btn btn-danger" type="submit" >Delete</button>
				</form>
			</td>
			<!--the context path is the portion of the request URL that indicates the context of the request.  -->
				
		</tr>	
		
		<%
		}
		%>
		
	</table>


       </div>
 </div>
            <!-- /.card -->

</div>



<jsp:include page="../common/footer.jsp" />  