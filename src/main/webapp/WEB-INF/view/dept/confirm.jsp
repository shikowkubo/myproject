<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>My Project | 部署 確認</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>
<h1>部署 確認</h1>

<html:errors />
<s:form>
<html:hidden property="id" />
<html:hidden property="prePage" />

<table>
<tr>
	<td>deptId</td>
	<td>${f:h(deptDto.deptId)}</td>
</tr>
<tr>
	<td>name</td>
	<td>${f:h(deptDto.deptName)}</td>
</tr>
</table>

<%-- 更新の場合 --%>
<c:if test="${prePage=='edit'}">
	<h4 style="color:red">この内容で更新してよろしいですか？</h4>
	<input type="submit" name="update" value="更新">
</c:if>
<%-- 削除の場合 --%>
<c:if test="${prePage=='delete'}">
	<h4 style="color:red">このテーブルのレコードは削除できません</h4>
	<%--
	<input type="submit" name="delete" value="削除">
	--%>
</c:if>
<%-- 新規作成の場合 --%>
<c:if test="${prePage=='create'}">
	<h4 style="color:red">この内容で新規作成してよろしいですか？</h4>
	<input type="submit" name="insert" value="新規作成">
</c:if>

</s:form>
<a href="javascript:history.back()">戻る</a>
</body>
</html>