<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Eventos</title>

<jsp:include page="../../../importacoes.jsp"/>


<script type="text/javascript">
	$(function(){
		$('table').dataTable({
	        "language": {
	            "lengthMenu": "Mostrando _MENU_ registros por páginas",
	            "zeroRecords": "Nenhuma ocorrência",
	            "info": "pág _PAGE_ de _PAGES_",
	            "infoEmpty": "Sem registros",
	            "infoFiltered": "(Buscando de _MAX_ registros)",
	            "search": "Buscar",
	            "paginate": {
	                "next": "próximo",
	                "previous": "anterior."
	            },
	        }
	    });
		
	})
</script>

</head>
<body>
	<div class="container">
		<h2>Listagem de evento</h2>
		<table>
		
		<thead>
			<tr>
				<th> Data do evento </th>
				<th> Descrição do evento </th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${Evento}" var="eve">
		
			<tr>
				<td>${eve.data}</td>
				<td>${eve.descricao}</td>
			</tr>
			
		</c:forEach>
		
		</tbody>
		</table>
		
	<a class="btn btn-primary"href="http://localhost:8080/eventocientifico.visaot.web/"><span class="glyphicon glyphicon-arrow-left"></span>Voltar</a>
	<a class="btn btn-primary" href="cadastrar"><span class="glyphicon glyphicon-plus"></span>Adicionar</a>	
	
	</div>

</body>
</html>