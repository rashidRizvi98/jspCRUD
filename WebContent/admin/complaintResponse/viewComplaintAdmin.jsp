    
     <%@page import="helper.complaintHelper,model.complaintModel,controller.*, java.util.ArrayList" %>
   
<jsp:include page="../common/header.jsp" />  







<div class="content-wrapper">
 <div class="card-body table-responsive p-0">
             
<table class="table table-hover text-nowrap">
		<tr><td></td>
			<td></td>
			<th>Complaint ID</th>
			<th>Complaint</th>
			<th>Resident ID</th>
			<th>Date</th>
			<th>Time</th>
		</tr>
		
		
		
		<%
			
				complaintHelper ch =new complaintHelper();
				ArrayList<complaintModel> complaintList= ch.displayComplaints();
				
		for (complaintModel complaint:complaintList)
		{
		%>
		
		<tr><td></td>
			<td></td>
			<td><%=complaint.getComplaintId() %></td> <!-- The code placed within JSP expression tag is written to the output stream of the response. -->
			<td><%=complaint.getComplaint() %></td>
			<td><%=complaint.getUserName() %>
			<td><%=complaint.getComDate() %></td>
			<td><%=complaint.getComTime() %></td>

			<td>
				<form method="post" action="../../deleteComplaintAController">
					<input type="hidden" name="userName" value="<%=complaint.getUserName()%>"> 
					
					<input type="hidden" name="complaintId" value="<%=complaint.getComplaintId()%>"> 
					<button class="btn btn-danger"  type="submit" >Delete</button>
				</form>
			</td>
			<td><a href="<%=request.getContextPath() %>/admin/complaintResponse/addResponse.jsp?complaintId=<%=complaint.getComplaintId() %>&& userName=<%=complaint.getUserName() %> "><button class="btn btn-warning">Respond</button></a></td>
			


			<!--the context path is the portion of the request URL that indicates the context of the request.  -->
				
		</tr>	
		
		<%
		}
		%>
		
	</table>
</div>


</div>
</div>


<jsp:include page="../common/footer.jsp" />  