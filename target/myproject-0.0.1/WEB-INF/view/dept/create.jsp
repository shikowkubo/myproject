<%@page pageEncoding="UTF-8"%>
<html>
<head>
<html:javascript formName="deptActionForm_createConfirm"/>

<title>My Project | 部署 新規作成</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>部署 新規作成</h1>

<html:errors/>
<s:form>
<html:hidden property="id" />
<html:hidden property="prePage" />

<table>
<tr>
	<td>部署ID</td>
	<td><html:text property="deptId"/></td>
</tr>

<tr>
	<td>部署名</td>
	<td><html:text property="deptName" /></td>
</tr>
</table>
<s:submit property="createConfirm" clientValidate="true">新規作成内容を確認</s:submit>
<br /><br />
<a href="javascript:history.back()">戻る</a>
<s:link href="/">top</s:link>

</s:form>
</body>
</html>