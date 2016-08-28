<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style type="text/css">
h3 {font-family: Comic Sans MS; font-size: 18px;}
</style>
<script language="JavaScript">
function validaCampos() {
	with (document.submit) {
		if (numTopico.value == "") {
		alert("Digite o Numero");
		numTopico.focus();
		return false;
	}
		if (nomeTopico.value == "") {
		alert("Digite o Nome");
		nomeTopico.focus();
		return false;
	}
   }
}

function focar(){
	with(document.submit){
		numTopico.focus();
	}
}


/*Função Pai de Mascaras*/
function Mascara(o,f){
v_obj=o
v_fun=f
setTimeout("execmascara()",1)
}

/*Função que Executa os objetos*/
function execmascara(){
v_obj.value=v_fun(v_obj.value)
}	

function Integer(v){
return v.replace(/\D/g,"");
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Excluir T&oacute;picos</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body onload="focar();">
	<!-- header -->
<form name="submit" action="ExcluirTopicosNoBanco.action" method="post" onsubmit="return validaCampos();">
    <div id="logo" class="logo"><a href="#">Modo Administrador</a></div>
    <div id="header" class="header">
    	<div id="left_header" class="left_header"></div>
        <div id="right_header" class="right_header"></div>
  </div> 
  <div id="menu" class="menu">
        	<ul>
              <li><a href="ExibirTopicosPagina.action">Voltar</a></li>
           </ul>
      </div>
    <!--end header -->
    <!-- main -->
    <div id="content" class="content">
    	<div id="content_top" class="content_top">
        	<div id="content_top_left" class="content_top_left"></div>
            <div id="content_top_right" class="content_top_right"></div>
        </div>
      <div id="content_body" class="content_body">
       	  <div id="sidebar" class="sidebar">
            <div id="sidebar_top" class="sidebar_top"></div>
            <div id="sidebar_body" class="sidebar_body" align="center">Professor</div>
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
						<td colspan="3" align="Center"><h3>Exclus&atilde;o de T&oacute;picos</h3></td>
					</tr>					

					<tr>
						<td width="10%">N&uacute;mero do T&oacute;pico:</td>
						<td colspan="2"><input id="numTopico" type="text" name="numTopico" size="40" onKeyDown="Mascara(this,Integer);" onKeyPress="Mascara(this,Integer);" onKeyUp="Mascara(this,Integer);"></td>
					</tr>

					<tr>
						<td colspan="3" align="right"><button  type="submit" class="entrar">Excluir</button></td>
					</tr>
				</table>
             <div id="foot_text" class="foot_text">
			 </div>
            
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
