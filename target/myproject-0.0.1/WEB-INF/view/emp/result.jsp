<%@page pageEncoding="UTF-8"%>
<html>
<title>My Project | 社員情報 検索結果</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>社員情報 検索結果</h1>

<html:errors/>
<s:form>

<table>
<tr style="background-color:#A9F5BC">
	<th>社員ID</th>
	<th>名前</th>
	<th></th>
	<th></th>
	<th></th>
</tr>
<c:forEach var="e" varStatus="s" items="${empItems}">
<tr style="background-color:${s.index %2 == 0 ? 'white' : '#E6E6E6'}">
	<td>${f:h(e.empId)} </td>
	<td>${f:h(e.name)} </td>
	<td>
		<c:if test="${f:h(e.deptId).equals('1')}">NERV</c:if>
		<c:if test="${f:h(e.deptId).equals('2')}">WILLE</c:if>
		<c:if test="${f:h(e.deptId).equals('3')}">&lt;unknown&gt;</c:if>
	</td>
	<td><s:link href="showEdit/${e.id}">詳細・編集</s:link></td>
	<td><s:link href="delete/${e.id}">削除</s:link></td>
</tr>
</c:forEach>
</table>
<br /><br />
<a href="javascript:history.back()">戻る</a>
<s:link href="/">top</s:link>

</s:form>
</body>
</html>