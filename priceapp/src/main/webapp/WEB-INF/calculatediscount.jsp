<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><spring:message code="title"/>  </h1>
<br/><br/>
<a href="getDiscountedPrice?lang=en">English</a> &nbsp;&nbsp;
<a href="getDiscountedPrice?lang=de">German</a> &nbsp;&nbsp;
<a href="getDiscountedPrice?lang=fr">French</a> &nbsp;&nbsp;
<br/>
<br/>
<form:form method="get" action="calculateDiscountedPrice" modelAttribute="product">
	<table>
		<tr>
			<td><form:label path="productPrice">
				<spring:message code="product.price"/>
			</form:label></td>
			<td>
				<form:input path="productPrice"/>
			</td>
			<td>
				<form:errors path="productPrice">
					<spring:message code="product.price.error"/>
				</form:errors>
			
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="productType">
					<spring:message code="product.type"/>
				</form:label>
			</td>
			<td>
				<form:select path="productType">
					<form:options items="${productTypeList}"/>
				</form:select>
			</td>
			<td>
				<form:errors path="productType">
					<spring:message code="product.type.error"/>
				</form:errors>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="Calculate"/></td>
			<td><input type="reset" value="Clear"/>
			<td></td>
		</tr>
	</table>

</form:form>
</body>
</html>