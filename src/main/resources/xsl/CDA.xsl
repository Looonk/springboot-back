<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:n3="http://www.w3.org/1999/xhtml"
	xmlns:n1="urn:hl7-org:v3" xmlns:n2="urn:hl7-org:v3/meta/voc" xmlns:voc="urn:hl7-org:v3/voc"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

	<xsl:output method="html" indent="yes" version="4.01" 
		encoding="ISO-8859-1" doctype-public="-//W3C//DTD HTML 4.01//EN" />

	<!-- CDA document -->
	<xsl:variable name="tableWidth">
		50%</xsl:variable>

	<!-- Documentate -->
	<xsl:variable name="color">color</xsl:variable>
	<xsl:variable name="theme">theme</xsl:variable>
	<xsl:variable name="server">serverName</xsl:variable>
  <xsl:variable name="serverNameVar">gehos</xsl:variable>

	<xsl:variable name="title">
		<xsl:choose>
			<xsl:when test="/n1:ClinicalDocument/n1:title">
				<xsl:value-of select="/n1:ClinicalDocument/n1:title"/>
			</xsl:when>
			<xsl:otherwise>Clinical Document</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:template match="/">
		<xsl:apply-templates select="n1:ClinicalDocument"/>
	</xsl:template>
         


	<xsl:template match="n1:ClinicalDocument">
		<html>
			<head>
				<link href="/css/style.css"
				  rel="stylesheet"
				  type="text/css"/>
				<style>
					.phones{
						    background-color: #333333;
						    border-radius: 3px 3px 3px 3px;
						    color: white;
						    font-family: verdana;
						    font-size: 10px;
						    font-weight: bold;
						    padding: 4px 4px 1px;
						    width: 98%;}	
					ul,ol{margin:0px ;padding-left:13px }	
					.ol1,.ul1 {
							margin: 0 !important;
							padding-left: 25px !important;
					}
					li{padding:0px !important}
					.datas
					{color:#bfbfbf}	
					.ind
					{
					background-color: #FFFFFF;
					border: 1px solid #989898;
					
		
					top:-1px;
				    overflow: auto;
				    position: fixed;
				    width: 295px;
					}
					.indButton
					{
					    background-color: #F4F4F4;
					    background-position: 2px 3px;
					    background-repeat: no-repeat;
					    border-bottom: 1px solid #989898;
					    border-radius: 0 8px 8px 0;
					    border-right: 1px solid #989898;
					    border-top: 1px solid #989898;
					    cursor: pointer;
					    height: 25px;
					    opacity: 0.8;
					    position: fixed;
					    top: 25px;
					    width: 23px;
								    
					}
					.indButton:hover
					{

					    opacity: 1;
	
								    
					}
						
				</style>
                   <script>
                   // <![CDATA[
						var color=new String();
						var server=new String();
						var theme=new String();
						var module=new String();
						var selected="";
						var collapsed=true;


				      function load()
				      {

				      var aux=new String(window.location);
				      aux=aux.split('?')[1];
				      color=aux.split('color=')[1].split('&')[0];
				      theme=aux.split('theme=')[1].split('&')[0];
				      server=aux.split('server=')[1].split('&')[0].replace('/','');
				      module=aux.split('module=')[1].split('&')[0];
							      
					  var link_tag = document.getElementsByTagName("link")[0];
					  link_tag.href=link_tag.href.replace('color',color);
					  link_tag.href=link_tag.href.replace('theme',theme);
					  link_tag.href=link_tag.href.replace('serverName',server);
					

				      }
				      
				      function setSc(el)
				      {
				      if(selected=="")
				      {
				      	selected=el;
				      }
				      if(selected.id!=el.id){
				          selected.style.fontWeight="normal";
				          selected.style.color="";
						  selected=el;   
					   }
					     
				       setTimeout(scrollL,100);
				      }
				      function scrollL()
						{
							
						  
							
							  selected.style.fontWeight="bold";
							  selected.style.color="#9A2121";
						      var left = (window.pageXOffset)?(window.pageXOffset):(document.documentElement)?document.documentElement.scrollLeft:document.body.scrollLeft;
						      var top = (window.pageYOffset)?(window.pageYOffset):(document.documentElement)?document.documentElement.scrollTop:document.body.scrollTop;
		
						      window.scrollTo(0,top);
						   /* Scroll the right frame to wherever this frame is scrolled to */
						   
						}
				      
					function refreshLinksDoc(par)
					{	
								var comp=document.getElementById('link'+par);
								var url='/*2/modVisorhc/visorhc/modules/*3/hce/modInfo/DocClinico/VerDocClinico.gehos?identificador='+par+'&origen=buscarDocumento';
								url=url.replace('*2',server);
								comp.href=url.replace('*3',module);		
					}
					function showIndice()
					{
					    var td=document.getElementById("indiceTD");
						if(collapsed)
						{
						  
						  td.style.display="";
						  
						}
						else
						{
						   td.style.display="none";
						}
						collapsed=!collapsed;
					}
					
					function resizeIndice()
				      {
				      	var size2=window.innerHeight;
				      	
				      	var ell=document.getElementById('indiceDiv');
				      
				        
				      	ell.style.height=(size2-15)+"px";
				      }
				      function doResize(e)
				      {
				        
				      	resizeIndice();
				      }
				      // ]]>
		  </script>
				<title>
					<xsl:value-of select="$title"/>
				</title>

			</head>


			<body class="body">

		          <script>
				      load();
    				window.onresize = doResize;

			  </script>
	
			  <table cellpadding="0px" cellspacing="0px" width="99%" border="0px">
			   <tr>
			   		<td  width="300px" id="indiceTD" style="display:none">
			   		
			   		<div class="ind" id="indiceDiv" >
					    <div style="font-family:Verdana; font-size:12px">
							<xsl:call-template name="indiceCDA">
								<xsl:with-param name="token" select="/n1:ClinicalDocument/n1:component/n1:structuredBody"/>
							</xsl:call-template>
						</div>
					
					</div>
					
					<img src="/img/spacer.gif" />
			   		</td>
			  <td>
				<table cellpadding="0px" cellspacing="0px" width="99%" border="0px">
					<!-- Datos del paciente-->
					<xsl:choose>
						<xsl:when test="/n1:ClinicalDocument/n1:recordTarget">
							<tr>
								<td>
								  
									<div class="panel">
										<div class="panelHeader">
											<div style="float: left;" align="left">
														Datos generales del paciente
											</div>
											<div align="right">
												<xsl:value-of select="concat('No.H.C.: ',//n1:entry/n1:observationMedia[@ID='numerohc']/n1:value)"/>
											</div>
										</div>
									<!--Panelcontent-->
										<div class="panelContent">
											
											
											
											
											
											
				<table cellpadding="0" cellspacing="0">
					<tr>
						<td style="width: 0px"></td>

						<td  valign="top">

								<xsl:call-template name="fotoPaciente">
											
								</xsl:call-template>		
						
						</td>

						<td style="width: 8px"></td>

						<td valign="middle">
						<!-- Datos -->
							<div style="overflow:hidden;height: 76px;">
							<table cellpadding="0" cellspacing="0" style="height: 60px;margin-top: 10px;">
							  <tr>
								<td valign="top">
									<div class="normalText">
										Nombre:
									</div>
								</td>

								<td style="width: 5px"></td>
								<td valign="top">
									<div class="dataText">
										<xsl:choose>
											<xsl:when test="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:given">
												<xsl:value-of select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:given"/>												
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>			
									</div>
								</td>

								<td style="width: 23px"></td>
								<td valign="top">
									<div class="normalText">
										Primer apellido:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td valign="top">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[1]">
												<xsl:value-of select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[1]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
								<td style="width: 23px"></td>

								<td valign="top">
									<div class="normalText">
										Segundo apellido:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td valign="top">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[2]">
												<xsl:value-of select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[2]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
								
								<td style="width: 23px"></td>

								<td valign="top">
									<div class="normalText">
										Edad:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td valign="top">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[3]">
												<xsl:value-of select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[3]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
								
								<td style="width: 23px"></td>

								<td valign="top">
									<div class="normalText">
										ABO/Rh:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td valign="top">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[5]">
												<xsl:value-of select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[5]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
			
							 </tr>


							 <tr>
								<td>
									<div class="normalText" style="margin-bottom:2px">
											No. de identidad:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td>
									<div  class="dataText">
										<xsl:call-template name="patientId">
												<xsl:with-param name="structuredBody" select="/n1:ClinicalDocument/n1:component/n1:structuredBody"/>
										</xsl:call-template>
									</div>
								</td>

								<td style="width: 23px"></td>

								<td>
									<div class="normalText">
										Fecha de nacimiento:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td>
									<div  class="dataText">
										<xsl:call-template name="formatDate">
											<xsl:with-param name="date" select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:birthTime/@value"/>
										</xsl:call-template>
									</div>
								</td>
								
								<td style="width: 23px"></td>
								
								<td>
									<div class="normalText">
										Sexo:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td>
									<div  class="dataText" >
										<xsl:variable name="sex" select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:administrativeGenderCode/@code"/>
										<xsl:choose>
											<xsl:when test="$sex='M'">Masculino</xsl:when>
											<xsl:when test="$sex='F'">Femenino</xsl:when>
										</xsl:choose>
									</div>
								</td>
								
								<td style="width: 23px"></td>
								
								<td>
									<div class="normalText">
										Nacionalidad:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td >
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[4]">
												<xsl:value-of select="/n1:ClinicalDocument/n1:recordTarget/n1:patientRole/n1:patient/n1:name/n1:family[4]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
						

							 </tr>


							 
							</table>
							</div>
						<!--end Datos-->
						</td>
					</tr>

				</table>
											
										</div>
									</div>
								</td>
							</tr>
							
						</xsl:when>
					</xsl:choose>
						<tr><td>
								<!--body -->							
								<xsl:apply-templates select="n1:component/n1:structuredBody"/>
								<!-- end body -->
						</td></tr>

					<!--Datos del documento -->

							<tr>
								<td>
									<div style="height: 13px;"/>			
									<div class="panel">
										<div class="panelHeader">
											<xsl:text>
												Datos del documento
											</xsl:text>
										</div>
										<div class="panelContent">
										<!--Datos-->
											<table cellpadding="0" cellspacing="0" border="0">
												<tr>
													<td class="tdSepPeq" valign="top">
														<div  class="normalText">
																Realizado por:
														</div>
													</td>
													<td style="width: 5px"></td>
													<td class="tdSepGran" valign="top">
														<div  class="dataText">
															<xsl:choose>
																<xsl:when test="/n1:ClinicalDocument/n1:author/n1:assignedAuthor/n1:assignedPerson/n1:name">
																	<xsl:call-template name="getName">
																		<xsl:with-param name="name" select="/n1:ClinicalDocument/n1:author/n1:assignedAuthor/n1:assignedPerson/n1:name"/>
																	</xsl:call-template>
																</xsl:when>
																<xsl:otherwise>
																	-
																</xsl:otherwise>
															</xsl:choose>
														</div>
													</td>								
													<td class="tdSepPeq" valign="top">
														<div  class="normalText">
																Fecha de creaci&#243;n:
														</div>
													</td>
													<td style="width: 5px"></td>
													<td class="tdSepGran" valign="top">
														<div  class="dataText">
															<xsl:call-template name="formatDate">
																<xsl:with-param name="date" select="/n1:ClinicalDocument/n1:effectiveTime/@value"/>
															</xsl:call-template>
														</div>
													</td>
													<td class="tdSepPeq" valign="top">
														<div  class="normalText">
																Hora:
														</div>
													</td>
													<td style="width: 5px"></td>
													<td class="tdSepGran" valign="top">
														<div  class="dataText">
															<xsl:call-template name="formatDate2">
																<xsl:with-param name="date" select="/n1:ClinicalDocument/n1:effectiveTime/@value"/>
															</xsl:call-template>
														</div>
													</td>
												</tr>
												<tr>
													<td style="height:2px;" colspan="5"></td>
												</tr>
												<tr>
															<td valign="bottom" >
																<div  class="normalText">
																		Instituci&#243;n a la que pertenece:
																</div>
															</td>
															<td style="width: 5px"></td>
															<td valign="bottom" style="padding-right:24px">
																<div  class="dataText">
																	<xsl:call-template name="getName">
																		<xsl:with-param name="name" select="/n1:ClinicalDocument/n1:author/n1:assignedAuthor/n1:representedOrganization/n1:name"/>
																	</xsl:call-template>
																</div>
															</td>
															<td valign="bottom">
																<div  class="normalText">
																		Instituci&#243;n donde se realiza:
																</div>
															</td>
															<td style="width: 5px"></td>
															<td valign="bottom" style="padding-right:24px">
																<div  class="dataText">
																	<xsl:call-template name="getName">
																		<xsl:with-param name="name" select="/n1:ClinicalDocument/n1:custodian/n1:assignedCustodian/n1:representedCustodianOrganization/n1:name"/>
																	</xsl:call-template>
																</div>
															</td>				
												</tr>
											</table>
										<!-- end Datos-->
										</div>
									</div>
								</td>								
							</tr>	


							<tr><td>
								<xsl:choose>
									<xsl:when test="n1:relatedDocument">
							<div style="height: 13px;"/>	
								<div class="panel">
									<div class="panelHeader">
										<text class="title">
											Documento relacionado
										</text>
									</div>
									<div class="panelContent">
										<table cellspacing="0px" cellpadding="0px" border="0px">
												<xsl:choose>
													<xsl:when test="n1:relatedDocument">
																<xsl:apply-templates select="n1:relatedDocument"/>
													</xsl:when>
													<xsl:otherwise>
															<tr>
																	<td>
																				<div  class="normalText">
																						No existe ning&#250;n documento relacionado.
																				</div>
																	</td>
															</tr>
													</xsl:otherwise>
												</xsl:choose>
										</table>								
									</div>
								</div>	
								</xsl:when>
							</xsl:choose>					
							</td></tr>
							<tr>
								<td>
									<!--footer firma -->
										<xsl:call-template name="bottomline"/>
									<!--end footer firma -->
								</td>
							</tr>
		
				<!--end Datos del documento -->
				</table>		
			</td></tr>
			
		</table>	
           

			
			  <div class="indButton" title="Índice" onclick="showIndice()" style=" background-image:url(/img/i.png);">
			   		   
			   </div>
			   <script>
			   		resizeIndice();
			   </script>
			</body>
		</html>
	</xsl:template>

	<!-- Estado Civil tamplate-->
	<xsl:template name="maritalStatus">
		<xsl:param name="maritalStatusCode"/>
		<xsl:variable name="code" select="normalize-space($maritalStatusCode/@code)"/>
		<xsl:variable name="estadoCivil" select="string($code)"/>
		<xsl:choose>
			<xsl:when test="$estadoCivil='A'">
				Matrimonio anulado  
			</xsl:when>	
			<xsl:when test="$estadoCivil='D'">
				Divorciado 	
			</xsl:when>
			<xsl:when test="$estadoCivil='T'">
				Unido
			</xsl:when>
			<xsl:when test="$estadoCivil='I'">
				Concubinato
			</xsl:when>
			<xsl:when test="$estadoCivil='L'">
				Separado legalmente 
			</xsl:when>
			<xsl:when test="$estadoCivil='M'">
				Casado 	
			</xsl:when>
			<xsl:when test="$estadoCivil='S'">
				Soltero 	
			</xsl:when>
			<xsl:when test="$estadoCivil='P'">
				Soltero legalmente 	
			</xsl:when>
			<xsl:when test="$estadoCivil='W'">
				Viudo
			</xsl:when>	
			<xsl:otherwise>
			-
			</xsl:otherwise>		
		</xsl:choose>
	</xsl:template>
	<!-- end Estado Civil template-->

<!--template Raza-->
	<xsl:template name="razaDoc">
		<xsl:param name="raceCode"/>
		<xsl:variable name="code" select="normalize-space($raceCode/@code)"/>
		<xsl:choose>
			<xsl:when test="$code!=''">
					<xsl:value-of select="normalize-space($code)"/>
			</xsl:when>
			<xsl:otherwise>
					-
			</xsl:otherwise>
		</xsl:choose>		
	</xsl:template>
<!-- end template Raza-->

<!--template Etnia-->
	<xsl:template name="etniaDoc">
		<xsl:param name="ethnicGroupCode"/>
		<xsl:variable name="code" select="normalize-space($ethnicGroupCode/@code)"/>
		<xsl:choose>
			<xsl:when test="$code!=''">
					<xsl:value-of select="normalize-space($code)"/>
			</xsl:when>
			<xsl:otherwise>
					-
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
<!--end template Etnia-->

<!--template País-->
	<xsl:template name="country">
		<xsl:param name="country"/>
		<xsl:variable name="pais" select="normalize-space($country)"/>
		<xsl:choose>
			<xsl:when test="$pais!=''">
					<xsl:value-of select="$pais"/>
			</xsl:when>
			<xsl:otherwise>
					-
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
<!--end template País-->	

	<!-- StructuredBody -->
	<xsl:template match="n1:component/n1:structuredBody">
		<table cellpadding="0px" cellspacing="0px" width="100%">			
			<xsl:for-each select="n1:component/n1:section">		
				<tr>
					<td>
						<xsl:apply-templates select="."/>						
					</td>
				</tr>
			</xsl:for-each>
		</table>
	</xsl:template>
	
	
	
	<!-- Component/Section ***-->
	<xsl:template match="n1:component/n1:section">					
		<xsl:choose>
			<xsl:when test="n1:title">
				<xsl:variable name="titulo" select="normalize-space(n1:title)"/>
				<xsl:choose>
					<xsl:when test="$titulo!='Foto del paciente' and $titulo!='PATIENTID'">
							<xsl:variable name="idp" select="concat($titulo,position())"/>
							<div class="panel2" id="{generate-id(n1:title)}" >
								
								<xsl:apply-templates select="n1:title"/>							
								<div class="panelContent2">				
									<xsl:apply-templates select="n1:entry|n1:text|n1:component/n1:section"/>
								</div>
							</div>
					</xsl:when>
				</xsl:choose>
			</xsl:when>
			<xsl:otherwise>					
				 <xsl:apply-templates select="n1:entry|n1:text|n1:component/n1:section"/>				
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- imagen base64 -->
	<xsl:template match="n1:entry">
		<xsl:choose>
			<xsl:when test="n1:observationMedia/n1:value[@mediaType='image/png']">
				<xsl:variable name="imagen" select="n1:observationMedia/n1:value"/>
				<div>
					<img src="data:image/png;base64,{$imagen}"/>
				</div>
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	
	<!-- Imagen Paciente-->
	<xsl:template name="fotoPaciente">
		<xsl:choose>
			<xsl:when test="//n1:entry/n1:observationMedia[@ID='patientphoto']/n1:value">
			<xsl:variable name="imagenURL" select="//n1:entry/n1:observationMedia[@ID='patientphoto']/n1:value"/>		
				<div class="imgPatient" style="background-image:url({$imagenURL});overflow:hidden; width:74px ; height:74px" >

		 		</div>
			</xsl:when>
			<xsl:otherwise>
			<div class="imgPatient" style="background-image:url('/img/desconocido.png');overflow:hidden; width:74px ; height:74px" >

		 		</div>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	
	
	
	<!--   Title  -->
	<xsl:template match="n1:title">
		<div class="panelHeader">
		
						<text class="title">
							<xsl:value-of select="."/>
						</text>
		</div>
	</xsl:template>
	
	<!--   Text   -->
	<xsl:template match="n1:text">
		<xsl:apply-templates select="n1:table|n1:list|n1:paragraph"/>
	</xsl:template>
	
	<xsl:template match="n1:paragraph">
		<xsl:param name="perc" />
		<xsl:variable name="textoCaption" select="n1:caption"/>
			<span class="span1" style="width:99%">
				<span class="span2">
				  <span>
					<xsl:apply-templates select="n1:caption"/>
					<p>
						<xsl:variable name="textoParagraph" select="normalize-space(string(current()))"/>
						<xsl:variable name="textoSobrante" select="normalize-space($textoCaption)"/>
						<xsl:value-of select="normalize-space(substring-after($textoParagraph,$textoSobrante))"/>
					</p>
				  </span>
				</span>
			</span>
	</xsl:template>
	
	<xsl:template match="n1:paragraph/n1:caption">
		<h1>
			<xsl:value-of select="normalize-space(string(current()))"/>
		</h1>
	</xsl:template>
	
	<!--     Content w/ deleted text is hidden -->
	<xsl:template match="n1:content[@revised='delete']"/>
	
	<!--   content  -->
	<xsl:template match="n1:content">
		<xsl:apply-templates/>
	</xsl:template>
	
	<!--   list  template -->
	<xsl:template match="n1:list">
		<div style="padding-top: 13px;padding-bottom: 13px;">
			<table cellspacing="0px"
				   cellpadding="0px"
				   border="0px"
				   class="listTable"
				   width="100%">
				<tr class="listHeader">
					<td	class="list_td">
						<xsl:if test="n1:caption">
							<text class="title">
								<xsl:apply-templates select="n1:caption"/>
							</text>
						</xsl:if>
					</td>
				</tr>
				<xsl:for-each select="n1:item">
					<tr class="dr-table-row">
						<td	class="list_td">
							<text class="normalText">
								<xsl:apply-templates/>						
							</text>	
						</td>
					</tr>				
				</xsl:for-each>
			</table>
		</div>
	</xsl:template>
	<!--   list  template -->
	
	
	
	<!--   list  template -->
	<xsl:template match="n1:ul">		
		<xsl:for-each select="n1:li">
			<li>
				<xsl:apply-templates/>
			</li>								
		</xsl:for-each>				
	</xsl:template>
	<!--   list  template -->

	<xsl:template match="n1:list[@listType='ordered']">
		<xsl:if test="n1:caption">
			<span class="normalText" style="font-weight: bold;">
				<xsl:apply-templates select="n1:caption"/>
			</span>
		</xsl:if>
		<ol class="ol1">
			<xsl:for-each select="n1:item">
				<li class="dataText"><xsl:apply-templates/></li>
			</xsl:for-each>
		</ol>
	</xsl:template>
	<xsl:template name="loop">
		<xsl:param name="startIndex"></xsl:param>
		<xsl:param name="endIndex"></xsl:param>
			<xsl:choose>
				<xsl:when test="$endIndex > $startIndex">
				adasdads
				<xsl:call-template name="loop">
					<xsl:with-param name="startIndex">
						<xsl:number value="number($startIndex)+1" />
					</xsl:with-param>
					<xsl:with-param name="endIndex">
						<xsl:number value="number($endIndex)" />
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
			</xsl:choose>
	</xsl:template>
	<xsl:template match="n1:list[@listType='definition']">
		<xsl:if test="n1:caption">
			<span class="normalText" style="font-weight: bold;">
				<xsl:apply-templates select="n1:caption"/>
			</span>
		</xsl:if>
		


		
		
		
			<xsl:variable name="size"  select="count(n1:item)"/>
			<xsl:variable name="group" select="number(4)"/>
			<xsl:variable name="half" select="ceiling($size div $group)"/>
			<xsl:variable name="par" select="number($group mod 2)"/>
			

			
			<table width="100%">
				<xsl:for-each select="n1:item[position() &#60;= $half]">
				    <tr>
				    	<td>
				    	<xsl:variable name="aux1" select="number((position()-1) * $group +1)"/>

				    		<xsl:choose>
				    			<xsl:when test="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject">
				    				<xsl:call-template name="ite">
				    					<xsl:with-param name="param" select="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject"/>
				    					<xsl:with-param name="index" select="$aux1"/>
				    				</xsl:call-template>
				    			</xsl:when>
				    		</xsl:choose>
				    	</td>
				    	<td>
				    	<xsl:variable name="aux1" select="number((position()-1) * $group +2)"/>
				    		<xsl:choose>
				    			<xsl:when test="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject">
				    				<xsl:call-template name="ite">
				    					<xsl:with-param name="param" select="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject"/>
				    					<xsl:with-param name="index" select="$aux1"/>
				    				</xsl:call-template>
				    			</xsl:when>
				    		</xsl:choose>
				   
				    		
				    	</td>
				    	<td>
							<xsl:variable name="aux1" select="number((position()-1) * $group +3)"/>
				    		<xsl:choose>
				    			<xsl:when test="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject">
				    				<xsl:call-template name="ite">
				    					<xsl:with-param name="param" select="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject"/>
				    					<xsl:with-param name="index" select="$aux1"/>
				    				</xsl:call-template>
				    			</xsl:when>
				    		</xsl:choose>
				    	</td>
				    	<td>
							<xsl:variable name="aux1" select="number((position()-1) * $group +4)"/>
				    		<xsl:choose>
				    			<xsl:when test="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject">
				    				<xsl:call-template name="ite">
				    					<xsl:with-param name="param" select="../n1:item[$aux1]/n1:renderMultiMedia/@referencedObject"/>
				    					<xsl:with-param name="index" select="$aux1"/>
				    				</xsl:call-template>
				    			</xsl:when>
				    		</xsl:choose>
				    	</td>
				    	
	 
		
				    	
				    	
				    	
				    </tr>
				</xsl:for-each>
			</table>
			
	
	</xsl:template>
	<xsl:template name="ite">
		<xsl:param name="param"/>
		<xsl:param name="index"/>
				<xsl:variable name="it2"  select="//n1:observationMedia[@ID=$param]/n1:value"/>
				<div style="width:200px;height:225px; padding: 3px; background-color:#2B3439;-moz-border-radius: 3px 3px 3px 3px;">
					<div style="margin-bottom:3px;width:200px;height:200px;">
						<img src="{$it2}" width="200px" height="200px"/>
					</div>
					<div style=" text-align:center">
						<label style="font-family: Verdana !important;    font-size: 11px;    font-weight: bold;color:#ffffff">Imagen
						<xsl:value-of select="$index"/> 
						</label>
					</div>
					
						
				</div>
				<div style="height:5px"></div>
	
	</xsl:template>

	<xsl:template match="n1:list[@listType='unordered']">
		<xsl:if test="n1:caption">
			<span class="normalText" style="font-weight: bold;">
				<xsl:apply-templates select="n1:caption"/>
			</span>
		</xsl:if>
		<ul class="ol1">
			<xsl:for-each select="n1:item">
				<li class="dataText"><xsl:apply-templates/></li>
			</xsl:for-each>
		</ul>
	</xsl:template>
	
	<!--   caption  -->
	<xsl:template match="n1:caption">
			<xsl:value-of select="normalize-space(string(current()))"/>
	</xsl:template>
	
	<!--  Tables   -->
	<xsl:template match="n1:table/@*|n1:thead/@*|n1:tfoot/@*|n1:tbody/@*|n1:colgroup/@*|n1:col/@*|n1:tr/@*|n1:th/@*|n1:td/@*">
		<xsl:copy>
			<xsl:apply-templates/>
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="n1:table">
		 <xsl:choose>
			<xsl:when test="n1:tbody/n1:tr[2]/n1:th[2]">
				<div style="padding-top: 13px; padding-bottom: 13px;">
					<table cellspacing="0px"
						   cellpadding="0px"
						   border="0px"
						   width="100%">
						<xsl:call-template name="listBody">
							<xsl:with-param name="body" select="n1:tbody"/>
						</xsl:call-template>
					</table>				
				</div>
			</xsl:when>
			<xsl:otherwise>
				<div style="width:100%;">
					<xsl:apply-templates select="n1:tbody"/>
				</div>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template match="n1:tbody">	
		<xsl:choose>
			<xsl:when test="n1:tr/n1:th">
				<div style="height: 13px;"/>
				<div class="panel">
					<div class="panelHeader">
						<xsl:value-of select="n1:tr/n1:th"/>
					</div>
					<div class="panelContent">		
						<table cellspacing="0px" cellpadding="0px" border="0px">
							<tbody>	
							
								<xsl:for-each select="n1:tr">
								   <tr>
									<xsl:if test="n1:td">
									   <td class="normalText">
											<xsl:variable name="texto" select="concat('- ',.)"/>
											<xsl:call-template name="tokenizer">
			                                    <xsl:with-param name="string" select="$texto" />                                                           
			                    			</xsl:call-template>
		                    			</td>
									</xsl:if>
									</tr>
								</xsl:for-each>
							</tbody>
						</table>
					</div>
				</div>
			</xsl:when>
			<xsl:otherwise>	
				<xsl:choose>
					<xsl:when test="n1:tr/n1:td/n1:list|n1:tr/n1:td/n1:paragraph">
						<table cellspacing="0px" cellpadding="0px" border="0px" width="100%">
							<tbody>	
								<xsl:for-each select="n1:tr">
									<xsl:if test="n1:td">
										<xsl:apply-templates select="."/>
									</xsl:if>
								</xsl:for-each>
							</tbody>
						</table>
					</xsl:when>
					<xsl:otherwise>
						<table cellspacing="0px" cellpadding="0px" border="0px">
							<tbody>	
								<xsl:for-each select="n1:tr">
									<xsl:if test="n1:td">
										<xsl:apply-templates select="."/>
									</xsl:if>
								</xsl:for-each>
							</tbody>
						</table>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="listBody">
		<xsl:param name="body"/>
			<xsl:for-each select="$body/n1:tr">
				<xsl:choose>
					<xsl:when test="n1:td/n1:list or n1:td/n1:paragraph">
						<tr>
							<xsl:apply-templates select="n1:td"/>
						</tr>								
					</xsl:when>
					<xsl:otherwise>	
						<xsl:choose>					
							<xsl:when test="n1:th">
								<xsl:choose>
									<xsl:when test="n1:th[2]">
										<tr class="list_th_Header">
											<xsl:for-each select="n1:th">
												<xsl:variable name="colspan" select="@colspan"/>
												<xsl:variable name="width" select="@width"/>
												<xsl:variable name="rowspan" select="@rowspan"/>
												<xsl:choose>
													<xsl:when test="position()=1">
														<td class="list_td_First" colspan="{$colspan}" width="{$width}" rowspan="{$rowspan}">
															<text class="normalText">
																<xsl:value-of select="."/>
															</text>	
														</td>
													</xsl:when>
													<xsl:otherwise>
														<td class="list_td" colspan="{$colspan}" width="{$width}" rowspan="{$rowspan}">
															<text class="normalText">
																<xsl:value-of select="."/>
															</text>	
														</td>
													</xsl:otherwise>
												</xsl:choose>												
											</xsl:for-each>
										</tr>
									</xsl:when>
									<xsl:otherwise>
										<tr class="listHeader">
											<xsl:for-each select="n1:th">
												<xsl:variable name="colspan" select="@colspan"/>
												<td class="list_td_Header" colspan="{$colspan}">
													<xsl:value-of select="."/>
												</td>
											</xsl:for-each>
										</tr>
									</xsl:otherwise>
								</xsl:choose>
							</xsl:when>	
							<xsl:otherwise>
								<tr class="dr-table-row">
									<xsl:for-each select="n1:td">
										<xsl:variable name="colspan" select="@colspan"/>
										<xsl:variable name="bgcolor" select="@bgcolor"/>
										<xsl:variable name="rowspan" select="@rowspan"/>
										<xsl:choose>
											<xsl:when test="position()=1">
												<td class="list_td_First" colspan="{$colspan}" valign="top"  bgcolor="{$bgcolor}" rowspan="{$rowspan}">
													<text class="normalText">
														<xsl:variable name="texto" select="."/>
														<xsl:call-template name="tokenizer">
						                                    <xsl:with-param name="string" select="$texto" />                                                          
						                    			</xsl:call-template>
													</text>	
												</td>
											</xsl:when>
											<xsl:otherwise>
												<td class="list_td" colspan="{$colspan}" valign="top"  bgcolor="{$bgcolor}" rowspan="{$rowspan}">
													<text class="normalText">
														<xsl:variable name="texto" select="."/>
														<xsl:call-template name="tokenizer">
						                                    <xsl:with-param name="string" select="$texto" />                                                       
						                    			</xsl:call-template>
													</text>	
												</td>
											</xsl:otherwise>
										</xsl:choose>
									</xsl:for-each>
								</tr>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
	</xsl:template>
	
	<xsl:template match="n1:thead">
		<thead>
			<xsl:apply-templates/>
		</thead>
	</xsl:template>
	
	<xsl:template match="n1:tfoot">
		<tfoot>
			<xsl:apply-templates/>
		</tfoot>
	</xsl:template>
	
	<xsl:template match="n1:colgroup">
		<colgroup>
			<xsl:apply-templates/>
		</colgroup>
	</xsl:template>
	
	<xsl:template match="n1:col">
		<col>
			<xsl:apply-templates/>
		</col>
	</xsl:template>
	
	<xsl:template match="n1:tr">
		<xsl:choose>
			<xsl:when test="n1:td/n1:list or n1:td/n1:paragraph">
				<xsl:for-each select="n1:td">
					<tr>
						<xsl:apply-templates select="."/>
					</tr>
				</xsl:for-each>				
			</xsl:when>
			<xsl:otherwise>
				<tr>
					<xsl:apply-templates select="n1:td|n1:th"/>		
				</tr>
			</xsl:otherwise>
		</xsl:choose>		
	</xsl:template>
	
	<xsl:template match="n1:th">
		<xsl:variable name="colspan" select="@colspan"/>
		
		<th class="panelHeader"	colspan="{$colspan}" >
			<text>
				<xsl:apply-templates/>
			</text>
		</th>
	</xsl:template>
	
	<xsl:template match="n1:td">
		<xsl:variable name="colspan" select="@colspan"/>
		<xsl:variable name="rowspan" select="@rowspan"/>
		<xsl:choose>
			<xsl:when test="n1:paragraph or n1:list or n1:ul">
				<xsl:choose>
					<xsl:when test="$colspan">
						<td colspan="{$colspan}" width="100%" padding="0px" spacing="0px">
							<div  style="padding-bottom: 0px;">
								<xsl:apply-templates select="n1:paragraph|n1:list|n1:ul"/>
							</div>
						</td>
					</xsl:when>
					<xsl:otherwise>
						<td width="100%" padding="0px" spacing="0px">
							<div  style="padding-bottom: 0px;">
								<xsl:apply-templates select="n1:paragraph|n1:list|n1:ul"/>
							</div>
						</td>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:when>
			<xsl:otherwise>
				<xsl:choose>
					<xsl:when test="(position() mod 2) != 0">
						<td colspan="{$colspan}" class="tdSepPeq">
							<text class="normalText" style="padding-right:5px;">									
								<xsl:value-of select="normalize-space(string(current()))"/>	
							</text>	
						</td>
					</xsl:when>
					<xsl:otherwise>
						<td colspan="{$colspan}" rowspan="{$rowspan}" class="tdSepGran" style="padding-right:23px;">
							<text class="dataText">
								<xsl:variable name="texto" select="."/>
								<xsl:call-template name="tokenizer">
                                    <xsl:with-param name="string" select="$texto" />                                                           
                    			</xsl:call-template>
							</text>
						</td>	
					</xsl:otherwise>
				</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>		
	</xsl:template>
	
	<xsl:template match="n1:table/n1:caption">
		<span style="font-weight:bold; ">
			<xsl:apply-templates/>
		</span>
	</xsl:template>
	
	<!--   RenderMultiMedia 
         this currently only handles GIF's and JPEG's.  It could, however,
	 be extended by including other image MIME types in the predicate
	 and/or by generating <object> or <applet> tag with the correct
	 params depending on the media type  @ID  =$imageRef     referencedObject
 -->
	<xsl:template match="n1:renderMultiMedia">
		<xsl:variable name="imageRef" select="@referencedObject"/>
		<xsl:choose>
			<xsl:when test="//n1:regionOfInterest[@ID=$imageRef]">
				<!-- Here is where the Region of Interest image referencing goes -->
				<xsl:if test='//n1:regionOfInterest[@ID=$imageRef]//n1:observationMedia/n1:value[@mediaType="image/gif" or @mediaType="image/jpeg"]'>
					<br clear="all"/>
					<xsl:element name="img">
						<xsl:attribute name="src">http://www.hospitalitaliano.org.ar/intranet/
				<xsl:value-of select="//n1:regionOfInterest[@ID=$imageRef]//n1:observationMedia/n1:value/n1:reference/@value"/></xsl:attribute>
					</xsl:element>
				</xsl:if>
			</xsl:when>
			<xsl:otherwise>
				<!-- Here is where the direct MultiMedia image referencing goes -->
				<xsl:if test='//n1:observationMedia[@ID=$imageRef]/n1:value[@mediaType="image/gif" or @mediaType="image/jpeg"]'>
					<br clear="all"/>
					<xsl:element name="img">
						<xsl:attribute name="src">http://www.hospitalitaliano.org.ar/intranet/
				<xsl:value-of select="//n1:observationMedia[@ID=$imageRef]/n1:value/n1:reference/@value"/></xsl:attribute>
					</xsl:element>
				</xsl:if>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- 	Stylecode processing   
	  Supports Bold, Underline and Italics display
-->
	<xsl:template match="//n1:*[@styleCode]">
		<xsl:if test="@styleCode='Bold'">
			<xsl:element name="b">
				<xsl:apply-templates/>
			</xsl:element>
		</xsl:if>
		<xsl:if test="@styleCode='xListing'">
			<xsl:element name="pre">
				<xsl:apply-templates/>
			</xsl:element>
		</xsl:if>
		
		<xsl:if test="@styleCode='Italics'">
			<xsl:element name="i">
				<xsl:apply-templates/>
			</xsl:element>
		</xsl:if>
		<xsl:if test="@styleCode='Underline'">
			<xsl:element name="u">
				<xsl:apply-templates/>
			</xsl:element>
		</xsl:if>
		<xsl:if test="contains(@styleCode,'Bold') and contains(@styleCode,'Italics') and not (contains(@styleCode, 'Underline'))">
			<xsl:element name="b">
				<xsl:element name="i">
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:element>
		</xsl:if>
		<xsl:if test="contains(@styleCode,'Bold') and contains(@styleCode,'Underline') and not (contains(@styleCode, 'Italics'))">
			<xsl:element name="b">
				<xsl:element name="u">
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:element>
		</xsl:if>
		<xsl:if test="contains(@styleCode,'Italics') and contains(@styleCode,'Underline') and not (contains(@styleCode, 'Bold'))">
			<xsl:element name="i">
				<xsl:element name="u">
					<xsl:apply-templates/>
				</xsl:element>
			</xsl:element>
		</xsl:if>
		<xsl:if test="contains(@styleCode,'Italics') and contains(@styleCode,'Underline') and contains(@styleCode, 'Bold')">
			<xsl:element name="b">
				<xsl:element name="i">
					<xsl:element name="u">
						<xsl:apply-templates/>
					</xsl:element>
				</xsl:element>
			</xsl:element>
		</xsl:if>
	</xsl:template>
	
	<!-- 	Superscript or Subscript   -->
	<xsl:template match="n1:sup">
		<xsl:element name="sup">
			<xsl:apply-templates/>
		</xsl:element>
	</xsl:template>
	
	<xsl:template match="n1:sub">
		<xsl:element name="sub">
			<xsl:apply-templates/>
		</xsl:element>
	</xsl:template>
	
	<!-- Get Patient ID number template -->
	<xsl:template name="patientId">
		<xsl:param name="structuredBody"/>
		<xsl:variable name="section" select="normalize-space($structuredBody/n1:component[1]/n1:section/n1:title)"/>
		<xsl:choose>
			<xsl:when test="$section='PATIENTID'">
			
					<xsl:value-of select="normalize-space($structuredBody/n1:component[1]/n1:section/n1:text)"/>
				
			</xsl:when>
			<xsl:otherwise>
				<label  class="dataText">
					-
				</label>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--end  Get Patient ID number template -->
	
	<!-- Get a Name template -->
	<xsl:template name="getName">
		<xsl:param name="name"/>
		<xsl:choose>
			<xsl:when test="$name/n1:family">
				<xsl:if test="$name/n1:prefix">
					<xsl:value-of select="$name/n1:prefix"/>
					<xsl:text> </xsl:text>
				</xsl:if>
				<xsl:value-of select="$name/n1:given"/>
				<xsl:text> </xsl:text>
				<xsl:value-of select="$name/n1:family"/>
				<xsl:text> </xsl:text>
				<xsl:if test="$name/n1:suffix">
					<xsl:text>, </xsl:text>
					<xsl:value-of select="$name/n1:suffix"/>
				</xsl:if>
			</xsl:when>
			<xsl:otherwise>
						<xsl:choose>
									<xsl:when test="normalize-space($name)!=''">
											<xsl:value-of select="$name"/>
									</xsl:when>
									<xsl:otherwise>
											-
									</xsl:otherwise>
						</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!--end Get a Name template -->

	<!--  Bottomline  -->
	<xsl:template name="bottomline">
		<xsl:if test="/n1:ClinicalDocument/n1:legalAuthenticator">
			<div style="height: 13px;"/>
			<div class="phones" style="text-align:center">
			<table cellspacing="0px" cellpadding="0px" border="0px">
				<tr>
					<td class="tdSepPeq">
						<div style="width:16px; height:16px">
							<img src="/img/schedule.png" width="16px" height="16px"/>
						</div>
					</td>
					<td style="width: 6px"></td>
					<td class="tdSepPeq">
						<text class="datas">
							<xsl:text>Firmado por:</xsl:text>
						</text>
					</td>
					<td style="width: 6px"></td>
					<td class="tdSepGran">	
						<text >
							<xsl:call-template name="getName">
								<xsl:with-param name="name" select="/n1:ClinicalDocument/n1:legalAuthenticator/n1:assignedEntity/n1:assignedPerson/n1:name"/>
							</xsl:call-template>
						</text>
					</td>
					<td class="width: 6px"></td>
					<td class="tdSepPeq">	
						<text class="datas" >
							<xsl:text>Fecha:</xsl:text>
						</text>
					</td>
					<td style="width: 6px"></td>
					<td class="tdSepGran">
						<text >
							<xsl:call-template name="formatDate">
								<xsl:with-param name="date" select="//n1:ClinicalDocument/n1:legalAuthenticator/n1:time/@value"/>
							</xsl:call-template>
						</text>
					</td>
					<td class="tdSepPeq">	
						<text class="datas">
							<xsl:text>Hora:</xsl:text>
						</text>
					</td>
					<td style="width: 6px"></td>
					<td class="tdSepGran">
						<text >
							<xsl:call-template name="formatDate2">
								<xsl:with-param name="date" select="//n1:ClinicalDocument/n1:legalAuthenticator/n1:time/@value"/>
							</xsl:call-template>
						</text>
					</td>

				</tr>
			</table>
			</div>
		</xsl:if>
	</xsl:template>
	
	<xsl:template match="n1:htmlLink">
		<xsl:element name="a">
			<xsl:attribute name="href"><xsl:value-of select="./@href"/></xsl:attribute>
			<xsl:value-of select="."/>
		</xsl:element>
	</xsl:template>
	
	<!--  Format Date     
      outputs a date in Month Day, Year form
      e.g., 19991207  ==> December 07, 1999 , 2011 04 10 111017
-->
	<xsl:template name="formatDate">
		<xsl:param name="date"/>
		<xsl:choose>
			<xsl:when test="$date">
				<xsl:choose>
					<xsl:when test='substring ($date, 7, 1)="0"'>
						<xsl:value-of select="substring ($date, 8, 1)"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="substring ($date, 7, 2)"/>
					</xsl:otherwise>
				</xsl:choose>
				<xsl:text>/</xsl:text>
				<xsl:value-of select="substring ($date, 5, 2)"/>
				<xsl:text>/</xsl:text>				
				<xsl:value-of select="substring ($date, 1, 4)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:text>-</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template name="formatDate2">
		<xsl:param name="date"/>
		<xsl:choose>
			<xsl:when test="$date">
				<xsl:variable name="hora" select="substring ($date, 9, 2 )"/>
				<xsl:choose>
					<xsl:when test="$hora > 12">
						<xsl:value-of select="$hora - 12"/>
					</xsl:when>
					<xsl:otherwise>
		
							<xsl:value-of select="$hora"/>

					</xsl:otherwise>
				</xsl:choose>
				
				<xsl:text>:</xsl:text>	
				<xsl:value-of select="substring ($date, 11, 2)"/>
				<xsl:text>:</xsl:text>	
				<xsl:value-of select="substring ($date, 13, 2)"/>
					<xsl:choose>
						<xsl:when test="$hora > 12">
							<text> PM</text>
						</xsl:when>
						<xsl:otherwise>
						   <text> AM</text>
						</xsl:otherwise>
					</xsl:choose>

			</xsl:when>
			<xsl:otherwise>
				<xsl:text>-</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="formatDate1">
		<xsl:param name="date"/>
		<xsl:choose>
			<xsl:when test="$date">
				<xsl:choose>
					<xsl:when test='substring ($date, 7, 1)="0"'>
						<xsl:value-of select="substring ($date, 8, 1)"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="substring ($date, 7, 2)"/>
					</xsl:otherwise>
				</xsl:choose>
				<xsl:text> de </xsl:text>
				<xsl:variable name="month" select="substring ($date, 5, 2)"/>
				<xsl:choose>
					<xsl:when test="$month='01'">
						<xsl:text>Enero </xsl:text>
					</xsl:when>
					<xsl:when test="$month='02'">
						<xsl:text>Febrero</xsl:text>
					</xsl:when>
					<xsl:when test="$month='03'">
						<xsl:text>Marzo </xsl:text>
					</xsl:when>
					<xsl:when test="$month='04'">
						<xsl:text>Abril </xsl:text>
					</xsl:when>
					<xsl:when test="$month='05'">
						<xsl:text>Mayo </xsl:text>
					</xsl:when>
					<xsl:when test="$month='06'">
						<xsl:text>Junio </xsl:text>
					</xsl:when>
					<xsl:when test="$month='07'">
						<xsl:text>Julio </xsl:text>
					</xsl:when>
					<xsl:when test="$month='08'">
						<xsl:text>Agosto </xsl:text>
					</xsl:when>
					<xsl:when test="$month='09'">
						<xsl:text>Septiembre </xsl:text>
					</xsl:when>
					<xsl:when test="$month='10'">
						<xsl:text>Octubre </xsl:text>
					</xsl:when>
					<xsl:when test="$month='11'">
						<xsl:text>Noviembre </xsl:text>
					</xsl:when>
					<xsl:when test="$month='12'">
						<xsl:text>Diciembre </xsl:text>
					</xsl:when>
				</xsl:choose>
				<xsl:text> de </xsl:text>
				<xsl:value-of select="substring ($date, 1, 4)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:text>???</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>


	
	<xsl:template match="n1:associatedEntity">
		<xsl:variable name="tipoParticipante" select="normalize-space(n1:code/@displayName)"/>
		<tr>
			<td>
				<div style="height: 13px;"/>
				<div class="panel">
					<div class="panelHeader">
						<xsl:choose>
							<xsl:when test="$tipoParticipante='Padre'">
								Datos del padre
							</xsl:when>
							<xsl:when test="$tipoParticipante='Madre'">
								Datos de la madre
							</xsl:when>
							<xsl:otherwise>
								Datos del participante o acompa&#241;ante
							</xsl:otherwise>
						</xsl:choose>
					</div>
					<div class="panelContent">
						<xsl:choose>
							<xsl:when test="n1:associatedPerson">
								<div style="height: 6px;"/>
								<table cellspacing="0px" cellpadding="0px" border="0px">
									<tr>										
										<td class="tdSepPeq">
											<text  class="normalText">
												<xsl:text>
													Participante:
												</xsl:text>
											</text>
										</td>
										<td class="tdSepGran">
											<text  class="dataText">
												<xsl:call-template name="getName">
													<xsl:with-param name="name" select="n1:associatedPerson/n1:name"/>
												</xsl:call-template>										
											</text>
										</td>												
									</tr>
									<xsl:choose>
										<xsl:when test="n1:telecom">
											<tr>
												<td class="tdSepPeq">
													<text  class="normalText">
														Tel&#233;fonos:
													</text>
												</td>	
												<td style="width: 5px"></td>
												<td class="tdSepPeq">	
													<table cellspacing="0px" cellpadding="0px" border="0px">
														<tr>
 														<td class="tdSepPeq">	
															<ul>			
															<xsl:apply-templates select="n1:telecom"/>
															</ul>
														</td>
														</tr>
													</table>
												</td>							
											</tr>								
										</xsl:when>
									</xsl:choose>
									<xsl:choose>
									<xsl:when test="n1:addr">
											<tr>
												<td class="tdSepPeq">
													<text class="normalText">
														Direcci&#243;n:
													</text>
												</td>
												<td class="tdSepGran">
													<xsl:call-template name="direccion">
														<xsl:with-param name="parameter" select="n1:addr"/>
													</xsl:call-template>
												</td>
											</tr>
									</xsl:when>
								</xsl:choose>
								</table>	
							</xsl:when>
						</xsl:choose>
					</div>
				</div>
			</td>
		</tr>
	</xsl:template>
	
	<!-- Telephones -->
	<xsl:template match="n1:telecom">
		    <xsl:variable name="tele" select="normalize-space(@value)"/>
			<li  class="dataText">
				<xsl:value-of select="$tele"/>
			</li>
	
	</xsl:template>
	<!-- end Telephones -->

	<!-- Address  -->
	<xsl:template match="n1:patient/n1:birthplace/n1:place/n1:addr|n1:addr">		
		<xsl:choose>
				<xsl:when test="n1:streetNameType">
				<text class="dataText">
					<xsl:value-of select="n1:streetNameType"/>
				</text>
			</xsl:when>
		</xsl:choose>					

		<xsl:choose>
				<xsl:when test="n1:houseNumber">
				<text class="dataText">
					<xsl:value-of select="concat(' ',n1:streetNameBase)"/>
				</text>
			</xsl:when>
		</xsl:choose>

		<xsl:choose>
				<xsl:when test="n1:houseNumber">
				<text class="dataText">
					<xsl:value-of select="concat(' ',n&#250;mero)"/> 
				</text>
			</xsl:when>
		</xsl:choose>
		
		<xsl:choose>
				<xsl:when test="n1:houseNumber">
				<text class="dataText">
					<xsl:value-of select="concat(' ',n1:houseNumber)"/>
				</text>
			</xsl:when>
		</xsl:choose>
		
		<xsl:choose>
				<xsl:when test="n1:censusTract">
				<text class="dataText">
					<xsl:value-of select="concat(', ',n1:censusTract)"/>
				</text>
			</xsl:when>
		</xsl:choose>
		
		<xsl:choose>
				<xsl:when test="n1:city">
				<text class="dataText">
					<xsl:value-of select="concat(', ',n1:city)"/>						
				</text> 
			</xsl:when>
		</xsl:choose>
		
		<xsl:choose>
				<xsl:when test="n1:state">
				<text class="dataText">
					<xsl:value-of select="concat(', ',n1:state)"/>
				</text>
			</xsl:when>
		</xsl:choose>
		
			<xsl:choose>
				<xsl:when test="n1:country">
				<text class="dataText">
					<xsl:value-of select="concat(', ',n1:country)"/>
				</text>
			</xsl:when>
		</xsl:choose>
		
		<text class="dataText">
			<xsl:value-of select="string('.')"/>
		</text>
	</xsl:template>
	<!-- Doc relacionados template-->
	<xsl:template match="n1:relatedDocument">
			<xsl:choose>
				<xsl:when test="n1:parentDocument/n1:text">
					<tr>
							<td>
										<div  style="width:18px; height:16px">
												<img src="/img/document.png"/>
										</div>
							</td>
							<td>
										<div class="dataText">
										<xsl:variable name="texto" select="n1:parentDocument/n1:text"/>
										<xsl:variable name="param" select="concat(n1:parentDocument/n1:id/@root, '.' ,n1:parentDocument/n1:id/@extension)"/>
										<a id="link{$param}" href="" target="_blank">
											<xsl:value-of select="$texto"/>
										</a>
										
										<script>
											refreshLinksDoc("<xsl:value-of select="$param"/>");
										</script>
										</div>
							</td>
						</tr>
						<tr>
							<td style="height:8px">
							</td>
						</tr>
			</xsl:when>
			<xsl:otherwise>
					<tr>
							<td>
										<div  class="normalText">
												No existe ning&#250;n documento relacionado.
										</div>
							</td>
						</tr>
			</xsl:otherwise>
		</xsl:choose>
		
		
	
	</xsl:template>
	<!-- end Doc relacionados template-->
	<!-- para saltos de lineas -->
	<xsl:template name="tokenizer">
			  <xsl:param name="string" />
			  <xsl:param name="delimiter" select="'\n'" />
			  <xsl:choose>
			   <xsl:when test="$delimiter and contains($string, $delimiter)">
		           <xsl:value-of select="substring-before($string,$delimiter)" /> <br/>
		           <xsl:call-template name="tokenizer">
		           <xsl:with-param name="string" select="substring-after($string,$delimiter)" />
		           <xsl:with-param name="delimiter"     select="$delimiter" />
		           </xsl:call-template>
		       </xsl:when>
		       <xsl:otherwise>
		    		<xsl:value-of select="$string" />
		       </xsl:otherwise>
			 </xsl:choose>
		 </xsl:template>
	<!--  end para saltos de lineas -->
	
	<!--  Datos laborales template -->
	<xsl:template name="datosLaborales">
		
		<div style="overflow:hidden;">
							<table cellpadding="0" cellspacing="0" style="margin-top: -2px;">
							  <tr>
								<td valign="top"  class="tdSepPeq">
									<div class="normalText" >
										Formaci&#243;n:
									</div>
								</td>

								<td style="width: 5px"></td>
								<td valign="top">
									<div class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='formacion']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='formacion']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>			
									</div>
								</td>

								<td style="width: 24px"></td>
								<td valign="top">
									<div class="normalText">
										Grupo de personal:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td valign="top">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='grupop']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='grupop']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
								<td style="width: 24px"></td>

								<td valign="top">
									<div class="normalText">
										Ocupaci&#243;n:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td valign="top">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='ocupacion']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='ocupacion']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>


							 </tr>

							 <tr>
								<td  class="tdSepPeq">
									<div class="normalText" style="margin-bottom:2px" >
											&#193;rea de personal:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td  class="tdSepPeq">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='areap']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='areap']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>

								<td style="width: 24px"></td>

								<td  class="tdSepPeq">
									<div class="normalText">
										Divisi&#243;n personal:
									</div>
								</td>

								<td style="width: 6px"></td>

								<td  class="tdSepPeq">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='divisionp']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='divisionp']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>

								<td style="width: 24px"></td>

								<td  class="tdSepPeq">
									<div class="normalText">
										Divisi&#243;n:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td  class="tdSepPeq">
									<div class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='division']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='division']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
	
							 </tr>

							 <tr>
								<td >
									<div class="normalText">
										Subivisi&#243;n personal:
									</div> 
								</td>

								<td style="width: 5px"></td>

								<td valign="bottom">
									<div  class="dataText" >
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='subdivisionp']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='subdivisionp']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
			
									</div>
								</td>
								<td style="width: 24px"></td>

								<td  class="tdSepPeq">
									<div class="normalText">
										Sociedad:
									</div>
								</td>

								<td style="width: 6px"></td>

								<td  class="tdSepPeq">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='sociedad']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='sociedad']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>

								<td style="width: 24px"></td>

								<td  class="tdSepPeq">
									<div class="normalText">
										Unidad organizativa:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td  class="tdSepPeq">
									<div class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='unidado']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='unidado']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
							 </tr>
							 <tr>
								<td >
									<div class="normalText">
										Tel&#233;fono:
									</div> 
								</td>

								<td style="width: 5px"></td>

								<td valign="bottom">
									<div  class="dataText" style="overflow:">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='telefonodl']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='telefonodl']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
			
									</div>
								</td>
								<td style="width: 24px"></td>

								<td  class="tdSepPeq">
									<div class="normalText">
										Posici&#243;n:
									</div>
								</td>

								<td style="width: 6px"></td>

								<td  class="tdSepPeq">
									<div  class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='posiciondl']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='posiciondl']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>

								<td style="width: 24px"></td>

								<td  class="tdSepPeq">
									<div class="normalText">
										Antig&#252;edad:
									</div>
								</td>

								<td style="width: 5px"></td>

								<td  class="tdSepPeq">
									<div class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:entry/n1:observationMedia[@ID='antiguedad']/n1:value">
												<xsl:value-of select="//n1:entry/n1:observationMedia[@ID='antiguedad']/n1:value"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
									</div>
								</td>
							 </tr>
							</table>
							</div>
	</xsl:template>	
  <!-- end  Datos laborales template -->
    <!-- Datos familia template -->
    	<xsl:template name="datosFamilia">
		<div style="overflow:hidden;">
							<table cellpadding="0" cellspacing="0" style="margin-top: -2px;">
							  <tr>
								<td valign="top"  class="tdSepPeq">
									<div class="normalText" >
										Nombre de la madre:
									</div>
								</td>

								<td style="width: 5px"></td>
								<td valign="top">
									<div class="dataText">
										<xsl:choose>
											<xsl:when test="//n1:participant/n1:associatedEntity/n1:code[@displayName='madre']">
											<xsl:variable name="var" select="//n1:participant/n1:associatedEntity/n1:code[@displayName='madre']/parent::*"/>
											
											 
												<xsl:value-of select="$var/n1:associatedPerson/n1:name/n1:given"/>&#160;
												<xsl:value-of select="$var/n1:associatedPerson/n1:name/n1:family[1]"/>&#160;
												<xsl:value-of select="$var/n1:associatedPerson/n1:name/n1:family[2]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>		
									</div>
								</td>
							 </tr>


							 <tr>
								<td >
									<div class="normalText">
										Nombre del padre:
									</div> 
								</td>

								<td style="width: 5px"></td>

								<td valign="bottom">
									<div  class="dataText" >
										<xsl:choose>
											<xsl:when test="//n1:participant/n1:associatedEntity/n1:code[@displayName='padre']">
											<xsl:variable name="var" select="//n1:participant/n1:associatedEntity/n1:code[@displayName='padre']/parent::*"/>
											
											 
												<xsl:value-of select="$var/n1:associatedPerson/n1:name/n1:given"/>&#160;
												<xsl:value-of select="$var/n1:associatedPerson/n1:name/n1:family[1]"/>&#160;
												<xsl:value-of select="$var/n1:associatedPerson/n1:name/n1:family[2]"/>
											</xsl:when>
											<xsl:otherwise>
												-
											</xsl:otherwise>
				
										</xsl:choose>	
			
									</div>
								</td>
							 </tr>
							 
							</table>
							</div>
    	</xsl:template>
    <!-- end  Datos familia template -->
	<!-- indice -->
	<xsl:template name="indiceCDA">
			  <xsl:param name="token" />
			   <xsl:param name="pred" />
			  <xsl:for-each select="$token/n1:component">
			  		<xsl:variable name="var" select="n1:section"/>
			  		
				    <xsl:call-template name="indiceCDAprint">
				  		<xsl:with-param name="tok" select="$var"/>
				  		<xsl:with-param name="ind" select="$pred" />
				    </xsl:call-template>
			    </xsl:for-each>
		 </xsl:template>
	<!--end indice -->
		<!-- indice -->
	<xsl:template name="indiceCDAprint">
			  <xsl:param name="tok" />
			  <xsl:param name="ind" />
			  <xsl:variable name="tit" select="$tok/n1:title"/>
			  <div style="margin-left:10px;margin-bottom:5px;">
			  		<xsl:choose>
			  			<xsl:when test="normalize-space(string($tit))!='PATIENTID'">
			  			 <div>
			  			 <a id="{generate-id()}" href="#{generate-id($tit)}" onclick="setSc(this)" style="cursor:pointer !important">
			  			    <label  style="font-weight:bold;font-size:10px;cursor:pointer !important">
								<xsl:choose>
									<xsl:when test="$ind">
										<xsl:value-of select="concat($ind,'.')"/>
									</xsl:when>
								</xsl:choose>
			  			     		
							<xsl:choose>
								<xsl:when test="$ind">
								 	<xsl:value-of select="concat(position(),'.  ')"/>
								</xsl:when>
								<xsl:otherwise>
								 	<xsl:value-of select="concat(position()-1,'. ')"/>
								</xsl:otherwise>
							</xsl:choose>
			  			    </label>
			  			    
			  			    <xsl:choose>
						  	 <xsl:when test="$tok/n1:component">
					
						  	 	<label style="margin-bottom:5px;font-weight:bold">
				     	    		<xsl:value-of select="$tit"/>
				     	    	</label>
				     	     </xsl:when>
				     	     <xsl:otherwise>
					     	     	<label style="">
					     	    		<xsl:value-of select="$tit"/>
					     	    	</label>
				     	     </xsl:otherwise>
						  </xsl:choose>
				     	    </a>
						 </div>
						 <xsl:choose>
						  	 <xsl:when test="$tok/n1:component">
						  	 <xsl:choose>
						  	 		<xsl:when test="$ind">
						  	 			<xsl:variable name="pred" select="concat($ind,'.',position())"/>
						  	 			<xsl:call-template name="indiceCDA">
							  	 			<xsl:with-param name="token" select="$tok" />
							  	 			<xsl:with-param name="pred" select="$pred" />
						  	 			</xsl:call-template>
						  	 		</xsl:when>
						  	 		<xsl:otherwise>
						  	 			<xsl:variable name="pred2" select="concat('',position()-1)"/>
						  	 			<xsl:call-template name="indiceCDA">
							  	 			<xsl:with-param name="token" select="$tok" />
							  	 			<xsl:with-param name="pred" select="$pred2" />
						  	 			</xsl:call-template>
						  	 		</xsl:otherwise>
						  	 </xsl:choose>
						  	 
						  	 		
						  	 </xsl:when>
						  </xsl:choose>
			  			</xsl:when>
			  		</xsl:choose>
			  		
					  
			   </div>
		 </xsl:template>
		 
		 
		 
		 
	<!--end indice -->
</xsl:stylesheet>
