<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd> 

<html> 

<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style1 {
	font-family: Verdana;
	font-size: 11px;
	font-weight: lighter;
	color: #fff;
	border: black;
	background-color: #000000;
	text-transform: none;
	font-style: normal;
}
-->
</style> 
<script language="JavaScript">
function validaCampos() {
	with (document.submit) {
		if (campoUsuario.value == "") {
		alert("Por favor, digite seu Usuario");
		campoUsuario.focus();
		return false;
	}
		if (campoSenha.value == "") {
		alert("Por favor, digite sua Senha");
		campoSenha.focus();
		return false;
	}
   }
}

function focar(){
	with(document.submit){
		campoUsuario.focus();
	}
}
</script> 

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 

<title>Gerenciador de Conte&uacute;do</title> 

</head> 

<body onload="focar();"> 

<form name="submit" action="ExibirUsuario.action" method="post" onsubmit="return validaCampos();"> 
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
				<div id="sidebar_body" class="sidebar_body"><p><span>Usu&aacute;rio</span></p></div>
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
								<input id="usuario" type="text" name="campoUsuario" size="20">
							</td>
							<td>&nbsp;</td>
							<td align="center">
								<label for="Login">Senha</label>
							</td>
							<td>
								<input id="senha" type="password" name="campoSenha" size="20">
							</td>
							<td align="right"><button  type="submit" class="botao">Entrar</button></td>
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
</form> 
    <!-- footer -->
    <div id="footer" class="footer">
    <div id="left_footer" class="left_footer">Desenvolvido por <a href="http://www.inter.it/" title="Website Design">Ederson de Jesus</a></div>
    <div id="right_footer" class="right_footer">
		<form name="y_datetime"><input name="textbox1" type=text class="style1" style="text-align=center" size=54 width=31 ></form>
		<script language="javascript"> 
			ydate = new Object(); 
			ydate.style  = 3; 
			ydate.military = 0; 
			
			ydate.days1  = new Array("Domingo","Segunda-feira","Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira","Sábado"); 
			ydate.days2  = new Array("Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado"); 
			ydate.months1 = new Array("janeiro","fevereiro","março","abril","maio","junho","julho", "agosto","setembro","outubro","novembro","dezembro"); 
			ydate.months2 = new Array("jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"); 
			
			function datedisplay() { 
			
			  ydate.now   = new Date(); 
			  ydate.year  = ydate.now.getFullYear(); 
			  ydate.month = ydate.now.getMonth(); 
			  ydate.date  = ydate.now.getDate(); 
			  ydate.day   = ydate.now.getDay(); 
			  ydate.hour  = ydate.now.getHours(); 
			  ydate.min   = ydate.now.getMinutes(); 
			  ydate.sec   = ydate.now.getSeconds(); 
			  ydate.ampm  = ""; 
			
			  if (ydate.military) { 
			        if (ydate.hour < 10) { ydate.hour = "0" + ydate.hour; } 
			  } 
			  else if (ydate.hour > 11) { 
			        ydate.ampm = "Pm"; 
			        ydate.hour = ydate.hour - 12; 
			  } 
			  else { ydate.ampm = "Am"; } 
			
			  if (ydate.hour == 0) { ydate.hour = 12; } 
			  if (ydate.min < 10)  { ydate.min = "0" + ydate.min; } 
			  if (ydate.sec < 10)  { ydate.sec = "0" + ydate.sec; } 
			
			  if (ydate.style == 0)      { ydate.txt = ydate.months2[ydate.month]+" "+ydate.date+" "+ydate.year; } 
			  else if (ydate.style == 1) { ydate.txt =":: "+ ydate.days2[ydate.day]+" "+ydate.hour+":"+ydate.min+":"+ydate.sec+" "+ydate.ampm+" ::"; } 
			  else if (ydate.style == 2) { ydate.txt =":: "+ydate.date+" "+ydate.months2[ydate.month]+"  "+ydate.year+" :: "+ydate.hour+":"+ydate.min+":"+ydate.sec+" "+ydate.ampm+" ::"; } 
			  else if (ydate.style == 3) { ydate.txt =":: "+ydate.days1[ydate.day]+" - "+ydate.date+" de " +ydate.months1[ydate.month]+" de "+ydate.year+" - "+ydate.hour+":"+ydate.min+":"+ydate.sec+" "+ydate.ampm+" ::"; } 
			  else if (ydate.style == 4) { ydate.txt = ":: "+ydate.date+"/"+(ydate.month+1)+"/"+ydate.year+" :: "+ydate.hour+":"+ydate.min+":"+ydate.sec+" "+ydate.ampm+" ::"; } 
			  else{ ydate.txt = ydate.year+"/"+(ydate.month+1)+"/"+ydate.date+" , "+ydate.hour+":"+ydate.min+":"+ydate.sec+" "+ydate.ampm; } 
			
			  document.y_datetime.textbox1.value = ydate.txt; 
			  ydate.id=setTimeout("datedisplay()",1000); 
			} 
			
			datedisplay(); 
		</script>
    </div>
    </div>
    <!-- end footer -->
</body> 
</html>