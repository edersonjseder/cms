<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style type="text/css">
h1 {font-family: Comic Sans MS; font-size: 18px; color: #00FF00;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>P&aacute;gina T&oacute;picos</title>
<link href="css/style1.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- header -->
    <div id="logo" class="logo"><a href="#">Modo Usu&aacute;rio</a></div>
    <div id="header" class="header">
    	<div id="left_header" class="left_header"></div>
        <div id="right_header" class="right_header"></div>
  </div> 
  <div id="menu" class="menu">
        	<ul>
			  <li><a href="VoltarPaginaUsuario.action">Voltar</a></li>
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
            <div id="text" class="text">
            <div id="text_top" class="text_top">
            	<div id="text_top_left" class="text_top_left"></div>
                <div id="text_top_right" class="text_top_right"></div>
            </div>
            <div id="text_body" class="text_body">
                <display:table name="listaTopicos" id="listaTopicos" requestURI="ExibirTopicos.action"
					class="table_lista" style="width: 100%">		
				
				<display:column property="idTopicos"  titleKey="Nome Topico" class="list_center" style="width: 25%;" />
				<display:column property="nome"  titleKey="Nome Topico" class="list_center" style="width: 25%;" />
				<display:column property="detalhe"  titleKey="Detalhe" class="list_center" style="width: 25%;" />
				<display:column property="status"  titleKey="Status" class="list_center" style="width: 22%;" />
				<display:setProperty name="basic.msg.empty_list_row"><s:text name="Nenhum Registro Encontrado" />
			    <display:setProperty name="basic.empty.showtable" value="true" /></display:setProperty>
				</display:table>
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
</body>
</html>
