<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"></c:url>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Abertura Nova Empresa</title>
</head>
<body>



	<form action="${linkServletNovaEmpresa}" method="post">
	
		Nome: <input type="text" name="nome"  />
		Data Abertura <input type="text" name="data"  />
		
	
		<input type="submit" />
	</form>

</body>
</html>