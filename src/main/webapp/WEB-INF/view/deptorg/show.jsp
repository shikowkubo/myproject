<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/global.css')}"/>
</head>
<body>

<html:errors/>

<table class="tablebg">
	<tr>
		<td> deptName </td>
		<td>
			${f:h(deptName)}
		</td>	
	</tr>

</table>

<s:link href="edit/${id}"> edit </s:link>


<br/><br/>
<s:link href="/dept/">list page</s:link>
</body>
</html>