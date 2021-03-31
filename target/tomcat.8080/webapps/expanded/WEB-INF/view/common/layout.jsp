<html>
<head>
<title><tiles:getAsString name="title" ignore="true" />aaa</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/my.css')}" />
</head>

<body>
<table width="100%";>
  <tr><td><tiles:insert page="../emp/search.jsp" /></td></tr>
  <tr><td><tiles:insert page="../emp/table.jsp" /></td></tr>
  <tr><td><tiles:insert page="../emp/create.jsp" /></td></tr>
</table>
</body>
</html>