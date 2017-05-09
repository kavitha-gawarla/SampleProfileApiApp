<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for registering! Here's the review of your details:</h3>
                </td>
            </tr>
            <tr>
                <td>First Name:</td>
                <td>${personalInfo.firstName}</td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td>${personalInfo.lastName}</td>
            </tr>
               <c:forEach items="${personalInfo.address}" var="address" varStatus="status">
             <tr>
                <td>Address</td>
                <td>${address.addressLine1} <br/>
                ${address.addressLine2} <br/>
                ${address.city} <br/>
                ${address.state} <br/>
                ${address.zip} <br/>
                </td>
            </tr>
            </c:forEach>
         <c:forEach items="${personalInfo.listOfPhoneDetails}" var="contact" varStatus="status">
		<tr>
			<td>${contact.phoneType}</td>
			<td>${contact.phoneNumber}</td>
			<td>${contact.extension}</td>
			
		</tr>
           
 </c:forEach>
 
   <c:forEach items="${personalInfo.email}" var="email" varStatus="status">
 <c:if test="${email.emailType=='EMAIL'}">
 <tr>
 	
                <td>Email</td>
                <td>${email.emailAddress}</td>
            </tr>
</c:if>
<c:if test="${email.emailType=='ALTEMAIL'}">
  <tr>
                <td>Alternate Email</td>
                <td>${email.emailAddress}</td>
           </tr>
           </c:if>
          
   </c:forEach>
        </table>
    </div>
</body>
</html>