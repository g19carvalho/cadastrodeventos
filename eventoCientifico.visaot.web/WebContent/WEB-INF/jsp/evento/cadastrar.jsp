<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Evento Cientifico</title>

<jsp:include page="../../../importacoes.jsp"/>

<script type="text/javascript">
$(function(){
	  $('#txtData').mask('00/00/0000');
	  
});

</script>

</head>
<body>


<form action="gravar" method="post">

<div class="panel panel-default">
<div class="panel-heading"><h2>Cadastro de Evento Cientifico</h2></div>
<div class="panel-body">
<div class="form-group">
	<label for="txtData">Data do Evento:</label>
	<input type="data" name="data" id="txtData" class="form-control" required>
</div>
	
<div class="form-group">
	<label for="txtNome">Descrição:</label>
	<input type="text" name="evento.descricao" id="txtDescricao" class="form-control" required>
</div>


	<button type="submit" class="btn btn-primary" ><span class="glyphicon glyphicon-floppy-disk"></span>Gravar
	</button>
	
	<a class="btn btn-primary"href="listar"><span class="glyphicon glyphicon-arrow-left"></span>Voltar</a>
	
	</div>
</div>


</form>

</body>
</html>