<%@page pageEncoding="UTF-8"%>
<head>
<title>My Project | 社員情報 検索</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>社員情報 検索</h1>

<html:errors/>
<s:form>
<table>
<tr>
	<td>所属部署</td>
	<td>
		<html:select property="deptId">
		<html:option value=""></html:option>
		<html:option value="1">NERV</html:option>
		<html:option value="2">WILLE</html:option>
		<html:option value="3">&lt;unknown&gt;</html:option>
		</html:select>
	</td>
</tr>
<tr>
	<td>社員ID</td>
	<td><html:text property="empId" /></td>
</tr>
<tr>
	<td>名前に含む文字</td>
	<td><html:text property="name" /></td>
</tr>
</table>
<s:submit property="searchExe" value="検索" />
</s:form>
<a href="javascript:history.back()">戻る</a>
<s:link href="/">top</s:link>

</body>
</html>