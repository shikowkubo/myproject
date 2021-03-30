<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>My Project | 部署 一覧</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>部署 一覧</h1>

<html:errors/>
<s:form>

<table>
<tr style="background-color:#A9F5BC">
<%--
	<th>id</th>
--%>
	<th>部署ID</th>
	<th>部署名</th>
	<th></th>
	<th></th>
</tr>

<c:forEach var="e" varStatus="s" items="${deptItems}">
	<tr style="background-color:${s.index %2 == 0 ? 'white' : '#E6E6E6'}">
<%--
		<td>${f:h(e.id)}</td>
 --%>
		<td>${f:h(e.deptId)}</td>
		<td>${f:h(e.deptName)}</td>
		<td><s:link href="showEdit/${e.id}">詳細・編集</s:link></td>
		<td><s:link href="delete/${e.id}">削除</s:link></td>
	</tr>
</c:forEach>
</table>
</s:form>
<s:link href="create">新規作成</s:link>
<br /><br />
<a href="javascript:history.back()">戻る</a>
<s:link href="/">top</s:link>

</body>
</html>