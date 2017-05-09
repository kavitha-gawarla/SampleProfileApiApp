<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="springform"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start Profile</title>
<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/startprofile.js" type="text/javascript"> </script>

</head>
<body>
	<div  style="display: block; margin: 50px 150px 60px 80px;">
	<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Build your Profile</h2></td>
				</tr>

			</table>
			<fieldset style="display: block; width:500px;">
				<legend>Personal Details:</legend>
		<springform:form action="saveprofile" method="post"	commandName="personalInfo">
		
			
			<div align="left" style="display: block;">
			<p>Personal Details</p>
			<hr>	

					<table>

						<tr>
							<td>First Name:</td>
							<td><springform:input path="firstName" size="25"/></td>
							<td align="left"><springform:errors path="firstName" /></td>
							<td> &nbsp;</td>
							<td>Last Name:</td>
							<td><springform:input path="lastName"  size="25"/></td>
							<td align="left"><springform:errors path="lastName" /></td>
						</tr>
						<tr>
							<td>Date of Birth:</td>
							<td><springform:input type="date" path="dob" /></td>
						
							<td align="left"><springform:errors path="dob" /></td>
						</tr>
					</table>
				

			</div>
			<br/>

			<div align="left" style="display: block;">
				<p>Address</p>
				<hr>	
					<table>
						<tr>
							<td>AddressLine1</td>
							<td colspan="5"><springform:input path="address[0].addressLine1" size="100"/></td>
						</tr>
						<tr>
							<td>AddressLine2</td>
							<td colspan="5"><springform:input path="address[0].addressLine2" size="100" /></td>
						</tr>
						<tr>
							<td>City</td>
							<td><springform:input path="address[0].city" /></td>
						
							<td>State</td>
							<td><springform:input path="address[0].state" /></td>
						
							<td>zipCode</td>
							<td><springform:input path="address[0].zip" /></td>
						</tr>

					</table>
			
			</div>
			<div align="left" style="display: block;">
				<p>Contact Details</p>
				<hr>	
					<table>
						<tr>
							<td>Home Phone<springform:hidden
									path="listOfPhoneDetails[0].phoneType" value="HOME" /> &nbsp;
							</td>
							<td><springform:input
									path="listOfPhoneDetails[0].phoneNumber" size="15" /></td>
							<td><springform:input path="listOfPhoneDetails[0].extension"
									size="4" /></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td>Cell<springform:hidden
									path="listOfPhoneDetails[1].phoneType" value="CELL" />
							</td>
							<td><springform:input
									path="listOfPhoneDetails[1].phoneNumber" size="15" /></td>
							<td></td>
						</tr>
						<tr>
							<td>Work<springform:hidden
									path="listOfPhoneDetails[2].phoneType" value="WORK" />
							</td>
							<td><springform:input
									path="listOfPhoneDetails[2].phoneNumber" size="15" /></td>
							<td><springform:input path="listOfPhoneDetails[2].extension"
									size="4" /></td>
						</tr>


					</table>
				
			</div>
			<div align="left" style="display: block;">
				
					<table>

						<tr>
							<td>E-mail: <springform:hidden
									path="email[0].emailType" value="EMAIL" /></td>
							<td><springform:input path="email[0].emailAddress" size="100"/></td>
						</tr>	
					<tr>
							<td>Alternate E-mail: <springform:hidden
									path="email[1].emailType" value="ALTEMAIL" /></td>
							<td><springform:input path="email[1].emailAddress" size="100"/></td>
					</tr>
					
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Register" /></td>
						</tr>
					</table>
				
			</div>

		</springform:form>
	</fieldset>	
	</div>


</body>
</html>