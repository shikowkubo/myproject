<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>My Project | 社員情報 確認</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>社員情報 確認</h1>

<html:errors />
<s:form>
<html:hidden property="id" />
<html:hidden property="prePage" />

<table>
<tr>
	<td>社員ID</td>
	<td>${f:h(empDto.empId)}</td>
</tr>
<tr>
	<td>名前</td>
	<td>${f:h(empDto.name)}</td>
</tr>
<tr>
	<td>年齢</td>
	<td>${f:h(empDto.age)}</td>
</tr>
<tr>
	<td>性別</td>
	<td>
		<c:if test="${empDto.genderId.equals('1')}">男性</c:if>
		<c:if test="${empDto.genderId.equals('2')}">女性</c:if>
	</td>
</tr>
<tr>
	<td>住所</td>
	<td>${f:h(empDto.address)}</td>
</tr>
<tr>
	<td>所属部署</td>
	<td>
		<c:if test="${empDto.deptId.equals('1')}">NERV</c:if>
		<c:if test="${empDto.deptId.equals('2')}">WILLE</c:if>
		<c:if test="${empDto.deptId.equals('3')}">&lt;unknown&gt;</c:if>
	</td>
</tr>
</table>

<%-- 更新の場合 --%>
<c:if test="${prePage=='edit'}">
	<h4 style="color:red">この内容で更新してよろしいですか？</h4>
	<input type="submit" name="update" value="更新">
</c:if>
<%-- 削除の場合 --%>
<c:if test="${prePage=='delete'}">
	<h4 style="color:red">この内容で削除してよろしいですか？</h4>
	<input type="submit" name="delete" value="削除">
</c:if>
<%-- 新規作成の場合 --%>
<c:if test="${prePage=='create'}">
	<h4 style="color:red">この内容で新規作成してよろしいですか？</h4>
	<input type="submit" name="insert" value="新規作成">
</c:if>

<a href="javascript:history.back()">戻る</a>
</s:form>
</body>
</html>