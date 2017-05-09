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
	<div id="msg"></div>
	<br />
	<div align="center"
		style="display: block; width: 1000px; margin: auto; border: 5px double;">
		<springform:form action="saveprofile" method="post"
			commandName="personalInfo">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Build your Profile</h2></td>
				</tr>

			</table>
			<div align="left" style="display: block;">
				<fieldset style="display: block; width: 500px; margin: auto;">
					<legend>Personal Details:</legend>

					<table>

						<tr>
							<td>First Name:</td>
							<td><springform:input path="firstName" /></td>
							<td align="left"><springform:errors path="firstName" /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><springform:input path="lastName" /></td>
							<td align="left"><springform:errors path="lastName" /></td>
						</tr>
						<tr>
							<td>Date of Birth:</td>
							<td><springform:input path="dob" /></td>
							<td align="left"><springform:errors path="dob" /></td>
						</tr>
					</table>
				</fieldset>

			</div>

			<div align="left" style="display: block;">
				<fieldset style="display: block; width: 500px; margin: auto;">
					<legend>Personal Details:</legend>
					<table>
						<tr>
							<td colspan="2">Address:</td>
						</tr>
						<tr>
							<td>AddressLine1</td>
							<td><springform:input path="address[0].addressLine1" /></td>
						</tr>
						<tr>
							<td>AddressLine2</td>
							<td><springform:input path="address[0].addressLine2" /></td>
						</tr>
						<tr>
							<td>City</td>
							<td><springform:input path="address[0].city" /></td>
						</tr>
						<tr>
							<td>State</td>
							<td><springform:input path="address[0].state" /></td>
						</tr>
						<tr>
							<td>zipCode</td>
							<td><springform:input path="address[0].zip" /></td>
						</tr>

					</table>
				</fieldset>
			</div>
			<div align="left" style="display: block;">
				<fieldset style="display: block; width: 500px; margin: auto;">
					<legend>Personal Details:</legend>
					<table>
						<tr>
							<td>Home Phone<springform:hidden
									path="listOfPhoneDetails[0].phoneType" value="HOME" />
							</td>
							<td><springform:input
									path="listOfPhoneDetails[0].phoneNumber" size="15" /></td>
							<td><springform:input path="listOfPhoneDetails[0].extension"
									size="4" /></td>
						</tr>
						<tr>
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
				</fieldset>
			</div>
			<div align="left" style="display: block;">
				<fieldset style="display: block; width: 500px; margin: auto;">
					<legend>Personal Details:</legend>
					<table>

						<tr>
							<td>E-mail:</td>
							<td><springform:input path="email[0].emailAddress" /></td>
							
						</tr>

						<tr>
							<td>Alternate E-mail:</td>
							<td><springform:input path="email[0].altEmailAddress" /></td>
						</tr>

							<tr>
							<td>E-mail Type:</td>
							<td><springform:input path="email[0].emailType" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Register" /></td>
						</tr>
					</table>
				</fieldset>
			</div>

		</springform:form>
	</div>


</body>
</html>