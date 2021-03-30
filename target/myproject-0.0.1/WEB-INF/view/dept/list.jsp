<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/global.css')}"/>
</head>
<body>

<html:errors/>

<s:form>
<html:hidden property="offset" />
<html:hidden property="count" />
<table border="1">
	<tr>
		<th>deptName</th><td><html:text property="deptName" /></td>
	</tr>
	<tr>
		<th></th><td><input type="submit" name="retrieve" value="retrieve" /></td>
	</tr>
</table>
<br/>

<table border="1">
<tr style="background-color:pink">

	<th>deptName</th>
<th></th><th></th><th></th>
</tr>

<c:forEach var="e" varStatus="s" items="${deptItems}">
	<tr style="background-color:${s.index %2 == 0 ? 'white' : 'aqua'}">
		<td>
			${f:h(e.deptName)}
		</td>
		<td><s:link href="show/${e.id}"> show </s:link></td>
		<td><s:link href="edit/${e.id}"> edit </s:link></td>
		<td><s:link onclick="return confirm('delete OK?');" href="delete/${e.id}">delete</s:link></td>
	</tr>
</c:forEach>

</table>
<table>
	<tr>
		<td>
			${f:h(totalNumber)}Items
		</td>
	</tr>
	<tr>
		<td>
			${f:h(currentPageIndex)}/${f:h(totalPageIndex)}
		</td>
	</tr>
</table>
<table>
	<tr>
		<td><input type="submit" name="firsPage" value="firsPage" ${isPrevPage == "true" ? '' : 'disabled'} /></td>
		<td><input type="submit" name="prevPage" value="prevPage" ${isPrevPage == "true" ? '' : 'disabled'} /></td>
		<td><input type="submit" name="nextPage" value="nextPage" ${isNextPage == "true" ? '' : 'disabled'} /></td>
		<td><input type="submit" name="lastPage" value="lastPage" ${isNextPage == "true" ? '' : 'disabled'} /></td>
	</tr>
</table>
</s:form>

<s:link href="create"> create new Object </s:link>
</body>
</html>