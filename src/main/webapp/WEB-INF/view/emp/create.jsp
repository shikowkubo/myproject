<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>My Project | 社員情報 新規作成</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>社員情報 新規作成</h1>

<html:errors/>
<s:form>
<html:hidden property="id" />
<html:hidden property="prePage" />

<table>
<tr>
	<td>社員番号</td>
	<td><html:text property="empId"/></td>
</tr>

<tr>
	<td>名前</td>
	<td><html:text property="name" /></td>
</tr>
<tr>
	<td>年齢</td>
	<td><html:text property="age" /></td>
</tr>
<tr>
	<td>性別</td>
	<td>
		<html:radio property="genderId" value="1"/>男性
		<html:radio property="genderId" value="2"/>女性
	</td>
</tr>
<tr>
	<td>住所</td>
	<td><html:text property="address" /></td>
</tr>
<tr>
	<td>所属部署</td>
	<td>
		<html:select property="deptId" >
		<html:option value="1">NERV</html:option>
		<html:option value="2">WILLE</html:option>
		<html:option value="3">&lt;unknown&gt;</html:option>
		</html:select>
	</td>
</tr>
</table>
<s:submit property="createConfirm" value="新規作成内容を確認" />
<br /><br />
<a href="javascript:history.back()">戻る</a>
<s:link href="/">top</s:link>

</s:form>
</body>
</html>