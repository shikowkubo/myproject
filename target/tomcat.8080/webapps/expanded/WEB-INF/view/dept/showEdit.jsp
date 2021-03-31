<%@page pageEncoding="UTF-8"%>
<html>
<head>
<html:javascript formName="deptActionForm_editConfirm"/>

<title>My Project | 部署 詳細・編集</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>部署 詳細・編集</h1>

<html:errors />
<s:form>
<html:hidden property="id" />
<html:hidden property="prePage" />

<table>
<tr>
	<td>部署ID</td>
	<td><html:text property="deptId" readonly="true"/></td>
</tr>
<tr>
	<td>部署名</td>
	<td><html:text property="deptName" /></td>
</tr>
</table>
<s:submit property="editConfirm" clientValidate="true">編集内容を確認</s:submit>
</s:form>
<a href="javascript:history.back()">戻る</a>
<s:link href="/">top</s:link>
</body>
</html>