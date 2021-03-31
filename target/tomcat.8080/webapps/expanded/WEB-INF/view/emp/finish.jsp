<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>My Project | 社員情報 更新</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>
<body>

<%-- 更新の場合 --%>
<c:if test="${prePage=='edit'}">
	<h4>更新が完了しました</h4>
</c:if>
<%-- 削除の場合 --%>
<c:if test="${prePage=='delete'}">
	<h4>削除が完了しました</h4>
</c:if>
<%-- 新規作成の場合 --%>
<c:if test="${prePage=='create'}">
	<h4>新規作成が完了しました</h4>
</c:if>


<html:errors />
<s:link href="">一覧</s:link>
<s:link href="/">top</s:link>

</body>
</html>