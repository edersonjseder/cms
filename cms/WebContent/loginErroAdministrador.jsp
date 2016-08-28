<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd> 

<html> 

<head>
<link href="css/styleErro.css" rel="stylesheet" type="text/css" />
<script language="JavaScript">
function validaCampos() {
	with (document.submit) {
		if (usuario.value == "") {
		alert("Por favor, digite seu Usuario");
		usuario.focus();
		return false;
	}
		if (senha.value == "") {
		alert("Por favor, digite sua Senha");
		senha.focus();
		return false;
	}
   }
}

function focar(){
	with(document.submit){
		usuario.focus();
	}
}
</script> 

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 

<title>Gerenciador de Conte&uacute;do</title> 

</head> 

<body onload="focar();"> 

<form name="submit" action="ExibirAdministrador.action" method="post" onsubmit="return validaCampos();"> 
	<div id="logo" class="logo">Gerenciamento de Conte&uacute;do - CMS</div>
	    <div id="header" class="header">
	    	<div id="left_header" class="left_header"></div>
	        <div id="right_header" class="right_header"></div>
  		</div> 
		<!-- main -->
    <div id="content" class="content">
    	<div id="content_top" class="content_top">
        	<div id="content_top_left" class="content_top_left"></div>
            <div id="content_top_right" class="content_top_right"></div>
        </div>
		<div id="content_body" class="content_body">
		 	<div id="sidebar" class="sidebar">
            	<div id="sidebar_top" class="sidebar_top"></div>
				<div id="sidebar_body" class="sidebar_body"><p><span>Usuario e senha Incorretos!!</span></p></div>
                <div id="sidebar_bottom" class="sidebar_bottom"></div>
          	</div>
            <div id="text" class="text">
	            <div id="text_top" class="text_top">
	            	<div id="text_top_left" class="text_top_left"></div>
	                <div id="text_top_right" class="text_top_right"></div>
	            </div>

				<div id="text_body" class="text_body">
					<table border="0" style="width: 100%;">
						<tr>
							<td align="center">
								<label for="Login">Login</label>
							</td>
							<td colspan="2">
								<input id="usuario" type="text" name="usuario" size="20">
							</td>
							<td>&nbsp;</td>
							<td align="center">
								<label for="Login">Senha</label>
							</td>
							<td>
								<input id="senha" type="password" name="senha" size="20">
							</td>
							<td align="center"><button  type="submit" class="botao">Entrar</button></td>
						</tr>
					</table>
				</div>
				<div id="text_bottom" class="text_bottom">
                	<div id="text_bottom_left" class="text_bottom_left"></div>
                    <div id="text_bottom_right" class="text_bottom_right"></div>
                </div>				
			</div>
		</div>
		<div id="content_bottom" class="content_bottom">
        	<div id="content_bottom_left" class="content_bottom_left"></div>
            <div id="content_bottom_right" class="content_bottom_right"></div>
        </div>
	</div>
	<!-- end main -->
    <!-- footer -->
    <div id="footer" class="footer">
    <div id="left_footer" class="left_footer">&copy; Copyright 2008 <b>Eder</b> design </div>
    <div id="right_footer" class="right_footer">
		Desenvolvido por <a href="http://www.inter.it/" title="Website Design">Ederson de Jesus</a>
    </div>
    </div>
    <!-- end footer -->
</form> 
</body> 
</html>