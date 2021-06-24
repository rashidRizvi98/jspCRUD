   
    <%@page import="helper.rInforHelper,model.rInforModel,controller.*, java.util.ArrayList" %>
    
 <jsp:include page="../common/header.jsp" />     
 

<div class="content-wrapper">
<div class="card-body table-responsive p-0">
             
<table class="table table-hover text-nowrap">

		<tr><th></th>
		<th>  </th>
			<th>Rent Information Id</th>
			<th>Tenant id</th>
			<th>Rent Amount</th>
			<th>Month</th>	
			<th>Date</th>
			<th>Time</th>
			
		</tr>
		
		
		<%
		
		
		rInforHelper rh=new rInforHelper();
		   ArrayList<rInforModel> rinforList= rh.displayRInformations();
		
		for (rInforModel rinfor: rinforList)
		{
	    %>
		<tr><td></td>
		<td>  </td>	
	 	<td><%=rinfor.getrInforId() %></td>
		<td><%=rinfor.getrId() %></td>
			<td><%=rinfor.getrAmount() %></td>
			<td><%=rinfor.getMonth() %></td>
			<td><%=rinfor.getRentDate() %></td>
			<td><%=rinfor.getRentTime() %></td>
		
			<td><a href="<%=request.getContextPath() %>/admin/rentInformation/updateRentInfor.jsp?rInforId=<%=rinfor.getrInforId() %>"><button class="btn btn-warning">change</button></a></td>
			<td>
				<form method="post" action="../../deleteRInforController">
					
					<input type="hidden" name="rInforId" value="<%=rinfor.getrInforId()%>"> 
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




<jsp:include page="../common/footer.jsp" />  