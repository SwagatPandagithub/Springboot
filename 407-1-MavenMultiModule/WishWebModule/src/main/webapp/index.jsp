<%@ page import="org.WebServiceModule.WishMessageService"%>
<h1 style='color :red;text-align: center'>
	<%=new WishMessageService().wishMessage("swagat")%>
</h1>

